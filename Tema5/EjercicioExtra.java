
/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se
 * debe pedir por teclado.
 * 
 */
public class EjercicioExtra {
  public static void main(String[] args) {

    System.out.print("Este programa pinta un árbol de Navidad");
    System.out.print("Por favor, introduzca la altura del árbol: ");
    int altura = Integer.parseInt(System.console().readLine());

    int base = 2;
    int tronco = altura - base;

    for (int i = 1; i <= altura; i++) {
      if (i == 1) {
        System.out.println("*");
      } else if ((i > 1) && (i <= tronco)) {
        System.out.println("/");
      } else {
        System.out.println("#");
      }

    }
    for (int i= 0; i < altura; i++){
      System.out.print(" ");
    }

  }
}