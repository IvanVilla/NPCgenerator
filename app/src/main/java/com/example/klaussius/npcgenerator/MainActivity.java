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
import personajes.generico.PersonajeGenerico;

public class MainActivity extends AppCompatActivity {

    // TextViews
    TextView tvNombre;
    TextView tvCaracteristica;
    TextView tvIdeal;
    TextView tvDefecto;
    TextView tvLazo;

    // Spinners
    Spinner spRazaPersonaje;
    Spinner spSexoPersonaje;

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

        // Inicializo el spinner de razas y su adaptador
        spRazaPersonaje = (Spinner)findViewById(R.id.spRazaPersonaje);
        ArrayAdapter<CharSequence> adaptadorRaza =
                ArrayAdapter.createFromResource(this,R.array.selectorRaza,android.R.layout.simple_spinner_item);
        adaptadorRaza.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spRazaPersonaje.setAdapter(adaptadorRaza);

        // Inicializo el spinner de sexo y su adaptador
        spSexoPersonaje = (Spinner)findViewById(R.id.spSexoPersonaje);
        ArrayAdapter<CharSequence> adaptadorSexo =
                ArrayAdapter.createFromResource(this,R.array.selectorSexo,android.R.layout.simple_spinner_item);
        adaptadorSexo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spSexoPersonaje.setAdapter(adaptadorSexo);

        // Botón de generar personaje
        btGenerarPersonaje = (Button)findViewById(R.id.btGenerarPersonaje);
        btGenerarPersonaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pj = spRazaPersonaje.getSelectedItem().toString();
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
        String sexo = spSexoPersonaje.getSelectedItem().toString();
        switch (spRazaPersonaje.getSelectedItem().toString()){
            case "Elfos":
                if (sexo.equals("Masculino")){
                    personaje = new personajes.elfos.Masculino();
                } else {
                    personaje = new personajes.elfos.Femenino();
                }
                break;
            case "Dracónicos":
                if (sexo.equals("Masculino")){
                    personaje = new personajes.draconicos.Masculino();
                } else {
                    personaje = new personajes.draconicos.Femenino();
                }
                break;
            case "Enanos":
                if (sexo.equals("Masculino")){
                    personaje = new personajes.enanos.Masculino();
                } else {
                    personaje = new personajes.enanos.Femenino();
                }
                break;
            case "Gnomos":
                if (sexo.equals("Masculino")){
                    personaje = new personajes.gnomos.Masculino();
                } else {
                    personaje = new personajes.gnomos.Femenino();
                }
                break;
            case "Medianos":
                if (sexo.equals("Masculino")){
                    personaje = new personajes.medianos.Masculino();
                } else {
                    personaje = new personajes.medianos.Femenino();
                }
                break;
            case "Semiorcos":
                if (sexo.equals("Masculino")){
                    personaje = new personajes.semiorcos.Masculino();
                } else {
                    personaje = new personajes.semiorcos.Femenino();
                }
                break;
            case "Tieflings":
                if (sexo.equals("Masculino")){
                    personaje = new personajes.tieflings.Masculino();
                } else {
                    personaje = new personajes.tieflings.Femenino();
                }
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
