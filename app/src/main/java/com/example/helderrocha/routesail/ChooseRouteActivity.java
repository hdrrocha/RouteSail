package com.example.helderrocha.routesail;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class ChooseRouteActivity extends AppCompatActivity {
    private Spinner spnOpcoes;
    private ArrayAdapter<String> adpOpcoes;
    private  ArrayAdapter<String> adpDados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_route);

        Button btnCallActivity = (Button) findViewById(R.id.btnNavegar);
        Spinner spnRoute = (Spinner)findViewById(R.id.spnRoute);
        btnCallActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ChooseRouteActivity.this, MapsActivity.class);
                startActivity(i);
            }
        });

        adpOpcoes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adpOpcoes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnRoute.setAdapter(adpOpcoes);
        adpOpcoes.add("Viado");
        adpOpcoes.add("Bixa Loka");
        adpOpcoes.add("Maxo Alfa");
        adpOpcoes.add("Femea");
        adpDados = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

    }
}
