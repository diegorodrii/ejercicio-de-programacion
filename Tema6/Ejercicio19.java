
/* 
 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos
 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
 * el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados.
 *
 */
public class Ejercicio19 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra 50 números aleatorios entre el -100 y el 200");

   
    int mayorPar = 0;
    int menorImpar= 0;
    
    for (int i = 0; i <= 50; i++){
      int numero = (int)(Math.random() * -100) ;
      int numeroSuma = (int)(Math.random () * 200);
      int numeroFinal = numero + numeroSuma;
      System.out.println(numeroFinal + " ");
      if ((numeroFinal < menorImpar) && ((numeroFinal % 2 == 1) || (numeroFinal % 2 == -1))){
        menorImpar = numeroFinal;
      }
      if ((numeroFinal > mayorPar) && (numeroFinal % 2 == 0)){
        mayorPar = numeroFinal;
      }
    }

    System.out.println("El mayor par es " + mayorPar);
    System.out.println("El menor impar es " + menorImpar);
    
  }

}
