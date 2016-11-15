package personajes.elfos;

import personajes.Personaje;

/**
 * Created by Klaussius on 15/11/2016.
 */

public class ElfoMasculino extends Personaje {
    /**
     * Constructor
     */
    public ElfoMasculino() {
        super.nombre=new NombreMasculino().getNombre()+" "+new Apellido().getApellido();
    }
}
