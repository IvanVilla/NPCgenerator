package ficha;

import utilidades.Dado;

/**
 * Lazos de los personajes
 * Created by Klaussius on 14/11/2016.
 */
public class Lazos {

    //Lazo del personaje
    private String lazo;

    //Lazos
    private String lazos[] = {
            "Objetivo o logro personal",
            "Miembros de la familia",
            "Colegas o compatriotas",
            "Benefactor, patrón o empleador",
            "Interés romántico",
            "Lugar especial",
            "Recuerdo",
            "Posesión valiosa",
            "Venganza"
    };

    /**
     * Constructor
     */
    public Lazos(){
        Dado dado = new Dado();
        this.lazo=lazos[dado.tirada(lazos.length)];
    }

    /**
     * Devuelve el lazo
     * @return lazo
     */
    public String getLazo() {
        return lazo;
    }
}
