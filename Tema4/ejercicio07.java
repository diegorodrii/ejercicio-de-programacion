/**
 * Realiza un programa que calcule la media de tres notas.
 * 
 * 
 */

    
public class ejercicio07{
  public static void main(String[] args) {
    System.out.println("Este programa calcula la nota media de las tres notas introducidas: ");
    System.out.print("Por favor, introduzca la nota del primer examen: ");
    double examen1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca la nota del segundo examen: ");
    double examen2 = Double.parseDouble(System.console().readLine());
        
    System.out.print("Por favor, introduzca la nota del tercer examen: ");
    double examen3 = Double.parseDouble(System.console().readLine());
    
    double media =( (double) examen1 + (double) examen2 + (double) examen3 ) / 3;
    

    if ((examen1 > 10) || (examen2 > 10) || (examen3 > 10)){
      System.out.println("Las notas introducidas no son correctas");
    } else {
      System.out.printf("La media es de %.2f", media);
    }
  } 
}
