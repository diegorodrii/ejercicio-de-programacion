
/* 
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
 * la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
 * del array.
 * 
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    System.out.println("Este programa lee 15 numeros y los almacena para finalmente rotarlos");

    System.out.println("Introduzca los números: ");

    int[] num = new int[15];

    int i;

    for (i = 0; i < 15; i++) {
      num[i] = Integer.parseInt(System.console().readLine());

    }
    for (i = 1; i <= 15; i++) {
      System.out.printf("|%3d ", i);

    }
    System.out.println("|");

    for (i = 0; i < 75; i++) {
      System.out.print("⎯");
    }
    System.out.println("⎯");

    for (i = 0; i < 15; i++) {
      System.out.printf("|%3d ", num[i]);
    }

    System.out.println("|");
    
    int aux = num [14];
    for (i = 14; i > 0; i--){
      num [i] = num [i-1]; 
    }
    num [0] = aux;
    System.out.println("\nArray rotado a la derecha una posición:");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", i);
      }
      System.out.println("|");
      for (i = 0; i < 75; i++) {
        System.out.print("⎯");
      }
      System.out.println("⎯");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", num[i]);
      }
      System.out.println("|");
    

  }
}
