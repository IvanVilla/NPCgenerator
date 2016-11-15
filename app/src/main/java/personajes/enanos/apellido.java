package personajes.enanos;

import utilidades.Dado;
import utilidades.HerramientasTexto;

/**
 * Genera apellidos personajes.enanos
 * Created by Klaussius on 15/11/2016.
 */

public class Apellido {
    //Comienzo nombres
    private String comienzos[]={
            "bal",
            "battle",
            "braw",
            "dan",
            "fire",
            "frost",
            "go",
            "holder",
            "iron",
            "lo",
            "lut",
            "rumna",
            "stra",
            "to",
            "un"
    };

    //Finales nombres
    private String finales[]={
            "beard",
            "derk",
            "derr",
            "fist",
            "forge",
            "gart",
            "gehr",
            "hammer",
            "heim",
            "hek",
            "keln",
            "kil",
            "nanvil",
            "runn"
    };

    //Nombre
    private String apellido;

    /**
     * Constructor
     */
    public Apellido() {
        Dado dado = new Dado();
        // Creo el Apellido
        apellido = comienzos[dado.tirada(comienzos.length)]+finales[dado.tirada(finales.length)];
        // Paso la primera letra a mayúsculas
        HerramientasTexto capitalizar = new HerramientasTexto();
        apellido =capitalizar.primeraMayuscula(apellido);
    }

    /**
     * Devuelve el Apellido
     * @return Apellido
     */
    public String getApellido() {
        return apellido;
    }
}
