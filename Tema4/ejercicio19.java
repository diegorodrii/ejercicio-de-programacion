/**
 * Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado. Se permiten números de hasta 5 cifras.
 * 
 * 
 */
 
public class ejercicio18{
  public static void main(String[] args) {
    System.out.println("Este programa te dice cuál es la primera cifra de un número entero de como mucho cinco cifras.");
    System.out.print("Por favor, introduzca el número: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    if ((numero >= 0) && (numero <= 9)){
			
			System.out.println("La primera cifra del número introducido es " + numero);
			
			
			}
			
    if ((numero >= 10) && (numero <= 99)){
			
			System.out.println("La primera cifra del número introducido es " + numero/10);
			
			}
    if ((numero >= 100) && (numero <= 999)){
			
			System.out.println("La primera cifra del número introducido es " + numero/100);
			
			}
    if ((numero >= 1000) && (numero <= 9999)){
			
			System.out.println("La primera cifra del número introducido es " + numero/1000);
			
			}
    if ((numero >= 10000) && (numero <= 99999)){
			
			System.out.println("La primera cifra del número introducido es " + numero/10000);
			
			}

 
        
  }
}			

