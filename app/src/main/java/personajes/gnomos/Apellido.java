package personajes.gnomos;

import utilidades.Dado;
import utilidades.HerramientasTexto;

/**
 * Created by Klaussius on 15/11/2016.
 */

class Apellido {
    //Comienzo apellidos
    private String comienzos[]={
            "be",
            "daer",
            "fol",
            "ga",
            "na",
            "mur",
            "nin",
            "raul",
            "sche",
            "tim",
            "tu"
    };

    //Finales apellidos
    private String finales[]={
            "ren",
            "gel",
            "kor",
            "rick",
            "ckle",
            "nig",
            "nor",
            "ppen",
            "bers",
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
