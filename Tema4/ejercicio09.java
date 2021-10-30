/**
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0).
 * 
 * 
 */

    
public class ejercicio09{
  public static void main(String[] args) {
    System.out.println("Este programa resuelve ecuaciones de segundo grado del tipo ax² + bx + c = 0 ");
    System.out.print("Por favor, introduzca el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
        
    System.out.print("Por favor, introduzca el valor de c: ");
    double c = Double.parseDouble(System.console().readLine());
    
    double irreal = b*b - (4 * a * c);5
    
    if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println("La ecuación tiene infinitas soluciones.");
    }
    
    if ((a == 0) && (b == 0) && (c != 0)) {
      System.out.println("La ecuación no tiene solución.");
    }
      
    if ((a != 0) && (b != 0) && (c == 0)) {
      System.out.println("x1 = 0");
      System.out.println("x2 = " + (-b / a));
    }
    
    if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.println("x1 = x2 = " + (-c / b));
    }
    
    if ((a != 0) && (b != 0) && (c != 0)) {
        
 
      System.out.println("x = " + irreal);
		}
      if (irreal < 0) {
          System.out.println("La ecuación no tiene soluciones reales");
      }  else {
        System.out.println("x1 = " + (-b + Math.sqrt(irreal))/(2 * a));
        System.out.println("x2 = " + (-b - Math.sqrt(irreal))/(2 * a));
    
 
  }      
}
} 
