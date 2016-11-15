package personajes.elfos;

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
            "al",
            "anas",
            "andras",
            "anti",
            "beth",
            "bi",
            "cae",
            "drusi",
            "en",
            "felo",
            "iele",
            "jelen",
            "key",
            "les",
            "lia",
            "merie",
            "mia",
            "nai",
            "nal",
            "que",
            "quil",
            "sa",
            "shana",
            "sha",
            "sila",
            "their",
            "thi",
            "vada",
            "valan",
            "xana"
    };

    //Finales nombres
    private String finales[]={
            "astra",
            "drie",
            "ele",
            "irra",
            "lee",
            "lathe",
            "lenna",
            "lia",
            "lynn",
            "nia",
            "nua",
            "phia",
            "qui",
            "rel",
            "riel",
            "rynna",
            "thaea",
            "te",
            "the",
            "trianna",
            "va",
            "vara"
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
