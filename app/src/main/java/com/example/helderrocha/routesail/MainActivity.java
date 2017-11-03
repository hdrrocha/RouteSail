package com.example.helderrocha.routesail;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.helderrocha.routesail.models.Rotas;

public class MainActivity extends AppCompatActivity {

    private ImageButton buttonEscolherRota;

    static final int ROTE_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadComponents();
        loadComponentsValues();
        loadEventsComponents();
    }




    private void loadComponents() {
        buttonEscolherRota  = (ImageButton) findViewById(R.id.buttonEscolherRota);
    }
    private void loadComponentsValues() {

    }
    private void loadEventsComponents() {


        buttonEscolherRota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("velocidade", "");
                startActivity(i);
            }
        });
    }

}
