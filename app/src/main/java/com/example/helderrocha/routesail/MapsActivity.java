package com.example.helderrocha.routesail;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.helderrocha.routesail.models.Aresta;
import com.example.helderrocha.routesail.models.NoMaritmo;
import com.example.helderrocha.routesail.models.Rotas;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
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

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap map;
    //    GoogleMap map;
    ArrayList<LatLng> markerPoints;
    private AutoCompleteTextView mEditRotas;

    private List<NoMaritmo> nos;
    private List<Aresta> mArestaList;
    private List<Rotas> mRotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mEditRotas = findViewById(R.id.rotas);
        mRotas = new ArrayList<>();
        mapFragment.getMapAsync(this);


        ArrayAdapter<Rotas> adapterRotas = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, mRotas);
        mEditRotas.setAdapter(adapterRotas);

        mEditRotas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                nos = mRotas.get(i).getNosMaritmos();
                mArestaList = mRotas.get(i).getArestas();

                InputMethodManager in = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                in.hideSoftInputFromWindow(mEditRotas.getApplicationWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);


                carregarGrafo();
            }
        });

        mEditRotas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View arg0) {
                mEditRotas.showDropDown();
            }
        });




    }

    private void loadDefaultNos(){
//        nos = new ArrayList<>();
//        NoMaritmo noMaritmo = new NoMaritmo();
//        noMaritmo.setId(1);
//        noMaritmo.setPosicao(new LatLng(-20,-30));
//        nos.add(noMaritmo);
//        noMaritmo = new NoMaritmo();
//        noMaritmo.setId(2);
//        noMaritmo.setPosicao(new LatLng(-20,-20));
//        nos.add(noMaritmo);
//        noMaritmo = new NoMaritmo();
//        noMaritmo.setId(3);
//        noMaritmo.setPosicao(new LatLng(-20,-10));
//        nos.add(noMaritmo);
//        noMaritmo = new NoMaritmo();
//        noMaritmo.setId(4);
//        noMaritmo.setPosicao(new LatLng(-10,-10));
//        nos.add(noMaritmo);
//
//        mArestaList = new ArrayList<>();
//        Aresta aresta = new Aresta();
//        aresta.setNoMaritmo1(nos.get(0));
//        aresta.setNoMaritmo2(nos.get(1));
//        aresta.setCorrente(3);
//        aresta.setVento(3);
//        aresta.setDistancia(50D);
//        mArestaList.add(aresta);
//
//        aresta = new Aresta();
//        aresta.setNoMaritmo1(nos.get(0));
//        aresta.setNoMaritmo2(nos.get(3));
//        aresta.setCorrente(9);
//        aresta.setVento(1);
//        aresta.setDistancia(900D);
//        mArestaList.add(aresta);
//
//        aresta = new Aresta();
//        aresta.setNoMaritmo1(nos.get(1));
//        aresta.setNoMaritmo2(nos.get(2));
//        aresta.setCorrente(5);
//        aresta.setVento(2);
//        aresta.setDistancia(30D);
//        mArestaList.add(aresta);
//
//        aresta = new Aresta();
//        aresta.setNoMaritmo1(nos.get(1));
//        aresta.setNoMaritmo2(nos.get(3));
//        aresta.setCorrente(15);
//        aresta.setVento(3);
//        aresta.setDistancia(500D);
//        mArestaList.add(aresta);
//
//        aresta = new Aresta();
//        aresta.setNoMaritmo1(nos.get(2));
//        aresta.setNoMaritmo2(nos.get(3));
//        aresta.setCorrente(1);
//        aresta.setVento(3);
//        aresta.setDistancia(600D);
//        mArestaList.add(aresta);
//
//        Rotas rotas = new Rotas();
//        rotas.setId(1);
//        rotas.setDescricao("Rota teste");
//        rotas.setArestas(mArestaList);
//        rotas.setNosMaritmos(nos);
//
//
//        mRotas.add(rotas);
        mRotas.add(CarregadorDeRotas.Rota1());
        mRotas.add(CarregadorDeRotas.Rota2());
        mRotas.add(CarregadorDeRotas.Rota3());
    }


    private String getDirectionsUrl(LatLng origin, LatLng dest) {

        // Origin of route
        String str_origin = "origin=" + origin.latitude + "," + origin.longitude;

        // Destination of route
        String str_dest = "destination=" + dest.latitude + "," + dest.longitude;


        // Sensor enabled
        String sensor = "sensor=false";

        // Building the parameters to the web service
        String parameters = str_origin + "&" + str_dest + "&" + sensor;

        // Output format
        String output = "json";

        // Building the url to the web service
        String url = "https://maps.googleapis.com/maps/api/directions/" + output + "?" + parameters;


        return url;
    }


    /**
     * A method to download json data from url
     */
    @SuppressLint("LongLogTag")
    private String downloadUrl(String strUrl) throws IOException {
        String data = "";
        InputStream iStream = null;
        HttpURLConnection urlConnection = null;
        try {
            URL url = new URL(strUrl);

            // Creating an http connection to communicate with url
            urlConnection = (HttpURLConnection) url.openConnection();

            // Connecting to url
            urlConnection.connect();

            // Reading data from url
            iStream = urlConnection.getInputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(iStream));

            StringBuffer sb = new StringBuffer();

            String line = "";
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

            data = sb.toString();

            br.close();

        } catch (Exception e) {
            Log.d("Exception while downloading url", e.toString());
        } finally {
            iStream.close();
            urlConnection.disconnect();
        }
        return data;
    }


    // Fetches data from url passed
    private class DownloadTask extends AsyncTask<String, Void, String> {

        // Downloading data in non-ui thread
        @Override
        protected String doInBackground(String... url) {

            // For storing data from web service
            String data = "";

            try {
                // Fetching the data from web service
                data = downloadUrl(url[0]);
            } catch (Exception e) {
                Log.d("Background Task", e.toString());
            }
            return data;
        }

        // Executes in UI thread, after the execution of
        // doInBackground()
        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);

            ParserTask parserTask = new ParserTask();

            // Invokes the thread for parsing the JSON data
            parserTask.execute(result);

        }
    }


    @Override
    public void onMapReady(final GoogleMap googleMap) {

        map = googleMap;
        // Initializing
        markerPoints = new ArrayList<LatLng>();
        LatLng santaCatarina = new LatLng(-27.588462, -48.336853);
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(santaCatarina));
        googleMap.animateCamera( CameraUpdateFactory.zoomTo( 8.0f ) );
        loadDefaultNos();
    }

    private void carregarGrafo() {
        map.clear();
        for (NoMaritmo no : nos) {
            map.addMarker(new MarkerOptions().position(no.getPosicao()));

        }
        for (Aresta aresta : mArestaList) {
            PolylineOptions polylineOptions = new PolylineOptions();
            switch (aresta.getVento()) {
                case 1:
                    polylineOptions.color(Color.GREEN);
                    break;
                case 2:
                    polylineOptions.color(Color.YELLOW);
                    break;
                case 3:
                    polylineOptions.color(Color.RED);
                    break;
            }
            polylineOptions.width(aresta.getCorrente());
            polylineOptions.add(aresta.getNoMaritmo1().getPosicao());
            polylineOptions.add(aresta.getNoMaritmo2().getPosicao());
            map.addPolyline(polylineOptions);
        }
    }


    /**
     * A class to parse the Google Places in JSON format
     */
    private class ParserTask extends AsyncTask<String, Integer, List<List<HashMap<String, String>>>> {

        // Parsing the data in non-ui thread
        @Override
        protected List<List<HashMap<String, String>>> doInBackground(String... jsonData) {

            JSONObject jObject;
            List<List<HashMap<String, String>>> routes = null;

            try {
                jObject = new JSONObject(jsonData[0]);
                DirectionsJSONParser parser = new DirectionsJSONParser();

                // Starts parsing data
                routes = parser.parse(jObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return routes;
        }

        // Executes in UI thread, after the parsing process
        @Override
        protected void onPostExecute(List<List<HashMap<String, String>>> result) {
            ArrayList<LatLng> points = null;
            PolylineOptions lineOptions = new PolylineOptions();
            MarkerOptions markerOptions = new MarkerOptions();

            // Traversing through all the routes
            for (int i = 0; i < result.size(); i++) {
                points = new ArrayList<LatLng>();
                lineOptions = new PolylineOptions();

                // Fetching i-th route
                List<HashMap<String, String>> path = result.get(i);

                // Fetching all the points in i-th route
                for (int j = 0; j < path.size(); j++) {
                    HashMap<String, String> point = path.get(j);

                    double lat = Double.parseDouble(point.get("lat"));
                    double lng = Double.parseDouble(point.get("lng"));
                    LatLng position = new LatLng(lat, lng);

                    points.add(position);
                }

                // Adding all the points in the route to LineOptions
                lineOptions.addAll(points);
                lineOptions.width(2);
                lineOptions.color(Color.RED);

            }

            // Drawing polyline in the Google Map for the i-th route
            map.addPolyline(lineOptions);
        }
    }

}
