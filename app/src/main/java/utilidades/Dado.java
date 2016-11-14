package utilidades;

import java.util.Random;

/**
 * Dados
 * Created by Klaussius on 14/11/2016.
 */

public class Dado {
    public int tirada(int caras) {
        Random random = new Random();
        return random.nextInt(caras);
    }
}
