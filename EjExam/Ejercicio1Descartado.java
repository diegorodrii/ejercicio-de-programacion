import java.util.Scanner;

public class Ejercicio1Descartado {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la longitud del lado del array: ");
    int lado = Integer.parseInt(s.nextLine());

    int[][] a = new int[lado][lado];

    int contador = 1;
    int fila = 0;
    String direccion = "derecha";
    int columna = 0;
    int incFila = 0;
    int incColumna = 1;
    int contadorSegmento = 0;
    int longitudSegmento = lado;

    for (int i = 0; i < lado * lado; i++) {
      a[fila][columna] = contador++;

      contadorSegmento++;

      if (contadorSegmento == longitudSegmento) {

        contadorSegmento = 0;

        switch(direccion) {
          case "derecha":
            direccion = "abajo";
            longitudSegmento--;
            break;
          case "abajo":
            direccion = "izquierda";
            break;
          case "izquierda":
            direccion = "arriba";
            longitudSegmento--;
            break;
          case "arriba":
            direccion = "derecha";
            break;
          default:
        }
      }

      switch(direccion) {
        case "derecha":
          incFila = 0;
          incColumna = 1;
          break;
        case "abajo":
          incFila = 1;
          incColumna = 0;
          break;
        case "izquierda":
          incFila = 0;
          incColumna = -1;
          break;
        case "arriba":
          incFila = -1;
          incColumna = 0;
          break;
        default:
      }

      columna += incColumna;
      fila += incFila;
    }

    System.out.println();
    muestraArrayIntBi(a);
  }

  // Todas las funciones están sacadas de los apuntes

  /**
   * Devuelve el número de filas de un array bidimensional de
   * números enteros.
   * 
   * @param x un array bidimensional de números enteros
   * @return  número de filas del array
   */
  public static int filasArrayIntBi(int x[][]) {
    return x.length;
  }
  
  /**
   * Devuelve el número de columnas de un array bidimensional
   * de números enteros.
   * 
   * @param x un array bidimensional de números enteros
   * @return  número de columnas del array
   */  
  public static int columnasArrayIntBi(int x[][]) {
    return x[0].length;
  }

  /**
   * Devuelve el máximo de un array bidimensional
   * de números enteros.
   * 
   * @param x un array bidimensional de números enteros
   * @return  el valor máximo encontrado en el array
   */  
  public static int maximoArrayIntBi(int x[][]) {
  
    int maximo = Integer.MIN_VALUE;
    
    for (int f = 0; f < filasArrayIntBi(x); f++) {
      for (int c = 0; c < columnasArrayIntBi(x); c++) {
        if (x[f][c] > maximo) {
          maximo = x[f][c];
        }
      }
    }

    return maximo;
  }

  /**
   * Muestra por pantalla el contenido de un array bidimensional
   * de números enteros.
   * 
   * @param x un array bidimensional de números enteros
   */
  public static void muestraArrayIntBi(int x[][]) {
  
    String formatoNumero = "%" + digitos(maximoArrayIntBi(x)) + "d";

    for (int f = 0; f < filasArrayIntBi(x); f++) {
      for (int c = 0; c < columnasArrayIntBi(x); c++) {
        System.out.printf(formatoNumero + " ", x[f][c]);
      }
      System.out.println();
    }
  }

  /**
   * Devuelve el número de dígitos que contiene un número entero
   * 
   * @param x un número entero
   * @return  la cantidad de dígitos que contiene el número
   */
  public static int digitos(int x) {
    
    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10;
        n++;
      }
      return n;
    }
  }

}
