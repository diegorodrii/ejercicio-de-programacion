package Examen1;

/**
 * Crea la clase Rectangulo con los atributos alto (de tipo entero), ancho (de
 * tipo entero) y estaRelleno
 * (de tipo booleano). Crea el constructor y el método toString. Prueba la clase
 * mediante un programa
 * que cree y pinte al menos dos rectángulos, uno relleno y otro hueco. No es
 * necesario utilizar menús ni
 * pedir los datos por teclado, se pueden crear directamente los objetos de
 * prueba en varias líneas.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(5,8,true);
        Rectangulo rectangulo2 = new Rectangulo(5,8,false);  

        rectangulo1.pinta();
        rectangulo2.pinta();
    }
   
}
