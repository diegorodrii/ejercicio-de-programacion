

/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
 * la salvedad de que el anterior estaba limitado a números de 5 dígitos como
 * máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
 * esta manera, la única limitación en el número de dígitos la establece el tipo de
 * dato que se utilice ( int o long ).
 *
 * @author Diego Rodríguez Barcos
 */
public class Ejercicio09 {
  public static void main(String[] args) {
   
    int numero = 0;
    System.out.println("Este programa te dice cuántos dígitos tiene un número introducido por teclado: ");
    System.out.print("Introduzca el número: ");
    numero = Integer.parseInt(System.console().readLine());

    
    int cantidadDivisiones = 0;
    do {
      numero = numero / 10;
      cantidadDivisiones++;
    } while (numero > 0);

  System.out.println("Tu número tiene " + cantidadDivisiones + " dígitos");


    
  }
}
