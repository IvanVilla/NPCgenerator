package detalles;

import utilidades.Dado;

/**
 * Ideales de los perosnajes
 * Created by Klaussius on 14/11/2016.
 */
public class Ideales {

    //Ideal del personaje
    private String ideal;

    //Ideales
    private String ideales[] = {
            "Alguna aspiración (cualquiera)",
            "Caridad (bueno)",
            "La comunidad (legal)",
            "Creatividad (caótico)",
            "Descubrir cosas (cualquiera)",
            "La justicia (legal)",
            "La libertad (caótico)",
            "La gloria (cualquiera)",
            "Un bien mayor (bueno)",
            "La codicia (malvado)",
            "El honor (legal)",
            "La independencia (caótico)",
            "El conocimiento (neutral)",
            "Proteger la vida (bueno)",
            "Vivir y dejar vivir (neutral)",
            "Poder (malvado)",
            "La nación (cualquiera)",
            "La gente (neutral)",
            "El poder (malvado)",
            "La redención (cualquiera)"
    };

    /**
     * Constructor
     */
    public Ideales(){
        Dado dado = new Dado();
        this.ideal=ideales[dado.tirada(ideales.length)];
    }

    /**
     * Devuelve el ideal
     * @return ideal
     */
    public String getIdeal() {
        return ideal;
    }
}
