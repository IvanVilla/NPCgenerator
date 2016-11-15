package com.example.klaussius.npcgenerator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import personajes.Personaje;
import personajes.enanos.EnanoFemenino;
import personajes.enanos.EnanoMasculino;
import personajes.generico.PersonajeGenerico;

public class MainActivity extends AppCompatActivity {

    // TextViews
    TextView tvNombre;
    TextView tvCaracteristica;
    TextView tvIdeal;
    TextView tvDefecto;
    TextView tvLazo;

    // Spinners
    Spinner spTipoPersonaje;

    // Buttons
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

        // Inicializo el spinner y su adaptador
        spTipoPersonaje = (Spinner)findViewById(R.id.spTipoPersonaje);
        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(this,R.array.selectorRaza,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spTipoPersonaje.setAdapter(adapter);



        // Botón de generar personaje
        btGenerarPersonaje = (Button)findViewById(R.id.btGenerarPersonaje);
        btGenerarPersonaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pj = spTipoPersonaje.getSelectedItem().toString();
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
     * Genera un personaje, rellena los textviews
     */
    public void generarPersonaje(){
        Personaje personaje;
        switch (spTipoPersonaje.getSelectedItem().toString()){
            case "Enano masculino":
                personaje = new EnanoMasculino();
                break;
            case "Enano femenino":
                personaje = new EnanoFemenino();
                break;
            default:
                personaje = new PersonajeGenerico();
        }
        tvNombre.setText(personaje.getNombre());
        tvCaracteristica.setText(personaje.getCaracteristica());
        tvIdeal.setText(personaje.getIdeal());
        tvDefecto.setText(personaje.getDefecto());
        tvLazo.setText(personaje.getLazo());
    }

}
