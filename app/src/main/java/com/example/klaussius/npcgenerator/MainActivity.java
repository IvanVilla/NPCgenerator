package com.example.klaussius.npcgenerator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ficha.Personaje;

public class MainActivity extends AppCompatActivity {

    TextView tvNombre;
    TextView tvCaracteristica;
    TextView tvIdeal;
    TextView tvDefecto;
    TextView tvLazo;

    Button btGenerarPersonaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Inicializo los textView
        tvNombre = (TextView)findViewById(R.id.tvNombre);
        tvCaracteristica = (TextView)findViewById(R.id.tvCaracteristica);
        tvIdeal = (TextView)findViewById(R.id.tvIdeal);
        tvDefecto = (TextView)findViewById(R.id.tvDefecto);
        tvLazo = (TextView)findViewById(R.id.tvLazo);

        // Botón de generar personaje
        btGenerarPersonaje = (Button)findViewById(R.id.btGenerarPersonaje);
        btGenerarPersonaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generarPersonaje();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

    // Mi código

    /**
     * Genera un personaje, llena los textView...
     */
    public void generarPersonaje(){
        Personaje personaje = new Personaje();
        tvNombre.setText(personaje.getNombre());
        tvCaracteristica.setText(personaje.getCaracteristica());
        tvIdeal.setText(personaje.getIdeal());
        tvDefecto.setText(personaje.getDefecto());
        tvLazo.setText(personaje.getLazo());
    }
}
