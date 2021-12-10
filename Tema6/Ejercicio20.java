
/* 
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 *
 */
public class Ejercicio20 {
  public static void main(String[] args) {
    System.out.println("Este programa pinta por pantalla una cuba con agua");

    System.out.println("¿De cuánto quiere que sea el ancho de la cuba?");
    int ancho = Integer.parseInt(System.console().readLine());

    System.out.println("¿De cuánto quiere que sea la altura de la cuba?");
    int altura = Integer.parseInt(System.console().readLine());

    int alturaAgua = (int) (Math.random() * altura);
    


    for (int o = altura; o >= 0; o--) {
      System.out.print("|");

      if (o <= alturaAgua) {
        for (int u = ancho ; u >= 0; u--) {
          System.out.print("~");

        }
        System.out.println("|");
      } else {
        for (int i = ancho; i >= 0; i--) {
          System.out.print(" ");
        }
        System.out.println("|");
      }
    }

    System.out.print(" ");
    for (int i = ancho; i >= 0; i--) {
      System.out.print("-");
    }
    System.out.println();

  }
}
