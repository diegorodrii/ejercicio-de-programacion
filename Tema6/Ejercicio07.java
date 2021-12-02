
/* 
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas).
 * 
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    System.out.println("Este programa crea una quiniela");

    int numero = 0;

    int numeroFila = 0;
    for (int i = 1; i <= 42; i++) {
      numero = ((int) (Math.random() * 3));
      numeroFila++;
      System.out.print(numeroFila + ". ");
      if (numero == 1) {
        System.out.print("|1    |  ");
      }
      if (numero == 2) {
        System.out.print("|  X  |  ");
      }
      if (numero == 3) {
        System.out.print("|    2|  ");
      }
      System.out.println();

    }

  }
}
