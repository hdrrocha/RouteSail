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
        noMaritmo.setmIcon(R.drawable.partida);
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
        noMaritmo.setmIcon(R.drawable.chegada);
        noMaritmo.setmLocal("Alantico sul, Ponta das Feiticeiras");
        noMaritmo.setPosicao(new LatLng(-27.382650, -48.409433));
        nos.add(noMaritmo);




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
        noMaritmo.setmIcon(R.drawable.partida);
        noMaritmo.setmLocal("Jurere internacional-Saía");
        noMaritmo.setPosicao(new LatLng(-27.435350, -48.502432));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(2);
        noMaritmo.setmLocal("Proximidades da Ilha do Francês");
        noMaritmo.setPosicao(new LatLng(-27.417524, -48.487296));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(3);
        noMaritmo.setmLocal("Proximidades da Ilha do Francês(lado de fora)");
        noMaritmo.setPosicao(new LatLng(-27.411733, -48.477598));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(4);
        noMaritmo.setmLocal("Saída das proximidades da Ilha do Francês(lado de fora)");
        noMaritmo.setPosicao(new LatLng(-27.413943, -48.471847));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(5);
        noMaritmo.setmLocal("Saída das proximidades de Canas Vieiras");
        noMaritmo.setPosicao(new LatLng(-27.414247, -48.463264));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(6);
        noMaritmo.setmLocal("Proximidades da Ilha do Francês(lado de dentro)");
        noMaritmo.setPosicao(new LatLng(-27.424205, -48.475564));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(7);
        noMaritmo.setmLocal("Saída das proximidades da Ilha do Francês(lado de dentro)");
        noMaritmo.setPosicao(new LatLng(-27.421234, -48.467582));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(8);
        noMaritmo.setmLocal("Proximidades Canas vieiras: Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.417868, -48.456682));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(9);
        noMaritmo.setmLocal("Proximidades de Canas Vieiras");
        noMaritmo.setPosicao(new LatLng(-27.409462, -48.443818));
        nos.add(noMaritmo);


        noMaritmo = new NoMaritmo();
        noMaritmo.setId(10);
        noMaritmo.setmIcon(R.drawable.chegada);
        noMaritmo.setmLocal("Chegada a Ponta das canas: ");
        noMaritmo.setPosicao(new LatLng(-27.401538, -48.431458));
        nos.add(noMaritmo);


        Aresta aresta = new Aresta();
        aresta.setId(1);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(1));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(2);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(5));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(40D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(3);
        aresta.setNoMaritmo1(nos.get(1));
        aresta.setNoMaritmo2(nos.get(2));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(40D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(4);
        aresta.setNoMaritmo1(nos.get(2));
        aresta.setNoMaritmo2(nos.get(3));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(40D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(5);
        aresta.setNoMaritmo1(nos.get(1));
        aresta.setNoMaritmo2(nos.get(5));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(40D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(6);
        aresta.setNoMaritmo1(nos.get(2));
        aresta.setNoMaritmo2(nos.get(3));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(40D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(7);
        aresta.setNoMaritmo1(nos.get(3));
        aresta.setNoMaritmo2(nos.get(4));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(40D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(8);
        aresta.setNoMaritmo1(nos.get(3));
        aresta.setNoMaritmo2(nos.get(4));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(40D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(8);
        aresta.setNoMaritmo1(nos.get(4));
        aresta.setNoMaritmo2(nos.get(8));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(40D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(9);
        aresta.setNoMaritmo1(nos.get(8));
        aresta.setNoMaritmo2(nos.get(9));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(40D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(10);
        aresta.setNoMaritmo1(nos.get(5));
        aresta.setNoMaritmo2(nos.get(6));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(40D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(11);
        aresta.setNoMaritmo1(nos.get(6));
        aresta.setNoMaritmo2(nos.get(7));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(400D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(11);
        aresta.setNoMaritmo1(nos.get(7));
        aresta.setNoMaritmo2(nos.get(8));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(40D);
        mArestaList.add(aresta);

//        Jurere internacional/Ponta das canas
        Rotas rotas = new Rotas();
        rotas.setId(1);
        rotas.setDescricao("CERTA1");
        rotas.setArestas(mArestaList);
        rotas.setNosMaritmos(nos);

        return rotas;
    }

    public static Rotas Rota3() {
        List<NoMaritmo> nos = new ArrayList<>();
        List<Aresta> mArestaList = new ArrayList<>();

        NoMaritmo noMaritmo = new NoMaritmo();
        noMaritmo.setId(1);
        noMaritmo.setmIcon(R.drawable.partida);
        noMaritmo.setmLocal("Pier de Porto Belo");
        noMaritmo.setPosicao(new LatLng(-27.151093, -48.544663));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(2);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.147885, -48.549470));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(3);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.141317, -48.553246));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(4);
        noMaritmo.setmLocal("Contorno  por fora da Ilha de porto Belo  Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.133526, -48.547410));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(5);
        noMaritmo.setmLocal("Saída  Ilha de porto Belo   Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.133067, -48.539513));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(6);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.131730, -48.534750));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(7);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.131730, -48.534750));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(8);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.128942, -48.527969));
        nos.add(noMaritmo);

//Camiho 2

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(9);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.146663, -48.541702));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(10);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.143188, -48.542260));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(11);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.141889, -48.538698));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(12);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.138643, -48.537625));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(13);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.134137, -48.535179));
        nos.add(noMaritmo);

//        Caminho 3
        noMaritmo = new NoMaritmo();
        noMaritmo.setId(14);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.145899, -48.539170));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(15);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.143913, -48.538054));
        nos.add(noMaritmo);

        noMaritmo.setId(16);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.140973, -48.538011));
        nos.add(noMaritmo);

//        (Ligar com camino 1)
        noMaritmo = new NoMaritmo();
        noMaritmo.setId(17);

        noMaritmo.setmIcon(R.drawable.chegada);
        noMaritmo.setmLocal("Praia do Caixa D'Açp Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.127185, -48.526639));
        nos.add(noMaritmo);


        Aresta aresta = new Aresta();
        aresta.setId(1);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(1));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(2);
        aresta.setNoMaritmo1(nos.get(1));
        aresta.setNoMaritmo2(nos.get(2));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(3);
        aresta.setNoMaritmo1(nos.get(2));
        aresta.setNoMaritmo2(nos.get(3));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(4);
        aresta.setNoMaritmo1(nos.get(3));
        aresta.setNoMaritmo2(nos.get(4));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(5);
        aresta.setNoMaritmo1(nos.get(4));
        aresta.setNoMaritmo2(nos.get(5));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(6);
        aresta.setNoMaritmo1(nos.get(5));
        aresta.setNoMaritmo2(nos.get(7));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(8);
        aresta.setNoMaritmo1(nos.get(7));
        aresta.setNoMaritmo2(nos.get(16));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(9);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(8));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(10);
        aresta.setNoMaritmo1(nos.get(8));
        aresta.setNoMaritmo2(nos.get(9));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(11);
        aresta.setNoMaritmo1(nos.get(8));
        aresta.setNoMaritmo2(nos.get(9));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(12);
        aresta.setNoMaritmo1(nos.get(9));
        aresta.setNoMaritmo2(nos.get(10));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(13);
        aresta.setNoMaritmo1(nos.get(10));
        aresta.setNoMaritmo2(nos.get(11));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(13);
        aresta.setNoMaritmo1(nos.get(11));
        aresta.setNoMaritmo2(nos.get(12));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(14);
        aresta.setNoMaritmo1(nos.get(12));
        aresta.setNoMaritmo2(nos.get(5));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(15);
        aresta.setNoMaritmo1(nos.get(8));
        aresta.setNoMaritmo2(nos.get(13));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(16);
        aresta.setNoMaritmo1(nos.get(13));
        aresta.setNoMaritmo2(nos.get(10));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


//        Pier de Porto Belo Oceano Atlântico Sul/Praia do Caixa D'Açp
        Rotas rotas = new Rotas();
        rotas.setId(3);
        rotas.setDescricao("CERTA 2");
        rotas.setArestas(mArestaList);
        rotas.setNosMaritmos(nos);

        return rotas;
    }

    public static Rotas Rota4() {
        List<NoMaritmo> nos = new ArrayList<>();
        List<Aresta> mArestaList = new ArrayList<>();

        NoMaritmo noMaritmo = new NoMaritmo();
        noMaritmo.setId(1);
        noMaritmo.setmIcon(R.drawable.partida);
        noMaritmo.setmLocal("Saida da praia dos açores Enseada do Pântano do Suls");
        noMaritmo.setPosicao(new LatLng(-27.783704, -48.523154));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(2);
        noMaritmo.setmLocal("Enseada do Pântano do Sul");
        noMaritmo.setPosicao(new LatLng(-27.785678, -48.521952));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(3);
        noMaritmo.setmLocal("Enseada do Pântano do Sul");
        noMaritmo.setPosicao(new LatLng(-27.787367, -48.522145));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(4);
        noMaritmo.setmLocal("Enseada do Pântano do Sul");
        noMaritmo.setPosicao(new LatLng(-27.790765, -48.523755));
        nos.add(noMaritmo);


        noMaritmo = new NoMaritmo();
        noMaritmo.setId(5);
        noMaritmo.setmLocal("Enseada do Pântano do Sul");
        noMaritmo.setPosicao(new LatLng(-27.793935, -48.524677));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(6);
        noMaritmo.setmLocal("Enseada do Pântano do Sul");
        noMaritmo.setPosicao(new LatLng(-27.798453, -48.524033));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(7);
        noMaritmo.setmLocal("Enseada do Pântano do Sul");
        noMaritmo.setPosicao(new LatLng(-27.808551, -48.521974));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(8);
        noMaritmo.setmLocal("Ponto norte anterios a ilha do  meio irmão");
        noMaritmo.setPosicao(new LatLng(-27.817205, -48.519742));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(9);
        noMaritmo.setmLocal("Ilha da irmã pequena, lateral ilha do meio irmão");
        noMaritmo.setPosicao(new LatLng(-27.823885, -48.532273));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(10);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.832842, -48.535535));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(11);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.841267, -48.545469));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(12);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.850324, -48.569701));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(13);
        noMaritmo.setmLocal("Passagem esqurda direão ao meio  ilha do meio irmao e irmã de fora");
        noMaritmo.setPosicao(new LatLng(-27.827038, -48.514492));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(14);
        noMaritmo.setmLocal("Meio  ilha do meio irmao e irmã de fora");
        noMaritmo.setPosicao(new LatLng(-27.836868, -48.512947));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(15);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.842484, -48.515307));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(16);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.855098, -48.525335));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(17);
        noMaritmo.setmLocal("Saida da Ilha do meio imrão");
        noMaritmo.setPosicao(new LatLng(-27.851107, -48.523365));
        nos.add(noMaritmo);

        noMaritmo.setId(18);
        noMaritmo.setmLocal("Passagem esquerda  Ilha da Irmã de fora");
        noMaritmo.setPosicao(new LatLng(-27.829401, -48.498259));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(19);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.837788, -48.493624));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(20);
        noMaritmo.setmLocal("Passagem pela Ilha da Imã de fora");
        noMaritmo.setPosicao(new LatLng(-27.841052, -48.495684));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(21);
        noMaritmo.setmLocal("Saida da ILha de Irmã de fora");
        noMaritmo.setPosicao(new LatLng(-27.848148, -48.503152));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(22);
        noMaritmo.setmIcon(R.drawable.chegada);
        noMaritmo.setmLocal("Chegada a praia da Ponta do papagaio");
        noMaritmo.setPosicao(new LatLng(-27.849110, -48.576910));
        nos.add(noMaritmo);


        Aresta aresta = new Aresta();
        aresta.setId(1);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(1));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(3);
        aresta.setNoMaritmo1(nos.get(1));
        aresta.setNoMaritmo2(nos.get(2));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(4);
        aresta.setNoMaritmo1(nos.get(2));
        aresta.setNoMaritmo2(nos.get(3));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(5);
        aresta.setNoMaritmo1(nos.get(3));
        aresta.setNoMaritmo2(nos.get(4));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(6);
        aresta.setNoMaritmo1(nos.get(4));
        aresta.setNoMaritmo2(nos.get(5));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(7);
        aresta.setNoMaritmo1(nos.get(5));
        aresta.setNoMaritmo2(nos.get(6));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(8);
        aresta.setNoMaritmo1(nos.get(6));
        aresta.setNoMaritmo2(nos.get(7));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(9);
        aresta.setNoMaritmo1(nos.get(7));
        aresta.setNoMaritmo2(nos.get(8));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(10);
        aresta.setNoMaritmo1(nos.get(7));
        aresta.setNoMaritmo2(nos.get(12));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(11);
        aresta.setNoMaritmo1(nos.get(7));
        aresta.setNoMaritmo2(nos.get(17));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(12);
        aresta.setNoMaritmo1(nos.get(12));
        aresta.setNoMaritmo2(nos.get(13));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(13);
        aresta.setNoMaritmo1(nos.get(13));
        aresta.setNoMaritmo2(nos.get(14));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(14);
        aresta.setNoMaritmo1(nos.get(16));
        aresta.setNoMaritmo2(nos.get(17));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(15);
        aresta.setNoMaritmo1(nos.get(17));
        aresta.setNoMaritmo2(nos.get(18));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(16);
        aresta.setNoMaritmo1(nos.get(18));
        aresta.setNoMaritmo2(nos.get(19));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(17);
        aresta.setNoMaritmo1(nos.get(19));
        aresta.setNoMaritmo2(nos.get(20));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(18);
        aresta.setNoMaritmo1(nos.get(21));
        aresta.setNoMaritmo2(nos.get(15));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(19);
        aresta.setNoMaritmo1(nos.get(14));
        aresta.setNoMaritmo2(nos.get(15));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);



        aresta = new Aresta();
        aresta.setId(20);
        aresta.setNoMaritmo1(nos.get(13));
        aresta.setNoMaritmo2(nos.get(14));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(21);
        aresta.setNoMaritmo1(nos.get(8));
        aresta.setNoMaritmo2(nos.get(9));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(22);
        aresta.setNoMaritmo1(nos.get(9));
        aresta.setNoMaritmo2(nos.get(10));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(23);
        aresta.setNoMaritmo1(nos.get(20));
        aresta.setNoMaritmo2(nos.get(15));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(24);
        aresta.setNoMaritmo1(nos.get(10));
        aresta.setNoMaritmo2(nos.get(11));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);
//        Praia dos Açores Enseada do Pântano do Sul/Praia da Ponta do papagaio
        Rotas rotas = new Rotas();
        rotas.setId(1);
        rotas.setDescricao("CERTO 3");
        rotas.setArestas(mArestaList);
        rotas.setNosMaritmos(nos);

        return rotas;
    }

    public static Rotas Rota5() {
        List<NoMaritmo> nos = new ArrayList<>();
        List<Aresta> mArestaList = new ArrayList<>();

        NoMaritmo noMaritmo = new NoMaritmo();
        noMaritmo.setId(1);
        noMaritmo.setmIcon(R.drawable.partida);
        noMaritmo.setmLocal("Saida de jurere internacional :  Oceano Atlântico Sul");
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
        noMaritmo.setmLocal("Proximidades da ilha do frances lado de dentro ");
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
        noMaritmo.setmIcon(R.drawable.chegada);
        noMaritmo.setmLocal("Chegada a Ponta das canas");
        noMaritmo.setPosicao(new LatLng(-27.401538, -48.431458));
        nos.add(noMaritmo);


        Aresta aresta = new Aresta();
        aresta.setId(1);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(1));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(2);
        aresta.setNoMaritmo1(nos.get(1));
        aresta.setNoMaritmo2(nos.get(2));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(3);
        aresta.setNoMaritmo1(nos.get(2));
        aresta.setNoMaritmo2(nos.get(3));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(4);
        aresta.setNoMaritmo1(nos.get(3));
        aresta.setNoMaritmo2(nos.get(4));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(5);
        aresta.setNoMaritmo1(nos.get(4));
        aresta.setNoMaritmo2(nos.get(7));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(6);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(5));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(7);
        aresta.setNoMaritmo1(nos.get(5));
        aresta.setNoMaritmo2(nos.get(6));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(8);
        aresta.setNoMaritmo1(nos.get(6));
        aresta.setNoMaritmo2(nos.get(7));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(9);
        aresta.setNoMaritmo1(nos.get(7));
        aresta.setNoMaritmo2(nos.get(8));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(10);
        aresta.setNoMaritmo1(nos.get(8));
        aresta.setNoMaritmo2(nos.get(9));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


//        Saida de jurere internacional /Chegada a Ponta das canas

        Rotas rotas = new Rotas();
        rotas.setId(5);
        rotas.setDescricao("CERTA 5");
        rotas.setArestas(mArestaList);
        rotas.setNosMaritmos(nos);

        return rotas;
    }

    public static Rotas Rota6() {
        List<NoMaritmo> nos = new ArrayList<>();
        List<Aresta> mArestaList = new ArrayList<>();

        NoMaritmo noMaritmo = new NoMaritmo();
        noMaritmo.setId(1);
        noMaritmo.setmIcon(R.drawable.partida);
        noMaritmo.setmLocal("Saida Garopaba: Santa Catarina");
        noMaritmo.setPosicao(new LatLng(-28.029592, -48.599380));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(2);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.998979, -48.595260));
        nos.add(noMaritmo);


        noMaritmo = new NoMaritmo();
        noMaritmo.setId(3);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.967751, -48.599380));
        nos.add(noMaritmo);



        noMaritmo = new NoMaritmo();
        noMaritmo.setId(4);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.940761, -48.586333));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(5);
        noMaritmo.setmLocal("Proximidades a guarda do Embau Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.919224, -48.567451));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(6);
        noMaritmo.setmLocal("Proximidades a guarda do Embau  passagem ao meio entre a ilha de Garopaba Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.910123, -48.550628));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(7);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.876138, -48.492263));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(8);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.818461, -48.440078));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(9);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.003235, -48.571641));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(10);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.968977, -48.552243));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(11);
        noMaritmo.setmLocal("Lado direito ilha da Garopaba  Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.949265, -48.529820 ));
        nos.add(noMaritmo);



        noMaritmo = new NoMaritmo();
        noMaritmo.setId(12);
        noMaritmo.setmLocal("Passada  direito ilha da Garopaba  Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.940280, -48.522696));
        nos.add(noMaritmo);



        noMaritmo = new NoMaritmo();
        noMaritmo.setId(13);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.923484, -48.519306));
        nos.add(noMaritmo);



        noMaritmo = new NoMaritmo();
        noMaritmo.setId(14);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.875468, -48.52243));
        nos.add(noMaritmo);



        noMaritmo = new NoMaritmo();
        noMaritmo.setId(15);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.848758, -48.484330));
        nos.add(noMaritmo);



        noMaritmo = new NoMaritmo();
        noMaritmo.setId(16);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.822952, -48.466820));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(17);
        noMaritmo.setmIcon(R.drawable.chegada);
        noMaritmo.setmLocal("Chegada Ilha de Santa Catarina");
        noMaritmo.setPosicao(new LatLng(-27.764967, -48.484087));
        nos.add(noMaritmo);


        Aresta aresta = new Aresta();
        aresta.setId(1);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(1));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(2);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(8));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(3);
        aresta.setNoMaritmo1(nos.get(1));
        aresta.setNoMaritmo2(nos.get(2));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(4);
        aresta.setNoMaritmo1(nos.get(2));
        aresta.setNoMaritmo2(nos.get(3));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(5);
        aresta.setNoMaritmo1(nos.get(3));
        aresta.setNoMaritmo2(nos.get(4));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(6);
        aresta.setNoMaritmo1(nos.get(4));
        aresta.setNoMaritmo2(nos.get(5));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(7);
        aresta.setNoMaritmo1(nos.get(5));
        aresta.setNoMaritmo2(nos.get(13));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(8);
        aresta.setNoMaritmo1(nos.get(8));
        aresta.setNoMaritmo2(nos.get(9));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(9);
        aresta.setNoMaritmo1(nos.get(9));
        aresta.setNoMaritmo2(nos.get(10));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(10);
        aresta.setNoMaritmo1(nos.get(10));
        aresta.setNoMaritmo2(nos.get(11));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(11);
        aresta.setNoMaritmo1(nos.get(6));
        aresta.setNoMaritmo2(nos.get(14));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(12);
        aresta.setNoMaritmo1(nos.get(11));
        aresta.setNoMaritmo2(nos.get(12));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(13);
        aresta.setNoMaritmo1(nos.get(15));
        aresta.setNoMaritmo2(nos.get(16));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(14);
        aresta.setNoMaritmo1(nos.get(6));
        aresta.setNoMaritmo2(nos.get(12));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(15);
        aresta.setNoMaritmo1(nos.get(13));
        aresta.setNoMaritmo2(nos.get(14));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(16);
        aresta.setNoMaritmo1(nos.get(14));
        aresta.setNoMaritmo2(nos.get(7));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(17);
        aresta.setNoMaritmo1(nos.get(7));
        aresta.setNoMaritmo2(nos.get(15));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(18);
        aresta.setNoMaritmo1(nos.get(14));
        aresta.setNoMaritmo2(nos.get(15));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(19);
        aresta.setNoMaritmo1(nos.get(7));
        aresta.setNoMaritmo2(nos.get(16));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        Rotas rotas = new Rotas();
        rotas.setId(6);
        rotas.setDescricao("CERTA 4");
        rotas.setArestas(mArestaList);
        rotas.setNosMaritmos(nos);


        return rotas;
    }


    public static Rotas Rota7() {
        List<NoMaritmo> nos = new ArrayList<>();
        List<Aresta> mArestaList = new ArrayList<>();

        NoMaritmo noMaritmo = new NoMaritmo();
        noMaritmo.setId(1);
        noMaritmo.setmIcon(R.drawable.partida);
        noMaritmo.setmLocal("Saida Joaquina Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.630815, -48.449901));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(2);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.638876, -48.450416));
        nos.add(noMaritmo);


        noMaritmo = new NoMaritmo();
        noMaritmo.setId(3);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.646783, -48.456081));
        nos.add(noMaritmo);



        noMaritmo = new NoMaritmo();
        noMaritmo.setId(4);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.653778, -48.460887));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(5);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.663509, -48.454536));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(6);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.676127, -48.449901));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(7);
        noMaritmo.setmLocal("Proximo ao Campeche direta Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.656185, -48.463518));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(8);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.662571, -48.466779));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(9);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.670933, -48.471586));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(10);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.683702, -48.472444));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(11);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.692367, -48.472101));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(12);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.697839, -48.473131));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(13);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.701030, -48.472273));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(14);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.705894, -48.471071));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(15);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.706654, -48.468668));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(16);
        noMaritmo.setmLocal("Proximo ao Campeche direta esquerda Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.689517, -48.453540));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(17);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.694533, -48.457231));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(18);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.698940, -48.459548));
        nos.add(noMaritmo);


        noMaritmo = new NoMaritmo();
        noMaritmo.setId(19);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.702208, -48.462295));
        nos.add(noMaritmo);



        noMaritmo = new NoMaritmo();
        noMaritmo.setId(20);
        noMaritmo.setmIcon(R.drawable.chegada);
        noMaritmo.setmLocal("Chegada ao sul da Ilha do Campeche Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.704412, -48.465728));
        nos.add(noMaritmo);



//        Saida Joaquina Oceano Atlântico Su /Chegada ao sul da Ilha do Campeche Oceano Atlântico Sul
        Rotas rotas = new Rotas();
        rotas.setId(7);
        rotas.setDescricao("CERTA 6");
        rotas.setArestas(mArestaList);
        rotas.setNosMaritmos(nos);

        return rotas;
    }
    public static Rotas Rota9() {
        List<NoMaritmo> nos = new ArrayList<>();
        List<Aresta> mArestaList = new ArrayList<>();

        NoMaritmo noMaritmo = new NoMaritmo();
        noMaritmo.setId(1);
        noMaritmo.setmIcon(R.drawable.partida);
        noMaritmo.setmLocal("Saida laguna Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.488745, -48.761960));
        nos.add(noMaritmo);

//        Lado 1
        noMaritmo = new NoMaritmo();
        noMaritmo.setId(2);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.475880, -48.749189));
        nos.add(noMaritmo);


        noMaritmo = new NoMaritmo();
        noMaritmo.setId(3);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.458677, -48.747129));
        nos.add(noMaritmo);



        noMaritmo = new NoMaritmo();
        noMaritmo.setId(4);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.434225, -48.728246));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(5);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.416109, -48.717603));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(6);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.392856, -48.709707));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(7);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.377150, -48.681898));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(8);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.341198, -48.674345));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(9);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.320044, -48.680524));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(10);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.283770, -48.671941));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(11);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.262151, -48.655805));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(12);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.248542, -48.660698));
        nos.add(noMaritmo);

//        Lado 2
        noMaritmo = new NoMaritmo();
        noMaritmo.setId(13);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.487934, -48.744492));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(14);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.484948, -48.748677));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(15);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.476988, -48.747347));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(16);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.471141, -48.745631));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(17);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.466161, -48.726254));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(18);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.460565, -48.710842));
        nos.add(noMaritmo);


        noMaritmo = new NoMaritmo();
        noMaritmo.setId(19);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.454226, -48.695049));
        nos.add(noMaritmo);



        noMaritmo = new NoMaritmo();
        noMaritmo.setId(20);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.443963, -48.684406));
        nos.add(noMaritmo);


        noMaritmo = new NoMaritmo();
        noMaritmo.setId(21);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.412865, -48.686466));
        nos.add(noMaritmo);


        noMaritmo = new NoMaritmo();
        noMaritmo.setId(22);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.261966, -48.626817));
        nos.add(noMaritmo);


        noMaritmo = new NoMaritmo();
        noMaritmo.setId(23);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.252516, -48.626388));
        nos.add(noMaritmo);


        noMaritmo = new NoMaritmo();
        noMaritmo.setId(24);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.245257, -48.648618));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(25);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.244501, -48.655828));
        nos.add(noMaritmo);


        noMaritmo = new NoMaritmo();
        noMaritmo.setId(26);
        noMaritmo.setmIcon(R.drawable.chegada);
        noMaritmo.setmLocal("Chegada Imbituba:Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-28.244156, -48.660440));
        nos.add(noMaritmo);

        Aresta aresta = new Aresta();
        aresta.setId(1);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(1));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(2);
        aresta.setNoMaritmo1(nos.get(1));
        aresta.setNoMaritmo2(nos.get(2));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(3);
        aresta.setNoMaritmo1(nos.get(2));
        aresta.setNoMaritmo2(nos.get(3));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(4);
        aresta.setNoMaritmo1(nos.get(3));
        aresta.setNoMaritmo2(nos.get(4));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(5);
        aresta.setNoMaritmo1(nos.get(4));
        aresta.setNoMaritmo2(nos.get(5));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(6);
        aresta.setNoMaritmo1(nos.get(5));
        aresta.setNoMaritmo2(nos.get(6));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(7);
        aresta.setNoMaritmo1(nos.get(6));
        aresta.setNoMaritmo2(nos.get(7));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(8);
        aresta.setNoMaritmo1(nos.get(7));
        aresta.setNoMaritmo2(nos.get(8));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(9);
        aresta.setNoMaritmo1(nos.get(8));
        aresta.setNoMaritmo2(nos.get(9));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(10);
        aresta.setNoMaritmo1(nos.get(9));
        aresta.setNoMaritmo2(nos.get(10));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(11);
        aresta.setNoMaritmo1(nos.get(10));
        aresta.setNoMaritmo2(nos.get(11));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(12);
        aresta.setNoMaritmo1(nos.get(11));
        aresta.setNoMaritmo2(nos.get(25));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(13);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(12));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(14);
        aresta.setNoMaritmo1(nos.get(12));
        aresta.setNoMaritmo2(nos.get(13));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(15);
        aresta.setNoMaritmo1(nos.get(13));
        aresta.setNoMaritmo2(nos.get(14));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(16);
        aresta.setNoMaritmo1(nos.get(14));
        aresta.setNoMaritmo2(nos.get(15));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(17);
        aresta.setNoMaritmo1(nos.get(15));
        aresta.setNoMaritmo2(nos.get(16));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(18);
        aresta.setNoMaritmo1(nos.get(16));
        aresta.setNoMaritmo2(nos.get(17));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(19);
        aresta.setNoMaritmo1(nos.get(17));
        aresta.setNoMaritmo2(nos.get(18));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(20);
        aresta.setNoMaritmo1(nos.get(18));
        aresta.setNoMaritmo2(nos.get(19));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(21);
        aresta.setNoMaritmo1(nos.get(19));
        aresta.setNoMaritmo2(nos.get(20));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(22);
        aresta.setNoMaritmo1(nos.get(20));
        aresta.setNoMaritmo2(nos.get(6));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(23);
        aresta.setNoMaritmo1(nos.get(10));
        aresta.setNoMaritmo2(nos.get(21));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(24);
        aresta.setNoMaritmo1(nos.get(21));
        aresta.setNoMaritmo2(nos.get(22));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(25);
        aresta.setNoMaritmo1(nos.get(22));
        aresta.setNoMaritmo2(nos.get(23));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(26);
        aresta.setNoMaritmo1(nos.get(23));
        aresta.setNoMaritmo2(nos.get(24));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);



        aresta = new Aresta();
        aresta.setId(27);
        aresta.setNoMaritmo1(nos.get(24));
        aresta.setNoMaritmo2(nos.get(25));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


//        Saida laguna /Chegada Imbitub

        Rotas rotas = new Rotas();
        rotas.setId(9);
        rotas.setDescricao("CERTA 7");
        rotas.setArestas(mArestaList);
        rotas.setNosMaritmos(nos);

        return rotas;
    }

    public static Rotas Rota10() {
        List<NoMaritmo> nos = new ArrayList<>();
        List<Aresta> mArestaList = new ArrayList<>();

        NoMaritmo noMaritmo = new NoMaritmo();
        noMaritmo.setId(1);
        noMaritmo.setmIcon(R.drawable.partida);
        noMaritmo.setmLocal("Saida Porto Belo Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.147987, -48.559763));
        nos.add(noMaritmo);

//      Caminho 1
        noMaritmo = new NoMaritmo();
        noMaritmo.setId(2);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.129655, -48.565942));
        nos.add(noMaritmo);


        noMaritmo = new NoMaritmo();
        noMaritmo.setId(3);
        noMaritmo.setmLocal("Proximidades de itapema Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.105132, -48.592979));
        nos.add(noMaritmo);



        noMaritmo = new NoMaritmo();
        noMaritmo.setId(4);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.081292, -48.577186));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(5);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.081750, -48.575727));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(6);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.024344, -48.567466));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(7);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.014786, -48.566865));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(8);
        noMaritmo.setmLocal("Proximidades a taquara Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.005457, -48.565921));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(9);
        noMaritmo.setmLocal("Taquara Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.006222, -48.577251));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(10);
        noMaritmo.setmLocal("Taquara Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-26.998421, -48.579225));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(11);
        noMaritmo.setmLocal("Saida de Taquara Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-26.993144, -48.578967));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(12);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-26.989664, -48.585791));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(13);
        noMaritmo.setmLocal("Praia de Laramjeiras Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-26.990162, -48.593086));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(14);
        noMaritmo.setmLocal("Proximidades de Molhe da Barra Sul Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-26.994559, -48.603171));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(15);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.000869, -48.614759));
        nos.add(noMaritmo);

//        Caminho 2
        noMaritmo = new NoMaritmo();
        noMaritmo.setId(16);
        noMaritmo.setmLocal("Direção a ilha de porto Bello Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.146354, -48.543669));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(17);
        noMaritmo.setmLocal("Ilha de Porto Belo Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.140320, -48.538562));
        nos.add(noMaritmo);

        noMaritmo = new NoMaritmo();
        noMaritmo.setId(18);
        noMaritmo.setmLocal("Saida da Ilha de Porto Belo Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.134783, -48.535988));
        nos.add(noMaritmo);


        noMaritmo = new NoMaritmo();
        noMaritmo.setId(19);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.129092, -48.540708));
        nos.add(noMaritmo);



        noMaritmo = new NoMaritmo();
        noMaritmo.setId(20);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.120689, -48.565814));
        nos.add(noMaritmo);

//        Liga com caminho 3
        noMaritmo = new NoMaritmo();
        noMaritmo.setId(21);
        noMaritmo.setmLocal("Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-27.106097, -48.539678));
        nos.add(noMaritmo);


        noMaritmo = new NoMaritmo();
        noMaritmo.setId(22);
        noMaritmo.setmIcon(R.drawable.chegada);
        noMaritmo.setmLocal("Praia central de Balneario Camburiú Oceano Atlântico Sul");
        noMaritmo.setPosicao(new LatLng(-26.995219, -48.622677));
        nos.add(noMaritmo);

        Aresta aresta = new Aresta();
        aresta.setId(1);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(1));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(2);
        aresta.setNoMaritmo1(nos.get(1));
        aresta.setNoMaritmo2(nos.get(2));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(3);
        aresta.setNoMaritmo1(nos.get(2));
        aresta.setNoMaritmo2(nos.get(3));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(4);
        aresta.setNoMaritmo1(nos.get(3));
        aresta.setNoMaritmo2(nos.get(4));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(5);
        aresta.setNoMaritmo1(nos.get(4));
        aresta.setNoMaritmo2(nos.get(5));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(6);
        aresta.setNoMaritmo1(nos.get(5));
        aresta.setNoMaritmo2(nos.get(6));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(7);
        aresta.setNoMaritmo1(nos.get(6));
        aresta.setNoMaritmo2(nos.get(7));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(8);
        aresta.setNoMaritmo1(nos.get(7));
        aresta.setNoMaritmo2(nos.get(8));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(9);
        aresta.setNoMaritmo1(nos.get(8));
        aresta.setNoMaritmo2(nos.get(9));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(10);
        aresta.setNoMaritmo1(nos.get(9));
        aresta.setNoMaritmo2(nos.get(10));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(11);
        aresta.setNoMaritmo1(nos.get(10));
        aresta.setNoMaritmo2(nos.get(11));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(12);
        aresta.setNoMaritmo1(nos.get(11));
        aresta.setNoMaritmo2(nos.get(12));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(13);
        aresta.setNoMaritmo1(nos.get(12));
        aresta.setNoMaritmo2(nos.get(13));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(14);
        aresta.setNoMaritmo1(nos.get(13));
        aresta.setNoMaritmo2(nos.get(14));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(15);
        aresta.setNoMaritmo1(nos.get(14));
        aresta.setNoMaritmo2(nos.get(21));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(16);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(15));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(17);
        aresta.setNoMaritmo1(nos.get(15));
        aresta.setNoMaritmo2(nos.get(16));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(18);
        aresta.setNoMaritmo1(nos.get(16));
        aresta.setNoMaritmo2(nos.get(17));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(19);
        aresta.setNoMaritmo1(nos.get(17));
        aresta.setNoMaritmo2(nos.get(18));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(20);
        aresta.setNoMaritmo1(nos.get(18));
        aresta.setNoMaritmo2(nos.get(19));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(21);
        aresta.setNoMaritmo1(nos.get(19));
        aresta.setNoMaritmo2(nos.get(20));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(22);
        aresta.setNoMaritmo1(nos.get(20));
        aresta.setNoMaritmo2(nos.get(5));
        aresta.setCorrente(false);
        aresta.setVento(false);
        aresta.setDistancia(50D);
        mArestaList.add(aresta);

        Rotas rotas = new Rotas();
        rotas.setId(23);
        rotas.setDescricao(" Porto Belo /Balneario Camburiú");
        rotas.setArestas(mArestaList);
        rotas.setNosMaritmos(nos);

        return rotas;
    }



}
