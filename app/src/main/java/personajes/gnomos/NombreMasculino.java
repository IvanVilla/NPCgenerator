package personajes.gnomos;

import utilidades.Dado;
import utilidades.HerramientasTexto;

/**
 * Nombres de elfos masculinos
 * Created by Klaussius on 15/11/2016.
 */

class NombreMasculino {
    //Comienzo nombres
    private String comienzos[]={
            "als",
            "al",
            "boddy",
            "broc",
            "bur",
            "fru",
            "gli",
            "jebe",
            "ke",
            "nam",
            "o",
            "roon",
            "see",
            "sin",
            "wa",
            "wren",
            "zo"
    };

    //Finales nombres
    private String finales[]={
            "ton",
            "vyn",
            "nock",
            "c",
            "gell",
            "ble",
            "don",
            "ky",
            "kin",
            "g",
            "bo",
            "ble",
            "m",
            "ddo",
            "dri",
            "rryn",
            "n",
            "ok"
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
