import javax.swing.text.Document;

/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un número
 * de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” y
 * si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 * @author Diego Rodríguez Barcos
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    System.out.println("Este programa abre una caja fuerte con un pin de 4 dígitos, teniendo 4 intentos ");
    final int contraseña = 1531;
    int combinacion = 0;
    int intentos = 0;
    
    while ((intentos < 4) && (contraseña != combinacion)) {
      System.out.print("Introduce la combinación: ");
      combinacion = Integer.parseInt(System.console().readLine());
      intentos++;
      if ((contraseña != combinacion) && (intentos < 4)){
        System.out.println("\nEsa no es la combinación");
        System.out.println("Has utilizado " + intentos +" intentos");
      } else if (contraseña == combinacion) {
        System.out.println("\nLa caja fuerte se ha abierto satisfactoriamente");
      }
      
      if ((contraseña != combinacion) && (intentos == 4)) {
        System.out.println("Te has quedado sin intentos");
      }

    }
  }
}
