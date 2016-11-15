package personajes.generico;

import utilidades.HerramientasTexto;
import utilidades.Dado;

/**
 * Genera un nombre para el personaje
 * Created by Klaussius on 14/11/2016.
 */
public class NombreGenerico {

    // Sílabas iniciales
    private String comienzos[]={
            "",
            "",
            "",
            "",
            "a",
            "be",
            "de",
            "el",
            "fa",
            "jo",
            "ki",
            "la",
            "ma",
            "na",
            "o",
            "pa",
            "re",
            "si",
            "ta",
            "va"
    };

    // Sílabas medias
    private String medios[]={
            "bar",
            "ched",
            "dell",
            "far",
            "gran",
            "hal",
            "jen",
            "kel",
            "lim",
            "mor",
            "net",
            "penn",
            "quil",
            "rond",
            "sark",
            "shen",
            "tur",
            "vash",
            "yor",
            "zen"
    };

    // Sílabas finales
    private String finales[]={
            "",
            "a",
            "ac",
            "ai",
            "al",
            "am",
            "an",
            "ar",
            "ea",
            "el",
            "er",
            "ess",
            "ett",
            "ic",
            "id",
            "il",
            "in",
            "is",
            "or",
            "us"
    };

    // Nombre
    String nombre;

    /**
     * Constructor
     */
    public NombreGenerico(){
        Dado dado = new Dado();
        // Creo el nombre
        nombre = comienzos[dado.tirada(comienzos.length)]+medios[dado.tirada(medios.length)]+finales[dado.tirada(finales.length)];
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
