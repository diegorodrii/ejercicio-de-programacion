
/**
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
 * se deberán mostrar 2¹ , 2² , 2³ , 2⁴ y 2⁵.
 *
 */
public class Ejercicio15 {
  public static void main(String[] args) {

    System.out.println("Este programa muestra por pantalla las potencias con base el numero dado y exponentes entre uno y el exponente introducido");
    System.out.println("Introduce la base: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce la exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());

    int potencia = base;
   
    int sumaExponente = 0;
      while (sumaExponente < exponente){
        sumaExponente++;
        System.out.println(base + " elevado a " + sumaExponente + " = " + potencia);
        potencia = potencia * base;
        
        
        
      }
      
      
    
    }
  
}
