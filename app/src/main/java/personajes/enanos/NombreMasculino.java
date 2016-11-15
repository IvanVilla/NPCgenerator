package personajes.enanos;

import utilidades.Dado;
import utilidades.HerramientasTexto;

/**
 * Nombres de personajes.enanos masculinos
 * Created by Klaussius on 15/11/2016.
 */

public class NombreMasculino {

    //Comienzo nombres
    private String comienzos[]={
            "a",
            "albe",
            "baern",
            "ba",
            "brot",
            "brue",
            "dain",
            "dar",
            "delg",
            "e",
            "ein",
            "far",
            "flint",
            "gar",
            "har",
            "kil",
            "mor",
            "or",
            "os",
            "ran",
            "ru",
            "tak",
            "thora",
            "tho",
            "tor",
            "trau",
            "tra",
            "ulf",
            "veit",
            "von"
    };

    //Finales nombres
    private String finales[]={
            "bek",
            "berk",
            "bon",
            "dain",
            "dal",
            "dek",
            "din",
            "drak",
            "drik",
            "endd",
            "gar",
            "gran",
            "grim",
            "in",
            "kar",
            "kil",
            "linn",
            "nor",
            "rak",
            "rik",
            "rin",
            "rich",
            "sik",
            "tor",
            "vok"
    };

    //Nombre
    private String nombre;

    /**
     * Constructor
     */
    public NombreMasculino() {
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
