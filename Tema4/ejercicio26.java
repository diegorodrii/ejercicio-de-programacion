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
    String dia = System.console().readLine().toLowerCase();
    System.out.print("En caso de que sea jueves, ¿Dispone usted de la tarjeta CineCampa?: 1-Si  2-No ");
    int tarjeta = Integer.parseInt(System.console().readLine());

    

    double precioBase = 0;
    double precioPareja = 0;
    double precioFinal = precioBase;
    switch (dia){
      case 1:
      precioBase = 8;
      break;
      
      case 2:
      precioBase = 8;
      break;
      
      case 3:
      precioBase = 5;
      break;
      
      case 4:
    
      






  } 
}			

