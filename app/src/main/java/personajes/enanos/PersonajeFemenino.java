package personajes.enanos;

/**
 * Enanos femeninos, hereda de personaje enano
 * Created by Klaussius on 15/11/2016.
 */

public class PersonajeFemenino extends Personaje {

    /**
     * Constructor
     */
    public PersonajeFemenino() {
        super.nombre=new NombreFemenino().getNombre()+" "+new Apellido().getApellido();
    }
}
