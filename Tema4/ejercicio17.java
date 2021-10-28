/**
 * Ejercicio 17 Tema 4.
 * Éste ejercicio nos pide realizar un programa que diga cuál es la última cifra de un número entero introducido por teclado. 
 * @author Diego Aguilera Martín
 * @author Diego Rodríguez Barcos
 */
public class ejercicio17 {
  public static void main(String[] args) {

    System.out.println("Éste programa te dice cuál es la última cifra de un número entero.");
    System.out.println("");
    System.out.println("Por favor, introduzca la cifra: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    System.out.println("La última cifra del número intrudido es el " + (numero % 10));
  }

}

