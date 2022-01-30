import java.util.Scanner;
import misfunciones.Matematicas;
// import misfunciones.Figuras;

/**
 * Escribe un programa que pase de binario a decimal.
 * 
 */

public class Ejercicio17 {
  // Programa principal //////////////////////////////////////
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Introduce el número en binario: ");
    long binario = Long.parseLong(s.nextLine());

    System.out.println("El número convertido de binario a decimal es: " + Matematicas.convierteBinarioDecimal(binario));


  }

}
