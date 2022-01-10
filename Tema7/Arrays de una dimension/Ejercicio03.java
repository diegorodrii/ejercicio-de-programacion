
/* 
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en mostrarse
 * y viceversa.
 * 
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra números en orden inverso.");

    System.out.println("Introduce el número: ");

    int [] num = new int [10];

   

    for (int i = 0; i < 10; i++){
      num[i] = Integer.parseInt(System.console().readLine());
    } 
    System.out.print("El orden inverso de los números introducidos es: " );
    for (int i = 9; i >= 0; i--){
      
      System.out.print(num[i] + " ");
    }
    
    

    
  }
}
