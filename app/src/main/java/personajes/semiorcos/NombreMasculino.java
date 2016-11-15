package personajes.semiorcos;

import utilidades.Dado;
import utilidades.HerramientasTexto;

/**
 * Nombres de elfos masculinos
 * Created by Klaussius on 15/11/2016.
 */

class NombreMasculino {
    //Comienzo nombres
    private String comienzos[]={
            "d",
            "f",
            "g",
            "h",
            "",
            "k",
            "kr",
            "mh",
            "r",
            "sh",
            "th"
    };

    //Medios nombres
    private String medios[]={
            "a",
            "e",
            "i",
            "o",
            "u"
    };

    //Finales nombres
    private String finales[]={
            "nch",
            "ng",
            "ll",
            "nk",
            "lg",
            "msh",
            "th",
            "sk",
            "rren",
            "nt",
            "mp",
            "kk"
    };

    //Nombre
    private String nombre;

    /**
     * Constructor
     */
    NombreMasculino() {
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
