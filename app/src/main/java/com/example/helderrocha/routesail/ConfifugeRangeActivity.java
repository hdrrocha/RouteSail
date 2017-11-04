package com.example.helderrocha.routesail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class ConfifugeRangeActivity extends AppCompatActivity {
    private TextView editTextRange;
    private ImageButton buttonMais;
    private ImageButton buttonMenos;

    private ImageButton buttonVelocidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confifuge_range);

        loadComponents();
        loadEventsComponents();
    }


    private void loadComponents() {
        editTextRange = (TextView) findViewById(R.id.editTextRange);
        editTextRange.setText(String.valueOf(0.0));
        buttonMais = (ImageButton) findViewById(R.id.buttonMais);
        buttonMenos  = (ImageButton) findViewById(R.id.buttonMenos);
        buttonVelocidade = (ImageButton) findViewById(R.id.buttonVelocidade);
    }

    private void loadEventsComponents() {
        buttonMais.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Double mais = Double.valueOf(editTextRange.getText().toString());
                mais = mais+1;
                editTextRange.setText(String.valueOf(mais));
            }
        });
        buttonMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double menos = Double.valueOf(editTextRange.getText().toString());
                menos  = menos-1;
                editTextRange.setText(String.valueOf(menos));
            }
        });

        buttonVelocidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent();
                String rangeSelecionado =  editTextRange.getText().toString();
                returnIntent.putExtra("RangeSelecionadaId", rangeSelecionado);
                setResult(DestinoActivity.RESULT_OK_VELOCIDADE,returnIntent);
                finish();
            }
        });

    }

}
