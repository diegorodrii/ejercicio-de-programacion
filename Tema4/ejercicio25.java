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
    System.out.println("Este programa calcula el precio según el alto y el ancho de la bandera solicitada");
    System.out.print("Por favor, introduzca el alto de la bandera en centímetros: ");
    double alto = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introducta el ancho de la bandera en centímetros: ");
    double ancho = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, especifique si quiere que la bandera tenga el escudo bordado (1 -Si o 2-No): ");
    int escudo = Integer.parseInt(System.console().readLine());

    
    /* Centímetros cuadrados**/ 
    double superficie = alto * ancho;
  
   /* Precio superficie**/
    double precioSuperficie = superficie * 0.01;
 
    /** IRPF*/
    if (escudo == 1){
      precioSuperficie = precioSuperficie + 3.25;
    } else if (escudo == 2){
      precioSuperficie = precioSuperficie;
    }

   if (alto < 0){
     System.out.println ("El alto introducido es incorrecto");
   } else if (ancho < 0){
    System.out.println ("El ancho introducido es incorrecto");
   } else if ((escudo > 2) || (escudo < 1)) {
    System.out.println ("El valor introducido al preguntar por el escudo es incorrecto");
   } else {/** Precio Final */
    System.out.printf("EL precio de una bandera de %.2f centímetros cuadrados es de %.2f € ", superficie, precioSuperficie);
   }
  }
}			

