
/* 
 * 
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    System.out.println("Este programa genera 100 números aleatorios y los cambia");

    int[] num = new int[100];

    int i;

    for (i = 0; i < 100; i++) {
      num[i] = (int) (Math.random() * 100);

    }

    for (i = 0; i < 100; i++) {
      System.out.printf("|%3d", num[i]);
    }

    System.out.println("|");

    System.out.println("Que valor quieres cambiar");
    int valor = Integer.parseInt(System.console().readLine());

    System.out.println("Por qué valor quieres cambiarlo");
    int cambiado = Integer.parseInt(System.console().readLine());

    
    for (i = 0; i < 100; i++) {

      if (num[i] == valor) {
        System.out.print("'" + cambiado + "'/ ");
      } else {
        System.out.print(num[i] + "/ ");
      }
    }
    System.out.println();
  }
}
