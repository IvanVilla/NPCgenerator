package personajes.enanos;

/**
 * Enanos masculinos, hereda de personaje enano
 * Created by Klaussius on 15/11/2016.
 */
public class PersonajeMasculino extends Personaje {

    /**
     * Constructor
     */
    public PersonajeMasculino() {
        super.nombre = new NombreMasculino().getNombre()+" "+new Apellido().getApellido();
    }
}
