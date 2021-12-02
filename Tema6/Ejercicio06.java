
/* 
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario de-
 * be adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
 * el programa dirá cuántas oportunidades quedan y si el número introducido es
 * menor o mayor que el número secreto.
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    System.out
        .println("Este programa crea un número al azar entre 0 y 100. Tienes 5 oportunidades para adivinar el número.");

    int numeroIntroducido = 0;

    int numeroSecreto = (int) (Math.random() * 101);

    for (int numeroIntentos = 4; numeroIntentos >= 0; numeroIntentos--) {

      System.out.print("Introduce el número que crees que es: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());

      if (numeroSecreto == numeroIntroducido) {
        System.out.println("¡Has acertado el número!");
        System.out.println("");
        break;
      } else {
        System.out.println("Lo siento, has fallado. Te quedan " + numeroIntentos + " intentos.");
        System.out.println("");
      }
      if (numeroIntroducido > numeroSecreto) {
        System.out.println("¡El número que has introducido es mayor que el número secreto!");
        System.out.println("");
      } else if (numeroIntroducido < numeroSecreto) {
        System.out.println("¡El número que has introducido es menor que el número secreto!");
        System.out.println("");
      }

      if (numeroIntentos == 0) {
        System.out.println("¡Te has quedado sin intentos!");
      }
    }

  }
}
