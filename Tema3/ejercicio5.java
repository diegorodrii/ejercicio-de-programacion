
/* 
  Escribe un programa que calcule el área de un rectángulo.
*/

    
public class ejercicio5 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula la superficio de un rectángulo");
    System.out.println("Por favor, introduzca la longitud en cm de la base del rectángulo: ");
   
    double base = Double.parseDouble(System.console() .readLine() ) ;
   
    
    System.out.println("Por favor, introduzca la longtiud en cm de la altura del rectángulo: ");
    
    double altura = Double.parseDouble(System.console() .readLine() ) ;
 
    double bxh = base * altura;
    
    System.out.printf("El área del rectángulo con base= %3.2f cm y h=%3.2f cm es igual a = %3.2f cm² ", base, altura, bxh);

    
  }     
}
