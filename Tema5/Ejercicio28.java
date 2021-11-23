
/**
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado.
 * 
 */
public class Ejercicio28 {
  public static void main(String[] args) {

   
    System.out.println("Este programa calcula el factorial de un número");
    System.out.print("Por favor, introduce el número: ");
    int numero = Integer.parseInt(System.console().readLine());
    int i = 1;
    int multiplo = 0;

    while (multiplo < numero) {
      multiplo = multiplo + i * 3;
      if (multiplo > numero){
        break;
      }
      System.out.print(multiplo + " ");
    } 
    System.out.println();
  }
}

