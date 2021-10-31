/**
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado
 * según las siguientes condiciones:
 * • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
 * de proyecto), los días que ha estado de viaje visitando clientes durante el
 * mes y su estado civil (1 - Soltero, 2 - Casado).
 * • El sueldo base según el cargo es de 950, 1200 y 1600 euros según
 * si se trata de un prog. junior, un prog. senior o un jefe de proyecto
 * respectivamente.
 * • Por cada día de viaje visitando clientes se pagan 30 euros extra en
 * concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
 * un 25% en caso de estar soltero y un 20% en caso de estar casado.
 */
 
public class ejercicio24{
  public static void main(String[] args) {
    System.out.println("Este programa genera la nómina de un empleado");
    System.out.print("Por favor, introduzca el cargo del empleado (Junior, Senior o Jefe): ");
    String cargo = System.console().readLine().toLowerCase();
    System.out.print("Por favor, introducta la cantidad de días que ha estado viajando visitando clientes en este mes: ");
    int dias = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    int estadoCivil = Integer.parseInt(System.console().readLine());

    
    /* Sueldo**/ 
    double sueldo = 0;
    /* IVA*/
    if (cargo.equals("Junior")){
      sueldo =  950;
    } else if (cargo.equals("Senior")){
      sueldo = 1200;
    } else if (cargo.equals("Jefe")){
      sueldo = 1600;
    }
 
    /** Código*/

   
   
  /** Precio Final */
   System.out.println("Tu sueldo es de: " + sueldo);
  }
}			

