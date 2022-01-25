import java.util.Scanner;
import misfunciones.Matematicas;
// import misfunciones.Figuras;

/**
 * Muestra los números primos que hay entre 1 y 1000.
 * 
 */

public class Ejercicio15 {
  // Programa principal //////////////////////////////////////
  public static void main(String[] args) {

    System.out.println("Los números primos que hay entre 1 y 1000 son: ");
    
    for (int i = 1; i < 1000; i++) {
      if (Matematicas.esPrimo(i)){
        System.out.println(i);
      }
    }


  }

}
