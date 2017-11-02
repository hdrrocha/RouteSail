package com.example.helderrocha.routesail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ConfifugeRangeActivity extends AppCompatActivity {
    private EditText editTextRange;
    private Button buttonMais;
    private Button buttonMenos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confifuge_range);

        loadComponents();
        loadEventsComponents();
    }


    private void loadComponents() {
         editTextRange = (EditText) findViewById(R.id.editTextRange);
        editTextRange.setText(String.valueOf(1));
         buttonMais = (Button) findViewById(R.id.buttonMais);
        buttonMenos  = (Button) findViewById(R.id.buttonMais);
    }

    private void loadEventsComponents() {
        buttonMais.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int mais = Integer.parseInt(editTextRange.getText().toString());
                mais =+ 1;
                editTextRange.setText(String.valueOf(mais));
            }
        });
        buttonMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int menos = Integer.parseInt(editTextRange.getText().toString());
                menos =- 1;
                editTextRange.setText(String.valueOf(menos));
            }
        });
    }

}
