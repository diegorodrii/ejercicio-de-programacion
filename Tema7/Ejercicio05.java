
/* 
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 * 
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra 10 números y te dice cuál es el máximo y cuál el mínimo.");

    System.out.println("Introduzca los números: ");

    int[] num = new int[10];

    int i;
    int maximo = 0;
    int minimo = Integer.MAX_VALUE;
    ;
    for (i = 0; i < 10; i++) {
      num[i] = Integer.parseInt(System.console().readLine());

    }
    for (i = 0; i < 10; i++) {

      if (num[i] > maximo) {
        maximo = num[i];

      } else if ((num[i] < minimo)) {
        minimo = num[i];

      }

    }
    System.out.println();
    for (i = 0; i < 10; i++) {
      System.out.print(num[i]);
      if (num[i] == maximo) {
        System.out.print(" --> máximo");
      } else if (num[i] == minimo) {
        System.out.print(" --> mínimo ");
      }
      System.out.println();
    }

  }
}
