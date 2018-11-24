package com.example.helderrocha.routesail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.helderrocha.routesail.api.UserRest;
import com.example.helderrocha.routesail.models.User;

import org.json.JSONException;
import org.json.JSONObject;

public class CadastreActivity extends AppCompatActivity {

    private ImageButton  buttonSave;
    private EditText editText;
    private  EditText editTextPassword;
    private  EditText editTextPasswordConfirm;
    private UserRest userRest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastre_activity);

        buttonSave = (ImageButton) findViewById(R.id.buttonOk);
        editText =  (EditText) findViewById(R.id.editText);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextPasswordConfirm =  (EditText) findViewById(R.id.editTextPasswordConfirm);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Helder", "Tocou");
                String senha;
                String confimarSenha;
                String email;
                senha =  editTextPassword.getText().toString();
                confimarSenha  = editTextPasswordConfirm.getText().toString();
                email = editText.getText().toString();

                Log.i("Helder > senha", senha);
                Log.i("Helder > confimarSenha", confimarSenha);
                userRest = new UserRest();
                if(senha.equals(confimarSenha)){
                    Log.i("Helder > Entrou", "shdiaushdiuash");

//                    String body;
                    JSONObject body = new JSONObject();
                    try {
                        body.put("password", senha);
                        body.put("loginEmail", email);

                        Log.i("Helder > body", body.toString());

                        userRest.createUsers(body.toString());

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
