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
            MarkerOptions marker = new MarkerOptions().position(no.getPosicao()).title(no.getmLocal());
            if(no.getmIcon()!= 0){
                marker.icon(BitmapDescriptorFactory.fromResource(no.getmIcon()));
            }else {
                marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.no));
            }

            map.addMarker(marker);

        }

        for (Aresta aresta : mArestaList) {
            PolylineOptions polylineOptions = new PolylineOptions();
            switch (aresta.getVento()) {
                case 1:
                    polylineOptions.color(Color.GREEN);
                    break;
                case 2:
                    polylineOptions.color(Color.YELLOW);
                    break;
                case 3:
                    polylineOptions.color(Color.RED);
                    break;
            }
            polylineOptions.width(aresta.getCorrente());
            polylineOptions.add(aresta.getNoMaritmo1().getPosicao());
            polylineOptions.add(aresta.getNoMaritmo2().getPosicao());
            map.addPolyline(polylineOptions);
        }
    }

    private void   getPossibilidades(NoMaritmo mNo, Aresta mresta) {
        //valida se a corrente está a favor
        if (validaCorrente(mNo, mresta)) {
            //valida se o vento esta contra
            if (validaVento(mNo, mresta)) {
                //pinta linha
                //faz soma
            }

        }//valida se a corrente esta a favor
        else if (validaCorrente(mNo, mresta)) {
            //valida se o vento esta a favor
            if (validaVento(mNo, mresta)) {
                //pinta linha
                //faz soma
            }

        }else if(verificaDistancias()){
            //pinta amenor distancia
        }
    }

    private boolean verificaDistancias() {
        return true;
    }


    private boolean validaCorrente(NoMaritmo mNo, Aresta mresta) {

        if(mresta.getCorrente() == 1){
            return true;
        }
        return false;
    }

    private boolean validaVento(NoMaritmo mNo, Aresta mresta) {

        if(mresta.getVento() == 1){
            return true;
        }
        return false;
    }

    private Double caclulaVelocidadeTempo(Double velBarco,Double velCorrente){
        return velCorrente + velBarco;
    }
}
