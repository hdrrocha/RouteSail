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
import com.google.maps.android.SphericalUtil;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
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
    List<Aresta> mMelhoresArestas;
    List<Aresta> mPioresresArestas;
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
        mPioresresArestas = new ArrayList<>();
        mMelhoresArestas =  new ArrayList<>();
        map.clear();

        for (NoMaritmo no : nos) {

            MarkerOptions marker = new MarkerOptions().position(no.getPosicao()).title(String.valueOf(no.getId()-1));

            if (no.getmIcon()!= 0) {
                marker.icon(BitmapDescriptorFactory.fromResource(no.getmIcon()));
            } else {
                marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.no));
            }
            map.moveCamera(CameraUpdateFactory.newLatLng(no.getPosicao()));
            map.animateCamera( CameraUpdateFactory.zoomTo( 11.0f ) );
            map.addMarker(marker);

        }
        buildRoute(nos.get(0));

        caclulaVelocidadeMedia(mMelhoresArestas);
    }

    // => Begin

    private void buildRoute(NoMaritmo no) {
        List<Aresta> arestas = new ArrayList<>();
        arestas.addAll(getArestas(no));
        Aresta melhorAresta = new Aresta();
        if (!arestas.isEmpty()) {
            melhorAresta = getMelhorAresta(arestas);
            mMelhoresArestas.add(melhorAresta);
            NoMaritmo proximoNo = melhorAresta.getNoMaritmo2();
            if (proximoNo != null) {
                buildRoute(proximoNo);
            } else {
                finishBuildRoute();
            }
        } else {
            finishBuildRoute();
        }

    }

    private void finishBuildRoute() {
        for (Aresta aresta: mArestaList) {
            Boolean existeMelhorAresta = false;
            for (Aresta melhorAresta: mMelhoresArestas) {
                if (aresta.getId() == melhorAresta.getId()) {
                    existeMelhorAresta = true;
                }
            }
            if (!existeMelhorAresta) {
                mPioresresArestas.add(aresta);
            }
        }
        for (Aresta aresta: mPioresresArestas) {
            printPiorAresta(aresta);
        }
        for (Aresta aresta: mMelhoresArestas) {
            printAresta(aresta);
        }
    }

    private Aresta getMelhorAresta(List<Aresta> arestas) {
        Aresta melhorAresta = arestas.get(0);
        for (Aresta aresta : arestas) {
            aresta.setDistancia(CalculationByDistance(aresta.getNoMaritmo1().getPosicao(), aresta.getNoMaritmo2().getPosicao()));
            Log.i("Aresta "+aresta.getId()+": " , String.valueOf(aresta.getDistancia()));
            melhorAresta = getMelhorAresta(melhorAresta, aresta);
        }
        return melhorAresta;
    }

    private void printAresta(Aresta aresta) {
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.color(Color.GREEN);
        polylineOptions.width(5);
        polylineOptions.add(aresta.getNoMaritmo1().getPosicao());
        polylineOptions.add(aresta.getNoMaritmo2().getPosicao());
        map.addPolyline(polylineOptions);
    }

    private void printPiorAresta(Aresta aresta) {
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.color(Color.RED);
        polylineOptions.width(5);
        polylineOptions.add(aresta.getNoMaritmo1().getPosicao());
        polylineOptions.add(aresta.getNoMaritmo2().getPosicao());
        map.addPolyline(polylineOptions);
    }

    // => End

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
            aresta.setDistancia(CalculationByDistance(aresta.getNoMaritmo1().getPosicao(), aresta.getNoMaritmo2().getPosicao()));
            Log.i("Aresta "+aresta.getId()+": " , String.valueOf(aresta.getDistancia()));
            melhorAresta = getMelhorAresta(melhorAresta, aresta);
            if(melhorAresta.isMelhorAresta()){
                mMelhoresArestas.add(melhorAresta);
            }

        }

        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.color(Color.GREEN);
        polylineOptions.width(5);
        polylineOptions.add(melhorAresta.getNoMaritmo1().getPosicao());
        polylineOptions.add(melhorAresta.getNoMaritmo2().getPosicao());
        map.addPolyline(polylineOptions);

    }

    private void caclulaVelocidadeMedia(List<Aresta> mMelhoresArestas) {
        Double distanciaTotal = null;
        Double distanciaTotalold = null;
        for (Aresta aresta : mMelhoresArestas) {
            if(distanciaTotal != null){
                distanciaTotalold =  distanciaTotal;
            }
            distanciaTotal =  aresta.getDistancia();

            if(distanciaTotalold != null){
                distanciaTotal = aresta.getDistancia() + distanciaTotalold;
            }

        }

        Log.i("distanciaTotal", String.valueOf(distanciaTotal));
    }

    private Aresta getMelhorAresta(Aresta primeira, Aresta segunda) {
        if (validaCorrente(primeira) && validaVento(primeira) && validaCorrente(segunda) && validaVento(segunda)) {
            if (primeira.getDistancia() < segunda.getDistancia()) {
                return primeira;
            } else {
                return segunda;
            }
        } else {
            if (validaCorrente(primeira) && validaVento(primeira) && (!validaCorrente(segunda) || !validaVento(segunda))) {
                return primeira;
            } else if (validaCorrente(primeira) && !validaVento(primeira) && (validaCorrente(segunda) || !validaVento(segunda))) {
                if (primeira.getDistancia() < segunda.getDistancia()) {
                    return primeira;
                } else {
                    return segunda;
                }
            } else if (!validaCorrente(primeira) || !validaVento(primeira) && (validaCorrente(segunda) && validaVento(segunda))) {

                    return segunda;

            } else if (!validaCorrente(primeira) || !validaVento(primeira) && (validaCorrente(segunda) || !validaVento(segunda))) {
                if (primeira.getDistancia() < segunda.getDistancia()) {
                    return primeira;
                } else {
                    return segunda;
                }
            }

        }
        return primeira;
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

    public double CalculationByDistance(LatLng StartP, LatLng EndP) {
        int Radius = 6371;// radius of earth in Km
        double lat1 = StartP.latitude;
        double lat2 = EndP.latitude;
        double lon1 = StartP.longitude;
        double lon2 = EndP.longitude;
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(Math.toRadians(lat1))
                * Math.cos(Math.toRadians(lat2)) * Math.sin(dLon / 2)
                * Math.sin(dLon / 2);
        double c = 2 * Math.asin(Math.sqrt(a));
        double valueResult = Radius * c;
        double km = valueResult / 1;
        DecimalFormat newFormat = new DecimalFormat("####");
        int kmInDec = Integer.valueOf(newFormat.format(km));
        double meter = valueResult % 1000;
        int meterInDec = Integer.valueOf(newFormat.format(meter));
        Log.i("Radius Value", "" + valueResult + "   KM  " + kmInDec
                + " Metros   " + meterInDec);

        return Radius * c;
    }
}
