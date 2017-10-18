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
    public static Rotas Rota1() {
        List<NoMaritmo> nos = new ArrayList<>();
        List<Aresta> mArestaList = new ArrayList<>();

        NoMaritmo noMaritmo = new NoMaritmo();
        noMaritmo.setId(1);
        noMaritmo.setmLocal("Alantico sul, saida Canas Vieiras");
        noMaritmo.setPosicao(new LatLng(-27.428102, -48.479555));
        nos.add(noMaritmo);
        noMaritmo = new NoMaritmo();
        noMaritmo.setId(2);
        noMaritmo.setmLocal("Ilha do Francês");
        noMaritmo.setPosicao(new LatLng(-27.415741, -48.478054));
        nos.add(noMaritmo);
        noMaritmo = new NoMaritmo();
        noMaritmo.setId(3);
        noMaritmo.setmLocal("Alantico sul, trajéto próximo a ponta das canas");
        noMaritmo.setPosicao(new LatLng(-27.386842, -48.442649));
        nos.add(noMaritmo);
        noMaritmo = new NoMaritmo();
        noMaritmo.setId(4);
        noMaritmo.setmLocal("Alantico sul, trajéto próximo a ponta das botas");
        noMaritmo.setPosicao(new LatLng(-27.382650, -48.409433));
        nos.add(noMaritmo);
        noMaritmo = new NoMaritmo();
        noMaritmo.setId(5);
        noMaritmo.setmLocal("Alantico sul, Ponta das Feiticeiras\n");
        noMaritmo.setPosicao(new LatLng(-27.382650, -48.409433));
        nos.add(noMaritmo);

        Aresta aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(1));
        aresta.setCorrente(1);
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
        rotas.setDescricao("Canas Vieiras/Ponta das Fenticeiras");
        rotas.setArestas(mArestaList);
        rotas.setNosMaritmos(nos);


        return rotas;
    }

    public static Rotas Rota2() {
        List<NoMaritmo> nos = new ArrayList<>();
        List<Aresta> mArestaList = new ArrayList<>();

        NoMaritmo noMaritmo = new NoMaritmo();
        noMaritmo.setId(1);
        noMaritmo.setmLocal("Saida de jurere internacional");
        noMaritmo.setPosicao(new LatLng(-27.435350, -48.502432));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(2);
        noMaritmo.setmLocal("Proximidades da ilha do frances: Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.417524, -48.487296));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(3);
        noMaritmo.setmLocal("Proximidades da ilha do frances lado de fora:Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.411733, -48.477598));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(4);
        noMaritmo.setmLocal("Saida das Proximidades da ilha do frances lado de fora:Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.413943, -48.471847));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(5);
        noMaritmo.setmLocal("Saida das Proximidades Canas vieiras: Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.414247, -48.463264));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(6);
        noMaritmo.setmLocal("Proximidades da ilha do frances lado de dentro");
        noMaritmo.setPosicao(new LatLng(-27.424205, -48.475564));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(7);
        noMaritmo.setmLocal("Saida das Proximidades da ilha do frances lado de dentro:Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.421234, -48.467582));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(8);
        noMaritmo.setmLocal("Proximidades Canas vieiras: Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.417868, -48.456682));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(9);
        noMaritmo.setmLocal("Proximidades Ponta das canas:  Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.409462, -48.443818));
        nos.add(noMaritmo);


        noMaritmo = new NoMaritmo();
        noMaritmo.setId(10);
        noMaritmo.setmLocal("Chegada a Ponta das canas: ");
        noMaritmo.setPosicao(new LatLng(-27.401538, -48.431458));
        nos.add(noMaritmo);


        Aresta aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(1));
        aresta.setCorrente(1);
        aresta.setVento(3);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(1));
        aresta.setNoMaritmo2(nos.get(2));
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
        aresta.setNoMaritmo1(nos.get(2));
        aresta.setNoMaritmo2(nos.get(3));
        aresta.setCorrente(15);
        aresta.setVento(3);
        aresta.setDistancia(500D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(3));
        aresta.setNoMaritmo2(nos.get(6));
        aresta.setCorrente(1);
        aresta.setVento(3);
        aresta.setDistancia(600D);
        mArestaList.add(aresta);

        aresta.setNoMaritmo1(nos.get(2));
        aresta.setNoMaritmo2(nos.get(4));
        aresta.setCorrente(1);
        aresta.setVento(3);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(4));
        aresta.setNoMaritmo2(nos.get(6));
        aresta.setCorrente(9);
        aresta.setVento(1);
        aresta.setDistancia(900D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(6));
        aresta.setNoMaritmo2(nos.get(7));
        aresta.setCorrente(5);
        aresta.setVento(2);
        aresta.setDistancia(30D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(7));
        aresta.setNoMaritmo2(nos.get(8));
        aresta.setCorrente(15);
        aresta.setVento(3);
        aresta.setDistancia(500D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(8));
        aresta.setNoMaritmo2(nos.get(9));
        aresta.setCorrente(1);
        aresta.setVento(3);
        aresta.setDistancia(600D);
        mArestaList.add(aresta);


        Rotas rotas = new Rotas();
        rotas.setId(1);
        rotas.setDescricao("Saida:jurere internacional / Chegada a Ponta das canas");
        rotas.setArestas(mArestaList);
        rotas.setNosMaritmos(nos);

        return rotas;
    }

    public static Rotas Rota3() {
        Rotas rotas = new Rotas();
        return rotas;
    }

    public static Rotas Rota4() {
        Rotas rotas = new Rotas();
        return rotas;
    }

    public static Rotas Rota5() {
        Rotas rotas = new Rotas();
        return rotas;
    }

}
