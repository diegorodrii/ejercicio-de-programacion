
/* 
 * Realiza un programa que vaya generando números aleatorios pares entre 0
 * y 100 y que no termine de generar números hasta que no saque el 24. El
 * programa deberá decir al final cuántos números se han generado.
 * 
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    System.out.println("Este programa genera números aleatorios pares entre 0 y 100");

    int numero = 0;
    do {
      numero = (int) (Math.random() * 100 + 1);
      if (numero % 2 == 0) {

        System.out.println(numero);
      }
    } while (numero != 100);

  }
}
