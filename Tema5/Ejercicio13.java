
/**
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 *
 */
public class Ejercicio12 {
  public static void main(String[] args) {

    int cantidadTerminos = 0;

    System.out.println("Este programa la cantidad de términos de la serie de Fibonacci que se soliciten ");
    System.out.print("Por favor, introduzca la cantidad de términos que quiere conocer: ");
    cantidadTerminos = Integer.parseInt(System.console().readLine());

    int numero1 = 0;
    int numero2 = 0;
    switch (cantidadTerminos){
      case 1:
        System.out.print("0");
        break;
        
        case 2:
        System.out.print("0 1");
        break;
        default:
          System.out.print("0 1");
          numero1 = 0;
          numero2 = 1;
          int cadena;
          while (cantidadTerminos > 2){
            cadena = numero1 + numero2;
            numero1 = numero2;
            numero2 = cadena;
            System.out.print(" " +numero2);
            cantidadTerminos--;
          }
    }
    System.out.println("");
  }
}
