
/**
 * Realiza una programa que calcule las horas transcurridas entre dos horas de
 * dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
 * El día de la semana se puede pedir como un número (del 1 al 7) o como una
 * cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
 * los datos correctamente y que el segundo día es posterior al primero.
 * 
 */
public class Ejercicio30 {
  public static void main(String[] args) {

    System.out.println("Este programa indica las horas transcurridas entre dos horas de dos dias de la semana");
    System.out.print("Por favor, introduce el primer día de la semana(1.- Lunes  2.-Martes ...): ");
    int dia1 = Integer.parseInt(System.console().readLine());

    System.out.print("Por favor, introduce la primera hora del primer dia de la semana: ");
    int hora1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduce el segundo día de la semana(1.- Lunes  2.-Martes ...): ");
    int dia2 = Integer.parseInt(System.console().readLine());

    System.out.print("Por favor, introduce la segunda hora del segundo dia de la semana: ");
    int hora2 = Integer.parseInt(System.console().readLine());
    
    int horasTotales = 0;

    if (dia1 <=7 && (dia1 > 0) && (hora1 <= 24) && (hora1 > 0) && ( dia2 <= 7) && (dia2 > 0) && (hora2 <= 24) && (hora2 > 0) && (dia1 <= dia2)) {
  
    horasTotales = 24 - hora1 + hora2;
    horasTotales = (dia2 - dia1) * 24;

    System.out.println("Las horas totales que han pasado son: " + horasTotales);
    } else {
      System.out.println("Hay un dato introducido que no es correcto");
    }
  }
}
