/**
 * Realiza un conversor de Mb a Kb.
 * 
 */

    
public class ejercicio10 {
  public static void main(String[] args) {
    System.out.println("Esto es un conversor de Mb a Kb");
    System.out.print("\nPor favor, introduzca la cantidad de Mb que quiere convertir a Kb: ");
    double mb = Double.parseDouble(System.console() .readLine() ) ;

    
    
    
    double kb = mb * 1000;
    
    System.out.printf("Conversor \n");
    System.out.println("---------------------------------------------------------------");
    System.out.printf("La cantidad dde Mb que se quieren convertir a Kb son: %.2f \n", mb);
    System.out.println("---------------------------------------------------------------");
    System.out.printf("El resultado de convertir Mb a Kb es: %.0f", kb);      

    
  }     
}

