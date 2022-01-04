
/* 
 * Modifica el programa anterior de tal forma que los números que se introducen
 * en el array se generen de forma aleatoria (valores entre 100 y 999).
 * 
 */
public class Ejercicio03 {
  public static void main(String[] args) {

    System.out.println("Este programa pinta una tabla y la suma de columnas y filas");

    int[][] num = new int[4][5];

    int fila;
    int columna;

    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        
        num[fila][columna] = 100 + (int)(Math.random()*899);
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

      System.out.printf("%7d", sumaColumna);
    }
    System.out.printf("   |%7d ", sumaTotal);

  }
}
