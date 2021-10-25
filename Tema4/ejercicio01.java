/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 * 
 */

    
public class ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Este programa printa por pantalla la asignatura que toca a primera hora dependiendo del día de la semana que se seleccione. ");
    System.out.print("Por favor, indique un día de la semana con letra minúscula: ");
    String dia = System.console().readLine();
    
    if (dia.equals("lunes")) {
      System.out.println("Programación");
      
    } 
    else if (dia.equals("martes")) {
      System.out.println("Programación");
      
    }     
    else if (dia.equals("miercoles")) {
      System.out.println("Sistemas informáticos");
    }
      
    else if (dia.equals("miércoles")) {
      System.out.println("Sistemas informáticos");      
      
    }
      
    else if (dia.equals("jueves")) {
      System.out.println("Programación");
      
    } 
     else if (dia.equals("viernes")) {
      System.out.println("Sistemas informáticos");
    }  
     else{
      System.out.println("No hay clase o has introducido mal los datos");
                  
    }     
  }     
}


