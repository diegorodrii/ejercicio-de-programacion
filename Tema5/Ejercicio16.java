
/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 */
public class Ejercicio16 {
  public static void main(String[] args) {

    System.out.println("Este programa dice si un número introducido es primo o no");
    System.out.println("Introduce el número: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    double modulo;

    Boolean primo = true;

    for (int divisor = 2; (divisor < numero) && primo; divisor++ ){
      modulo = numero%divisor;
        if(modulo == 0){
          primo = false;
        }else{
          primo = true;
        }
      
    
    }
    if(primo){
      System.out.println("El número es primo");
    } else {
      System.out.println("El número no es primo");
    }
  }
}
