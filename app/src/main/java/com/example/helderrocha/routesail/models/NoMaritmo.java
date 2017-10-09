package com.example.helderrocha.routesail.models;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

/**
 * Created by helderrocha on 04/10/17.
 */

public class NoMaritmo {
    private Integer mId;
    private LatLng mPosicao;
    private String mLocal;

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
}
