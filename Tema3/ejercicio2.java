/** 
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere 
 * convertir debe ser introducida por teclado.
 * 
*/

    
public class ejercicio2 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Por favor, introduzca la cantidad de euros que quiera convertir a pesetas : ");
    linea = System.console().readLine();
    int euros;
    euros = Integer.parseInt( linea );
    
    double valorpeseta = 166.38;
    
    System.out.println((int) (euros * valorpeseta) + " pesetas");
    
    
    
  }     
}
