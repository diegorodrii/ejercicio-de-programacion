
/**
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 *
 * @author Diego Rodríguez Barcos
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    
    int numero = 0;
    int cantidadNumeros = 0;
    do {
    System.out.print("Este programa te calcula la media de los números introducidos hasta que se marca un número negativo ");
    System.out.print("Por favor, introduzca los números que quiere introducir de uno en uno: ");
    numero = Integer.parseInt(System.console().readLine());
    cantidadNumeros++;
    } while (numero > 0);
    
    int media = numero / cantidadNumeros;

  System.out.println("La media es " + media);


    
  }
}
