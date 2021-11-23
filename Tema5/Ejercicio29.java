
/**
 * Escribe un programa que muestre por pantalla todos los números enteros
 * positivos menores a uno leído por teclado que no sean divisibles entre otro
 * también leído de igual forma.
 * 
 */
public class Ejercicio29 {
  public static void main(String[] args) {

    System.out.println("Este programa muestra todos los número positivos menores a uno leído que no sea divisible por otro también introducido");
    System.out.print("Por favor, introduce el número: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    System.out.println("Por favor, introduce el número por el cual quieres que no sean divisibles");
    int divisor = Integer.parseInt(System.console().readLine());

    int modulo = 0;
    int resultado = 0;
    int resta = 1;
    do {
      resultado = numero - resta;
      modulo = resultado % divisor;
      resta++;
      if (modulo == 0){
        
      } else {
        System.out.print(resultado + " ");
      }
      
      
    } while (resultado > 0);

    System.out.println();
  }
}
