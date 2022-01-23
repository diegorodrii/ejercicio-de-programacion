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

  /**
   * 
   * @param numeroIntroducido
   * @return
   */

  public static int siguientePrimo(int numeroIntroducido) {

    do {

      numeroIntroducido++;

    } while (!Matematicas.esPrimo(numeroIntroducido));

    return numeroIntroducido;
  }

  /**
   * 
   * @param base
   * @param exponente
   * @return
   */

  public static int potencia(int base, int exponente) {
    return (int) (Math.pow(base, exponente));
  }

  /**
   * 
   * @param num
   * @return
   */

  public static int digitos(int num) {
    int numDigitos = 0;
    while (num > 0) {
      num = num / 10;
      numDigitos++;
    }
    return numDigitos;
  }

  /**
   * 
   * @param numAVoltear
   * @return
   */

  public static int voltear(int numAVoltear) {
    int numVolteado = 0;
    while (numAVoltear > 0) {

      numVolteado = (numVolteado * 10) + (numAVoltear % 10);
      numAVoltear = numAVoltear / 10;

    }
    return numVolteado;

  }

  /**
   * Devuelve el dígito que está en la posición n de un número entero.
   * Se empieza contando por el 0 y de izquierda a derecha
   * 
   * 
   * @param numN
   * @param posicion
   * @return
   */
  public static int posicionN(int numN, int posicion) {
    numN = Matematicas.voltear(numN);

    while(posicion > 0 ){
      numN = numN / 10;
      posicion--;
    }
    return numN % 10;
  }
}
