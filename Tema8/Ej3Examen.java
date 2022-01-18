/**
 * Crea la función linea para pintar lineas de caracteres que tienen un
 * determinado carácter en los
 * extremos y otro carácter de relleno.
 * public static String linea(int longitud, char extremo, char relleno)
 * Ejemplos:
 * linea(5, ‘*’, ‘ ‘) devuelve “* *”
 * linea(5, ‘*’, ‘*‘) devuelve “*****”
 * linea(6, ‘X’, ‘-‘) devuelve “X----X”
 * linea(3, ‘&’, ‘$‘) devuelve “&$&”
 * linea(2, ‘&’, ‘$‘) devuelve “&&”
 * linea(1, ‘&’, ‘$‘) devuelve “&”
 * linea(0, ‘&’, ‘$‘) devuelve “”
 * linea(-3, ‘&’, ‘$‘) devuelve “”
 * Utiliza esta función para pintar una pirámide hueca cuya altura se pide por
 * teclado. Podemos suponer
 * que el usuario va a introducir un número mayor o igual a 1.
 * 
 * 
 */
public class Ej3Examen {
    public static void main(String[] args) {
        System.out.print(linea(4, '%','$' ));
    }

    public static String linea(int longitud, char extremo, char relleno){
            String resultado = "" + extremo;
            for (int j = 0; j < longitud-2; j++) {
                resultado += "" + relleno;
            }
            return resultado += "" + extremo;
        
    }

}
