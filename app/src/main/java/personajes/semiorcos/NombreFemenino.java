package personajes.semiorcos;

import utilidades.Dado;
import utilidades.HerramientasTexto;

/**
 * Nombres elfos femeninos
 * Created by Klaussius on 15/11/2016.
 */

class NombreFemenino {
    //Comienzo nombres
    private String comienzos[]={
            "ba",
            "e",
            "en",
            "kan",
            "my",
            "nee",
            "o",
            "own",
            "shau",
            "su",
            "vo",
            "yevel"
    };

    //Finales nombres
    private String finales[]={
            "ggi",
            "men",
            "gong",
            "sif",
            "ev",
            "ga",
            "vak",
            "ka",
            "tha",
            "la",
            "len",
            "da"
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
