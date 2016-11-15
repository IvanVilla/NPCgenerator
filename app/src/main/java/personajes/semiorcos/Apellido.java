package personajes.semiorcos;

import utilidades.Dado;
import utilidades.HerramientasTexto;

/**
 * Created by Klaussius on 15/11/2016.
 */

class Apellido {
    //Comienzo apellidos
    private String comienzos[]={
            "red",
            "brown",
            "yellow",
            "white",
            "black",
            "crush",
            "blind",
            "broken",
            "crushed",
            "cry",
            "death",
            "bleed",
            "wrath",
            "rage",
            "anger",
            "grin",
            "blood"
    };

    //Finales apellidos
    private String finales[]={
            "sand",
            "pike",
            "sword",
            "axe",
            "arrow",
            "skull",
            "bone",
            "moore",
            "cavern",
            "hand",
            "eye",
            "teeth",
            "tooth",
            "finger",
            "foot",
            "head",
            "tears",
            "tomb",
            "demon",
            "devil",
            "fiend",
            "mountain"
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
