/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Diego Rodríguez Barcos
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    System.out.print("Introduzca el número del que desea saber su tabla de multiplicar: ");
    int i = Integer.parseInt(System.console().readLine());

    if (i == 1){
      for (i = 0; i <= 10; i += 1) {
        System.out.println(i);
      }
    }
    if (i == 2){
      for (i = 0; i <= 20; i += 2) {
       System.out.println(i);
      }
    }
    if (i == 3){
      for (i = 0; i <= 30; i += 3) {
      System.out.println(i);
      }
    }
   
    if (i == 4){
      for (i = 0; i <= 40; i += 4) {
      System.out.println(i);
      }
    }
    if (i == 5){
      for (i = 0; i <= 50; i += 5) {
      System.out.println(i);
      }
    }
    
    if (i == 6){
      for (i = 0; i <= 60; i += 6) {
      System.out.println(i);
      }
    }
   
    if (i == 7){
      for (i= 0; i <= 70; i += 7) {
      System.out.println(i);
      } 
    }
    
    if (i == 8){
      for (i = 0; i <= 80; i += 8) {
      System.out.println(i);
      }
    }
  
    if (i == 9){
      for (i = 0; i <= 90; i += 9) {
      System.out.println(i);
      }
    }
    
  }
}
