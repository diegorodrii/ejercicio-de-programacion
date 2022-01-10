
/* 
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
 * elementos según la tabla que se muestra a continuación. Muestra el contenido
 * de todos los elementos del array. ¿Qué sucede con los valores de los elementos
 * que no han sido inicializados?
 * 
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra el contenido de todos los elementos del array.");

    char [] caracter = new char [10];

    caracter [0] = 'a';
    caracter [1] = 'x';
  
   
  
  
    caracter [4] = '@';
    caracter[6] = '"';
    caracter[7] = '+';
    caracter[8] = 'Q';
    

    for (int i = 0; i < 10; i++){
      System.out.println(i + "  " +caracter[i]);
    } 
    

    
  }
}
