package personajes.tieflings;

import utilidades.Dado;
import utilidades.HerramientasTexto;

/**
 * Created by Klaussius on 15/11/2016.
 */

class Apellido {
    //Comienzo apellidos
    private String comienzos[]={
            "arte",
            "carroña",
            "canto",
            "credo",
            "desesperación",
            "excelencia",
            "miedo",
            "gloria",
            "esperanza",
            "ideal",
            "música",
            "ningún lugar",
            "abierto",
            "poesía",
            "misión",
            "caos",
            "reverencia",
            "pena",
            "temeridad",
            "tormento",
            "cansancio"
    };

    //Nombre
    private String apellido;

    /**
     * Constructor
     */
    Apellido() {
        Dado dado = new Dado();
        // Creo el Apellido
        apellido = comienzos[dado.tirada(comienzos.length)];
        // Paso la primera letra a mayúsculas
        HerramientasTexto capitalizar = new HerramientasTexto();
        apellido =capitalizar.primeraMayuscula(apellido);
    }

    /**
     * Devuelve el Apellido
     * @return Apellido
     */
    String getApellido() {
        return apellido;
    }
}
