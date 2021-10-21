/** 
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 * 
 */

    
public class ejercicio03 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Por favor, introduzca la cantidad de euros que quiera convertir a pesetas : ");
    linea = System.console().readLine();
    int pesetas;
    pesetas = Integer.parseInt( linea );
    
    double valoreuro = 0.006;
    System.out.println(pesetas * valoreuro + " €");
     
  }     
}
