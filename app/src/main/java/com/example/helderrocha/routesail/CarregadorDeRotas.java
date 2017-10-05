package com.example.helderrocha.routesail;

import com.example.helderrocha.routesail.models.Aresta;
import com.example.helderrocha.routesail.models.NoMaritmo;
import com.example.helderrocha.routesail.models.Rotas;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by helderrocha on 04/10/17.
 */

public class CarregadorDeRotas {
    public static Rotas Rota1(){
        List<NoMaritmo> nos = new ArrayList<>();
        List<Aresta> mArestaList = new ArrayList<>();

        NoMaritmo noMaritmo = new NoMaritmo();
        noMaritmo.setId(1);
        noMaritmo.setPosicao(new LatLng(-20,-30));
        nos.add(noMaritmo);
        noMaritmo = new NoMaritmo();
        noMaritmo.setId(2);
        noMaritmo.setPosicao(new LatLng(-20,-20));
        nos.add(noMaritmo);
        noMaritmo = new NoMaritmo();
        noMaritmo.setId(3);
        noMaritmo.setPosicao(new LatLng(-20,-10));
        nos.add(noMaritmo);
        noMaritmo = new NoMaritmo();
        noMaritmo.setId(4);
        noMaritmo.setPosicao(new LatLng(-10,-10));
        nos.add(noMaritmo);

        Aresta aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(1));
        aresta.setCorrente(3);
        aresta.setVento(3);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(3));
        aresta.setCorrente(9);
        aresta.setVento(1);
        aresta.setDistancia(900D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(1));
        aresta.setNoMaritmo2(nos.get(2));
        aresta.setCorrente(5);
        aresta.setVento(2);
        aresta.setDistancia(30D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(1));
        aresta.setNoMaritmo2(nos.get(3));
        aresta.setCorrente(15);
        aresta.setVento(3);
        aresta.setDistancia(500D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(2));
        aresta.setNoMaritmo2(nos.get(3));
        aresta.setCorrente(1);
        aresta.setVento(3);
        aresta.setDistancia(600D);
        mArestaList.add(aresta);

        Rotas rotas = new Rotas();
        rotas.setId(1);
        rotas.setDescricao("Rota teste");
        rotas.setArestas(mArestaList);
        rotas.setNosMaritmos(nos);


        return rotas;
    }
    public static Rotas Rota2(){
        Rotas rotas = new Rotas();
        return rotas;
    }
    public static Rotas Rota3(){
        Rotas rotas = new Rotas();
        return rotas;
    }
    public static Rotas Rota4(){
        Rotas rotas = new Rotas();
        return rotas;
    }
    public static Rotas Rota5(){
        Rotas rotas = new Rotas();
        return rotas;
    }

}
