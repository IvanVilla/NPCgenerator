package personajes.tieflings;

import utilidades.Dado;
import utilidades.HerramientasTexto;

/**
 * Nombres elfos femeninos
 * Created by Klaussius on 15/11/2016.
 */

class NombreFemenino {
    //Comienzo nombres
    private String comienzos[]={
            "ak",
            "ana",
            "bry",
            "cri",
            "da",
            "e",
            "ka",
            "leri",
            "maka",
            "ne",
            "oria",
            "phe",
            "rie"
    };

    //Finales nombres
    private String finales[]={
            "ta",
            "kis",
            "seis",
            "ella",
            "maia",
            "a",
            "llista",
            "ssa",
            "ria",
            "meia",
            "nna",
            "laia",
            "ta"
    };

    //Nombre
    private String nombre;

    /**
     * Constructor
     */
    NombreFemenino() {
        Dado dado = new Dado();
        // Creo el nombre
        nombre = comienzos[dado.tirada(comienzos.length)]+finales[dado.tirada(finales.length)];
        // Paso la primera letra a mayúsculas
        HerramientasTexto capitalizar = new HerramientasTexto();
        nombre=capitalizar.primeraMayuscula(nombre);
    }

    /**
     * Devuelve el nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
}
