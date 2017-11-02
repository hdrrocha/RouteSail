package com.example.helderrocha.routesail;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonComecar;
    private Button buttonEscolherRota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadComponents();
        loadEventsComponents();
    }



    private void loadComponents() {
        buttonComecar = (Button) findViewById(R.id.buttonComecar);
        buttonEscolherRota  = (Button) findViewById(R.id.buttonEscolherRota);
    }

    private void loadEventsComponents() {
        buttonComecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityRoteChoose.class);
                i.putExtra("velocidade", "");
                startActivity(i);
            }
        });

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
