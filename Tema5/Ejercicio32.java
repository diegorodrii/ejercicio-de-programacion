
/**
 * Escribe un programa que, dado un número entero positivo, diga cuáles son y
 * cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden,
 * de izquierda a derecha. Usa long en lugar de int donde sea necesario para
 * admitir números largos.
 */
public class Ejercicio32 {
  public static void main(String[] args) {

    System.out
        .println("Este programa pide un número entero positivo y dice cuáles de sus dígitos son pares y cuánto suman.");
    System.out.println("Por favor, introduzca el número: ");
    long numero = Integer.parseInt(System.console().readLine());
    System.out.println("Contando de izquierda a derecha, hay número par dentro de " + numero + " en las siguientes posiciones: ");
    long volteado = 0;
    int longitud = 0;
    int posicion = 1;
    long sumaPares = 0;
    long volteadoPar = 0;
    

    if (numero == 0) {
      longitud = 1;
    }

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } // while

    // comprueba la posición
    while (volteado > 0) {
      
      if ((volteado % 10) % 2 == 0) {
        System.out.print(posicion + " ");
        
       volteadoPar = (volteado % 10) ;
       sumaPares = sumaPares + volteadoPar; 
       System.out.println("El dígito de la posición " + posicion + " es " + volteadoPar);
          
      }
      
      
      volteado /= 10;
      posicion++;
    } // while
    
    System.out.println("La suma de los pares es " + sumaPares );
    System.out.println();
  }
}
