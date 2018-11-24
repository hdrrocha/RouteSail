package com.example.helderrocha.routesail.api;



import android.util.Log;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;


public class UserRest {

//    private final DetailsScreenPresenter mDetailsScreenPresenter;

    private final Api api = new Retrofit.Builder()
            .baseUrl(Api.URL)
            .client(new OkHttpClient.Builder().build())
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(Api.class);
String suce;
    public void createUsers(String userBody) {
        api.createUsers(Api.API_KEY, userBody)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(response -> {
                    Log.i("SUCESSAGEM", response.getLoginEmail());
                });
    }
}
