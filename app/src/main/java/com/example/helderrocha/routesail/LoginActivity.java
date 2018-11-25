package com.example.helderrocha.routesail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.helderrocha.routesail.api.Course;
import com.example.helderrocha.routesail.api.UdacityCatalog;
import com.example.helderrocha.routesail.api.UdacityService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginActivity extends AppCompatActivity {

    private Button buttonCadastre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        buttonCadastre  = (Button) findViewById(R.id.button_cadastre);

        buttonCadastre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CadastreActivity.class);
                startActivity(intent);
            }
        });

    }
}
