package com.example.helderrocha.routesail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.helderrocha.routesail.models.Rotas;

public class DestinoActivity extends AppCompatActivity {

    public static final int RESULT_OK_VELOCIDADE = 2;
    private TextView textViewDestino;
    private Button buttonRange;
    private ImageButton buttonIniciar;
    private String rotaId;
    private String range;
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
                startActivityForResult(i, 1);
            }
        });

        buttonRange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ConfifugeRangeActivity.class);
                startActivityForResult(i, 2);
            }
        });

        buttonIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), MapsActivity.class);
                if(rotaId != null && range != null){
                    intent.putExtra("RotaSelecionadaId", rotaId);
                    intent.putExtra("velocidade", range.toString());

                }
                startActivity(intent);

            }
        });
    }


    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {

            if (resultCode == RESULT_OK)
            {
                String descricao= intent.getStringExtra("RotaSelecionadaDescricao");
                rotaId = intent.getStringExtra("RotaSelecionadaId");
                textViewDestino.setText(descricao);
            }

        if (resultCode == RESULT_OK_VELOCIDADE)
        {
            range = intent.getStringExtra("RangeSelecionadaId");
            buttonRange.setText(range);
        }
        }

}
