/**
 * Escribe un programa que calcule el precio final de un producto según su
 * base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
 * promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
 * muestran los valores correctos, aunque los números no estén tabulados.
 */
 
public class ejercicio23{
  public static void main(String[] args) {
    System.out.println("Este programa calcula el precio final de un producto");
    System.out.print("Por favor, introduzca la base imponible del producto: ");
    double baseImponible = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introducta el tipo de IVA aplicado (general, reducido, superreducido): ");
    String iva = System.console().readLine().toLowerCase();
    System.out.print("Por favor, introduzca el código promocional (nopro, mitad, meno5, 5porc): ");
    String codigo = System.console().readLine().toLowerCase();

    
    /* Base imponible**/ 
    double precioFinal = baseImponible;
    /* IVA*/
    if (iva.equals("general")){
      precioFinal = precioFinal * 1.21;
    } else if (iva.equals("reducido")){
      precioFinal = precioFinal * 1.1;
    } else if (iva.equals("superreducido")){
      precioFinal = precioFinal * 1.04;
    }
 
    /** Código*/
    if (codigo.equals("mitad")){
      precioFinal = precioFinal * 0.5;
    } else if (codigo.equals("meno5")){
      precioFinal = precioFinal - 5.0;
    } else if (codigo.equals("5porc")){
      precioFinal = precioFinal * 0.95;
    }    
    
    /** Precio Final */
    System.out.println("El precio final del producto es " + precioFinal);
  }
}			

