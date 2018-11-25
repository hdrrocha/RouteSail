package com.example.helderrocha.routesail;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.helderrocha.routesail.api.ApiService;
import com.example.helderrocha.routesail.api.Course;
import com.example.helderrocha.routesail.api.UdacityCatalog;
import com.example.helderrocha.routesail.api.UdacityService;
import com.example.helderrocha.routesail.models.User;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class LoginActivity extends AppCompatActivity {

    private Button buttonCadastre;
    private ImageButton buttonLogin;
    private  EditText editEmail;
    private EditText editPassword;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);


        buttonCadastre  = (Button) findViewById(R.id.button_cadastre);
        buttonLogin  = (ImageButton) findViewById(R.id.buttonLogin);
        editEmail = (EditText) findViewById(R.id.editEmail);
        editPassword = (EditText) findViewById(R.id.editPassword);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
                interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
                    httpClient.addInterceptor(interceptor);
                    httpClient.addInterceptor(new Interceptor() {
                        @Override
                        public okhttp3.Response intercept(Chain chain) throws IOException {
                            Request original = chain.request();

                            String email = editEmail.getText().toString();
                            String senha = editPassword.getText().toString();

                            Request request = original.newBuilder()
//                                    .header("Authorization", "Basic " + Base64.encodeToString((email+":"+senha).getBytes(), Base64.NO_WRAP))
                                    .header("Authorization", "Basic " + Base64.encodeToString(("devmuch3@gmail.com:!Q2w3e4r").getBytes(), Base64.NO_WRAP))
                                    .header("Accept", "application/json")
                                    .method(original.method(), original.body())
                                    .build();

                            return chain.proceed(request);
                        }
                    });


                OkHttpClient client =  httpClient.build();

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
                    paramObject.put("loginEmail", editEmail.getText().toString());
                    String email = editEmail.getText().toString();
                    String senha = editPassword.getText().toString();

                    Call<User> userCall = apiInterface.loginUsuario();

                    userCall.enqueue(new Callback<User>() {
                        @Override
                        public void onResponse(Call<User> call, Response<User> response) {
                            if(response.isSuccessful()) {
                                progressBar.setVisibility(View.GONE);
                                Log.i("Mensagem: ", "Dev:"+ response.code());
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);

                            } else {
                                progressBar.setVisibility(View.GONE);

                                Context context = getApplicationContext();
                                CharSequence text = "ERROR: "+ response.code();
                                int duration = Toast.LENGTH_SHORT;

                                Toast toast = Toast.makeText(context, text, duration);
                                toast.show();

                                Log.i("Mensagem", "Dev:"+ response.code());
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


        buttonCadastre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CadastreActivity.class);
                startActivity(intent);
            }
        });

    }

    public static String sha256(String base) {
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(base.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();

            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public static String base64(String base) {
        try{
//            byte[] bytesEncoded = Base64.encodeBase64(str.getBytes());
            // Sending side
            byte[] data = base.getBytes(StandardCharsets.UTF_8);
            String base64 = Base64.encodeToString(data, Base64.DEFAULT);


            return base64.toString();
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
