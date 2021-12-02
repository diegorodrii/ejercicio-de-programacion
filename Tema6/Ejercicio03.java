
/* 
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
 * de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra el nombre de una carta de la baraja francesa");

    int numero;
    String carta;
    int palo;
    String trebol = "♣️";
    String diamante = "♦️";
    String pica = "♠️";
    String corazon = "❤️";


    String caballo = "🐴";
    String sota = "💂";
    String rey = "👑";
    String as = "🃏";

    for (int i = 1; i <= 1; i++) {
      numero = (int) (Math.random() * 10) + 1;
      switch (numero) {
        case 1:
          carta = "A";
          System.out.print("La carta es el " + carta + " " + as + " de ");
          break;
        case 8:
          carta = "Sota";
          System.out.print("La carta es la " + carta + " " + sota + " de ");
          break;
        case 9:
          carta = "Caballo";
          System.out.print("La carta es la " + carta + " " + caballo + " de ");
          break;
        case 10:
          carta = "Rey";
          System.out.print("La carta es la " + carta + " " + rey + " de ");
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
