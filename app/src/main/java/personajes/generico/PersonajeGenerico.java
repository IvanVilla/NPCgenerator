package personajes.generico;

/**
 * Almacena un personaje
 * Created by Klaussius on 14/11/2016.
 */

public class PersonajeGenerico extends personajes.Personaje{

    /**
     * Constructor
     */
    public PersonajeGenerico(){
        super.nombre = new NombreGenerico().getNombre();
    }
}
