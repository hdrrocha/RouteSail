package com.example.helderrocha.routesail.models;

/**
 * Created by helderrocha on 04/10/17.
 */

public class Aresta {
    private int mId;
    private Vertices mVertices1;
    private Vertices mVertices2;
    private Double mDistancia;
    private Double mVelocidadeCorrente;
    private Double mVelocidadeVento;
    private boolean mVento;
    private boolean mCorrente;
    private boolean melhorAresta;

    public int getId() {
        return mId;
    }

    public void setId(int mId) {
        this.mId = mId;
    }

    public Vertices getNoMaritmo1() {
        return mVertices1;
    }

    public void setNoMaritmo1(Vertices mVertices1) {
        this.mVertices1 = mVertices1;
    }

    public Vertices getNoMaritmo2() {
        return mVertices2;
    }

    public void setNoMaritmo2(Vertices mVertices2) {
        this.mVertices2 = mVertices2;
    }

    public Double getDistancia() {
        return mDistancia;
    }

    public void setDistancia(Double mDistancia) {
        this.mDistancia = mDistancia;
    }

    public boolean getVento() {
        return mVento;
    }

    public void setVento(boolean mVento) {
        this.mVento = mVento;
    }

    public boolean getCorrente() {
        return mCorrente;
    }

    public void setCorrente(boolean mCorrente) {
        this.mCorrente = mCorrente;
    }

    public boolean isMelhorAresta() {
        return melhorAresta;
    }

    public void setMelhorAresta(boolean melhorAresta) {
        this.melhorAresta = melhorAresta;
    }

    public Double getmVelocidadeCorrente() {
        return mVelocidadeCorrente;
    }

    public void setmVelocidadeCorrente(Double mVelocidadeCorrente) {
        this.mVelocidadeCorrente = mVelocidadeCorrente;
    }

    public Double getmVelocidadeVento() {
        return mVelocidadeVento;
    }

    public void setmVelocidadeVento(Double mVelocidadeVento) {
        this.mVelocidadeVento = mVelocidadeVento;
    }
}
