
/* 
  Escribe un programa que calcule el área de un rectángulo.
*/

    
public class ejercicio5 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Por favor, introduzca la longitud de la base del rectángulo: ");
    linea = System.console().readLine();
    int base;
    base = Integer.parseInt( linea );
    
    System.out.print("Por favor, introduzca la longtiud de la altura del rectángulo: ");
    linea = System.console().readLine();
    int altura;
    altura = Integer.parseInt( linea );
    
    System.out.println("El área del rectángulo es: " + base * altura );

    
  }     
}
