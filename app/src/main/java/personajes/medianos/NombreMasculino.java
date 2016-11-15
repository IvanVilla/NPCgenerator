package personajes.medianos;

import utilidades.Dado;
import utilidades.HerramientasTexto;

/**
 * Nombres de elfos masculinos
 * Created by Klaussius on 15/11/2016.
 */

class NombreMasculino {
    //Comienzo nombres
    private String comienzos[]={
            "al",
            "an",
            "ca",
            "co",
            "el",
            "e",
            "fi",
            "ga",
            "lin",
            "ly",
            "me",
            "mi",
            "os",
            "pe",
            "re",
            "ros",
            "well"
    };

    //Finales nombres
    private String finales[]={
            "ton",
            "der",
            "de",
            "rrin",
            "don",
            "rrich",
            "nnan",
            "rret",
            "dal",
            "le",
            "rric",
            "lo",
            "born",
            "rrin",
            "ed",
            "coe",
            "by"
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
