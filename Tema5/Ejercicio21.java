
/**
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el
 * cómputo.
 * 
 */
public class Ejercicio21 {
  public static void main(String[] args) {
    System.out.println("Este programa dice cuantos números se han introducido, la media de los impars y el mayor de los pares ");
    int numeroTotal = 0;
    int cantidadNumeros = 0;
    int numeroPedido = 0;
    int numeroImpares =0;
    int mayorPar = 0;
    
    do {
      System.out.print("Por favor, introduzca los números que quiere introducir de uno en uno: ");
      numeroPedido = Integer.parseInt(System.console().readLine());
      
      if (numeroPedido < 0) {
        break;
      }
      cantidadNumeros++;
      if (numeroPedido % 2 == 1){
      numeroTotal = numeroTotal + numeroPedido;
      numeroImpares++;
      }
      
        if ((numeroPedido % 2 == 0) && (mayorPar < numeroPedido)){
        mayorPar = numeroPedido;
        
      }
    } while (numeroPedido > 0);

    double media = numeroTotal / numeroImpares;

    if (numeroPedido < 0) {
      System.out.println("La cantidad de números introducidos es: " + cantidadNumeros);
      System.out.println("La media de los impares es: " + media);
      System.out.println("El par mayor es: " + mayorPar);
    }

  }
}
