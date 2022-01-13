import java.util.Scanner;

/* 
* Minijuego "Busca el tesoro" 
* Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de
* cuatro filas por cinco columnas. El usuario intentará averiguar dónde
* está el tesoro. 
*/
public class MapaDelTesoro {
  public static void main(String[] args) throws InterruptedException {

    System.out.println("BUSCA EL TESORO!");

    final int vacio = 0;
    final int mina = 1;
    final int tesoro = 2;
    final int intento = 3;

    Scanner s = new Scanner(System.in);
    int x;
    int y;
    int cuadrante[][] = new int[5][4];

    // * inicia array*/
    for (x = 0; x < 4; x++) {
      for (y = 0; y < 3; y++) {
        cuadrante[x][y] = vacio;
      }
    }

    // * Coloca la mina*/

    int minaX = (int) (Math.random() * 5);
    int minaY = (int) (Math.random() * 4);
    cuadrante[minaX][minaY] = mina;

    // * Coloca el tesoro*/

    int tesoroX;
    int tesoroY;

    do {
      tesoroX = (int) (Math.random() * 5);
      tesoroY = (int) (Math.random() * 4);
    } while ((tesoroX == minaX) && (tesoroY == minaY));
    cuadrante[tesoroX][tesoroY] = tesoro;

    // * El usuario realia un intento*/

    boolean salir = false;
    String c = "";

    do {
      for (y = 3; y >= 0; y--) {
        System.out.print(y + "|");
        for (x = 0; x < 5; x++) {
          if (cuadrante[x][y] == intento) {
            System.out.print("X ");
          } else {
            System.out.print("  ");
          }

        }
        System.out.println();
      }
      System.out.println("  ----------\n  0 1 2 3 4\n");

      /* Pide las coordenadas */
      System.out.print("Coordenada X: ");
      x = Integer.parseInt(s.nextLine());

      System.out.print("Coordenada Y: ");
      y = Integer.parseInt(s.nextLine());

      // Mira lo que hay en las coordenadas que pidie el usuario

      switch (cuadrante[x][y]) {
        case vacio:
          cuadrante[x][y] = intento;
          break;

        case mina:
          System.out.println("Lo siento, has perdido.");
          salir = true;
          break;
        case tesoro:
          System.out.println("¡Enhorabuena, has encontrado el tesoro!");
          salir = true;
          break;
        default:
      }

    } while (!salir);

    // pinta el cuadrante
    for (y = 3; y >= 0; y--){
      System.out.print(y + "| ");
      for (x = 0; x < 5; x++){
        switch(cuadrante[x][y]){
          case vacio:
            c = "  ";
            break;
          case mina:
            c = "* ";
            break;
          case tesoro:
            c = "$ ";
            break;
          case intento:
            c = "X ";
            break;
          default:
        }
        System.out.print(c);
      }
      System.out.println();
    }
    System.out.println("  ----------\n   0 1 2 3 4\n");
    }
}
