package personajes.medianos;

import utilidades.Dado;
import utilidades.HerramientasTexto;

/**
 * Nombres elfos femeninos
 * Created by Klaussius on 15/11/2016.
 */

class NombreFemenino {
    //Comienzo nombres
    private String comienzos[]={
            "an",
            "bre",
            "ca",
            "co",
            "euphe",
            "ji",
            "ki",
            "lavi",
            "li",
            "mer",
            "ne",
            "pae",
            "por",
            "sera",
            "shae",
            "try",
            "va",
            "ver"
    };

    //Finales nombres
    private String finales[]={
            "dry",
            "e",
            "llie",
            "ra",
            "mia",
            "llian",
            "thri",
            "nia",
            "dda",
            "la",
            "la",
            "tia",
            "phina",
            "na",
            "me",
            "ni",
            "na"
    };

    //Nombre
    private String nombre;

    /**
     * Constructor
     */
    NombreFemenino() {
        Dado dado = new Dado();
        // Creo el nombre
        nombre = comienzos[dado.tirada(comienzos.length)]+finales[dado.tirada(finales.length)];
        // Paso la primera letra a mayúsculas
        HerramientasTexto capitalizar = new HerramientasTexto();
        nombre=capitalizar.primeraMayuscula(nombre);
    }

    /**
     * Devuelve el nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
}
