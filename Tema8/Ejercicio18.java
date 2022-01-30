import java.util.Scanner;
import misfunciones.Matematicas;
// import misfunciones.Figuras;

/**
 * Escribe un programa que pase de decimal a binario.
 * 
 */

public class Ejercicio18 {
  // Programa principal //////////////////////////////////////
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Introduce el número en decimal: ");
    int decimal = Integer.parseInt(s.nextLine());

    System.out.print("El número pasado a decimal queda como " + Matematicas.convierteDecimalBinario(decimal));

  }

}
