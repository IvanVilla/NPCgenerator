package personajes.elfos;

import utilidades.Dado;
import utilidades.HerramientasTexto;

/**
 * Nombres de elfos masculinos
 * Created by Klaussius on 15/11/2016.
 */

class NombreMasculino {
    //Comienzo nombres
    private String comienzos[]={
            "a",
            "ae",
            "ara",
            "au",
            "bei",
            "be",
            "car",
            "enia",
            "er",
            "ere",
            "galin",
            "hada",
            "hei",
            "hi",
            "imme",
            "ive",
            "lau",
            "min",
            "pae",
            "pe",
            "qua",
            "ria",
            "ro",
            "sove",
            "tha",
            "the",
            "va"
    };

    //Finales nombres
    private String finales[]={
            "an",
            "cian",
            "dan",
            "dartis",
            "don",
            "dran",
            "lar",
            "len",
            "lias",
            "llios",
            "lis",
            "liss",
            "mil",
            "mior",
            "mo",
            "nnis",
            "ren",
            "rion",
            "rrian",
            "rric",
            "rai",
            "ral",
            "rivol",
            "ris",
            "ro",
            "van",
    };

    //Nombre
    private String nombre;

    /**
     * Constructor
     */
    NombreMasculino() {
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
