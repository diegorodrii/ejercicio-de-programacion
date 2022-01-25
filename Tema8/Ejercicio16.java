import java.util.Scanner;
import misfunciones.Matematicas;
// import misfunciones.Figuras;

/**
 * Muestra los números capicúa que hay entre 1 y 99999.
 * 
 */

public class Ejercicio16 {
  // Programa principal //////////////////////////////////////
  public static void main(String[] args) {

    System.out.println("Los números capicua que hay entre 1 y 99999 son: ");
    
    for (int i = 1; i < 99999; i++) {
      if (Matematicas.esCapicua(i)){
        System.out.println(i);
      }
    }


  }

}
