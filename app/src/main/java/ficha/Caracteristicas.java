package ficha;

import utilidades.Dado;

/**
 * Características que pueden tener los personajes
 * Created by Klaussius on 14/11/2016.
 */

public class Caracteristicas {

    //Característica del personaje
    private String caracteristica;

    //Características
    private String caracteristicas[] = {
            "Actúa de forma despistada",
            "Es algo arrogante",
            "Parece estar aburrido",
            "Está masticando algo",
            "Es algo torpe",
            "Se muestra bastante curioso",
            "Actúa como si fuera tonto",
            "Parece algo nervioso",
            "Usa palabras erróneas",
            "Se muestra amistoso",
            "Está algo irritable",
            "Puede parecer algo pesimista",
            "Tiene una gran cicatriz",
            "Tartamudea ligeramente",
            "Habla muy alto o con susurros",
            "Bizquea ligeramente",
            "Mantiene las distancias",
            "Parece algo sospechoso",
            "Exclama y jura de forma bastante original",
            "Usa discursos adornados o palabras muy largas"
    };

    /**
     * Constructor
     */
    public Caracteristicas(){
        Dado dado = new Dado();
        this.caracteristica=caracteristicas[dado.tirada(caracteristicas.length)];
    }

    /**
     * Devuelve la característica
     * @return característica
     */
    public String getCaracteristica() {
        return caracteristica;
    }
}
