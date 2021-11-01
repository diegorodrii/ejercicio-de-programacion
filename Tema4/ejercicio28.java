/**
 * Una pastelería nos ha pedido realizar un programa que haga presupuestos de
 * tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
 * manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
 * 16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
 * además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
 * segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
 * nombre; la nata suma 2.50 y la escritura del nombre 2.75.
 */
 
public class ejercicio27{
  public static void main(String[] args) {
    System.out.println("Este programa realiza presupuestos de tartas");
    System.out.print("Por favor, díganos de que quiere el sabor de la tarta (1-manzana, 2-fresa o 3-chocolate): ");
    int sabor = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, díganos si quiere añadir nata a la tarta (1-Sí  2-No) ");
    int nata = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, díganos si quiere personalizar la tarta (1-Sí  2-No) ");
    int personalizada = Integer.parseInt(System.console().readLine());

    double precioManzana= 18;
    double precioFresa = 16;
    double precioChocolateNegro = 14;
    double precioChocolateBlanco = 15;
    double precioNata = 2.5;
    double precioNombre = 2.75;
    double precioFinal = 0;

    String chocolateEscrito = "";
    /**Sabor */
    if (sabor == 1){
      precioFinal = precioManzana;
    } else if (sabor == 2){
      precioFinal = precioFresa;
    } else if (sabor == 3){
      System.out.print("¿El chocolate desea que sea negro(1) o blanco(2)?");
      int tipoChocolate = Integer.parseInt(System.console().readLine());
      if (tipoChocolate == 1){
        precioFinal = precioChocolateNegro;
        chocolateEscrito = "negro";
        
      } else if (tipoChocolate == 2)
        precioFinal = precioChocolateBlanco;
        chocolateEscrito = "blanco";
    }
    /**Nata */
    if (nata == 1){
      precioFinal = precioFinal + precioNata;
    }

    /**Nombre */
    if (personalizada == 1){
      precioFinal = precioFinal + precioNombre;
    }
  
    /** Conversión int a String */
    String tipoSabor = "";
    switch (sabor){
      case 1:
      tipoSabor = "manzana";
      break;
 
      case 2:
      tipoSabor = "fresa";
      break;

      case 3:
      tipoSabor = "chocolate";
      break;
    }
    String nataAñadida = "";
    switch (nata){
      case 1:
      nataAñadida = "sí";
      break;
 
      case 2:
      nataAñadida = "no";
      break;
    }
    String nombreAñadido = "";
    switch (personalizada){
      case 1:
      nombreAñadido = "sí";
      break;
 
      case 2:
      nombreAñadido= "no";
      break;
    }

    /** Resolución */
    if (chocolateEscrito.equals("negro")){
      System.out.println("Sabor: chocolate negro");
    } else if (chocolateEscrito.equals("blanco")){
      System.out.println("Sabor: chocolate blanco");
    } else {
      System.out.println("Sabor: " + tipoSabor);
    }
   
    System.out.println("Nata: " + nataAñadida);
    System.out.println("Personalización: " + nombreAñadido);
    System.out.println("Precio final: " + precioFinal);

  } 
}			

