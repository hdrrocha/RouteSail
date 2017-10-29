package com.example.helderrocha.routesail;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.helderrocha.routesail.models.Aresta;
import com.example.helderrocha.routesail.models.NoMaritmo;
import com.example.helderrocha.routesail.models.Rotas;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap map;
    ArrayList<LatLng> markerPoints;
    private AutoCompleteTextView mEditRotas;

    private List<NoMaritmo> nos;
    private List<Aresta> mArestaList;
    private List<Rotas> mRotas;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mEditRotas = findViewById(R.id.rotas);
        mRotas = new ArrayList<>();
        mapFragment.getMapAsync(this);

        ArrayAdapter<Rotas> adapterRotas = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, mRotas);
        mEditRotas.setAdapter(adapterRotas);

        mEditRotas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                nos = mRotas.get(i).getNosMaritmos();
                mArestaList = mRotas.get(i).getArestas();

                InputMethodManager in = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                in.hideSoftInputFromWindow(mEditRotas.getApplicationWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);


                carregarGrafo();
            }
        });

        mEditRotas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View arg0) {
                mEditRotas.showDropDown();
            }
        });

    }

    private void loadDefaultNos(){
        mRotas.add(CarregadorDeRotas.Rota1());
        mRotas.add(CarregadorDeRotas.Rota2());
        mRotas.add(CarregadorDeRotas.Rota3());
        mRotas.add(CarregadorDeRotas.Rota4());
        mRotas.add(CarregadorDeRotas.Rota5());
        mRotas.add(CarregadorDeRotas.Rota6());
        mRotas.add(CarregadorDeRotas.Rota7());
        mRotas.add(CarregadorDeRotas.Rota9());
        mRotas.add(CarregadorDeRotas.Rota10());

    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {
        map = googleMap;
        markerPoints = new ArrayList<LatLng>();
        LatLng santaCatarina = new LatLng(-27.588462, -48.336853);
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(santaCatarina));
        googleMap.animateCamera( CameraUpdateFactory.zoomTo( 8.0f ) );
        loadDefaultNos();
    }

    private void carregarGrafo() {
        map.clear();
        for (NoMaritmo no : nos) {
            MarkerOptions marker = new MarkerOptions().position(no.getPosicao()).title(String.valueOf(no.getId()-1));

            if(no.getmIcon()!= 0){
                marker.icon(BitmapDescriptorFactory.fromResource(no.getmIcon()));
            }else {
                marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.no));
            }
            map.moveCamera(CameraUpdateFactory.newLatLng(no.getPosicao()));
            map.animateCamera( CameraUpdateFactory.zoomTo( 11.0f ) );
            map.addMarker(marker);

            List<Aresta> arestas = new ArrayList<>();
            arestas.addAll(getArestas(no));
            if (!arestas.isEmpty()) {
                pintaMelhorAresta(arestas, no);
            }
        }
    }

    private List<Aresta> getArestas(NoMaritmo mNoa) {
        List<Aresta> arestasFilter = new ArrayList<>();
        for (Aresta aresta : mArestaList) {
            if(aresta.getNoMaritmo1().getId() == mNoa.getId()){
                arestasFilter.add(aresta);
            }
        }
        return arestasFilter;
    }

    private void pintaMelhorAresta(List<Aresta> arestas, NoMaritmo no) {
        Aresta melhorAresta = arestas.get(0);

        for (Aresta aresta : arestas) {
            melhorAresta = getMelhorAresta(melhorAresta, aresta);
        }

        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.color(Color.GREEN);
        polylineOptions.width(5);
        polylineOptions.add(melhorAresta.getNoMaritmo1().getPosicao());
        polylineOptions.add(melhorAresta.getNoMaritmo2().getPosicao());
        map.addPolyline(polylineOptions);

        for (Aresta aresta : arestas) {
            if (aresta.getId() != melhorAresta.getId()) {
                polylineOptions = new PolylineOptions();
                polylineOptions.color(Color.RED);
                polylineOptions.width(5);
                polylineOptions.add(aresta.getNoMaritmo1().getPosicao());
                polylineOptions.add(aresta.getNoMaritmo2().getPosicao());
                map.addPolyline(polylineOptions);
            }
        }
    }

    private Aresta getMelhorAresta(Aresta primeira, Aresta segunda) {
        if (validaCorrente(primeira) && validaVento(primeira) && validaCorrente(segunda) && validaVento(segunda)) {
            if (validaDistanciaTrue(primeira) && validaDistanciaFalse(segunda)) {
                return primeira;
            } else {
                return segunda;
            }
        } else {
            if (validaCorrente(primeira) && validaVento(primeira) && (!validaCorrente(segunda) || !validaVento(segunda))) {
                return primeira;
            } else if (validaCorrente(primeira) && !validaVento(primeira) && (validaCorrente(segunda) || !validaVento(segunda))) {
                if (validaDistanciaTrue(primeira) && validaDistanciaFalse(segunda)) {
                    return primeira;
                } else {
                    return segunda;
                }
            } else if (!validaCorrente(primeira) && !validaVento(primeira) && (!validaCorrente(segunda) || !validaVento(segunda))) {
                if (validaDistanciaTrue(primeira) && validaDistanciaFalse(segunda)) {
                    return primeira;
                } else {
                    return segunda;
                }
            }

        }
        return primeira;
    }


//    private boolean  getPossibilidades( Aresta mresta) {
//        //valida se a corrente está a favor e   /valida se o vento esta contra
//        if (validaCorrente(mresta) && validaVento(mresta)) {
//                return true;
//
//        }//valida se a corrente esta a favor ev alida se o vento esta contra
//        else if (validaCorrente(mresta) && !validaVento(mresta)) {
//                //pinta linha
//                //faz soma
//                return true;
//        }
//        else if(verificaDistancias(mresta)){
//            //pinta amenor distancia
//        }
//        return false;
//    }

    private boolean validaDistanciaTrue(Aresta mresta) {
//        noMaritmo.getmAresta();
//        if(noMaritmo.get)
            return true;
    }

    private boolean validaDistanciaFalse(Aresta mresta) {
//        noMaritmo.getmAresta();
//        if(noMaritmo.get)
        return true;
    }


    private boolean validaCorrente( Aresta mresta) {
        return  mresta.getCorrente() == true;
    }

    private boolean validaVento(Aresta mresta) {

        return  mresta.getVento() == true;
    }

    private Double caclulaVelocidadeTempo(Double velBarco,Double velCorrente){
        return velCorrente + velBarco;
    }
}
