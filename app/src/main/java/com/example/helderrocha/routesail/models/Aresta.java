package com.example.helderrocha.routesail.models;

/**
 * Created by helderrocha on 04/10/17.
 */

public class Aresta {
    private int mId;
    private NoMaritmo mNoMaritmo1;
    private NoMaritmo mNoMaritmo2;
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

    public NoMaritmo getNoMaritmo1() {
        return mNoMaritmo1;
    }

    public void setNoMaritmo1(NoMaritmo mNoMaritmo1) {
        this.mNoMaritmo1 = mNoMaritmo1;
    }

    public NoMaritmo getNoMaritmo2() {
        return mNoMaritmo2;
    }

    public void setNoMaritmo2(NoMaritmo mNoMaritmo2) {
        this.mNoMaritmo2 = mNoMaritmo2;
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
