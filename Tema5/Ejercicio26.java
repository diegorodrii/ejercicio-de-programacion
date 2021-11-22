
/**
 * Realiza un programa que pida primero un número y a continuación un dígito. El
 * programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 * 
 */
public class Ejercicio26 {
  public static void main(String[] args) {

    System.out.println("Este programa pide un número y después un dígito para conocer la posición que éste ocupa en el número");
    System.out.print("Por favor, introduce el número: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduce el digito: ");
    int digito = Integer.parseInt(System.console().readLine());

    int divisor = 1;
    int modulo = 10;
    int posicionDigito = 0;
    int division = 0;
    do  {
      division = numero % modulo;
      division = numero / divisor;
      
      modulo = (modulo * 10);
      divisor = divisor * 10;
      if (division == digito){
        System.out.println("El número aparece en la posición " + posicionDigito);
      }
      posicionDigito++;
      
    } while (numero != digito);
    if (numero != digito){
      System.out.println("El dígito no aparece en el número");
      
    }

  }
}
