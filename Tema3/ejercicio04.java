/** 
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 * 
 */

    
public class ejercicio04 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Por favor, introduzca uno de los números con el que quiera operar: ");
    linea = System.console().readLine();
    int numero1;
    numero1 = Integer.parseInt( linea );
    
    System.out.print("Por favor, introduzca el otro número con el que quiere realizar todas las operaciones: ");
    linea = System.console().readLine();
    int numero2;
    numero2 = Integer.parseInt( linea );
    
    System.out.println("La suma de los dos números es: " + (numero1 + numero2) );
    System.out.println("La resta de los dos números es: " + (numero1 - numero2) );
    System.out.println("La multiplicación de los dos números es: " + (numero1 * numero2) );
    System.out.println("La división de los dos números es: " + (numero1 / numero2) );
    
    
    
    
    
  }     
}
