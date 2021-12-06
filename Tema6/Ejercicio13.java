
/* 
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor
 * 
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Este programa simula la tirada de dos dados");
    int dado1 = 0;
    int dado2 = 0;
    do{
    
      dado1 = (int)(Math.random() * 6);
      System.out.println("El dado 1 ha sacado un " + dado1);
    
      dado2 = (int)(Math.random() * 6);
      System.out.println("El dado 2 ha sacado un " + dado2);
      System.out.println();

    } while (dado1 != dado2);
    System.out.println();
    System.out.println("Los dos dados han sacado el mismo valor!");
  }
}
