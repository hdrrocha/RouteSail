package com.example.helderrocha.routesail.models;

import java.util.List;

/**
 * Created by helderrocha on 04/10/17.
 */

public class Rotas {
    private Integer mId;
    private String mDescricao;
    private List<NoMaritmo> mNosMaritmos;
    private List<Aresta> mArestas;

    public Integer getId() {
        return mId;
    }

    public void setId(Integer mId) {
        this.mId = mId;
    }

    public String getDescricao() {
        return mDescricao;
    }

    public void setDescricao(String mDescricao) {
        this.mDescricao = mDescricao;
    }

    public List<NoMaritmo> getNosMaritmos() {
        return mNosMaritmos;
    }

    public void setNosMaritmos(List<NoMaritmo> mNosMaritmos) {
        this.mNosMaritmos = mNosMaritmos;
    }

    public List<Aresta> getArestas() {
        return mArestas;
    }

    public void setArestas(List<Aresta> mArestas) {
        this.mArestas = mArestas;
    }

    @Override
    public String toString() {
        return mDescricao;
    }
}
