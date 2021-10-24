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
    
    double raiz = ((double) b * (double) b) - 4 * ((double) a * (double) c);
    
    double x1;    
    double x2;
    x1 = (((double) - b + Math.sqrt((double) raiz))) / 2 * (double) a;
           
    
    System.out.printf ("El resultado de la ecuación es: %1.3f ", x1); 
    
 
  }      
} 
