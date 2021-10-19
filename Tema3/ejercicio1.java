/**
 * Realiza un programa que pida dos números y que luego muestre el resultado
   de su multiplicación
*/

    
public class ejercicio1 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Por favor, introduzca uno de los números que quiera multiplicar: ");
    linea = System.console().readLine();
    int numero1;
    numero1 = Integer.parseInt( linea );
    
    System.out.print("Por favor, introduzca el número por el que quiere multiplicar el número anterior: ");
    linea = System.console().readLine();
    int numero2;
    numero2 = Integer.parseInt( linea );
    
    System.out.println(numero1 * numero2);
    
    
    
  }     
}
