/**
 * Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa. Se permiten números de hasta 5 cifras.
 * 
 * 
 */
 
public class ejercicio20{
  public static void main(String[] args) {
    System.out.println("Este programa te dice si el número introducido es capicúa");
    System.out.print("Por favor, introduzca el número: ");
    int numero = Integer.parseInt(System.console().readLine());
  
    
    if ((numero >= 0) && (numero <= 9)){
			
			System.out.println("El número es capicúa");
			
			}

    if ((numero >= 10) && (numero <= 99) && (numero % 10 == numero / 10)){
			
			System.out.println("El número es capicúa");
			
			}
    if ((numero >= 100) && (numero <= 999) && (numero % 10 == numero / 100)){
			
			System.out.println("El número es capicúa");
			
			}
    if ((numero >= 1000) && (numero <= 9999) && (numero % 10 == numero / 1000)){
			
			System.out.println("El número es capicúa");
			
			}
    if ((numero >= 10000) && (numero <= 99999) && (numero % 10 == numero / 10000)){
			
			System.out.println("El número es capicúa");
			
			} else {
			System.out.println("El número no es capicúa");
			}

 
        
  }
}			

