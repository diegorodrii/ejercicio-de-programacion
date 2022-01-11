
/* 
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma
 * total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
 * que el ordenador se queda pensando antes de mostrar los números.
 * 
 */
public class Ejercicio04 {
  public static void main(String[] args) {

    System.out.println("Este programa pinta una tabla y la suma de columnas y filas");

    int[][] num = new int[4][5];

    int fila;
    int columna;

    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {

        num[fila][columna] = 100 + (int) (Math.random() * 899);
      }
    }

    // Enseña filas y columnas y las filas las suma*/
    int sumaFila;
    for (fila = 0; fila < 4; fila++) {
      sumaFila = 0;
      for (columna = 0; columna < 5; columna++) {

        System.out.printf("%7d", num[fila][columna]);

        sumaFila += num[fila][columna];
      }

      System.out.print("   |");
      try {
        Thread.sleep(2000);
      } catch (InterruptedException ex) {
        // aquí tratamos la excepción como queramos, haciendo nada, sacando por pantalla
        // el error, ...
      }
      System.out.printf("%7d \n", sumaFila);
    }

    // Enseña suma columnas y suma total*/
    int sumaColumna;
    int sumaTotal = 0;
    System.out.println("-------------------------------------------------");

    for (columna = 0; columna < 5; columna++) {
      sumaColumna = 0;
      for (fila = 0; fila < 4; fila++) {
        sumaColumna += num[fila][columna];
        sumaTotal += num[fila][columna];
      }
      try {
        Thread.sleep(2000);
        } catch (InterruptedException ex) {
        // aquí tratamos la excepción como queramos, haciendo nada, sacando por pantalla el error, ...
        }
      System.out.printf("%7d", sumaColumna);
    }
    try {
      Thread.sleep(2000);
      } catch (InterruptedException ex) {
      // aquí tratamos la excepción como queramos, haciendo nada, sacando por pantalla el error, ...
      }
    System.out.printf("   |%7d ", sumaTotal);

  }
}
