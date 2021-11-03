/**
 * Realiza un programa que cambie el orden de una cifra introducida
 * 
 */
 
public class ejercicioEx3{
    public static void main(String[] args) {
      System.out.println("Este programa cambia el orden los números de una cifra introducida");
      System.out.print("Por favor, introduzca la cifra: ");
      int cifra = Integer.parseInt(System.console().readLine());;
     
      if ((cifra >= 0) && (cifra < 9)){
        System.out.println("La cifra con el orden cambiado es " + cifra);
      } else if ((cifra >= 10) && (cifra < 99)){
        System.out.println("La cifra con el orden cambiado es " + cifra % 10 + cifra / 10);
      } else if ((cifra >= 100) && (cifra < 999)){
        System.out.println("La cifra con el orden cambiado es " + cifra % 10 + (cifra / 10) % 10 + cifra / 100);
      } else if ((cifra >= 1000) && (cifra < 9999)){
        System.out.println("La cifra con el orden cambiado es " + cifra % 10 + (cifra / 10) % 10 + (cifra / 100) % 10 + cifra / 1000);
      }
    }
  }			
  
  