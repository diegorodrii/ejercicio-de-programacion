
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

    
    int multiplo = 1;
    int resultado = 1;

    resultado = multiplo * numero;
    while (multiplo < numero) {
  
      resultado = resultado * multiplo;
      
      multiplo++;
      
      
    } 
    System.out.print(numero + "! = " + resultado);
    System.out.println();
  }
}

