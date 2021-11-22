
/**
 * Escribe un programa que permita ir introduciendo una serie indeterminada de
 * números mientras su suma no supere el valor 10000. Cuando esto último ocurra,
 * se debe mostrar el total acumulado, el contador de los números introducidos y
 * la media.
 * 
 */
public class Ejercicio23 {
  public static void main(String[] args) {

    System.out.println(
        "Este programa muestra el valor total acumulado antes de llegar a 10000. Se mostrará también un contador de los números y la media ");
    int numeroTotal = 0;
    int numeroPedido = 0;
    int cantidadNumeros = 0;
    do {
      System.out.println("Introduce valores para sumarlos y superar el valor 10000: ");
      numeroPedido = Integer.parseInt(System.console().readLine());

      
      
      numeroTotal = numeroTotal + numeroPedido;
      cantidadNumeros++;

    } while (numeroTotal <= 10000);
    System.out.println("El número total conseguido es: " + numeroTotal);
    System.out.println("La cantidad de números introducidos es: " + cantidadNumeros);
    System.out.println("La media del total conseguido es: " + numeroTotal / cantidadNumeros);

  }
}
