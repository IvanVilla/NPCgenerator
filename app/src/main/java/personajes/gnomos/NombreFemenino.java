package personajes.gnomos;

import utilidades.Dado;
import utilidades.HerramientasTexto;

/**
 * Nombres elfos femeninos
 * Created by Klaussius on 15/11/2016.
 */

class NombreFemenino {
    //Comienzo nombres
    private String comienzos[]={
            "bimp",
            "bree",
            "cara",
            "car",
            "done",
            "duva",
            "e",
            "elly",
            "li",
            "loop",
            "lori",
            "mard",
            "ni",
            "o",
            "or",
            "roy",
            "sha",
            "ta",
            "way",
            "za"
    };

    //Finales nombres
    private String finales[]={
            "nottin",
            "na",
            "mip",
            "lin",
            "lla",
            "jobell",
            "wick",
            "lli",
            "mottin",
            "lla",
            "nab",
            "ssa",
            "da",
            "la",
            "wyn",
            "mil",
            "na",
            "wocket",
            "nna"
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
