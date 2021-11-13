
/**
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
 * calcule la potencia
 *
 */
public class Ejercicio14 {
  public static void main(String[] args) {

    System.out.println("Este programa calcula la potencia al introducir una base y un exponente ");
    System.out.println("Introduce la base: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce la exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());

    int potencia = base;
    if (exponente == 1){
      System.out.println("La potencia es " + potencia);
    } else {
      while (exponente > 1){
      
        potencia = potencia * base;
        exponente--;
    
      }
  
      System.out.println("La potencia es: " + potencia);
    
    }
   
   
  }
}
