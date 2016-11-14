package ficha;

import utilidades.Dado;

/**
 * Defectos de los personajes
 * Created by Klaussius on 14/11/2016.
 */
public class Defectos {

    //Lazo del personaje
    private String defecto;

    //Lazos
    private String defectos[] = {
            "Amor perdido o susceptibilidad romántica",
            "Decadente",
            "Arrogancia",
            "Envidia de las posesiones de alguien",
            "Codicia abrumadora",
            "Propenso a la ira",
            "Tiene un enemigo poderoso",
            "Fobia específica",
            "Secreto escandaloso o vergonzoso",
            "Fechoría o crimen secreto",
            "Posee conocimiento prohibido",
            "Valentía estúpida"
    };

    /**
     * Constructor
     */
    public Defectos(){
        Dado dado = new Dado();
        this.defecto=defectos[dado.tirada(defectos.length)];
    }

    /**
     * Devuelve el defecto
     * @return defecto
     */
    public String getDefecto() {
        return defecto;
    }
}
