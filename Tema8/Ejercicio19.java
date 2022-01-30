import java.util.Scanner;
import misfunciones.Matematicas;
// import misfunciones.Figuras;

/**
 * Une y amplía los dos programas anteriores de tal forma que se permita
 * convertir un número entre cualquiera de las siguientes bases: decimal,
 * binario,
 * hexadecimal y octal.
 * 
 */

public class Ejercicio19 {
  // Programa principal //////////////////////////////////////
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("CALCULADORA DE PROGRAMADOR");
    System.out.println("---------------------------");
    System.out.println(" ");

    System.out.println("Elija la conversión que quiere realizar:");
    System.out.println("1 - Decimal a Binario");
    System.out.println("2 - Decimal a Octal");
    System.out.println("3 - Decimal a Hexadecimal");
    System.out.println("4 - Binario a Decimal");
    System.out.println("5 - Binario a Octal");
    System.out.println("6 - Binario a Hexadecimal");
    System.out.println("7 - Octal a Decimal");
    System.out.println("8 - Octal a Binario");
    System.out.println("9 - Octal a Hexadecimal");
    System.out.println("10 - Hexadecimal a Decimal");
    System.out.println("11 - Hexadecimal a Binario");
    System.out.println("12 - Hexadecimal a Octal");
    System.out.println(" ");
    System.out.print("> ");
    int tipoConversion = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    long numero = 0;
    System.out.print("Introduzca un número ");
    switch (tipoConversion) {
      case 1:
      System.out.print("decimal: ");
      numero = Long.parseLong(s.nextLine());
      System.out.println("El número pasado a binario queda así: " + Matematicas.convierteDecimalBinario(numero));
      
      break;
     
      case 2:
      System.out.print("decimal: ");
      numero = Long.parseLong(s.nextLine());
      System.out.println("El número pasado a octal queda así: " + Matematicas.convierteDecimalOctal(numero));


      break;

      case 3:
      System.out.print("decimal: ");
      numero = Long.parseLong(s.nextLine());
      System.out.println("El número pasado a hexadecimal queda así: " + Matematicas.convierteDecimalHexadecimal(numero));

      break;
        
      case 4:
      System.out.print("binario: ");
      numero = Long.parseLong(s.nextLine());

      System.out.println("El número pasado a decimal queda así: " + Matematicas.convierteBinarioDecimal(numero));

      break;
        
      case 5:
      System.out.print("binario: ");
      numero = Long.parseLong(s.nextLine());
    
      System.out.println("El número pasado a octal queda así: " + Matematicas.convierteBinarioOctal(numero));

      break;
        
      case 6:
      System.out.print("binario: ");
      numero = Long.parseLong(s.nextLine());
      System.out.println("El número pasado a hexadecimal queda así: " + Matematicas.convierteBinarioHexadecimal(numero));

      break;

      case 7:
      System.out.print("octal: ");
      numero = Long.parseLong(s.nextLine());

      System.out.println("El número pasado a deciaml queda así: " + Matematicas.convierteOctalDecimal(numero));

      break;
        
      case 8:
      System.out.print("octal: ");
      numero = Long.parseLong(s.nextLine());
      System.out.println("El número pasado a binario queda así: " + Matematicas.convierteOctalBinario(numero));

      break;
        
      case 9:
      System.out.print("octal: ");
      numero = Long.parseLong(s.nextLine());
      
      System.out.println("El número pasado a hexadecimal queda así: " + Matematicas.convierteOctalHexadecimal(numero));

      break;
        
      case 10:
      System.out.print("hexadecimal: ");
      String numeroHex = s.nextLine().toUpperCase();
      System.out.println("El número pasado a octal queda así: " + Matematicas.convierteHexadecimalDecimal(numeroHex));

      break;
        
      case 11:
      System.out.print("hexadecimal: ");
      numeroHex = s.nextLine().toUpperCase();
      System.out.println("El número pasado a octal queda así: " + Matematicas.convierteHexadecimalBinario(numeroHex));

      break;

      case 12:
      System.out.print("hexadecimal: ");
      numeroHex = s.nextLine().toUpperCase();
      System.out.println("El número pasado a octal queda así: " + Matematicas.convierteHexadecimalOctal(numeroHex));

      break;

    }
   
  }

}
