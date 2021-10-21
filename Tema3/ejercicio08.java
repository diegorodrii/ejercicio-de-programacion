/**
 * Escribe un programa que calcule el salario semanal de un empleado en base a
 * las horas trabajadas, a razón de 12 euros la hora.
 */

    
public class ejercicio08 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca la cantidad de horas trabajadas esta semana: ");
    double horasTrabajadas = Double.parseDouble(System.console() .readLine() ) ;
    
    double salarioSemanal = horasTrabajadas * 12;
    System.out.printf("Facturación \n");
    System.out.println("---------------------------------------------------------------");
    System.out.printf("El número de horas trabajadas es: %.1f \n",horasTrabajadas);
    System.out.println("---------------------------------------------------------------");
    System.out.printf("El salario de haber trabajado: %.1f horas esta semana es %.2f € \n",horasTrabajadas, salarioSemanal);      

    
  }     
}

