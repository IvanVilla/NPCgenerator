package personajes.elfos;

import utilidades.Dado;
import utilidades.HerramientasTexto;

/**
 * Created by Klaussius on 15/11/2016.
 */

class Apellido {
    //Comienzo apellidos
    private String comienzos[]={
            "ama",
            "amas",
            "gala",
            "holi",
            "ilphel",
            "lia",
            "meli",
            "naï",
            "sian",
            "silos"
    };

    //Finales apellidos
    private String finales[]={
            "amne",
            "cient",
            "don",
            "kiir",
            "lo",
            "mion",
            "nodel",
            "tacia"
    };

    //Nombre
    private String apellido;

    /**
     * Constructor
     */
    Apellido() {
        Dado dado = new Dado();
        // Creo el Apellido
        apellido = comienzos[dado.tirada(comienzos.length)]+finales[dado.tirada(finales.length)];
        // Paso la primera letra a mayúsculas
        HerramientasTexto capitalizar = new HerramientasTexto();
        apellido =capitalizar.primeraMayuscula(apellido);
    }

    /**
     * Devuelve el Apellido
     * @return Apellido
     */
    String getApellido() {
        return apellido;
    }
}
