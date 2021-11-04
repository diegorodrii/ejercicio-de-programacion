/**
 * Una empresa textil que realiza polos personalizados para trabajadores, asociaciones y clubes
 * nos ha pedido hacer un programa que sea capaz de elaborar presupuestos. El precio de cada
 * polo depende de si se piden en blanco o en color, de la cantidad que se pida y del tipo de
 * técnica que se emplee para el logotipo, que puede ser serigrafía o bordado. En un
 * presupuesto no se mezclan distintos colores o técnicas. El pedido mínimo son 20 polos.
 * Suponemos que el usuario introduce correctamente todos los datos. En este ejercicio no hay
 * que comprobar la validez de los mismos. A la cantidad final hay que sumarle el IVA del 21%.
 * En la siguiente tabla se muestran las tarifas de los polos:
 *  Polo blanco entre 20 y 39 unid. --> 4.9 € c.u. 
 *  Polo blanco entre 40 y 99 unid. --> 3.9 € c.u. 
 *  Polo blanco 100 o más unid. --> 3.2 € c.u.
 * a) El polo de color es siempre un 20% más caro que el blanco.
 * b) La serigrafía cuesta 2 € por polo para pedidos de menos de 50 unidades y 1,50 € para
 * pedidos de 50 o más unidades.
 * c) El bordado cuesta 3 € por polo para pedidos de menos de 50 unidades y 2,50 € para
 * pedidos de 50 o más unidades.
 * 
 * Author Diego Rodríguez Barcos 
 * 04-11-2021
 * 
 * 
 * 
 */
 
public class Ex17drb03{
  public static void main(String[] args) {
    System.out.println("Este programa calcula el precio de su pedido");
    System.out.print("Porfavor, introduzca la cantidad de polos que desea: ");
    int polo = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca el color del que desea que sean los polos (1.- Blanco  2.- Color): ");
    int color = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca ahora la técnica a emplear para la creación del logotipo(1.- Serigrafiada  2.- Bordado) ");
    int logotipo = Integer.parseInt(System.console().readLine());
 

   
    double precioPoloIndividual = 0;
    if (polo < 20){
      System.out.println("Lo sentimos, no se puede llevar a cabo el pedido ya que hay que encargar como mínimo 20 polos");
    } else { 
      if ((polo >= 20) && (polo <= 39)){
        precioPoloIndividual = 4.9;

      } else if ((polo >= 40) && (polo <= 99)){
        precioPoloIndividual = 3.9;

      } else if (polo >= 100){
        precioPoloIndividual = 3.2;

      }

      String solicitudColor = "";
      switch (color){
        case 1:
        solicitudColor = "blanco";
        break;

        case 2:
        solicitudColor = "oscuro";
        precioPoloIndividual = precioPoloIndividual * 1.2;
        break;
      }
      String solicitudLogo = "";
      double logoIndividual = 0;
      switch (logotipo){
        case 1:
        solicitudLogo = "Serigrafiado";
        if (polo < 50) {
          logoIndividual = 2.00;
          break;

        } else if (polo > 50){
          logoIndividual = 1.50;
        }

        case 2:
        solicitudLogo = "Bordado";
        if (polo < 50) {
          logoIndividual = 3.00;
          break;

        } else if (polo > 50){
          logoIndividual = 2.50;
        }
        break;
      }

      double precioFinalSinIva = ((precioPoloIndividual * polo) + (logoIndividual * polo));
      double precioFinalConIva = ((precioPoloIndividual * polo) + (logoIndividual * polo)) * 1.21;
      double iva = precioFinalConIva - precioFinalSinIva;

      System.out.println("TEXTILES MARTÍNEZ");
      System.out.println("------------------");
      System.out.println ("Cantidad de polos: " + polo);
      System.out.println ("Cada polo individualmente cuesta " + precioPoloIndividual + " €");
      System.out.println("Tipo de color: " + solicitudColor);
      System.out.println("Tipo de logotipo: " + solicitudLogo);
      System.out.printf("Precio Logotipo total: %.2f € \n",(logoIndividual * polo));
      System.out.printf("Precio Logotipo + polo total: %.2f € \n", precioFinalSinIva);
      System.out.printf("La cantidad de IVA en euros a implementar al precio de los polos es: %.2f € \n", iva);
      System.out.printf("Precio total es: %.2f € ", precioFinalConIva);


    }
  }	
}
  
