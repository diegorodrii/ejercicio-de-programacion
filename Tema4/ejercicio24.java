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
    System.out.print("Por favor, introduzca el cargo del empleado (1 - Junior, 2- Senior o 3 - Jefe): ");
    int cargo = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introducta la cantidad de días que ha estado viajando visitando clientes en este mes: ");
    int dias = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    int estadoCivil = Integer.parseInt(System.console().readLine());

    double sueldo = 0;
    /* Sueldo**/ 
    switch(cargo){
      case 1: 
          sueldo = 950;
          break;
      case 2: 
          sueldo = 1200;
          break;
      case 3: 
          sueldo = 1600;
          break;
  }
   /* Días viajando**/
    sueldo = sueldo + (30 * dias);
 
    /** IRPF*/
    if (estadoCivil == 1){
      sueldo = sueldo * 0.75;
    } else if (estadoCivil == 2){
      sueldo = sueldo * 0.8;
    }

    double sueldoBase = 0;
    if (cargo == 1){
      sueldoBase = 950;
    } else if (cargo == 2){
      sueldoBase = 1200;
    } else if (cargo == 3){
      sueldoBase = 1600;
    }
    double retencion = 0;
    if (estadoCivil == 1){
      retencion = 0.25;
    } else if ( estadoCivil == 2){
      retencion = 0.2;
    } 
   
    if ((cargo > 3) || (cargo < 0)){
      System.out.println("Lo siento, el cargo introducido es incorrecto");
    } else if ((dias > 31) || (dias < 0)) {
      System.out.println("Lo siento, los dias introducidos son incorrectos");
    } else if ((estadoCivil > 2) || (estadoCivil < 0)){
      System.out.println("Lo siento, el estado civil introducido es incorrecto");
    } else {  /** Precio Final */
      System.out.println("Tu sueldo base conforme a tu puesto es: " + sueldoBase + " €");
      System.out.println("Dietas por los días viajados " + (30 * dias) + " €");
      System.out.println("Tu sueldo en bruto es: " + (sueldoBase + (30 * dias + " €")));
      System.out.println("La retención es de: " + (retencion * sueldo) + " €");
      System.out.println("Tu sueldo neto es de: " + sueldo + " €");
   
     }
   		
  }
}		

