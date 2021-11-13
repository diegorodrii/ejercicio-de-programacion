
/**
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 *
 * @author Diego Rodríguez Barcos
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra el cuadrado y el cubo de un número introducido y de los 5 siguientes ");
    System.out.print("Por favor, introduzca el número: ");
    int numero = Integer.parseInt(System.console().readLine());

    for (int numeroVeces = 5; numeroVeces >= 0;) {

      int cuadrado = numero * numero;
      int cubo = numero * numero * numero;

      System.out.printf("\n %5d %5d %5d", numero++, cuadrado++, cubo++);
      numeroVeces--;
    }

  }
}
