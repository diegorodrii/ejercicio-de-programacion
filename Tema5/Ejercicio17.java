
/**
 * Realiza un programa que sume los 100 números siguientes a un número entero y
 * positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 */
public class Ejercicio17 {
  public static void main(String[] args) {

    System.out.println("Este programa suma los 100 numeros siguientes a un número entero y positivo introducido");
    System.out.print("Introduce el número: ");
    int numero = Integer.parseInt(System.console().readLine());

    int suma = numero;
    int numeroSumas = 100;
    int sumaTotal = 0;
    if (numero > 0){
      while (numeroSumas > 0) {
        numeroSumas--;
        suma = suma + numero++;
        
      }
    }
    System.out.println("La suma de los siguientes 100 números es: " + suma);
  }
}
