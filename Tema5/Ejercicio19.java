
/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 * pedir por teclado.
 * 
 */
public class Ejercicio19 {
  public static void main(String[] args) {

    System.out
        .println("Este programa pinta una pirámide con una altura y un carácter introducido por teclado");
    System.out.print("Introduce la altura: ");
    int altura = Integer.parseInt(System.console().readLine());

    System.out.print("Introduce el carácter: ");
    String caracter = System.console().readLine().toLowerCase();

    int posicionPico = altura / 2;
    int posicionFilas = altura / 2;


   
    do {
     
      System.out.println(caracter);
      altura--;
      System.out.println(caracter);
    } while (altura > 0);
    
    
    int base = altura * 2;
    while (base > 0){
    System.out.print(caracter + " ");
    base--;
    }    

    /** 
    do {
      do {
        
        System.out.print(" ");
        posicionPico--;
        
      } while (posicionPico >= 0);

      System.out.println(caracter);
      altura--;
    } while (altura > 0);
 */
  }
}
