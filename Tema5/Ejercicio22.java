
/**
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 */
public class Ejercicio22 {
  public static void main(String[] args) {

    System.out.println("Este programa muestra todos los números del 2 al 100 ");
    int numero = 2;
    System.out.print(numero + " ");
    do {

      {
        if (numero >= 100) {
          break;
        }
        numero++;
      }

      System.out.print(numero + " ");

    } while (numero >= 2);
  }
}
