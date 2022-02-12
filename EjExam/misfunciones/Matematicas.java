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

  public static int digitos(long num) {
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
      if ((posicion == 0) && (numDigito % 10 != digito)) {
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

    while (nDigElim > 0) {
      numDetras = numDetras / 10;
      nDigElim--;
    }
    return numDetras;
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

    while (nDigElim > 0) {
      numDelante = numDelante / 10;
      nDigElim--;
    }
    return Matematicas.voltear(numDelante);
  }

  /**
   * 
   * @param numeroIntroducido
   * @param numPegado
   * @return <code> numeroIntroducido </code>
   */
  public static int pegaPorDetras(int numeroIntroducido, int numPegado) {
    numeroIntroducido = numeroIntroducido * 10 + numPegado;
    return numeroIntroducido;
  }

  /**
   * 
   * @param numeroIntroducido
   * @param numPegado
   * @return
   */
  public static int pegaPorDelante(int numeroIntroducido, int numPegado) {
    numeroIntroducido = Matematicas.voltear(numeroIntroducido);
    numeroIntroducido = numeroIntroducido * 10 + numPegado;
    numeroIntroducido = Matematicas.voltear(numeroIntroducido);
    return numeroIntroducido;
  }

  public static int trozoDeNumero(int numeroIntroducido) {
    int digito1 = 0;
    digito1 = numeroIntroducido % 10;
    numeroIntroducido = Matematicas.voltear(numeroIntroducido);

    numeroIntroducido = (numeroIntroducido % 10) * 10; // sacamos el digito inicial, que multiplicamos por 10 para asi
                                                       // tenerlo como decenas

    return numeroIntroducido + digito1;

  }

  public static int juntaNumeros(int numeroIntroducido, int numPegar) {

    int vecesDividido = 0;
    int pegamento = numPegar;
    while (numPegar > 0) {
      numPegar = numPegar / 10;
      vecesDividido++;
    }
    while (vecesDividido > 0) {
      numeroIntroducido = numeroIntroducido * 10;
      vecesDividido--;
    }
    numeroIntroducido = numeroIntroducido + pegamento;
    return numeroIntroducido;
  }

  public static int convierteBinarioDecimal(long binario) {
    long digito = 0;
    int sumaDecimal = 0;
    int base = 2;
    int exponente = 0;

    while (binario > 0) {
      digito = binario % 10;
      if (digito != 0) {
        sumaDecimal = sumaDecimal + (int) (Math.pow(base, exponente));
      }
      binario = binario / 10;
      exponente++;

    }
    return sumaDecimal;
  }

  public static String convierteDecimalBinario(long decimal) {

    String numCadena = "";


    while (decimal > 0){
      String digito = String.valueOf(decimal % 2);
      numCadena = digito + numCadena;
      
      decimal = decimal / 2;
    }

    return numCadena;

  }

  public static long decimalABinario(long numeroDe) {
    String numeroBi = ""; //se define el número binario como un string vacío

    //en cada iteración del bucle numeroDe (el número decimal introducido), irá reduciendose a la mitad sucesivamente.
    //el bucle continuará hasta que numeroDe llegue a 0. El resto de la división de numeroDe entre 2 será el valor 
    //añadido a la variable numeroBi. Se le añade por delante ya que el primer dígito del número binario corresponde 
    //a la última división que se realice en el bucle, el segundo dígito con la penúltima división...
    while (numeroDe > 0) {
      String digito = String.valueOf(numeroDe % 2);

      numeroBi = digito + numeroBi;

      numeroDe /= 2;
    } //while (numeroDe > 0)

    return Long.valueOf(numeroBi);
  }

  public static long convierteBinarioOctal(long numeroBi){
    String numeroOc = "";
    
    while (numeroBi > 0){
      String digitoNumeroOc = String.valueOf(Matematicas.convierteBinarioDecimal(numeroBi % 1000));
      numeroOc = digitoNumeroOc + numeroOc;
  
      numeroBi /= 1000;
  
      
    }
    return Long.valueOf(numeroOc);
    

    
  }

  public static String convierteBinarioHexadecimal(long numeroBi) {
    String numeroHe = "";
    
    while (numeroBi > 0){
      String digitoNumeroHex = String.valueOf(Matematicas.convierteBinarioDecimal(numeroBi % 10000));

      switch (digitoNumeroHex) {
        case "10":
          digitoNumeroHex = "A";
          break;
        case "11":
          digitoNumeroHex = "B";
          break;
        case "12":
          digitoNumeroHex = "C";
          break;
        case "13":
          digitoNumeroHex = "D";
          break;
        case "14":
          digitoNumeroHex = "E";
          break;
        case "15":
          digitoNumeroHex = "F";
          break;
        default:

      }

      numeroHe = digitoNumeroHex + numeroHe;
  
      numeroBi /= 10000;
  
      
    }
    return numeroHe;
  }

  public static long convierteDecimalOctal(long numeroDe){
    long numeroBi = Matematicas.decimalABinario(numeroDe);
    return convierteBinarioOctal(numeroBi);
  }

  public static String convierteDecimalHexadecimal(long numeroDe){
    long numeroBi = Matematicas.decimalABinario(numeroDe);
    return convierteBinarioHexadecimal(numeroBi);
  }

  public static long convierteOctalBinario(long numeroOc) {
    //si numeroOc (el número octal) es 0, no entrará al bucle while (numeroOc > 0) (hablaremos  de él a continuación), 
    //por lo que hay que poner la condición de que si numeroOc es 0 la función devuelva un 0
    if (numeroOc == 0) {
      return 0;
    } else {
      String numeroBi = ""; //se define el número binario como un string vacío

      //mientras numeroOc sea mayor que 0 será dividido entre 10 en cada iteración. Sacando el resto de la divisón de numeroOc
      //entre 10 tenemos cada digito del número, que pasaremos de forma independiente a binario. Guardaremos cada dígito como un string
      //y si no tiene tres dígitos binarios se le añaden ceros hasta que el dígito en binario se componga de tres dígitos.
      //estos tres dígitos se añadirán por la izquierda anumeroBi para formar el número en binario
      while (numeroOc > 0) {
        String digitoABi = String.valueOf(decimalABinario(numeroOc % 10));

        if (Matematicas.digitos(Long.valueOf(digitoABi)) == 1) {
          digitoABi = "00" + digitoABi;
        } else if (Matematicas.digitos(Long.valueOf(digitoABi)) == 2) {
          digitoABi = "0" + digitoABi;
        } //if (funciones.funcionesTema801.digitos(Long.valueOf(digitoABi)) == 1)

        numeroBi = numeroBi + digitoABi;

        numeroOc /= 10;
      } //while (numeroOc > 0)

      return Long.valueOf(numeroBi); //se devuelve el número binario como long en vez de String (así no saldrán ceros a la izquierda)
    } //if (numeroOc == 0)
  } //public static long octalABinario(long numeroOc)


  public static long convierteHexadecimalBinario(String numeroHex) {
    //si numeroHex es igual a cero la función devolverá un 0, en caso contrario comenzará la conversión
    if (numeroHex.equals("0")) {
      return 0;
    } else {
      String numeroBi = ""; //se define el número binario como vacío
      String digitoABi = ""; //se define la función utilizada para pasar cada caracter hexadecimal a binario también como vacío

      //con la función charAt() se comprueba cada caracter de la cadena String que forma el número hexadecimal
      //el bucle durará lo que tarde la variable i en igualar la longitud del número introducido. En caso de que
      //charAt(i) encuentre un número mayor que 9 la variable digitoABi obtendrá su valor correspondiente en decimal
      //en caso contrario el dígito no cambiará. Ojo, es muy importante que tanto digitoABi como el caracter
      //encontrado se definan como string (en el segundo caso usaremos String.valueOf()), porque si no los dígitos 
      //menores de 10 se tomarán como su valor ASCII. El dígito obtenido en decimal se pasa a binario habiendolo pasado a
      //long para volver a ser pasado de nuevo a String y guardado en la variable digitoBi. Si el valor de esta variable
      //no llega a tener cuatro dígitos se añadirán los ceros necesarios hasta que el dígito en binario tenga cuatro dígitos.
      //estos cuatro dígitos se añadirán a numeroBi por la izquierda
      for (int i = 0; i < numeroHex.length(); i++) {
        switch(numeroHex.charAt(i)) {
          case 'A':
            digitoABi = "10";
            break;
          case 'B':
            digitoABi = "11";
            break;
          case 'C':
            digitoABi = "12";
            break;
          case 'D':
            digitoABi = "13";
            break;
          case 'E':
            digitoABi = "14";
            break;
          case 'F':
            digitoABi = "15";
            break;
          default:
            digitoABi = String.valueOf(numeroHex.charAt(i)); 
        } //switch(numeroHex.charAt(i))

        String digitoBi = String.valueOf(decimalABinario(Long.valueOf(digitoABi)));

        if (Matematicas.digitos(Long.valueOf(digitoBi)) == 1) {
          digitoBi = "000" + digitoBi;
        } else if (Matematicas.digitos(Long.valueOf(digitoBi)) == 2) {
          digitoBi = "00" + digitoBi;
        } else if (Matematicas.digitos(Long.valueOf(digitoBi)) == 3) {
          digitoBi = "0" + digitoBi;
        } //if (funciones.funcionesTema801.digitos(Long.valueOf(digitoBi)) == 1)

        numeroBi = numeroBi + digitoBi;
      } //for (int i = 0; i < numeroHex.length(); i++)

      return Long.valueOf(numeroBi); //la función devuelve numeroBi como un long en vez de un String (así no saldrán ceros a la izquierda)
    } //if (numeroHex.equals("0"))
  } //public static long hexadecimalABinario(String numeroHex)

  public static long convierteOctalDecimal(long numeroOc){
    long numeroBi = Matematicas.convierteOctalBinario(numeroOc);
    return convierteBinarioDecimal(numeroBi);
  }

  public static String convierteOctalHexadecimal(long numeroOc){
    long numeroBi = Matematicas.convierteOctalBinario(numeroOc);
    return convierteBinarioHexadecimal(numeroBi);
  }

  public static long convierteHexadecimalDecimal(String numeroHe) {
    long numeroBi = Matematicas.convierteHexadecimalBinario(numeroHe);
    return convierteBinarioDecimal(numeroBi);
  }

  public static long convierteHexadecimalOctal(String numeroHe) {
    long numeroBi = Matematicas.convierteHexadecimalBinario(numeroHe);
    return convierteBinarioOctal(numeroBi);
  }
}