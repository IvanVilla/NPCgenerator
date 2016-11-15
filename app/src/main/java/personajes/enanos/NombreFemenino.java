package personajes.enanos;

import utilidades.Dado;
import utilidades.HerramientasTexto;

/**
 * Nombres de personajes.enanos femeninos
 * Created by Klaussius on 15/11/2016.
 */

public class NombreFemenino {
    //Comienzo nombres
    private String comienzos[]={
            "am",
            "ar",
            "aud",
            "bar",
            "dag",
            "die",
            "el",
            "falk",
            "fine",
            "gunn",
            "gur",
            "hel",
            "hlin",
            "kath",
            "kris",
            "il",
            "lift",
            "mard",
            "ris",
            "san",
            "tor",
            "torg",
            "vis"
    };

    //Finales nombres
    private String finales[]={
            "ber",
            "de",
            "deth",
            "dis",
            "dred",
            "dryn",
            "ga",
            "hild",
            "ja",
            "llen",
            "loda",
            "nal",
            "ra",
            "runn",
            "sa",
            "tin",
            "tra",
            "tryd",
            "wynn"
    };

    //Nombre
    private String nombre;

    /**
     * Constructor
     */
    public NombreFemenino() {
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
