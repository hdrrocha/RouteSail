package com.example.helderrocha.routesail.api;


import com.example.helderrocha.routesail.models.User;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiService {
    String URL = " https://sandbox.openrainbow.com/api/rainbow/";
    String API_KEY = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJjb3VudFJlbmV3ZWQiOjAsIm1heFRva2VuUmVuZXciOjcsInVzZXIiOnsiaWQiOiI1YmY5OGI1MzA4MThhOTY2ZGE5Y2Y4YzQiLCJsb2dpbkVtYWlsIjoiZ2VuYXJvY29sdXNzb0BnbWFpbC5jb20ifSwiaWF0IjoxNTQzMDg1NzM0LCJleHAiOjE1NDQzODE3MzR9.fIZVbSBgHdFTRqzZ5yXIv3bXsGUfiUQb4WHb1fTmXwappVlWMkVX_UGUSbGPQ7XqoeltZ4XQqid_YTmbssocx2HGRFAA_MBjlfhryQlkJzRP_toiWGTlOVQ2109mIxJXln2G58FJEHxQahRbPH_PQ6p6j1EqWsrCOMJKORpX0-RB7J0dR6tHg1tM6d_l9zbbGqFJCHv0b8f8QKV0HoUz90xYyUz3Gi-MQgRjZqX1ByXyNvpG6U1egBC510mMI_hUqAKv4de0Mco0mw79Or8MaLEc2bouAkFQC-7TOhvTaR326cjshdooJUfsqaMQx5MV_wuMwPkyJ-ILd5ff_2u_Gw";


    @POST("admin/v1.0/users")
    Observable<User> createUsers(
            @Header("authorization") String auth,
            @Body String userBody
    );

    @Headers({
            "Content-Type: application/json",
            "Authorization: " + API_KEY
    })

    @POST("admin/v1.0/users")
    Call<User> criarUsuario(@Body String body);


    @GET("authentication/v1.0/login")
    Call<User> loginUsuario();


}
