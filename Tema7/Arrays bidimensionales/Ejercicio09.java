import java.util.Scanner;

/**
 *
 * 
 * Realiza un programa que sea capaz de rotar todos los elementos de una matriz
 * cuadrada una posición en el sentido de las agujas del reloj. La matriz debe
 * tener
 * 12 filas por 12 columnas y debe contener números generados al azar entre 0 y
 * 100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
 * con los números convenientemente alineados.
 * 
 */

public class Ejercicio09 {

  public static void main(String[] args) {

    int[][] num = new int[12][12];
    int[][] num2 = new int[12][12];
    int capa;
    int i;
    int j;
    int aux1;
    int aux2;

    // da valores al array
    for (i = 0; i < 12; i++) {
      for (j = 0; j < 12; j++) {
        num[i][j] = (int) (Math.random() * 101);

      }
    }

    // dibuja array

    for (i = 0; i < 12; i++) {
      System.out.print("( ");
      for (j = 0; j < 12; j++) {
        System.out.printf("%3d  ", num[i][j]);
      }
      System.out.print(" )");
      System.out.println();
    }


    // rotación /////////////////////////////////////////////


    
    for (capa = 0; capa < 6; capa++) {

      // rota por arriba
      aux1 = num[capa][11 - capa];
      for (i = 11 - capa; i > capa; i--) {
        num[capa][i] = num[capa][i - 1];
      }

      // rota por la derecha
      aux2 = num[11 - capa][11 - capa];
      for (i = 11 - capa; i > capa + 1; i--) {
        num[i][11 - capa] = num[i - 1][11 - capa];
      }
      num[capa + 1][11 - capa] = aux1;

      // rota por abajo
      aux1 = num[11 - capa][capa];
      for (i = capa; i < 11 - capa - 1; i++) {
        num[11 - capa][i] = num[11 - capa][i + 1];
      }
      num[11 - capa][11 - capa - 1] = aux2;

      // rota por la izquierda
      for (i = capa; i < 11 - capa - 1; i++) {
        num[i][capa] = num[i + 1][capa];
      }
      num[11 - capa - 1][capa] = aux1;

    } // for capa

    // muestra el array resultante ///////////////////////////

    System.out.println("\n\nArray rotado en el sentido de las agujas del reloj");
    System.out.println("--------------------------------------------------");

    for (i = 0; i < 12; i++) {
      System.out.print("( ");
      for (j = 0; j < 12; j++) {
        System.out.printf("%3d  ", num[i][j]);
      }
      System.out.print(" )");
      System.out.println();
    }
  }
}
