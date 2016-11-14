package ficha;

/**
 * Almacena un personaje
 * Created by Klaussius on 14/11/2016.
 */

public class Personaje {
    // Datos
    private String nombre;
    private String caracteristica;
    private String ideal;
    private String defecto;
    private String lazo;

    /**
     * Constructor
     */
    public Personaje(){
        nombre = new GeneradorNombre().getNombre();
        caracteristica=new Caracteristicas().getCaracteristica();
        ideal = new Ideales().getIdeal();
        defecto = new Defectos().getDefecto();
        lazo = new Lazos().getLazo();
    }

    /**
     * Devuelve el nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
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
}
