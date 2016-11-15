package personajes.enanos;

/**
 * Enanos femeninos, hereda de personaje enano
 * Created by Klaussius on 15/11/2016.
 */

public class EnanoFemenino extends personajes.Personaje {

    /**
     * Constructor
     */
    public EnanoFemenino() {
        super.nombre=new NombreFemenino().getNombre()+" "+new Apellido().getApellido();
    }
}
