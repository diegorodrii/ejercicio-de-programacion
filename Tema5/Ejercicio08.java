/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Diego Rodríguez Barcos
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    System.out.print("Introduzca el número del que desea saber su tabla de multiplicar: ");
    int n = Integer.parseInt(System.console().readLine());


    for (int i = n; i <= n * 10; i += n) {
      System.out.println(i);
    }


    
  }
}
