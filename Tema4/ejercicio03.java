/**
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
 * diente nombre del día de la semana.
 * 
 */

    
public class ejercicio03{
  public static void main(String[] args) {
    System.out.println("Este programa te muestra el día de la semana correspondiente a su número ");
    System.out.print("Por favor, indique un número para asociarlo con su semana: ");
    String solicitud = System.console().readLine();
    int dia = Integer.parseInt (solicitud);

    if (dia == 1){
      System.out.println("Lunes");
    }
      
    if (dia == 2){
      System.out.println("Martes");
    }
    
    if (dia == 3){
      System.out.println("Miércoles");
    }
      
    if (dia == 4){
      System.out.println("Jueves");
 
    }
    
    if (dia == 5){
      System.out.println("Viernes");
 
    }
    if (dia == 6){
      System.out.println("Sábado");
 
    }
    if (dia == 7){
      System.out.println("Domingo");
 
    }
 
     
  }     
}

