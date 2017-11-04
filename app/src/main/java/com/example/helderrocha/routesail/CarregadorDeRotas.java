package com.example.helderrocha.routesail;

import com.example.helderrocha.routesail.models.Aresta;
import com.example.helderrocha.routesail.models.Vertices;
import com.example.helderrocha.routesail.models.Rotas;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by helderrocha on 04/10/17.
 */

public class CarregadorDeRotas {
    public static Rotas Rota1() {
        List<Vertices> nos = new ArrayList<>();
        List<Aresta> mArestaList = new ArrayList<>();

        Vertices vertices = new Vertices();
        vertices.setId(1);
        vertices.setmLocal("Alantico sul, saida Canas Vieiras");
        vertices.setmIcon(R.drawable.ic_boat);
        vertices.setPosicao(new LatLng(-27.428102, -48.479555));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(2);
        vertices.setmLocal("Ilha do Francês");
        vertices.setPosicao(new LatLng(-27.415741, -48.478054));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(3);
        vertices.setmLocal("Alantico sul, trajéto próximo a ponta das canas");
        vertices.setPosicao(new LatLng(-27.386842, -48.442649));

        nos.add(vertices);
        vertices = new Vertices();
        vertices.setId(4);
        vertices.setmLocal("Alantico sul, trajéto próximo a ponta das botas");
        vertices.setPosicao(new LatLng(-27.382650, -48.409433));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(5);
        vertices.setmIcon(R.drawable.ic_flag);
        vertices.setmLocal("Alantico sul, Ponta das Feiticeiras");
        vertices.setPosicao(new LatLng(-27.382650, -48.409433));
        nos.add(vertices);




        Rotas rotas = new Rotas();
        rotas.setId(1);
        rotas.setDescricao("Canas Vieiras/Ponta das Fenticeiras");
        rotas.setArestas(mArestaList);
        rotas.setNosMaritmos(nos);


        return rotas;
    }

    public static Rotas Rota2() {
        List<Vertices> nos = new ArrayList<>();
        List<Aresta> mArestaList = new ArrayList<>();

        Vertices vertices = new Vertices();
        vertices.setId(1);
        vertices.setmIcon(R.drawable.ic_boat);
        vertices.setmLocal("Jurere internacional-Saía");
        vertices.setPosicao(new LatLng(-27.435350, -48.502432));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(2);
        vertices.setmLocal("Proximidades da Ilha do Francês");
        vertices.setPosicao(new LatLng(-27.417524, -48.487296));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(3);
        vertices.setmLocal("Proximidades da Ilha do Francês(lado de fora)");
        vertices.setPosicao(new LatLng(-27.411733, -48.477598));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(4);
        vertices.setmLocal("Saída das proximidades da Ilha do Francês(lado de fora)");
        vertices.setPosicao(new LatLng(-27.413943, -48.471847));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(5);
        vertices.setmLocal("Saída das proximidades de Canas Vieiras");
        vertices.setPosicao(new LatLng(-27.414247, -48.463264));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(6);
        vertices.setmLocal("Proximidades da Ilha do Francês(lado de dentro)");
        vertices.setPosicao(new LatLng(-27.424205, -48.475564));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(7);
        vertices.setmLocal("Saída das proximidades da Ilha do Francês(lado de dentro)");
        vertices.setPosicao(new LatLng(-27.421234, -48.467582));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(8);
        vertices.setmLocal("Proximidades Canas vieiras: Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.417868, -48.456682));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(9);
        vertices.setmLocal("Proximidades de Canas Vieiras");
        vertices.setPosicao(new LatLng(-27.409462, -48.443818));
        nos.add(vertices);


        vertices = new Vertices();
        vertices.setId(10);
        vertices.setmIcon(R.drawable.ic_flag);
        vertices.setmLocal("ic_flag a Ponta das canas: ");
        vertices.setPosicao(new LatLng(-27.401538, -48.431458));
        nos.add(vertices);


        Aresta aresta = new Aresta();
        aresta.setId(1);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(1));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(2);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(5));
        aresta.setCorrente(true);
        aresta.setVento(true);
       
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(3);
        aresta.setNoMaritmo1(nos.get(1));
        aresta.setNoMaritmo2(nos.get(2));
        aresta.setCorrente(false);
        aresta.setVento(true);
       
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(4);
        aresta.setNoMaritmo1(nos.get(2));
        aresta.setNoMaritmo2(nos.get(3));
        aresta.setCorrente(false);
        aresta.setVento(false);
       
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(5);
        aresta.setNoMaritmo1(nos.get(1));
        aresta.setNoMaritmo2(nos.get(5));
        aresta.setCorrente(true);
        aresta.setVento(false);
       
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(6);
        aresta.setNoMaritmo1(nos.get(2));
        aresta.setNoMaritmo2(nos.get(3));
        aresta.setCorrente(false);
        aresta.setVento(false);
       
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(7);
        aresta.setNoMaritmo1(nos.get(3));
        aresta.setNoMaritmo2(nos.get(4));
        aresta.setCorrente(false);
        aresta.setVento(false);
       
        mArestaList.add(aresta);

//        aresta = new Aresta();
//        aresta.setId(8);
//        aresta.setNoMaritmo1(nos.get(3));
//        aresta.setNoMaritmo2(nos.get(4));
//        aresta.setCorrente(false);
//        aresta.setVento(false);
//
//        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(9);
        aresta.setNoMaritmo1(nos.get(4));
        aresta.setNoMaritmo2(nos.get(8));
        aresta.setCorrente(true);
        aresta.setVento(false);
       
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(10);
        aresta.setNoMaritmo1(nos.get(8));
        aresta.setNoMaritmo2(nos.get(9));
        aresta.setCorrente(false);
        aresta.setVento(false);
       
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(11);
        aresta.setNoMaritmo1(nos.get(5));
        aresta.setNoMaritmo2(nos.get(6));
        aresta.setCorrente(false);
        aresta.setVento(false);
       
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(12);
        aresta.setNoMaritmo1(nos.get(6));
        aresta.setNoMaritmo2(nos.get(7));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(13);
        aresta.setNoMaritmo1(nos.get(7));
        aresta.setNoMaritmo2(nos.get(8));
        aresta.setCorrente(false);
        aresta.setVento(false);
       
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
        List<Vertices> nos = new ArrayList<>();
        List<Aresta> mArestaList = new ArrayList<>();

        Vertices vertices = new Vertices();
        vertices.setId(1);
        vertices.setmIcon(R.drawable.ic_boat);
        vertices.setmLocal("Pier de Porto Belo");
        vertices.setPosicao(new LatLng(-27.151093, -48.544663));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(2);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.147885, -48.549470));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(3);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.141317, -48.553246));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(4);
        vertices.setmLocal("Contorno  por fora da Ilha de porto Belo  Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.133526, -48.547410));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(5);
        vertices.setmLocal("Saída  Ilha de porto Belo   Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.133067, -48.539513));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(6);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.131730, -48.534750));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(7);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.131730, -48.534750));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(8);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.128942, -48.527969));
        nos.add(vertices);

//Camiho 2

        vertices = new Vertices();
        vertices.setId(9);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.146663, -48.541702));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(10);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.143188, -48.542260));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(11);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.141889, -48.538698));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(12);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.138643, -48.537625));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(13);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.134137, -48.535179));
        nos.add(vertices);

//        Caminho 3
        vertices = new Vertices();
        vertices.setId(14);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.145899, -48.539170));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(15);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.143913, -48.538054));
        nos.add(vertices);

        vertices.setId(16);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.140973, -48.538011));
        nos.add(vertices);

//        (Ligar com camino 1)
        vertices = new Vertices();
        vertices.setId(17);

        vertices.setmIcon(R.drawable.ic_flag);
        vertices.setmLocal("Praia do Caixa D'Açp Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.127185, -48.526639));
        nos.add(vertices);


        Aresta aresta = new Aresta();
        aresta.setId(1);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(1));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(2);
        aresta.setNoMaritmo1(nos.get(1));
        aresta.setNoMaritmo2(nos.get(2));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(3);
        aresta.setNoMaritmo1(nos.get(2));
        aresta.setNoMaritmo2(nos.get(3));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(4);
        aresta.setNoMaritmo1(nos.get(3));
        aresta.setNoMaritmo2(nos.get(4));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(5);
        aresta.setNoMaritmo1(nos.get(4));
        aresta.setNoMaritmo2(nos.get(5));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(6);
        aresta.setNoMaritmo1(nos.get(5));
        aresta.setNoMaritmo2(nos.get(7));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(8);
        aresta.setNoMaritmo1(nos.get(7));
        aresta.setNoMaritmo2(nos.get(16));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(9);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(8));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(10);
        aresta.setNoMaritmo1(nos.get(8));
        aresta.setNoMaritmo2(nos.get(9));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(11);
        aresta.setNoMaritmo1(nos.get(8));
        aresta.setNoMaritmo2(nos.get(9));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(12);
        aresta.setNoMaritmo1(nos.get(9));
        aresta.setNoMaritmo2(nos.get(10));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(13);
        aresta.setNoMaritmo1(nos.get(10));
        aresta.setNoMaritmo2(nos.get(11));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(13);
        aresta.setNoMaritmo1(nos.get(11));
        aresta.setNoMaritmo2(nos.get(12));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(14);
        aresta.setNoMaritmo1(nos.get(12));
        aresta.setNoMaritmo2(nos.get(5));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(15);
        aresta.setNoMaritmo1(nos.get(8));
        aresta.setNoMaritmo2(nos.get(13));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(16);
        aresta.setNoMaritmo1(nos.get(13));
        aresta.setNoMaritmo2(nos.get(10));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
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
        List<Vertices> nos = new ArrayList<>();
        List<Aresta> mArestaList = new ArrayList<>();

        Vertices vertices = new Vertices();
        vertices.setId(1);
        vertices.setmIcon(R.drawable.ic_boat);
        vertices.setmLocal("Saida da praia dos açores Enseada do Pântano do Suls");
        vertices.setPosicao(new LatLng(-27.783704, -48.523154));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(2);
        vertices.setmLocal("Enseada do Pântano do Sul");
        vertices.setPosicao(new LatLng(-27.785678, -48.521952));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(3);
        vertices.setmLocal("Enseada do Pântano do Sul");
        vertices.setPosicao(new LatLng(-27.787367, -48.522145));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(4);
        vertices.setmLocal("Enseada do Pântano do Sul");
        vertices.setPosicao(new LatLng(-27.790765, -48.523755));
        nos.add(vertices);


        vertices = new Vertices();
        vertices.setId(5);
        vertices.setmLocal("Enseada do Pântano do Sul");
        vertices.setPosicao(new LatLng(-27.793935, -48.524677));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(6);
        vertices.setmLocal("Enseada do Pântano do Sul");
        vertices.setPosicao(new LatLng(-27.798453, -48.524033));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(7);
        vertices.setmLocal("Enseada do Pântano do Sul");
        vertices.setPosicao(new LatLng(-27.808551, -48.521974));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(8);
        vertices.setmLocal("Ponto norte anterios a ilha do  meio irmão");
        vertices.setPosicao(new LatLng(-27.817205, -48.519742));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(9);
        vertices.setmLocal("Ilha da irmã pequena, lateral ilha do meio irmão");
        vertices.setPosicao(new LatLng(-27.823885, -48.532273));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(10);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.832842, -48.535535));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(11);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.841267, -48.545469));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(12);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.850324, -48.569701));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(13);
        vertices.setmLocal("Passagem esqurda direão ao meio  ilha do meio irmao e irmã de fora");
        vertices.setPosicao(new LatLng(-27.827038, -48.514492));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(14);
        vertices.setmLocal("Meio  ilha do meio irmao e irmã de fora");
        vertices.setPosicao(new LatLng(-27.836868, -48.512947));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(15);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.842484, -48.515307));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(16);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.855098, -48.525335));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(17);
        vertices.setmLocal("Saida da Ilha do meio imrão");
        vertices.setPosicao(new LatLng(-27.851107, -48.523365));
        nos.add(vertices);

        vertices.setId(18);
        vertices.setmLocal("Passagem esquerda  Ilha da Irmã de fora");
        vertices.setPosicao(new LatLng(-27.829401, -48.498259));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(19);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.837788, -48.493624));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(20);
        vertices.setmLocal("Passagem pela Ilha da Imã de fora");
        vertices.setPosicao(new LatLng(-27.841052, -48.495684));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(21);
        vertices.setmLocal("Saida da ILha de Irmã de fora");
        vertices.setPosicao(new LatLng(-27.848148, -48.503152));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(22);
        vertices.setmIcon(R.drawable.ic_flag);
        vertices.setmLocal("ic_flag a praia da Ponta do papagaio");
        vertices.setPosicao(new LatLng(-27.849110, -48.576910));
        nos.add(vertices);


        Aresta aresta = new Aresta();
        aresta.setId(1);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(1));
        aresta.setCorrente(false);
        aresta.setVento(false);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(2);
        aresta.setNoMaritmo1(nos.get(1));
        aresta.setNoMaritmo2(nos.get(2));
        aresta.setCorrente(false);
        aresta.setVento(false);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(3);
        aresta.setNoMaritmo1(nos.get(2));
        aresta.setNoMaritmo2(nos.get(3));
        aresta.setCorrente(false);
        aresta.setVento(false);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(4);
        aresta.setNoMaritmo1(nos.get(3));
        aresta.setNoMaritmo2(nos.get(4));
        aresta.setCorrente(false);
        aresta.setVento(false);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(5);
        aresta.setNoMaritmo1(nos.get(4));
        aresta.setNoMaritmo2(nos.get(5));
        aresta.setCorrente(false);
        aresta.setVento(false);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(6);
        aresta.setNoMaritmo1(nos.get(5));
        aresta.setNoMaritmo2(nos.get(6));
        aresta.setCorrente(false);
        aresta.setVento(false);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(7);
        aresta.setNoMaritmo1(nos.get(6));
        aresta.setNoMaritmo2(nos.get(7));
        aresta.setCorrente(false);
        aresta.setVento(false);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(8);
        aresta.setNoMaritmo1(nos.get(7));
        aresta.setNoMaritmo2(nos.get(8));
        aresta.setCorrente(true);
        aresta.setVento(true);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(9);
        aresta.setNoMaritmo1(nos.get(7));
        aresta.setNoMaritmo2(nos.get(12));
        aresta.setCorrente(true);
        aresta.setVento(true);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(10);
        aresta.setNoMaritmo1(nos.get(7));
        aresta.setNoMaritmo2(nos.get(17));
        aresta.setCorrente(true);
        aresta.setVento(false);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(11);
        aresta.setNoMaritmo1(nos.get(12));
        aresta.setNoMaritmo2(nos.get(13));
        aresta.setCorrente(false);
        aresta.setVento(false);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(12);
        aresta.setNoMaritmo1(nos.get(13));
        aresta.setNoMaritmo2(nos.get(14));
        aresta.setCorrente(false);
        aresta.setVento(false);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(13);
        aresta.setNoMaritmo1(nos.get(16));
        aresta.setNoMaritmo2(nos.get(17));
        aresta.setCorrente(false);
        aresta.setVento(false);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(14);
        aresta.setNoMaritmo1(nos.get(17));
        aresta.setNoMaritmo2(nos.get(18));
        aresta.setCorrente(false);
        aresta.setVento(false);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(15);
        aresta.setNoMaritmo1(nos.get(18));
        aresta.setNoMaritmo2(nos.get(19));
        aresta.setCorrente(true);
        aresta.setVento(false);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(16);
        aresta.setNoMaritmo1(nos.get(19));
        aresta.setNoMaritmo2(nos.get(20));
        aresta.setCorrente(false);
        aresta.setVento(false);
        mArestaList.add(aresta);

//        aresta = new Aresta();
//        aresta.setId(17);
//        aresta.setNoMaritmo1(nos.get(21));
//        aresta.setNoMaritmo2(nos.get(15));
//        aresta.setCorrente(false);
//        aresta.setVento(false);
//        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(18);
        aresta.setNoMaritmo1(nos.get(14));
        aresta.setNoMaritmo2(nos.get(15));
        aresta.setCorrente(false);
        aresta.setVento(false);
        mArestaList.add(aresta);



        aresta = new Aresta();
        aresta.setId(19);
        aresta.setNoMaritmo1(nos.get(13));
        aresta.setNoMaritmo2(nos.get(14));
        aresta.setCorrente(false);
        aresta.setVento(false);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(20);
        aresta.setNoMaritmo1(nos.get(8));
        aresta.setNoMaritmo2(nos.get(9));
        aresta.setCorrente(true);
        aresta.setVento(false);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(21);
        aresta.setNoMaritmo1(nos.get(9));
        aresta.setNoMaritmo2(nos.get(10));
        aresta.setCorrente(false);
        aresta.setVento(false);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(22);
        aresta.setNoMaritmo1(nos.get(20));
        aresta.setNoMaritmo2(nos.get(15));
        aresta.setCorrente(false);
        aresta.setVento(false);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(23);
        aresta.setNoMaritmo1(nos.get(15));
        aresta.setNoMaritmo2(nos.get(11));
        aresta.setCorrente(false);
        aresta.setVento(false);
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(24);
        aresta.setNoMaritmo1(nos.get(10));
        aresta.setNoMaritmo2(nos.get(11));
        aresta.setCorrente(true);
        aresta.setVento(true);
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(25);
        aresta.setNoMaritmo1(nos.get(11));
        aresta.setNoMaritmo2(nos.get(21));
        aresta.setCorrente(false);
        aresta.setVento(false);
        mArestaList.add(aresta);

//        Praia dos Açores Enseada do Pântano do Sul/Praia da Ponta do papagaio
        Rotas rotas = new Rotas();
        rotas.setId(3);
        rotas.setDescricao("CERTO 3");
        rotas.setArestas(mArestaList);
        rotas.setNosMaritmos(nos);

        return rotas;
    }

    public static Rotas Rota5() {
        List<Vertices> nos = new ArrayList<>();
        List<Aresta> mArestaList = new ArrayList<>();

        Vertices vertices = new Vertices();
        vertices.setId(1);
        vertices.setmIcon(R.drawable.ic_boat);
        vertices.setmLocal("Saida de jurere internacional :  Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.435350, -48.502432));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(2);
        vertices.setmLocal("Proximidades da ilha do frances: Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.417524, -48.487296));
        nos.add(vertices);


        vertices = new Vertices();
        vertices.setId(3);
        vertices.setmLocal("Proximidades da ilha do frances lado de fora:Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.411733, -48.477598));
        nos.add(vertices);



        vertices = new Vertices();
        vertices.setId(4);
        vertices.setmLocal("Saida das Proximidades da ilha do frances lado de fora:Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.413943, -48.471847));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(5);
        vertices.setmLocal("Saida das Proximidades Canas vieiras: Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.414247, -48.463264));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(6);
        vertices.setmLocal("Proximidades da ilha do frances lado de dentro ");
        vertices.setPosicao(new LatLng(-27.424205, -48.475564));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(7);
        vertices.setmLocal("Saida das Proximidades da ilha do frances lado de dentro:Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.421234, -48.467582));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(8);
        vertices.setmLocal("Proximidades Canas vieiras: Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.417868, -48.456682));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(9);
        vertices.setmLocal("Proximidades Ponta das canas:  Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.409462, -48.443818));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(10);
        vertices.setmIcon(R.drawable.ic_flag);
        vertices.setmLocal("ic_flag a Ponta das canas");
        vertices.setPosicao(new LatLng(-27.401538, -48.431458));
        nos.add(vertices);


        Aresta aresta = new Aresta();
        aresta.setId(1);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(1));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(2);
        aresta.setNoMaritmo1(nos.get(1));
        aresta.setNoMaritmo2(nos.get(2));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(3);
        aresta.setNoMaritmo1(nos.get(2));
        aresta.setNoMaritmo2(nos.get(3));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(4);
        aresta.setNoMaritmo1(nos.get(3));
        aresta.setNoMaritmo2(nos.get(4));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(5);
        aresta.setNoMaritmo1(nos.get(4));
        aresta.setNoMaritmo2(nos.get(7));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(6);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(5));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(7);
        aresta.setNoMaritmo1(nos.get(5));
        aresta.setNoMaritmo2(nos.get(6));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(8);
        aresta.setNoMaritmo1(nos.get(6));
        aresta.setNoMaritmo2(nos.get(7));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(9);
        aresta.setNoMaritmo1(nos.get(7));
        aresta.setNoMaritmo2(nos.get(8));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(10);
        aresta.setNoMaritmo1(nos.get(8));
        aresta.setNoMaritmo2(nos.get(9));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


//        Saida de jurere internacional /ic_flag a Ponta das canas

        Rotas rotas = new Rotas();
        rotas.setId(5);
        rotas.setDescricao("CERTA 5");
        rotas.setArestas(mArestaList);
        rotas.setNosMaritmos(nos);

        return rotas;
    }

    public static Rotas Rota6() {
        List<Vertices> nos = new ArrayList<>();
        List<Aresta> mArestaList = new ArrayList<>();

        Vertices vertices = new Vertices();
        vertices.setId(1);
        vertices.setmIcon(R.drawable.ic_boat);
        vertices.setmLocal("Saida Garopaba: Santa Catarina");
        vertices.setPosicao(new LatLng(-28.029592, -48.599380));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(2);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.998979, -48.595260));
        nos.add(vertices);


        vertices = new Vertices();
        vertices.setId(3);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.967751, -48.599380));
        nos.add(vertices);



        vertices = new Vertices();
        vertices.setId(4);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.940761, -48.586333));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(5);
        vertices.setmLocal("Proximidades a guarda do Embau Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.919224, -48.567451));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(6);
        vertices.setmLocal("Proximidades a guarda do Embau  passagem ao meio entre a ilha de Garopaba Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.910123, -48.550628));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(7);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.876138, -48.492263));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(8);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.818461, -48.440078));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(9);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.003235, -48.571641));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(10);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.968977, -48.552243));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(11);
        vertices.setmLocal("Lado direito ilha da Garopaba  Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.949265, -48.529820 ));
        nos.add(vertices);



        vertices = new Vertices();
        vertices.setId(12);
        vertices.setmLocal("Passada  direito ilha da Garopaba  Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.940280, -48.522696));
        nos.add(vertices);



        vertices = new Vertices();
        vertices.setId(13);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.923484, -48.519306));
        nos.add(vertices);



        vertices = new Vertices();
        vertices.setId(14);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.875468, -48.52243));
        nos.add(vertices);



        vertices = new Vertices();
        vertices.setId(15);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.848758, -48.484330));
        nos.add(vertices);



        vertices = new Vertices();
        vertices.setId(16);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.822952, -48.466820));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(17);
        vertices.setmIcon(R.drawable.ic_flag);
        vertices.setmLocal("ic_flag Ilha de Santa Catarina");
        vertices.setPosicao(new LatLng(-27.764967, -48.484087));
        nos.add(vertices);


        Aresta aresta = new Aresta();
        aresta.setId(1);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(1));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(2);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(8));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(3);
        aresta.setNoMaritmo1(nos.get(1));
        aresta.setNoMaritmo2(nos.get(2));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(4);
        aresta.setNoMaritmo1(nos.get(2));
        aresta.setNoMaritmo2(nos.get(3));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(5);
        aresta.setNoMaritmo1(nos.get(3));
        aresta.setNoMaritmo2(nos.get(4));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(6);
        aresta.setNoMaritmo1(nos.get(4));
        aresta.setNoMaritmo2(nos.get(5));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(7);
        aresta.setNoMaritmo1(nos.get(5));
        aresta.setNoMaritmo2(nos.get(13));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(8);
        aresta.setNoMaritmo1(nos.get(8));
        aresta.setNoMaritmo2(nos.get(9));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(9);
        aresta.setNoMaritmo1(nos.get(9));
        aresta.setNoMaritmo2(nos.get(10));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(10);
        aresta.setNoMaritmo1(nos.get(10));
        aresta.setNoMaritmo2(nos.get(11));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(11);
        aresta.setNoMaritmo1(nos.get(6));
        aresta.setNoMaritmo2(nos.get(14));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(12);
        aresta.setNoMaritmo1(nos.get(11));
        aresta.setNoMaritmo2(nos.get(12));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(13);
        aresta.setNoMaritmo1(nos.get(15));
        aresta.setNoMaritmo2(nos.get(16));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(14);
        aresta.setNoMaritmo1(nos.get(6));
        aresta.setNoMaritmo2(nos.get(12));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(15);
        aresta.setNoMaritmo1(nos.get(13));
        aresta.setNoMaritmo2(nos.get(14));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(16);
        aresta.setNoMaritmo1(nos.get(14));
        aresta.setNoMaritmo2(nos.get(7));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(17);
        aresta.setNoMaritmo1(nos.get(7));
        aresta.setNoMaritmo2(nos.get(15));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(18);
        aresta.setNoMaritmo1(nos.get(14));
        aresta.setNoMaritmo2(nos.get(15));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(19);
        aresta.setNoMaritmo1(nos.get(7));
        aresta.setNoMaritmo2(nos.get(16));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        Rotas rotas = new Rotas();
        rotas.setId(6);
        rotas.setDescricao("CERTA 4");
        rotas.setArestas(mArestaList);
        rotas.setNosMaritmos(nos);


        return rotas;
    }


    public static Rotas Rota7() {
        List<Vertices> nos = new ArrayList<>();
        List<Aresta> mArestaList = new ArrayList<>();

        Vertices vertices = new Vertices();
        vertices.setId(1);
        vertices.setmIcon(R.drawable.ic_boat);
        vertices.setmLocal("Saida Joaquina Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.630815, -48.449901));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(2);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.638876, -48.450416));
        nos.add(vertices);


        vertices = new Vertices();
        vertices.setId(3);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.646783, -48.456081));
        nos.add(vertices);



        vertices = new Vertices();
        vertices.setId(4);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.653778, -48.460887));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(5);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.663509, -48.454536));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(6);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.676127, -48.449901));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(7);
        vertices.setmLocal("Proximo ao Campeche direta Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.656185, -48.463518));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(8);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.662571, -48.466779));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(9);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.670933, -48.471586));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(10);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.683702, -48.472444));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(11);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.692367, -48.472101));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(12);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.697839, -48.473131));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(13);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.701030, -48.472273));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(14);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.705894, -48.471071));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(15);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.706654, -48.468668));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(16);
        vertices.setmLocal("Proximo ao Campeche direta esquerda Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.689517, -48.453540));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(17);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.694533, -48.457231));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(18);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.698940, -48.459548));
        nos.add(vertices);


        vertices = new Vertices();
        vertices.setId(19);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.702208, -48.462295));
        nos.add(vertices);



        vertices = new Vertices();
        vertices.setId(20);
        vertices.setmIcon(R.drawable.ic_flag);
        vertices.setmLocal("ic_flag ao sul da Ilha do Campeche Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.704412, -48.465728));
        nos.add(vertices);



//        Saida Joaquina Oceano Atlântico Su /ic_flag ao sul da Ilha do Campeche Oceano Atlântico Sul
        Rotas rotas = new Rotas();
        rotas.setId(7);
        rotas.setDescricao("CERTA 6");
        rotas.setArestas(mArestaList);
        rotas.setNosMaritmos(nos);

        return rotas;
    }
    public static Rotas Rota9() {
        List<Vertices> nos = new ArrayList<>();
        List<Aresta> mArestaList = new ArrayList<>();

        Vertices vertices = new Vertices();
        vertices.setId(1);
        vertices.setmIcon(R.drawable.ic_boat);
        vertices.setmLocal("Saida laguna Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.488745, -48.761960));
        nos.add(vertices);

//        Lado 1
        vertices = new Vertices();
        vertices.setId(2);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.475880, -48.749189));
        nos.add(vertices);


        vertices = new Vertices();
        vertices.setId(3);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.458677, -48.747129));
        nos.add(vertices);



        vertices = new Vertices();
        vertices.setId(4);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.434225, -48.728246));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(5);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.416109, -48.717603));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(6);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.392856, -48.709707));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(7);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.377150, -48.681898));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(8);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.341198, -48.674345));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(9);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.320044, -48.680524));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(10);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.283770, -48.671941));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(11);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.262151, -48.655805));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(12);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.248542, -48.660698));
        nos.add(vertices);

//        Lado 2
        vertices = new Vertices();
        vertices.setId(13);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.487934, -48.744492));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(14);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.484948, -48.748677));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(15);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.476988, -48.747347));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(16);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.471141, -48.745631));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(17);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.466161, -48.726254));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(18);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.460565, -48.710842));
        nos.add(vertices);


        vertices = new Vertices();
        vertices.setId(19);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.454226, -48.695049));
        nos.add(vertices);



        vertices = new Vertices();
        vertices.setId(20);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.443963, -48.684406));
        nos.add(vertices);


        vertices = new Vertices();
        vertices.setId(21);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.412865, -48.686466));
        nos.add(vertices);


        vertices = new Vertices();
        vertices.setId(22);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.261966, -48.626817));
        nos.add(vertices);


        vertices = new Vertices();
        vertices.setId(23);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.252516, -48.626388));
        nos.add(vertices);


        vertices = new Vertices();
        vertices.setId(24);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.245257, -48.648618));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(25);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.244501, -48.655828));
        nos.add(vertices);


        vertices = new Vertices();
        vertices.setId(26);
        vertices.setmIcon(R.drawable.ic_flag);
        vertices.setmLocal("ic_flag Imbituba:Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-28.244156, -48.660440));
        nos.add(vertices);

        Aresta aresta = new Aresta();
        aresta.setId(1);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(1));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(2);
        aresta.setNoMaritmo1(nos.get(1));
        aresta.setNoMaritmo2(nos.get(2));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(3);
        aresta.setNoMaritmo1(nos.get(2));
        aresta.setNoMaritmo2(nos.get(3));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(4);
        aresta.setNoMaritmo1(nos.get(3));
        aresta.setNoMaritmo2(nos.get(4));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(5);
        aresta.setNoMaritmo1(nos.get(4));
        aresta.setNoMaritmo2(nos.get(5));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(6);
        aresta.setNoMaritmo1(nos.get(5));
        aresta.setNoMaritmo2(nos.get(6));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(7);
        aresta.setNoMaritmo1(nos.get(6));
        aresta.setNoMaritmo2(nos.get(7));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(8);
        aresta.setNoMaritmo1(nos.get(7));
        aresta.setNoMaritmo2(nos.get(8));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(9);
        aresta.setNoMaritmo1(nos.get(8));
        aresta.setNoMaritmo2(nos.get(9));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(10);
        aresta.setNoMaritmo1(nos.get(9));
        aresta.setNoMaritmo2(nos.get(10));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(11);
        aresta.setNoMaritmo1(nos.get(10));
        aresta.setNoMaritmo2(nos.get(11));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(12);
        aresta.setNoMaritmo1(nos.get(11));
        aresta.setNoMaritmo2(nos.get(25));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(13);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(12));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(14);
        aresta.setNoMaritmo1(nos.get(12));
        aresta.setNoMaritmo2(nos.get(13));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(15);
        aresta.setNoMaritmo1(nos.get(13));
        aresta.setNoMaritmo2(nos.get(14));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(16);
        aresta.setNoMaritmo1(nos.get(14));
        aresta.setNoMaritmo2(nos.get(15));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(17);
        aresta.setNoMaritmo1(nos.get(15));
        aresta.setNoMaritmo2(nos.get(16));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(18);
        aresta.setNoMaritmo1(nos.get(16));
        aresta.setNoMaritmo2(nos.get(17));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(19);
        aresta.setNoMaritmo1(nos.get(17));
        aresta.setNoMaritmo2(nos.get(18));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(20);
        aresta.setNoMaritmo1(nos.get(18));
        aresta.setNoMaritmo2(nos.get(19));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(21);
        aresta.setNoMaritmo1(nos.get(19));
        aresta.setNoMaritmo2(nos.get(20));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(22);
        aresta.setNoMaritmo1(nos.get(20));
        aresta.setNoMaritmo2(nos.get(6));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(23);
        aresta.setNoMaritmo1(nos.get(10));
        aresta.setNoMaritmo2(nos.get(21));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(24);
        aresta.setNoMaritmo1(nos.get(21));
        aresta.setNoMaritmo2(nos.get(22));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(25);
        aresta.setNoMaritmo1(nos.get(22));
        aresta.setNoMaritmo2(nos.get(23));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(26);
        aresta.setNoMaritmo1(nos.get(23));
        aresta.setNoMaritmo2(nos.get(24));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);



        aresta = new Aresta();
        aresta.setId(27);
        aresta.setNoMaritmo1(nos.get(24));
        aresta.setNoMaritmo2(nos.get(25));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


//        Saida laguna /ic_flag Imbitub

        Rotas rotas = new Rotas();
        rotas.setId(9);
        rotas.setDescricao("CERTA 7");
        rotas.setArestas(mArestaList);
        rotas.setNosMaritmos(nos);

        return rotas;
    }

    public static Rotas Rota10() {
        List<Vertices> nos = new ArrayList<>();
        List<Aresta> mArestaList = new ArrayList<>();

        Vertices vertices = new Vertices();
        vertices.setId(1);
        vertices.setmIcon(R.drawable.ic_boat);
        vertices.setmLocal("Saida Porto Belo Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.147987, -48.559763));
        nos.add(vertices);

//      Caminho 1
        vertices = new Vertices();
        vertices.setId(2);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.129655, -48.565942));
        nos.add(vertices);


        vertices = new Vertices();
        vertices.setId(3);
        vertices.setmLocal("Proximidades de itapema Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.105132, -48.592979));
        nos.add(vertices);



        vertices = new Vertices();
        vertices.setId(4);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.081292, -48.577186));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(5);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.081750, -48.575727));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(6);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.024344, -48.567466));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(7);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.014786, -48.566865));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(8);
        vertices.setmLocal("Proximidades a taquara Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.005457, -48.565921));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(9);
        vertices.setmLocal("Taquara Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.006222, -48.577251));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(10);
        vertices.setmLocal("Taquara Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-26.998421, -48.579225));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(11);
        vertices.setmLocal("Saida de Taquara Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-26.993144, -48.578967));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(12);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-26.989664, -48.585791));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(13);
        vertices.setmLocal("Praia de Laramjeiras Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-26.990162, -48.593086));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(14);
        vertices.setmLocal("Proximidades de Molhe da Barra Sul Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-26.994559, -48.603171));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(15);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.000869, -48.614759));
        nos.add(vertices);

//        Caminho 2
        vertices = new Vertices();
        vertices.setId(16);
        vertices.setmLocal("Direção a ilha de porto Bello Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.146354, -48.543669));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(17);
        vertices.setmLocal("Ilha de Porto Belo Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.140320, -48.538562));
        nos.add(vertices);

        vertices = new Vertices();
        vertices.setId(18);
        vertices.setmLocal("Saida da Ilha de Porto Belo Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.134783, -48.535988));
        nos.add(vertices);


        vertices = new Vertices();
        vertices.setId(19);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.129092, -48.540708));
        nos.add(vertices);



        vertices = new Vertices();
        vertices.setId(20);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.120689, -48.565814));
        nos.add(vertices);

//        Liga com caminho 3
        vertices = new Vertices();
        vertices.setId(21);
        vertices.setmLocal("Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-27.106097, -48.539678));
        nos.add(vertices);


        vertices = new Vertices();
        vertices.setId(22);
        vertices.setmIcon(R.drawable.ic_flag);
        vertices.setmLocal("Praia central de Balneario Camburiú Oceano Atlântico Sul");
        vertices.setPosicao(new LatLng(-26.995219, -48.622677));
        nos.add(vertices);

        Aresta aresta = new Aresta();
        aresta.setId(1);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(1));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(2);
        aresta.setNoMaritmo1(nos.get(1));
        aresta.setNoMaritmo2(nos.get(2));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(3);
        aresta.setNoMaritmo1(nos.get(2));
        aresta.setNoMaritmo2(nos.get(3));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(4);
        aresta.setNoMaritmo1(nos.get(3));
        aresta.setNoMaritmo2(nos.get(4));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(5);
        aresta.setNoMaritmo1(nos.get(4));
        aresta.setNoMaritmo2(nos.get(5));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(6);
        aresta.setNoMaritmo1(nos.get(5));
        aresta.setNoMaritmo2(nos.get(6));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(7);
        aresta.setNoMaritmo1(nos.get(6));
        aresta.setNoMaritmo2(nos.get(7));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(8);
        aresta.setNoMaritmo1(nos.get(7));
        aresta.setNoMaritmo2(nos.get(8));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(9);
        aresta.setNoMaritmo1(nos.get(8));
        aresta.setNoMaritmo2(nos.get(9));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(10);
        aresta.setNoMaritmo1(nos.get(9));
        aresta.setNoMaritmo2(nos.get(10));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(11);
        aresta.setNoMaritmo1(nos.get(10));
        aresta.setNoMaritmo2(nos.get(11));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(12);
        aresta.setNoMaritmo1(nos.get(11));
        aresta.setNoMaritmo2(nos.get(12));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(13);
        aresta.setNoMaritmo1(nos.get(12));
        aresta.setNoMaritmo2(nos.get(13));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(14);
        aresta.setNoMaritmo1(nos.get(13));
        aresta.setNoMaritmo2(nos.get(14));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(15);
        aresta.setNoMaritmo1(nos.get(14));
        aresta.setNoMaritmo2(nos.get(21));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(16);
        aresta.setNoMaritmo1(nos.get(0));
        aresta.setNoMaritmo2(nos.get(15));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(17);
        aresta.setNoMaritmo1(nos.get(15));
        aresta.setNoMaritmo2(nos.get(16));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(18);
        aresta.setNoMaritmo1(nos.get(16));
        aresta.setNoMaritmo2(nos.get(17));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(19);
        aresta.setNoMaritmo1(nos.get(17));
        aresta.setNoMaritmo2(nos.get(18));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);


        aresta = new Aresta();
        aresta.setId(20);
        aresta.setNoMaritmo1(nos.get(18));
        aresta.setNoMaritmo2(nos.get(19));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(21);
        aresta.setNoMaritmo1(nos.get(19));
        aresta.setNoMaritmo2(nos.get(20));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        aresta = new Aresta();
        aresta.setId(22);
        aresta.setNoMaritmo1(nos.get(20));
        aresta.setNoMaritmo2(nos.get(5));
        aresta.setCorrente(false);
        aresta.setVento(false);
    
        mArestaList.add(aresta);

        Rotas rotas = new Rotas();
        rotas.setId(23);
        rotas.setDescricao(" Porto Belo /Balneario Camburiú");
        rotas.setArestas(mArestaList);
        rotas.setNosMaritmos(nos);

        return rotas;
    }



}
