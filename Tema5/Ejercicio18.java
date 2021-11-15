
/**
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en
 * 7.
 * 
 */
public class Ejercicio18 {
  public static void main(String[] args) {

    System.out
        .println("Este programa escribe los números comprendidos entre los dos introducidos, incrementando de 7 en 7");
    System.out.print("Introduce el primer número: ");
    int numero1 = Integer.parseInt(System.console().readLine());

    System.out.print("Introduce el segundo número: ");
    int numero2 = Integer.parseInt(System.console().readLine());

    System.out.print("La sucesión de los números es: " + numero1);
    int exponente = numero1;
    while (exponente < numero2) {

      exponente = exponente + 7;
      if (exponente > numero2) {
        break;
      }
      System.out.print(" " + exponente);
    }

  }
}
