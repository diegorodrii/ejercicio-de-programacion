/**
 * La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
 * máxima calidad y nos ha pedido hacer un configurador que calcule el precio
 * según el alto y el ancho. El precio base de una bandera es de un céntimo de
 * euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
 * se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
 * son 3.25 €. El IVA ya está incluido en todas las tarifas.
 */
 
public class ejercicio25{
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

   
   
  /** Precio Final */
   System.out.println("Tu sueldo es de: " + sueldo);
  }
}			

