
/* 
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
 * programa intentará adivinar el número que estás pensando - un número entre 0
 * y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
 * debe preguntar si el número que estás pensando es mayor o menor que el que
 * te acaba de decir.
 * 
 */
public class Ejercicio14 {
  public static void main(String[] args) {
    System.out.println("Este programa intenta adivinar el número que estás pensando");

    int numero = (int) (Math.random() * 100);
    for (int numeroIntentos = 5; numeroIntentos >= 0; numeroIntentos--) {

      System.out.println("¿Tu número es el " + numero + " ? 1.- Sí      2.- No");
      int respuesta = Integer.parseInt(System.console().readLine());
      if (respuesta == 1) {
        System.out.println();
        System.out.println("He acertado tu número!");
        break;
      }

      System.out.println("Tu número es mayor o menor que el que te acabo de decir?  1.- Mayor    2.- Menor");
      int mayorOMenor = Integer.parseInt(System.console().readLine());

      if (mayorOMenor == 1) {
        numero = (int) (Math.random() * (100 -numero) + numero);
      } else if (mayorOMenor == 2){
        numero =(int) (Math.random() * (100 + numero) - 101);
      }
    }
    System.out.println("");
    System.out.println("Me he quedado sin intentos!");
  }
}
