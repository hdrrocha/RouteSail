package com.example.helderrocha.routesail;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.helderrocha.routesail.models.Aresta;
import com.example.helderrocha.routesail.models.Vertices;
import com.example.helderrocha.routesail.models.Rotas;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap map;
    private ArrayList<LatLng> markerPoints;

    private List<Vertices> nos;
    private List<Aresta> mArestaList;
    private List<Rotas> mRotas = new ArrayList<>();
    private List<Aresta> mMelhoresArestas;
    private List<Aresta> mPioresresArestas;

    private int rotaId = 0;
    private Double velocidade = 0.0;

    private TextView rotaSelecionada;
    private TextView tempoEstimado;
    private TextView velocidadeMedia;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);




    }


    private void loadComponents() {
        rotaSelecionada = (TextView) findViewById(R.id.rotaSelecionada);
        tempoEstimado = (TextView) findViewById(R.id.tempoEstimado);
        velocidadeMedia = (TextView) findViewById(R.id.velocidadeMedia);
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

    private void loadComponetsEvents() {
    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {
        map = googleMap;
        markerPoints = new ArrayList<LatLng>();
        LatLng santaCatarina = new LatLng(-27.588462, -48.336853);
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(santaCatarina));
        googleMap.animateCamera( CameraUpdateFactory.zoomTo( 8.0f ) );
        loadDefaultNos();


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            rotaId = Integer.parseInt(extras.getString("RotaSelecionadaId"));
            velocidade = Double.valueOf(extras.getString("velocidade"));
        }

        loadComponents();
        loadComponetsEvents();

        if(rotaId != 0){
            nos = mRotas.get(rotaId).getNosMaritmos();
            mArestaList = mRotas.get(rotaId).getArestas();


            velocidadeMedia.setText(velocidade.toString());
            rotaSelecionada.setText(mRotas.get(rotaId).getDescricao());

            carregarGrafo();
        }
    }

    private void carregarGrafo() {
        mPioresresArestas = new ArrayList<>();
        mMelhoresArestas =  new ArrayList<>();
        map.clear();

        for (Vertices no : nos) {

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


    }

    // => Begin Arestas
    private void buildRoute(Vertices no) {
        List<Aresta> arestas = new ArrayList<>();
        arestas.addAll(getArestas(no));
        Aresta melhorAresta = new Aresta();
        if (!arestas.isEmpty()) {
            melhorAresta = getMelhorAresta(arestas);
            mMelhoresArestas.add(melhorAresta);
            Vertices proximoNo = melhorAresta.getNoMaritmo2();
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
        caclulaVelocidadeMedia(mMelhoresArestas);

    }

    private Aresta getMelhorAresta(List<Aresta> arestas) {
        Aresta melhorAresta = arestas.get(0);
        for (Aresta aresta : arestas) {
            aresta.setDistancia(RSUtil.CalculationByDistance(aresta.getNoMaritmo1().getPosicao(), aresta.getNoMaritmo2().getPosicao()));
            aresta.setmVelocidadeCorrente(RSUtil.radomValue(1,10));//TO DO Setar na class
            melhorAresta = getMelhorAresta(melhorAresta, aresta);
        }

        return melhorAresta;
    }

    private void printAresta(Aresta aresta) {
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.color(ContextCompat.getColor(getApplicationContext(), R.color.colorGreenAresta));
        polylineOptions.width(5);
        polylineOptions.add(aresta.getNoMaritmo1().getPosicao());
        polylineOptions.add(aresta.getNoMaritmo2().getPosicao());
        map.addPolyline(polylineOptions);
    }

    private void printPiorAresta(Aresta aresta) {
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.color(ContextCompat.getColor(getApplicationContext(), R.color.colorAresta));
        polylineOptions.getEndCap();
        polylineOptions.width(5);
        polylineOptions.add(aresta.getNoMaritmo1().getPosicao());
        polylineOptions.add(aresta.getNoMaritmo2().getPosicao());
        map.addPolyline(polylineOptions);
    }

    private List<Aresta> getArestas(Vertices mNoa) {
        List<Aresta> arestasFilter = new ArrayList<>();
        for (Aresta aresta : mArestaList) {
            if(aresta.getNoMaritmo1().getId() == mNoa.getId()){
                arestasFilter.add(aresta);
            }
        }
        return arestasFilter;
    }

    private boolean validaCorrente( Aresta mresta) {
        return  mresta.getCorrente() == true;
    }

    private boolean validaVento(Aresta mresta) {

        return  mresta.getVento() == true;
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

    // => End

    // => Begin Calculos
    private void caclulaVelocidadeMedia(List<Aresta> mMelhoresArestas) {
        Double distanciaTotal = 0.0;
        Double vel =  RSUtil.arredondar(caclulaVelocidadeTempo(velocidade, velocidadeMediaCorrente(mMelhoresArestas)), 2, 1);

        for (Aresta aresta : mMelhoresArestas) {
            distanciaTotal += aresta.getDistancia();
        }

        Double tEstimado = calculaTempoViagem( RSUtil.arredondar(distanciaTotal, 2, 1), vel);

        tempoEstimado.setText(tEstimado.toString());
    }

    private Double caclulaVelocidadeTempo(Double velBarco,Double velCorrente){
        return velCorrente + velBarco;
    }

    private Double velocidadeMediaCorrente(List<Aresta> arestas){
        Double count = 0.0;
        Double soamCorrentes = 0.0;
        for (Aresta a : arestas){
            count++;
            soamCorrentes += a.getmVelocidadeCorrente();
        }

        return  soamCorrentes/count;


    }

    private Double calculaTempoViagem(Double distancia, Double velocicidade){
//        t = d / v
        return  distancia/velocicidade;
    }
    // => End

}
