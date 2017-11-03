package com.example.helderrocha.routesail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class DestinoActivity extends AppCompatActivity {

    private TextView textViewDestino;
    private Button buttonRange;
    private ImageButton buttonIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destino);

        loadComponents();
        loadEventsComponents();
    }

    private void loadComponents() {
        textViewDestino = (TextView) findViewById(R.id.textViewDestino);
        buttonRange = (Button) findViewById(R.id.buttonRange);
        buttonIniciar = (ImageButton) findViewById(R.id.buttonIniciar);
    }

    private void loadEventsComponents() {
        textViewDestino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), EscolherRotaActivity.class);
                startActivity(i);
            }
        });

        buttonRange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ConfifugeRangeActivity.class);
                startActivity(i);
            }
        });

        buttonIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(i);
            }
        });
    }
}
