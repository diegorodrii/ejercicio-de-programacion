import java.util.Scanner;
import misfunciones.Matematicas;
import misfunciones.Figuras;

/**
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
 * resulta trivial teniendo voltea y la función siguientePrimo también es muy
 * fácil de
 * implementar teniendo esPrimo.
 * 1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro
 * es capicúa y falso en caso contrario.
 * 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro
 * es primo y falso en caso contrario.
 * 3. siguientePrimo: Devuelve el menor primo que es mayor al número que
 * se pasa como parámetro.
 * 4. potencia: Dada una base y un exponente devuelve la potencia.
 * 5. digitos: Cuenta el número de dígitos de un número entero.
 * 6. voltea: Le da la vuelta a un número.
 * 7. digitoN: Devuelve el dígito que está en la posición n de un número entero.
 * Se empieza contando por el 0 y de izquierda a derecha.
 * 8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
 * dentro de un número entero. Si no se encuentra, devuelve -1.
 * 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la
 * derecha).
 * 10. quitaPorDelante: Le quita a un número n dígitos por delante (por la
 * izquierda).
 * 11. pegaPorDetras: Añade un dígito a un número por detrás.
 * 12. pegaPorDelante: Añade un dígito a un número por delante.
 * 13. trozoDeNumero: Toma como parámetros las posiciones inicial y final
 * dentro de un número y devuelve el trozo correspondiente.
 * 14. juntaNumeros: Pega dos números para formar uno.
 * 
 */

public class Ejercicio01al14 {
  // Programa principal //////////////////////////////////////
  public static void main(String[] args) {

    // esCapicua

    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número entero positivo: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());

    if (Matematicas.esCapicua(numeroIntroducido)) {
      System.out.println("El " + numeroIntroducido + " es capicua.");
    } else {
      System.out.println("El " + numeroIntroducido + " no es capicua.");
    }

    // esPrimo

    if (Matematicas.esPrimo(numeroIntroducido)) {
      System.out.println("El número " + numeroIntroducido + " es primo");
    } else {
      System.out.println("El número " + numeroIntroducido + " no es primo");
    }

    // siguientePrimo

    System.out.println("El siguiente número primo más pequeño es: " + Matematicas.siguientePrimo(numeroIntroducido));

    // potencia

    System.out.print("Introduzca la base: ");
    int base = Integer.parseInt(s.nextLine());

    System.out.print("Introduzca el exponente: ");
    int exponente = Integer.parseInt(s.nextLine());
    System.out.println("La potencia es: " + Matematicas.potencia(base, exponente));

    // digitos

    System.out.print("Introduzca un número para conocer sus dígitos: ");
    int num = Integer.parseInt(s.nextLine());

    System.out.println("El número tiene " + Matematicas.digitos(num) + " dígitos");

    // voltea

    System.out.print("Introduzca el número que quiere voltear: ");
    int numAVoltear = Integer.parseInt(s.nextLine());

    System.out.println("El número volteado es " + Matematicas.voltear(numAVoltear));

    // posicionN
    System.out.print("Introduce el número que quiera saber la posición de su dígito: ");
    int numN = Integer.parseInt(s.nextLine());

    System.out.print("Introduce la posición que quiere conocer: ");
    int N = Integer.parseInt(s.nextLine());

    System.out.println("El dígito de la " + N + " posición es " + Matematicas.posicionN(numN, N));
    
    // posicionDeDigito

    System.out.print("Introduce el número que quiera saber la posicion en la que se encuentra el dígito que introduzca: ");
    int numDigito = Integer.parseInt(s.nextLine());

    System.out.print("Introduce el dígito que quiera conocer la posicion en la que se encuentra: ");
    int digito = Integer.parseInt(s.nextLine());

    System.out.println("El dígito " + digito + " posición es " + Matematicas.posicionDeDigito(numDigito, digito));
  
    // quitaPorDetrás

    System.out.print("Introduce el número al que le quiere eliminar digitos por detrás: ");
    int numDetras = Integer.parseInt(s.nextLine());

    System.out.print("Introduce cuantos digitos quiere eliminar por detrás: ");
    int nDigElim = Integer.parseInt(s.nextLine());

    System.out.println("El número se queda así: " + Matematicas.quitaPorDetras(numDetras, nDigElim));
  
     // quitaPorDelante

     System.out.print("Introduce el número al que le quiere eliminar digitos por delante: ");
     int numDelante = Integer.parseInt(s.nextLine());
 
     System.out.print("Introduce cuantos digitos quiere eliminar por delante: ");
     nDigElim = Integer.parseInt(s.nextLine());
 
     System.out.println("El número se queda así: " + Matematicas.quitaPorDelante(numDelante, nDigElim));
  }
}
