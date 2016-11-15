package personajes.elfos;

/**
 * Elfos femeninos, hereda de personaje
 * Created by Klaussius on 15/11/2016.
 */

public class ElfoFemenino extends personajes.Personaje{
    /**
     * Constructor
     */
    public ElfoFemenino() {
        super.nombre=new NombreFemenino().getNombre()+" "+new Apellido().getApellido();
    }
}
