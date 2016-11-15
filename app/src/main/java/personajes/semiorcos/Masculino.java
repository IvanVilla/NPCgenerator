package personajes.semiorcos;

import personajes.Personaje;

/**
 * Created by Klaussius on 15/11/2016.
 */

public class Masculino extends Personaje {
    /**
     * Constructor
     */
    public Masculino() {
        super.nombre=new NombreMasculino().getNombre()+" "+new Apellido().getApellido();
    }
}
