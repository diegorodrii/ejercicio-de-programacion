
/**
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 * entre 1 y un número leído por teclado.
 * 
 */
public class Ejercicio27 {
  public static void main(String[] args) {

   
    System.out.println("Este programa dice los múltiplos de 3 que hay entre el 1 y el número introducido");
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

