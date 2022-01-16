import java.util.Scanner;

/* 
* Minijuego "Busca el tesoro" 
* Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de
* cuatro filas por cinco columnas. El usuario intentará averiguar dónde
* está el tesoro. 
*/
public class MapaDelTesorov2 {
  public static void main(String[] args) throws InterruptedException {

    System.out.println("BUSCA EL TESORO!");
    System.out.println("-----------------");

    int indiceFila = 0;
    int indiceColumna = 0;
    int coordenadaX;
    int coordenadaY;
    int intentos = 4;



    String [][] cuadricula = new String [4][5];

    

    int tesoroX =(int) (Math.random() * 5);
    int tesoroY = (int)(Math.random() * 4);

    int minaX = tesoroX;
    int minaY = tesoroY;

    while ((tesoroX == minaX) == (minaY == tesoroY)){
      minaX = (int)(Math.random()* 5);
      minaY = (int)(Math.random() * 4);
    }

    String[] estado = {"¡Has encontrado la mina!", "¡Enhorabuena! ¡Has encontrado el tesoro!", "¡Cuidado! ¡Hay una mina cerca!", "Te has quedado sin intentos.", "Lo siento, has perdido"};
    int numEstado = 0;

    System.out.println("y");

    System.out.println("  ┌───┬───┬───┬───┬───┐");

    for (indiceFila = 0; indiceFila < 4; indiceFila++){
      System.out.print(indiceFila + " |");
      for (indiceColumna = 0; indiceColumna < 5; indiceColumna++){
        cuadricula[indiceFila] [indiceColumna] = " "; //se definen las posiciones del array como espacios vacíos
        System.out.print(" " + cuadricula[indiceFila] [indiceColumna] + " |");
      }
      System.out.println(" ");
      if (indiceFila < 3) {
        System.out.println("  ├───┼───┼───┼───┼───┤");
      } else {
        System.out.println("  └───┴───┴───┴───┴───┘");
      } //if
    }

    System.out.print("    ");
    for (indiceColumna = 0; indiceColumna < 5; indiceColumna++) {
      System.out.print(indiceColumna + "   ");
    } 

    System.out.print("x");

    System.out.println(" ");
    System.out.println(" ");



  }
}
