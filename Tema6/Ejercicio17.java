
/* 
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
 * serán de 4 unidades. No hay que comprobar que los datos se introducen
 * correctamente; podemos suponer que el usuario los introduce bien. Dentro de
 * la pecera hay que colocar de forma aleatoria un pececito, que puede estar
 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
 * rectángulo.
 *
 */
public class Ejercicio17 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    int alto = Integer.parseInt(System.console().readLine());

    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    int ancho = Integer.parseInt(System.console().readLine());

    int posicion = 0;

    int posicionPez = (int) (Math.random() * (alto - 2) * (ancho - 2));

    // Pinta la parte superior /////////////////////////////////////////////////
    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
    System.out.println();

    // Pinta la parte central //////////////////////////////////////////////////
    for (int i = 2; i < alto; i++) {
      System.out.print("*"); // parte izquierda de la pecera
      for (int j = 2; j < ancho; j++) {
        if (posicion == posicionPez) {
          System.out.print("&");
        } else {
          System.out.print(" ");
        }
        posicion++;
      } // for j
      System.out.println("*"); // parte derecha de la pecera
    } // for i

    // Pinta la parte inferior /////////////////////////////////////////////////
    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
  }
}
