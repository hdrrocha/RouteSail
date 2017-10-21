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
        List<NoMaritmo> nos = new ArrayList<>();
        List<Aresta> mArestaList = new ArrayList<>();

        NoMaritmo noMaritmo = new NoMaritmo();
        noMaritmo.setId(1);
        noMaritmo.setmLocal("Pier de Porto Belo Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.151093, -48.544663));
        nos.add(noMaritmo);



        noMaritmo.setId(2);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.147885, -48.549470));
        nos.add(noMaritmo);

        noMaritmo.setId(3);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.141317, -48.553246));
        nos.add(noMaritmo);


        noMaritmo.setId(4);
        noMaritmo.setmLocal("Contorno  por fora a Ilha de porto Belo  Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.133526, -48.547410));
        nos.add(noMaritmo);

        noMaritmo.setId(5);
        noMaritmo.setmLocal("Saída  Ilha de porto Belo   Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.133067, -48.539513));
        nos.add(noMaritmo);


        noMaritmo.setId(6);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.131730, -48.534750));
        nos.add(noMaritmo);

        noMaritmo.setId(7);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.131730, -48.534750));
        nos.add(noMaritmo);

        noMaritmo.setId(8);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.128942, -48.527969));
        nos.add(noMaritmo);

//Camiho 2

        noMaritmo.setId(9);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.146663, -48.541702));
        nos.add(noMaritmo);

        noMaritmo.setId(10);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.143188, -48.542260));
        nos.add(noMaritmo);

        noMaritmo.setId(11);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.141889, -48.538698));
        nos.add(noMaritmo);

        noMaritmo.setId(12);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.138643, -48.537625));
        nos.add(noMaritmo);

        noMaritmo.setId(13);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.134137, -48.535179));
        nos.add(noMaritmo);

//        Caminho 3

        noMaritmo.setId(14);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.145899, -48.539170));
        nos.add(noMaritmo);

        noMaritmo.setId(15);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.143913, -48.538054));
        nos.add(noMaritmo);

        noMaritmo.setId(16);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.140973, -48.538011));
        nos.add(noMaritmo);

//        (Ligar com camino 1)
        noMaritmo.setId(17);
        noMaritmo.setmLocal("Praia do Caixa D'Açp Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.127185, -48.526639));
        nos.add(noMaritmo);


        Aresta aresta = new Aresta();

        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(1));
        aresta.setCorrente(1);
        aresta.setVento(1);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(1));
        aresta.setNoMaritmo2(nos.get(2));
        aresta.setCorrente(1);
        aresta.setVento(1);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(2));
        aresta.setNoMaritmo2(nos.get(3));
        aresta.setCorrente(1);
        aresta.setVento(1);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(3));
        aresta.setNoMaritmo2(nos.get(4));
        aresta.setCorrente(1);
        aresta.setVento(1);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(4));
        aresta.setNoMaritmo2(nos.get(5));
        aresta.setCorrente(1);
        aresta.setVento(1);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(5));
        aresta.setNoMaritmo2(nos.get(6));
        aresta.setCorrente(1);
        aresta.setVento(1);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(6));
        aresta.setNoMaritmo2(nos.get(7));
        aresta.setCorrente(1);
        aresta.setVento(1);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(7));
        aresta.setNoMaritmo2(nos.get(8));
        aresta.setCorrente(1);
        aresta.setVento(1);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(8));
        aresta.setNoMaritmo2(nos.get(9));
        aresta.setCorrente(1);
        aresta.setVento(1);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(9));
        aresta.setNoMaritmo2(nos.get(10));
        aresta.setCorrente(1);
        aresta.setVento(1);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(10));
        aresta.setNoMaritmo2(nos.get(11));
        aresta.setCorrente(1);
        aresta.setVento(1);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(11));
        aresta.setNoMaritmo2(nos.get(12));
        aresta.setCorrente(1);
        aresta.setVento(1);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(12));
        aresta.setNoMaritmo2(nos.get(13));
        aresta.setCorrente(1);
        aresta.setVento(1);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);
//
//        aresta = new Aresta();
//        aresta.setNoMaritmo1(nos.get(13));
//        aresta.setNoMaritmo2(nos.get(17));
//        aresta.setCorrente(1);
//        aresta.setVento(1);
//        aresta.setDistancia(50D);
//        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(14));
        aresta.setNoMaritmo2(nos.get(15));
        aresta.setCorrente(1);
        aresta.setVento(1);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(15));
        aresta.setNoMaritmo2(nos.get(16));
        aresta.setCorrente(1);
        aresta.setVento(1);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

//        aresta = new Aresta();
//        aresta.setNoMaritmo1(nos.get(16));
//        aresta.setNoMaritmo2(nos.get(17));
//        aresta.setCorrente(1);
//        aresta.setVento(1);
//        aresta.setDistancia(50D);
//        mArestaList.add(aresta);


        Rotas rotas = new Rotas();
        rotas.setId(3);
        rotas.setDescricao("Pier de Porto Belo Oceano Atlântico Sul/Praia do Caixa D'Açp");
        rotas.setArestas(mArestaList);
        rotas.setNosMaritmos(nos);

        return rotas;
    }

    public static Rotas Rota4() {
        List<NoMaritmo> nos = new ArrayList<>();
        List<Aresta> mArestaList = new ArrayList<>();

        NoMaritmo noMaritmo = new NoMaritmo();
        noMaritmo.setId(1);
        noMaritmo.setmLocal("Saida da praia dos açores Enseada do Pântano do Suls");
        noMaritmo.setPosicao(new LatLng(-27.783704, -48.523154));
        nos.add(noMaritmo);

        noMaritmo.setId(2);
        noMaritmo.setmLocal("Enseada do Pântano do Sul");
        noMaritmo.setPosicao(new LatLng(-27.785678, -48.521952));
        nos.add(noMaritmo);

        noMaritmo.setId(3);
        noMaritmo.setmLocal("Enseada do Pântano do Sul");
        noMaritmo.setPosicao(new LatLng(-27.787367, -48.522145));
        nos.add(noMaritmo);

        noMaritmo.setId(4);
        noMaritmo.setmLocal("Enseada do Pântano do Sul");
        noMaritmo.setPosicao(new LatLng(-27.790765, -48.523755));
        nos.add(noMaritmo);


        noMaritmo.setId(5);
        noMaritmo.setmLocal("Enseada do Pântano do Sul");
        noMaritmo.setPosicao(new LatLng(-27.793935, -48.524677));
        nos.add(noMaritmo);

        noMaritmo.setId(6);
        noMaritmo.setmLocal("Enseada do Pântano do Sul");
        noMaritmo.setPosicao(new LatLng(-27.798453, -48.524033));
        nos.add(noMaritmo);

        noMaritmo.setId(6);
        noMaritmo.setmLocal("Enseada do Pântano do Sul");
        noMaritmo.setPosicao(new LatLng(-27.808551, -48.521974));
        nos.add(noMaritmo);

        noMaritmo.setId(8);
        noMaritmo.setmLocal("Ponto norte anterios a ilha do  meio irmão Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.817205, -48.519742));
        nos.add(noMaritmo);

        noMaritmo.setId(9);
        noMaritmo.setmLocal("Ilha da irmã pequena, lateral ilha do meio irmão Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.823885, -48.532273));
        nos.add(noMaritmo);

        noMaritmo.setId(10);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.832842, -48.535535));
        nos.add(noMaritmo);

        noMaritmo.setId(11);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.841267, -48.545469));
        nos.add(noMaritmo);

        noMaritmo.setId(12);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.850324, -48.569701));
        nos.add(noMaritmo);

        noMaritmo.setId(13);
        noMaritmo.setmLocal("Passagem esqurda direão ao meio  ilha do meio irmao e irmã de fora Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.827038, -48.514492));
        nos.add(noMaritmo);

        noMaritmo.setId(14);
        noMaritmo.setmLocal("Meio  ilha do meio irmao e irmã de fora  Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.836868, -48.512947));
        nos.add(noMaritmo);

        noMaritmo.setId(14);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.842484, -48.515307));
        nos.add(noMaritmo);

        noMaritmo.setId(16);
        noMaritmo.setmLocal("Saida da Ilha do meio imrão Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.851107, -48.523365));
        nos.add(noMaritmo);

        noMaritmo.setId(17);
        noMaritmo.setmLocal("Passagem esquerda  Ilha da Irmã de fora Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.829401, -48.498259));
        nos.add(noMaritmo);

        noMaritmo.setId(18);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.837788, -48.493624));
        nos.add(noMaritmo);

        noMaritmo.setId(19);
        noMaritmo.setmLocal("Passagem pela Ilha da Imã de fora Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.841052, -48.495684));
        nos.add(noMaritmo);

        noMaritmo.setId(20);
        noMaritmo.setmLocal("Saida da ILha de Irmã de fora Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.848148, -48.503152));
        nos.add(noMaritmo);

        noMaritmo.setId(21);
        noMaritmo.setmLocal("Chegada a praia da Ponta do papagaio Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.849110, -48.576910));
        nos.add(noMaritmo);


        Aresta aresta = new Aresta();

        aresta = new Aresta();
        aresta.setNoMaritmo1(nos.get(2));
        aresta.setNoMaritmo2(nos.get(3));
        aresta.setCorrente(1);
        aresta.setVento(3);
        aresta.setDistancia(600D);
        mArestaList.add(aresta);

        Rotas rotas = new Rotas();
        rotas.setId(1);
        rotas.setDescricao("Praia dos açores Enseada do Pântano do Sul/ praia da Ponta do papagaio Oceano Atlântico Sul");
        rotas.setArestas(mArestaList);
        rotas.setNosMaritmos(nos);

        return rotas;
    }

    public static Rotas Rota5() {
        Rotas rotas = new Rotas();
        return rotas;
    }

}
