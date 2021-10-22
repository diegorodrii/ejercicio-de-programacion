/**
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
 * la hora.
 * 
 */

    
public class ejercicio04{
  public static void main(String[] args) {
    System.out.println("Este programa calcula el salario ganado en función de las horas semanales trabajadas ");
    System.out.print("Por favor, indique el número entero de horas que ha trabajado estas horas: ");
    String horasTrabajadas = System.console().readLine();
    int horas = Integer.parseInt (horasTrabajadas);

    if ((horas >=0) && (horas <= 40)) {
      int salario1 = (int) horas * 12;
      System.out.println("El salario obtenido en " + horas + " horas es: " + salario1);
    }
      
    else if (horas >= 41) {
      int salario2 = 40 * 12 + ( horas - 40 ) * 16;
      System.out.println("El salario obtenido en " + horas + " horas es: " + salario2);    
    }    
  }     
}
