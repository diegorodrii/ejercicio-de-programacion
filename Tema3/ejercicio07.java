/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 * 
 */

    
public class ejercicio07 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca la base imponible a la que aplicar el IVA: ");
    double baseImp = Double.parseDouble(System.console() .readLine() ) ;
    
    double calcIva = baseImp * 1.21;
    System.out.printf("Facturación \n");
    System.out.println("---------------------------------------------------------------");
    System.out.printf("Base imponible : %6.2f. \n",baseImp);
    System.out.println("---------------------------------------------------------------");
    System.out.printf("Este es el resultado de la baseImp: %.2f aplicando el 21 por ciento: %.2f \n",baseImp, calcIva);      

    
  }     
}

