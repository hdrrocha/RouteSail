package com.example.helderrocha.routesail;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SpeedActivity extends Activity {
    private EditText edtSpeed;
    private Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);

        edtSpeed = findViewById(R.id.textViewSpeed);
        edtSpeed.getBackground().setAlpha(0);
        edtSpeed.setTextColor(Color.WHITE);
        edtSpeed.setHint("0.0 Km/h");
        btnCalcular = findViewById(R.id.buttonCalculo);


        btnCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("velocidade", edtSpeed.getText().toString());
                startActivity(i);
            }
        });
    }
}
