/**
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =
 * 0).
 * 
 */

    
public class ejercicio05{
  public static void main(String[] args) {
    System.out.println("Este programa resuelve ecuaciones de primer grado ax+b = 0 ");
    System.out.print("Por favor, indique el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());

    System.out.println("Este programa resuelve ecuaciones de primer grado ");
    System.out.print("Por favor, indique el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());      
    
    double operacion = (double)-b / (double) a ;
    

    
    if (a == 0) {
			if (b == 0) {
			  System.out.println ("Esta ecuacion tiene infinitas soluciones, es compatible indeterminado.");
			} else {
				System.out.println("Esta ecuación no tiene solución");
			}
		} else {
			System.out.println ("El resultado de x= " + (-b/a));
		}
    
  }     
}
