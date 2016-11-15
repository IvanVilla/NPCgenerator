package personajes.enanos;

/**
 * Enanos masculinos, hereda de personaje
 * Created by Klaussius on 15/11/2016.
 */
public class Masculino extends personajes.Personaje {

    /**
     * Constructor
     */
    public Masculino() {
        super.nombre = new NombreMasculino().getNombre()+" "+new Apellido().getApellido();
    }
}
