
/* 
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
 * El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
 * de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
 * entre 1 y 40 caracteres.
 * 
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("Este programa pinta diez líneas formadas por caractéres");

    int numeroLineas = 0;

    do {

      int longitud = (int) (Math.random() * 40);

      numeroLineas++;
      int elegido = (int) (Math.random() * 6 + 1);
      System.out.print(numeroLineas + ". ");
      while (longitud != 0) {

        switch (elegido) {
          case 1:
            System.out.print("* ");
            break;

          case 2:
            System.out.print("- ");
            break;

          case 3:
            System.out.print("= ");
            break;

          case 4:
            System.out.print(". ");
            break;

          case 5:
            System.out.print("| ");
            break;

          case 6:
            System.out.print("@ ");
            break;
        }

        longitud--;
      }
      System.out.println();
    } while (numeroLineas != 10);

    System.out.println();

  }
}
