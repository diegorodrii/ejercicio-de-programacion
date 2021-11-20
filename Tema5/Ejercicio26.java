
/**
 * Realiza un programa que pida primero un número y a continuación un dígito. El
 * programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 * 
 */
public class Ejercicio26 {
  public static void main(String[] args) {

    System.out.println("Este programa imprime el número introducido al revés");
    System.out.print("Por favor, introduce el número: ");
    int numero = Integer.parseInt(System.console().readLine());

    int modulo = 10;
    int obtencionReves = 0;
    int divisor = 1;
    System.out.print("El número al revés es: ");
    do {

      obtencionReves = numero % modulo;
      obtencionReves = obtencionReves / divisor;

      modulo = (modulo * 10);
      divisor = divisor * 10;
      
      if (obtencionReves <= 0) {
        obtencionReves = numero % modulo;
        obtencionReves = obtencionReves / divisor;
        if (obtencionReves <= 0) {
          break;
        } else{
          obtencionReves = 0;
        }
      }
      System.out.print(obtencionReves);

    } while (obtencionReves >= 0);

  }
}
