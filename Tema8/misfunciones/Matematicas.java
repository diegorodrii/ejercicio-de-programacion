package misfunciones;
/**
 * Funciones matemáticas variadas
 * 
 */

public class Matematicas {
    /**
     * Genera un valor entero aleatorio entre
     * <code>
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] numeros = new int[50];
    
        for (int i = 0; i < numeros.length; i++) {
          numeros[i] = aleatorio(1, 100);
        }
        
        for (int n : numeros) {
          System.out.print(n + "  ");
        }
    
        System.out.println("\nPrimos:");
    
        for (int n : numeros) {
          if (esPrimo(n)) {
            System.out.print(n + "  ");
          } 
        }
      }
    
      // Funciones ///////////////////////////
      /**
       * 
       * @param inicio
       * @param fin
       * @return
       */
      public static int aleatorio(int inicio, int fin) {
        return (int)(Math.random() * (fin - inicio + 1)) + inicio;
      }
      /**
       * 
       * @param numero entero positivo
       * @return <code>true</code> si <code>numero</code> es primo
       */
      public static boolean esPrimo(int numero) {
        boolean esPrimo = true;
        
        for (int i = 2; i < numero; i++) {
          if ((numero % i) == 0) {
            esPrimo = false;
          }
        }
        
        return esPrimo;
      }
    
}
