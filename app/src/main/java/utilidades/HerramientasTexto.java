package utilidades;

/**
 * Created by Klaussius on 14/11/2016.
 */

public class HerramientasTexto {
    public String primeraMayuscula(String frase){
        char[] cadenaChar = frase.toCharArray();
        cadenaChar[0]=Character.toUpperCase(cadenaChar[0]);
        return new String (cadenaChar);
    }
}
