package com.example.helderrocha.routesail.models;

/**
 * Created by helderrocha on 04/10/17.
 */

public class Aresta {
    private Integer mId;
    private NoMaritmo mNoMaritmo1;
    private NoMaritmo mNoMaritmo2;
    private Double mDistancia;
    private Integer mVento;
    private Integer mCorrente;

    public Integer getId() {
        return mId;
    }

    public void setId(Integer mId) {
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

    public Integer getVento() {
        return mVento;
    }

    public void setVento(Integer mVento) {
        this.mVento = mVento;
    }

    public Integer getCorrente() {
        return mCorrente;
    }

    public void setCorrente(Integer mCorrente) {
        this.mCorrente = mCorrente;
    }
}
