
/**
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
 * programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
 * mitad (división entera entre 2) de la altura más uno.
 */
public class Ejercicio31 {
  public static void main(String[] args) {

    System.out.println("Este programa dibuja una L según la altura introducida");
    System.out.println("Por favor, introduzca la altura: ");
    int altura = Integer.parseInt(System.console().readLine());

    int numeroAsteriscosAltura = 0;
    int numeroAsteriscosHorizontal = 0;
    do {
      System.out.println("*");
      numeroAsteriscosAltura++;
    } while (numeroAsteriscosAltura < altura);

    if (numeroAsteriscosAltura == altura){
      do{
      System.out.print("* ");
      numeroAsteriscosHorizontal++;
      } while (numeroAsteriscosHorizontal <= (numeroAsteriscosAltura/2));
      System.out.print("* ");
      System.out.println();
    }
  }
}
