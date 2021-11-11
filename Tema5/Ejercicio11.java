
/**
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 *
 * @author Diego Rodríguez Barcos
 */
public class Ejercicio11 {
  public static void main(String[] args) {

    int numero = 0;
    
      System.out.println("Este programa muestra el cuadrado y el cubo de un número introducido y de los 5 siguientes ");
      System.out.print("Por favor, introduzca el número: ");
      numero = Integer.parseInt(System.console().readLine());
   

    System.out.println("Esquema Resolución ");
    System.out.printf(" %5d   %5d    %5d", numero, (numero * numero), (numero * numero * numero));
    System.out.printf("\n %5d   %5d    %5d", numero + 1, ((numero + 1) * (numero + 1)), ((numero +1) * (numero + 1) * (numero + 1)));
    System.out.printf("\n %5d   %5d    %5d", numero + 2, ((numero + 2) * (numero + 2)), ((numero +2) * (numero + 2) * (numero + 2)));
    System.out.printf("\n %5d   %5d    %5d", numero + 3, ((numero + 3) * (numero + 3)), ((numero +3) * (numero + 3) * (numero + 3)));
    System.out.printf("\n %5d   %5d    %5d", numero + 4, ((numero + 4) * (numero + 4)), ((numero +4) * (numero + 4) * (numero + 4)));
    System.out.printf("\n %5d   %5d    %5d", numero + 5, ((numero + 5) * (numero + 5)), ((numero +5) * (numero + 5) * (numero + 5)));


  }
}
