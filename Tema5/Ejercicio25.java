
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
    
    int modulo = 10;
    int obtencionReves = 0;
    int divisor = 1;
    System.out.print("El número al revés es: " );
    do  {

      obtencionReves = numero % modulo;
      obtencionReves = obtencionReves / divisor;
      if (obtencionReves <= 0){
        break;
      }
      modulo = (modulo * 10);
      divisor = divisor * 10;
      System.out.print(obtencionReves);

    } while (obtencionReves > 0);
    
    
  }
}
