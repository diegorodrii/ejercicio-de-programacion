
/* 
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra 50 números aleatorios entre 100 y 199");

    int numero = 0;
    int numeroMaximo = 0;
    int numeroMinimo = 1000;
    int media = 0;
    for (int i = 1; i <= 50; i++) {
      numero = (int) (Math.random() * 11);
      System.out.print(numero);
      System.out.print(" ");
      if (numeroMaximo < numero) {
        numeroMaximo = numero;
      }
      
      if (numeroMinimo > numero) {
        numeroMinimo = numero;
      }
      media = media + numero;

    }
    System.out.println("");
    System.out.println("El número más alto es: " + numeroMaximo);
    System.out.println("El número más bajo es: " + numeroMinimo);
    System.out.println("La media es: " + media);
  }
}
