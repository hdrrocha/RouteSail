package com.example.helderrocha.routesail;

import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MapLineActivity extends AppCompatActivity implements OnMapReadyCallback {
//    GoogleMap googleMapmap;
    ArrayList<LatLng> markerPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_map_line);


        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_map_line);
        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

        mapFragment.getMapAsync(this);

        Bundle extras = getIntent().getExtras();
        String value;
        if (extras != null) {
            value = extras.getString("velocidade");
            Log.w("PAULINHO", value);
        }

    }

    // Include the OnCreate() method here too, as described above.
    @Override
    public void onMapReady(final GoogleMap googleMap) {
        // Add a marker in Sydney, Australia,
        // and move the map's camera to the same location.
        LatLng sydney = new LatLng(-33.852, 151.211);
        googleMap.addMarker(new MarkerOptions().position(sydney)
                .title("Marker in Sydney"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {

            @Override
            public void onMapClick(LatLng point) {
                // TODO Auto-generated method stub
//                List<LatLng> lstLatLngs = null;
                markerPoints = new ArrayList<>();
                markerPoints.add(point);
//                googleMap.clear();
                googleMap.addMarker(new MarkerOptions().position(point));
            }
        });
    }

    public boolean validaNo(boolean correnteFavor,  boolean vento) {

        if(vento && correnteFavor){
            //vento contra e corrente a favor
            return true;
        } else if(vento){
            //sem corrente mas vento contra
            return true;
        }else if(correnteFavor){
            //sem vento mas corrente a favor
        }else{
            //distancia
        }
        return false;
    }

    public Double calculaVelocidadeAlternada(Double velocidadeCorrente,  Double velocidadeBarco) {
        return velocidadeCorrente + velocidadeBarco;
    }

}
