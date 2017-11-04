package com.example.helderrocha.routesail.models;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

/**
 * Created by helderrocha on 04/10/17.
 */

public class Vertices {
    private Integer mId;
    private LatLng mPosicao;
    private String mLocal;
    private int mIcon;
    private boolean isInicial;


    private List<Aresta> mAresta;

    public Integer getId() {
        return mId;
    }

    public void setId(Integer mId) {
        this.mId = mId;
    }

    public LatLng getPosicao() {
        return mPosicao;
    }

    public void setPosicao(LatLng mPosicao) {
        this.mPosicao = mPosicao;
    }

    public String getmLocal() {
        return mLocal;
    }

    public void setmLocal(String mLocal) {
        this.mLocal = mLocal;
    }

    public int getmIcon() {
        return mIcon;
    }

    public void setmIcon(int mIcon) {
        this.mIcon = mIcon;
    }

    public List<Aresta> getmAresta() {
        return mAresta;
    }

    public void setmAresta(List<Aresta> mAresta) {
        this.mAresta = mAresta;
    }

    public boolean isInicial() {
        return isInicial;
    }

    public void setInicial(boolean inicial) {
        isInicial = inicial;
    }
}
