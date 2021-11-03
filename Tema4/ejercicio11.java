/**
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan para llegar a la medianoche.
 * 
 * 
 */
 
public class ejercicio11{
  public static void main(String[] args) {
    System.out.println("Este programa determina los segundos que faltan para llegar a la medianoche");
    System.out.print("Por favor, introduzca la hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    double mediaNoche = 86400;
    
    double segundosHora = hora * 3600;
    double minutosHora = minutos * 60;

    double segundosRestantes = mediaNoche - segundosHora - minutosHora;

    System.out.println("Quedan " + segundosRestantes + " segundos para la medianoche");
    
   
  }
}

