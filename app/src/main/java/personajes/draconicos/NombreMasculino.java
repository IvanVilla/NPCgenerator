package personajes.draconicos;

import utilidades.Dado;
import utilidades.HerramientasTexto;

/**
 * Nombres de elfos masculinos
 * Created by Klaussius on 15/11/2016.
 */

class NombreMasculino {
    //Comienzo nombres
    private String comienzos[]={
            "to",
            "tar",
            "she",
            "sha",
            "rho",
            "pa",
            "pand",
            "na",
            "me",
            "kriv",
            "hes",
            "do",
            "bha",
            "bala",
            "arj"
    };

    //Finales nombres
    private String finales[]={
            "rinn",
            "hun",
            "dinn",
            "mash",
            "gar",
            "trin",
            "jed",
            "daar",
            "hen",
            "drash",
            "",
            "sh",
            "kan",
            "naar",
            "rash",
            "sar",
            "han"
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
