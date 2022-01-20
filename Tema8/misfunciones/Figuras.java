package misfunciones;

/**
 * Realiza figuras
 */

public class Figuras {
    /**
     * Crea una línea de asteriscos
     * 
     * @param longitud tamaño de línea
     * @return una línea de asteriscos
     */
    public static String linea(int longitud) {
        String resultado = "";
        for (int i = 0; i < longitud; i++) {
            resultado += "*";
        }
        return resultado;
    }
}


