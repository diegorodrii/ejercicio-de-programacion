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
  public static int posicionN(int numN, int N) {
    numN = Matematicas.voltear(numN);

    while (N > 0) {
      numN = numN / 10;
      N--;
    }
    return numN % 10;
  }

  /**
   * 
   * Da la posición de la primera ocurrencia de un dígito
   * dentro de un número entero. Si no se encuentra, devuelve -1.
   * 
   * @param numDigito
   * @param digito
   * 
   * @return
   */
  public static int posicionDeDigito(int numDigito, int digito) {
    numDigito = Matematicas.voltear(numDigito);
    int posicion = 0;
    while (numDigito % 10 != digito) {
      numDigito = numDigito / 10;
      posicion++;
      if ((posicion == 0) && (numDigito % 10 != digito)){
        return -1;
      }
    }
    return posicion;

  }

  /**
   * Le quita a un número n dígitos por detrás (por la
   * derecha).
   * 
   * @param numDetras
   * @param nDigElim
   * @return
   */
  public static int quitaPorDetras(int numDetras, int nDigElim) {
    numDetras = Matematicas.voltear(numDetras);
    int x = 0;

    while (nDigElim > 0){
      x = x * 10 + numDetras % 10;
      numDetras = numDetras / 10;
      nDigElim--;
    }
    return x;
  }

    /**
   * Le quita a un número n dígitos por delante (por la
   * izquierda).
   * 
   * @param numDelante
   * @param digito
   * @return
   */
  public static int quitaPorDelante(int numDelante, int nDigElim) {
    numDelante = Matematicas.voltear(numDelante);
    int x = 0;

    while (nDigElim > 0){
      x = x * 10 + numDelante % 10;
      numDelante = numDelante / 10;
      nDigElim--;
    }
    return x;
  }
}