/**
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 */

    
public class ejercicio12 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca la nota que sacó en el primer examen: ");
    double examen1 = Double.parseDouble(System.console() .readLine() ) ;
    
    System.out.print("Por favor, introduzca la nota que desea sacar esta evaluación: ");
    double notaDeseada = Double.parseDouble(System.console() .readLine() ) ;
    
    double examen2;
    examen2= (-(0.4 * examen1) + (notaDeseada)) / 0.6;
    System.out.printf("Calculadora de nota \n");
    System.out.println("---------------------------------------------------------------");
    System.out.printf("La nota que ha sacado en el primer examen es %.2f y la nota que desea alcanzar es: %.2f \n", examen1, notaDeseada);
    System.out.println("---------------------------------------------------------------");
    System.out.printf("La nota que necesita sacar para alcanzar la nota deseada de %.2f, habiendo obtenido la nota de %.2f en el primer examen, es de: %.2f", examen1, notaDeseada, examen2);      

    
  }     
}

