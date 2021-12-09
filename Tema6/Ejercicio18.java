
/* 
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
 * sustituir el color blanco por colores más alegres. Realiza un programa que
 * genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
 * cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
 * debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
 * naranja. 
 *
 */
public class Ejercicio18 {
  public static void main(String[] args) {
    System.out.println("Este programa ofrece una paleta de colores");

    int c1;
    int c2;
    int c3;

    do {
      c1 = (int) (Math.random() * 6);
      c2 = (int) (Math.random() * 6);
      c3 = (int) (Math.random() * 6);
    } while ((c1 == c2) || (c1 == c3) || (c2 == c3));

    String color1 = "";

    switch (c1) {
      case 0:
        color1 = "rojo";
        break;
      case 1:
        color1 = "azul";
        break;
      case 2:
        color1 = "verde";
        break;
      case 3:
        color1 = "amarillo";
        break;
      case 4:
        color1 = "violeta";
        break;
      case 5:
        color1 = "naranja";
        break;
      default:
    }

    String color2 = "";

    switch (c2) {
      case 0:
        color2 = "rojo";
        break;
      case 1:
        color2 = "azul";
        break;
      case 2:
        color2 = "verde";
        break;
      case 3:
        color2 = "amarillo";
        break;
      case 4:
        color2 = "violeta";
        break;
      case 5:
        color2 = "naranja";
        break;
      default:
    }

    String color3 = "";

    switch (c3) {
      case 0:
        color3 = "rojo";
        break;
      case 1:
        color3 = "azul";
        break;
      case 2:
        color3 = "verde";
        break;
      case 3:
        color3 = "amarillo";
        break;
      case 4:
        color3 = "violeta";
        break;
      case 5:
        color3 = "naranja";
        break;
      default:
    }

    System.out.print(color1 + ", " + color2 + ", " + color3);
  }

}
