
/**
 * Escribe un programa que lea un número n e imprima una pirámide de números
 * con n filas como en la siguiente figura:
 * 
 */
public class Ejercicio24 {
  public static void main(String[] args) {

    System.out.println(
        "Este programa imprime un programa con la cantidad de filas introducidas ");
    System.out.print("Por favor, introduce la cantidad de filas: ");
    int numeroFilas = Integer.parseInt(System.console().readLine());

    
    int altura = 1;
    int i = 0;
    int espacios = numeroFilas - 1;
   
    
  
    while (altura <= numeroFilas) {

      // inserta espacios
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
     
      // pinta la línea
      for (i = 1; i < altura; i++ ) {
        System.out.print(i);
      }
      for (i = altura; i > 0; i-- ) {
        System.out.print(i);
      }

      System.out.println();

      altura++;
      espacios--;
      
      
    }

  }
}
