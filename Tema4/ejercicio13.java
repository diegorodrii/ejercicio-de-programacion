/**
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 * 
 * 
 */
 
public class ejercicio13{
  public static void main(String[] args) {
    System.out.println("Este programa ordena tres números enteros introducidos por teclado");
  System.out.print("Por favor, introduzca el primer número: ");
    int numero1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca el segundo número: ");
    int numero2 = Integer.parseInt(System.console().readLine());

    System.out.print("Por favor, introduzca el tercer número: ");
    int numero3 = Integer.parseInt(System.console().readLine());
        
    if ((numero1 > numero2) && (numero1 > numero3) && (numero2 > numero3)){
			System.out.println (numero1 + "," + numero2 + "," + numero3);
    }
    if ((numero1 > numero2) && (numero1 > numero3) && (numero3 > numero2)){
			System.out.println (numero1 + "," + numero3 + "," + numero2);
    }
    if ((numero2 > numero1) && (numero2 > numero3) && (numero1 > numero3)){
			System.out.println (numero2 + "," + numero1 + "," + numero3);
    }    
    if ((numero2 > numero1) && (numero2 > numero3) && (numero3 > numero1)){
			System.out.println (numero2 + "," + numero3 + "," + numero1);
    }    
    if ((numero3 > numero2) && (numero3 > numero1 ) && (numero2 > numero1)){
			System.out.println (numero3 + "," + numero2 + "," + numero1);
    }    
    if ((numero3 > numero2) && (numero3 > numero1) && (numero1 > numero2)){
			System.out.println (numero3 + "," + numero1 + "," + numero2);
    }    
    
    
    
    
    
    
        
  }
}

