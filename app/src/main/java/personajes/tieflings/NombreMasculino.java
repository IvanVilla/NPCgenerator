package personajes.tieflings;

import utilidades.Dado;
import utilidades.HerramientasTexto;

/**
 * Nombres de elfos masculinos
 * Created by Klaussius on 15/11/2016.
 */

class NombreMasculino {
    //Comienzo nombres
    private String comienzos[]={
            "ak",
            "am",
            "bara",
            "dama",
            "eke",
            "la",
            "kai",
            "leu",
            "me",
            "mor",
            "pe",
            "ska",
            "the",
    };

    //Finales nombres
    private String finales[]={
            "menos",
            "non",
            "kas",
            "kos",
            "mon",
            "dos",
            "ron",
            "cis",
            "lech",
            "dai",
            "thos",
            "laios",
            "mos",
            "rai"
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
