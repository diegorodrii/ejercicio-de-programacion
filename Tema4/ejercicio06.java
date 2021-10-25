/**
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. Aplica la fórmula t =√(2h/g) siendo g = 9.81m/s2
 * 
 */

    
public class ejercicio06{
  public static void main(String[] args) {
    System.out.println("Este programa calcula el tiempo que tardará en caer un objeto desde una altura h ");
    System.out.print("Por favor, indique el valor de la altura h: ");
    double altura = Double.parseDouble(System.console().readLine());

    if ( altura <= 0) {
      System.out.println("Con estos datos no hay solución");
    } else {
      double g = 9.81;
      double operacion = ((double) altura * 2) / g; 
      double resultado = Math.sqrt((double) operacion);
    System.out.printf ("El resultado de la operación es: %1.3f", resultado);      
    }
    

    
  }     
}
