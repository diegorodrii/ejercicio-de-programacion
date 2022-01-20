package misfunciones;

/**
 * Funciones matemáticas variadas
 * 
 */

public class Matematicas {

  // Funciones ///////////////////////////
  /**
   * 
   * @param inicio
   * @param fin
   * @return
   */

  public static boolean esCapicua(int numeroIntroducido) {
    int numero = numeroIntroducido;
    int voltear = 0;
    int contador = 0;
    while (numero > 0) {

      voltear = (voltear * 10) + (numero % 10);
      numero /= 10;
      contador++;
    }
    /**
     * Comparo si el numero dado la vuelta es igual al numero que he introducido
     **/
    if ((voltear == numeroIntroducido) && (contador > 1)) {
      return true;

    } else {
      return false;
    }

  }

  public static int aleatorio(int inicio, int fin) {
    return (int) (Math.random() * (fin - inicio + 1)) + inicio;
  }

  /**
   * 
   * @param numero entero positivo
   * @return <code>true</code> si <code>numero</code> es primo
   */
  public static boolean esPrimo(int numeroIntroducido) {
    boolean esPrimo = true;

    for (int i = 2; i < numeroIntroducido; i++) {
      if ((numeroIntroducido % i) == 0) {
        return false;
      }
    }
    if (esPrimo) {
      return true;
    } else {
      return false;
    }


  }
}
