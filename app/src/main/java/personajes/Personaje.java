package personajes;

import detalles.Caracteristicas;
import detalles.Defectos;
import detalles.Ideales;
import detalles.Lazos;

/**
 * Created by Klaussius on 15/11/2016.
 */

public class Personaje {
    // Datos
    protected String nombre;
    private String caracteristica;
    private String ideal;
    private String defecto;
    private String lazo;

    /**
     * Constructor
     */
    public Personaje(){
        caracteristica=new Caracteristicas().getCaracteristica();
        ideal = new Ideales().getIdeal();
        defecto = new Defectos().getDefecto();
        lazo = new Lazos().getLazo();
    }

    /**
     * Devuelve la característica
     * @return característica
     */
    public String getCaracteristica() {
        return caracteristica;
    }

    /**
     * Devuelve el ideal
     * @return ideal
     */
    public String getIdeal() {
        return ideal;
    }

    /**
     * Devuelve el defecto
     * @return defecto
     */
    public String getDefecto() {
        return defecto;
    }

    /**
     * Devuelve el lazo
     * @return lazo
     */
    public String getLazo() {
        return lazo;
    }

    /**
     * Devuelve el nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
}
