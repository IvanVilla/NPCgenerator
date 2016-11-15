package personajes.enanos;

/**
 * Enanos femeninos, hereda de personaje
 * Created by Klaussius on 15/11/2016.
 */

public class Femenino extends personajes.Personaje {

    /**
     * Constructor
     */
    public Femenino() {
        super.nombre=new NombreFemenino().getNombre()+" "+new Apellido().getApellido();
    }
}
