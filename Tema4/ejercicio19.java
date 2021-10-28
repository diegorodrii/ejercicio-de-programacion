/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 * 
 * 
 */
 
public class ejercicio19{
  public static void main(String[] args) {
    System.out.println("Este programa te dice cuantos dígitos tiene un número introducido que puede ser positivo o negativo");
    System.out.print("Por favor, introduzca el número: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    if ((numero <= 0) && (numero >= -9)){
			
			System.out.println("El número de cifras del número introducido es 1");
			
			}
			
    if ((numero <= -10) && (numero >= -99)){
			
			System.out.println("El número de cifras del número introducido es 2");
			
			}
    if ((numero <= -100) && (numero >= -999)){
			
			System.out.println("El número de cifras del número introducido es 3");
			
			}
    if ((numero <= -1000) && (numero >= -9999)){
			
			System.out.println("El número de cifras del número introducido es 4");
			
			}
    if ((numero <= -10000) && (numero >= -99999)){
			
			System.out.println("El número de cifras del número introducido es 5");
			
			}    
    
    if ((numero >= 0) && (numero <= 9)){
			
			System.out.println("El número de cifras del número introducido es 1");
			
			}
			
    if ((numero >= 10) && (numero <= 99)){
			
			System.out.println("El número de cifras del número introducido es 2");
			
			}
    if ((numero >= 100) && (numero <= 999)){
			
			System.out.println("El número de cifras del número introducido es 3");
			
			}
    if ((numero >= 1000) && (numero <= 9999)){
			
			System.out.println("El número de cifras del número introducido es 4");
			
			}
    if ((numero >= 10000) && (numero <= 99999)){
			
			System.out.println("El número de cifras del número introducido es 5");
			
			}

 
        
  }
}			

