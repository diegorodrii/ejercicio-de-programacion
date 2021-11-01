/**
 * Realiza un programa que calcule el precio de un desayuno. El programa
 * preguntará primero qué ha tomado el usuario de comer: palmera, donut o
 * pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
 * programa debe preguntar además si era con aceite o con tortilla; el primero
 * vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
 * café a 1’50 y 1’20 respectivamente.
 */
 
public class ejercicio29{
  public static void main(String[] args) {
    System.out.println("Este programa calcula el precio de un desayuno");
    System.out.print("Por favor, díganos que va tomar el usuario de comer (1-palmera 2-donut  3-pitufo): ");
    int desayuno = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, díganos que bebida escoge (1-zumo  2-café): ");
    int bebida = Integer.parseInt(System.console().readLine());

    double precioPalmera = 1.4;
    double precioDonut = 1;
    double precioPitufoAceite = 1.20;
    double precioPitufoTortilla = 1.6;
    double precioZumo = 1.5;
    double precioCafe = 1.2;
    double precioFinal = 0;

    /**Elecciones */
    String eleccionDesayuno = "";
    String pitufoEscrito = "";
    switch(desayuno){
      case 1:
      eleccionDesayuno = "Ha elegido la palmera como desayuno";
      precioFinal = precioPalmera;
      break;

      case 2:
      eleccionDesayuno = "Ha elegido el donut como desayuno";
      precioFinal = precioDonut;
      break;

      case 3:
      System.out.print("¿Desea que el pitufo sea de tortilla(1) o de aceite(2)? ");
      int tipoPitufo = Integer.parseInt(System.console().readLine());
      if (tipoPitufo == 1){
        precioFinal = precioPitufoTortilla;
        System.out.print("Ha elegido el pitufo de tortilla");
       } else if (tipoPitufo == 2){
         precioFinal = precioPitufoAceite;
         System.out.print("Ha elegido el pitufo de aceite");
       } else {
         System.out.println("No es una opción válida");
       }
      break;
       }  

    String eleccionBebida = "";
    switch(bebida){
      case 1:
      precioFinal = precioFinal + precioZumo;
      eleccionBebida = "Ha elegido el zumo como bebida";
      break;

      case 2:
      precioFinal = precioFinal + precioCafe;
      eleccionBebida = "Ha elegido el café como bebida";
      break;

      default:
      eleccionBebida = "No es una opción válida";
    }
    
    System.out.println(eleccionDesayuno);
    System.out.println(eleccionBebida);
    System.out.println("El precio final es de " + precioFinal + " €");

    
    }
  		
}
  
