package com.example.helderrocha.routesail.api;



import android.util.Log;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class UserRest {

//    private final DetailsScreenPresenter mDetailsScreenPresenter;
//.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
    private final ApiService api = new Retrofit.Builder()
            .baseUrl(ApiService.URL)
            .client(new OkHttpClient.Builder().build())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService.class);
String suce;
    public void createUsers(String userBody) {
        api.createUsers(ApiService.API_KEY, userBody)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(response -> {
                    Log.i("SUCESSAGEM", response.token);
                });
    }
}
