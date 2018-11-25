package com.example.helderrocha.routesail;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Toast;

import com.example.helderrocha.routesail.api.ApiService;
import com.example.helderrocha.routesail.api.Course;
import com.example.helderrocha.routesail.api.UdacityCatalog;
import com.example.helderrocha.routesail.api.UdacityService;
import com.example.helderrocha.routesail.api.UserRest;
import com.example.helderrocha.routesail.models.User;

import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class CadastreActivity extends AppCompatActivity {

    private ImageButton  buttonSave;
    private EditText editText;
    private  EditText editTextPassword;
    private  EditText editTextPasswordConfirm;
    private UserRest userRest;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastre_activity);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        buttonSave = (ImageButton) findViewById(R.id.buttonOk);
        editText =  (EditText) findViewById(R.id.editText);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextPasswordConfirm =  (EditText) findViewById(R.id.editTextPasswordConfirm);
        progressBar.setVisibility(View.GONE);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
                interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(ApiService.URL)
                        .client(client)
                        .addConverterFactory(ScalarsConverterFactory.create())
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                ApiService apiInterface = retrofit.create(ApiService.class);

                // prepare call in Retrofit 2.0
                try {
                    JSONObject paramObject = new JSONObject();
                    paramObject.put("loginEmail", editText.getText().toString());
                    paramObject.put("password", editTextPassword.getText().toString());

                    Call<User> userCall = apiInterface.criarUsuario(paramObject.toString());

                    userCall.enqueue(new Callback<User>() {
                        @Override
                        public void onResponse(Call<User> call, Response<User> response) {
                            if(response.isSuccessful()) {
                                progressBar.setVisibility(View.GONE);
                                onBackPressed();
                                Log.i("Finotti", "EUPA:"+ response.code());
                            } else {
                                progressBar.setVisibility(View.GONE);

                                Context context = getApplicationContext();
                                CharSequence text = "ERROR: "+ response.code();
                                int duration = Toast.LENGTH_SHORT;

                                Toast toast = Toast.makeText(context, text, duration);
                                toast.show();

                                Log.i("Finotti", "Nao rolou:"+ response.code());
                            }

                        }

                        @Override
                        public void onFailure(Call<User> call, Throwable t) {
                            Log.i("Finotti", t.getMessage());
                        }
                    });
                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        });
    }
}
