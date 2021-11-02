/**
 * Escribe un programa que pida un número por teclado y que luego muestre la versión “complementaria”
 * de ese número de tal forma que cada dígito se cambia por su complementario (9 menos el dígito). Usa
 * long en lugar de int donde sea necesario para admitir números largos. Máximo 3 dígitos
 * 
 * 
 */
 
public class ejercicio30{
    public static void main(String[] args) {
      System.out.println("Este programa muestra la versión complementaria del número que se introduzca");
      System.out.print("Por favor, introduzca el número: ");
      int numero = Integer.parseInt(System.console().readLine());
    
      
      if ((numero >= 0) && (numero <= 9)){
              
              System.out.println("El complementario es: " + (9 - numero ));
              
              }
  
      else if ((numero >= 10) && (numero <= 99)){
              
              System.out.println("El complementario es: " + (99- numero ));
              
              }
      else if ((numero >= 100) && (numero <= 999)){
              
              System.out.println("El complementario es: " + (999 - numero ));
              
              }  
    }
  }			
  
  