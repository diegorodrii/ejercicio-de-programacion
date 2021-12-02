
/* 
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separa-
 * dos por espacios.
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra el 20 números enteros aleatorios entre 0 y 10");

    for (int i = 1; i <= 20; i++){

      System.out.print((int) (Math.random() * 11 ));
      System.out.print(" ");
      
    }

   System.out.println();
  }
}
