
/* 
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 * primos a las primeras posiciones, desplazando el resto de números (los que no
 * son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
 * array resultante.
 *
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Este programa ordena de manera que los primos sean los primeros 10 números introducidos ");

    int[] num = new int[10];
    int[] primo = new int[10];
    int[] noPrimo = new int[10];
    int i;

    int primos = 0;
    int noPrimos = 0;
    boolean esPrimo = false;
    for (i = 0; i < 10; i++) {
      num[i] = Integer.parseInt(System.console().readLine());

      esPrimo = true;
      for (int u = 2; u < num[i]; u++) {
        if (num[i] % u == 0) {
          esPrimo = false;
        }

      }
      if (esPrimo){
        primo[primos++] = num[i];
      } else{
        noPrimo[noPrimos++] = num [i];
      }
  
    }

    
    for (i = 1; i <= 10; i++) {
      System.out.printf("|%3d ", i);

    }
    System.out.println("|");

    for (i = 0; i < 55; i++) {
      System.out.print("⎯");
    }
    System.out.println("⎯");

    for (i = 0; i < 10; i++) {
      System.out.printf("|%3d ", num[i]);
    }

    System.out.println("|");


     // Los números primos se menten en las primeras
    // posiciones del array original.
    for (i = 0; i < primos; i++) {
      num[i] = primo[i];
    }
    
    // Los números que no son primos se colocan al final.
    for (i = primos; i < primos + noPrimos; i++) {
      num[i] = noPrimo[i - primos];
    }
    for (i = 1; i <= 10; i++) {
      System.out.printf("|%3d ", i);

    }
    System.out.println("|");

    for (i = 0; i < 55; i++) {
      System.out.print("⎯");
    }
    System.out.println("⎯");

    for (i = 0; i < 10; i++) {
      System.out.printf("|%3d ", num[i]);
    }

    System.out.println("|");

  }

}
