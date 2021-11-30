import javax.xml.namespace.QName;

/* 
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja
 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
 * y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
 * numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
 * 1). Para convertir un número en una cadena de caracteres podemos usar
 * String.valueOf(n) .
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra el nombre de una carta de la baraja francesa");

    int numero;
    String carta;
    int palo;
    String trebol = "♣️";
    String diamante = "♦️";
    String pica = "♠️";
    String corazon = "❤️";

    for (int i = 1; i <= 1; i++) {
      numero = (int) (Math.random() * 13) + 1;
      switch (numero) {
        case 1:
          carta = "A";
          System.out.print("La carta es la " + carta + " de ");
          break;
        case 11:
          carta = "J";
          System.out.print("La carta es la " + carta + " de ");
          break;
        case 12:
          carta = "Q";
          System.out.print("La carta es la " + carta + " de ");
          break;
        case 13:
          carta = "K";
          System.out.print("La carta es la " + carta + " de ");
          break;
        default:
          System.out.print("La carta es el " + numero + " de ");
      }

      palo = (int) (Math.random() * 4) + 1;
      switch (palo) {
        case 1:
          System.out.print("tréboles " + trebol);
          break;
        case 2:
          System.out.print("diamantes " + diamante);
          break;
        case 3:
          System.out.print("picas " + pica);
          break;
        case 4:
          System.out.print("corazones " + corazon);
          break;

      }
    }
    System.out.println();
  }
}
