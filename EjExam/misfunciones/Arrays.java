package misfunciones;
/**
 * Funciones con arrays
 * 
 */

public class Arrays {
    public static String linea(int longitud) {
        String resultado = "";
        for (int i = 0; i < longitud; i++) {
            resultado += "*";
        }
        return resultado;
    }
}