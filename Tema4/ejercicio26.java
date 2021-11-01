/**
 * Realiza un programa que calcule el precio de unas entradas de cine en función
 * del número de personas y del día de la semana. El precio base de una entrada
 * son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
 * jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
 * Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
 * grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
 * que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
 * 1 individual que son 41 euros (33 + 8).
 */
 
public class ejercicio26{
  public static void main(String[] args) {
    System.out.println("Este programa calcula el precio de unas entradas de cine");
    System.out.print("Por favor, introduzca la cantidad de personas que solicitan una entrada: ");
    int personas = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca el numero del dia de la semana para las entradas (1-7): ");
    int dia = Integer.parseInt(System.console().readLine());

    double precioBaseNormal = 8;
    double precioBaseEspecial = 5;
    double precioFinal = 0;
    double precioPareja = 11;
    int cantidadParejas = personas / 2;

    /**Miércoles */
    if (dia == 3){
      precioFinal = precioBaseEspecial;
    }

    /**Jueves */
    if ((dia == 4) && (personas % 2 == 0)){
      precioFinal = precioPareja * cantidadParejas;
      System.out.print("¿Dispone usted de la tarjeta CineCampa?: 1-Si  2-No ");
      int tarjeta = Integer.parseInt(System.console().readLine());
      if (tarjeta == 1){
        precioFinal = precioFinal * 0.9;
      }
    }
    if ((dia == 4) && (personas % 2 == 1)){
      precioFinal = precioPareja * cantidadParejas + precioBaseNormal;
      System.out.print("¿Dispone usted de la tarjeta CineCampa?: 1-Si  2-No ");
      int tarjeta = Integer.parseInt(System.console().readLine());
      if (tarjeta == 1){
        precioFinal = precioFinal * 0.9;
      }
    }

    /** Cualquier otro día */
    if ((dia == 1) || (dia == 2) || (dia == 5) || (dia == 6) || (dia == 7)){
      precioFinal = precioBaseNormal * personas;
    }
    
    /** Pasar el número del día de la semana a formato String para así en la resolución poder aclarar el día seleccionado */
    String diaEscrito = "";
    switch (dia){
      case 1:
      diaEscrito = "lunes";
      break;
 
      case 2:
      diaEscrito = "martes";
      break;

      case 3:
      diaEscrito = "miércoles";
      break;
    
      case 4:
      diaEscrito = "jueves";
      break;

      case 5:
      diaEscrito = "viernes";
      break;

      case 6:
      diaEscrito = "sábado";
      break;

      case 7:
      diaEscrito = "domingo";
      break;
    }
    /** Resolución */
    if ((dia == 1) || (dia == 2) || (dia == 5) || (dia == 6) || (dia == 7) || (dia == 4) || (dia == 3)){
    System.out.println("La cantidad de personas es de " + personas);
    System.out.println("El día de la semana es " + diaEscrito);
    System.out.println("El precio final de la entrada es de " + precioFinal + " €");
    }  else {
      System.out.println("Lo siento, el día introducido no es correcto");
    }
  } 
}			

