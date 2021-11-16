
/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se
 * debe pedir por teclado.
 * 
 */
public class Ejercicio19 {
    public static void main(String[] args) {

    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int altura= Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el carácter de relleno: ");
    String caracter= System.console().readLine();

    int planta = 1;
    int longitudDeLinea = 1;
    int espacios = altura - 1;

    while (planta <= altura) {

      // inserta espacios
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      // pinta la línea
      for (int i = 1; i <= longitudDeLinea; i++) {
        System.out.print(caracter);
      }

      System.out.println();

      planta++;
      espacios--;
      longitudDeLinea += 2;
    }
  }
}