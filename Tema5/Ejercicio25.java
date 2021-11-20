
/**
 * Realiza un programa que pida un número por teclado y que luego muestre ese
 * número al revés.
 * 
 */
public class Ejercicio25 {
  public static void main(String[] args) {

    System.out.println(
        "Este programa imprime el número introducido al revés");
    System.out.print("Por favor, introduce el número: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int divisor = 10;
    int obtencionReves = 0;
    while (obtencionReves < 0) {

      obtencionReves = numero % divisor;
      divisor = divisor * 10;
      System.out.print("El número al revés es: " + obtencionReves);
    }
    
  }
}
