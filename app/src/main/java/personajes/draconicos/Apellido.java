package personajes.draconicos;

import utilidades.Dado;
import utilidades.HerramientasTexto;

/**
 * Created by Klaussius on 15/11/2016.
 */

class Apellido {
    //Comienzo apellidos
    private String comienzos[]={
            "clenthin",
            "daarden",
            "delmi",
            "drache",
            "fenken",
            "kepeshk",
            "kerrhy",
            "kimba",
            "linxaka",
            "myas",
            "nemmo",
            "nori",
            "ophinsh",
            "prexijan",
            "shesten",
            "turnu",
            "verthisa",
            "yarje"
    };

    //Finales apellidos
    private String finales[]={
            "thiallor",
            "drian",
            "rev",
            "dandion",
            "kabradon",
            "molik",
            "lon",
            "tuul",
            "sendalor",
            "tan",
            "nis",
            "xius",
            "talajiir",
            "dilin",
            "deliath",
            "roth",
            "thurgiesh",
            "rit"
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
