package com.example.helderrocha.routesail;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.example.helderrocha.routesail.models.Rotas;

import java.util.ArrayList;
import java.util.List;

public class ActivityEscolherRota extends AppCompatActivity {
    private AutoCompleteTextView mEditRotas;
    private List<Rotas> mRotas = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolher_rota);
        loadDefaultNos();
        loadComponents();
        loadEventsComponents();


    }

    private void loadComponents(){
        mEditRotas = findViewById(R.id.rotas);
        mEditRotas.setThreshold(1);
        mEditRotas.setAdapter(getRotesAdapter());
    }

    private ArrayAdapter getRotesAdapter(){
//        String [] rotes = {};
//        List<String> wordList = new ArrayList<String>();
//
//        for(int i = 0; i < mRotas.size();i++){
//            rotes[i] = mRotas.get(i).getDescricao().toString();
//            i += 1;
//        }
//
//        Collections.addAll(wordList, roxtes);
//        AutoCompleteAdapter adapter = new AutoCompleteAdapter(this,android.R.layout.simple_dropdown_item_1line,android.R.id.text1,wordList);
        ArrayAdapter<Rotas> adapterRotas = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,android.R.id.text1, mRotas);
        return adapterRotas;
    }

    private void loadDefaultNos(){
        mRotas.add(CarregadorDeRotas.Rota1());
        mRotas.add(CarregadorDeRotas.Rota2());
        mRotas.add(CarregadorDeRotas.Rota3());
        mRotas.add(CarregadorDeRotas.Rota4());
        mRotas.add(CarregadorDeRotas.Rota5());
        mRotas.add(CarregadorDeRotas.Rota6());
        mRotas.add(CarregadorDeRotas.Rota7());
        mRotas.add(CarregadorDeRotas.Rota9());
        mRotas.add(CarregadorDeRotas.Rota10());

    }

    private void loadEventsComponents(){
        mEditRotas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //TO DO
                mRotas.get(i).getNosMaritmos();
                InputMethodManager in = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                in.hideSoftInputFromWindow(mEditRotas.getApplicationWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);

//                Toast.makeText(getApplicationContext(),  "Selecionado",  Toast.LENGTH_SHORT).show();

                Intent returnIntent = new Intent();
                returnIntent.putExtra("result",                mRotas.get(i).getDescricao());
                setResult(MainActivity.RESULT_OK,returnIntent);
                finish();
            }
        });

        mEditRotas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View arg0) {
                mEditRotas.showDropDown();
            }
        });
    }


}
