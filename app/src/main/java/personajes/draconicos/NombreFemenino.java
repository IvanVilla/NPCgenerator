package personajes.draconicos;

import utilidades.Dado;
import utilidades.HerramientasTexto;

/**
 * Nombres elfos femeninos
 * Created by Klaussius on 15/11/2016.
 */

class NombreFemenino {
    //Comienzo nombres
    private String comienzos[]={
            "a",
            "bi",
            "da",
            "fari",
            "ha",
            "havi",
            "jhe",
            "ka",
            "ko",
            "mi",
            "na",
            "pe",
            "rai",
            "so",
            "suri",
            "tha",
            "ua"
    };

    //Finales nombres
    private String finales[]={
            "kra",
            "ri",
            "ar",
            "deh",
            "rann",
            "lar",
            "ri",
            "va",
            "rinn",
            "hann",
            "la",
            "rra",
            "ann",
            "ra",
            "na",
            "va",
            "djit"
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
