
/**
 * Escribe un programa que lea una lista de diez números y determine cuántos son
 * positivos, y cuántos son negativos.
 *
 */
public class Ejercicio13 {
  public static void main(String[] args) {

    System.out.println("Este programa lee una lista de diez números y dice cuantos son negativos y cuantos positivos ");

    int numero = 0;
    int cantidadIntroduzca = 0;
    int cantidadPositivos = 0;
    int cantidadNegativos = 0;
    for (cantidadIntroduzca = 10; cantidadIntroduzca > 0;) {
      System.out.print("Por favor, introduzca una lista de diez números, tanto positivos como negativos: ");
      numero = Integer.parseInt(System.console().readLine());
      cantidadIntroduzca--;

      if (numero > 0) {
        cantidadPositivos++;
      } else {
        cantidadNegativos++;
      }

    }
    System.out.println("Hay " + cantidadPositivos + " números positivos");
    System.out.println("Hay " + cantidadNegativos + " números negativos");
  }
}
