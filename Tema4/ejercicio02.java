/**
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
 * 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
 * horas, los minutos no se deben introducir por teclado.
 * 
 */

    
public class ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Este programa te saluda personalizadamente dependiendo de la hora que introduzca. ");
    System.out.print("Por favor, indique una hora como número entero: ");
    String solicitud = System.console().readLine();
    int hora = Integer.parseInt (solicitud);

    if ((hora <= 12) && (hora >= 6)) {
      System.out.println("¡Buenas días!");
      
    }

    if ((hora <= 20) && (hora >= 13)) {
      System.out.println("¡Buenas tardes!");

    } 

    if ((hora <= 5) || (hora >= 21)) {
      System.out.println("¡Buenas noches!");

    
    

    }
  }     
}

