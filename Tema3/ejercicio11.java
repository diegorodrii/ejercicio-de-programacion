/**
 * Realiza un conversor de Mb a Kb.
 * 
 */

    
public class ejercicio11 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca la cantidad de Mb que quiere convertir a Kb: ");
    double kb = Double.parseDouble(System.console() .readLine() ) ;

    
    
    
    double mb = kb / 1000;
    
    System.out.printf("Conversor \n");
    System.out.println("---------------------------------------------------------------");
    System.out.printf("La cantidad dde Kb que se quieren convertir a Mb son: %.0f \n", kb);
    System.out.println("---------------------------------------------------------------");
    System.out.printf("El resultado de convertir Kb a Mb es: %.2f", mb);      

    
  }     
}

