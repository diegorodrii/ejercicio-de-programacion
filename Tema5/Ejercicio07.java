import javax.swing.text.Document;

/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 * @author Diego Rodríguez Barcos
 */
public class Ejercicio07 {
  public static void main(String[] args) {
   
    int contraseña = 1531;
    int combinacion = 0;
    int intentos = 0;
    while ((intentos < 4) && (contraseña != combinacion)){
      System.out.print("Introduce la combinación: ");
      combinacion = Integer.parseInt(System.console().readLine());
      intentos++;
    
      if (contraseña != combinacion){
        System.out.println("Esa no es la combinación");
      } else if (contraseña == combinacion){
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
      } 
      if (intentos == 4){
        System.out.println("Te has quedado sin intentos");
      }

    }
  }
}
