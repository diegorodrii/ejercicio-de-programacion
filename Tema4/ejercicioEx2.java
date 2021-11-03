/**
 * Realiza un programa que calcule el precio de un desayuno. El programa preguntará primero qué ha
 * tomado el usuario de comer: palmera, donut o pitufo. La palmera vale 1’40 y el donut 1 euro. En caso
 * de tomar pitufo, el programa debe preguntar además si era con aceite o con tortilla; el primero vale
 * 1’20 y el segundo 1’80. Por último se pregunta por la bebida: zumo o café a 1’50 y 1’25
 * respectivamente. Se pueden omitir las tildes (por ej. cafe en lugar de café) para evitar posibles
 * problemas en la codificación de caracteres.
 * 
 */
 
public class ejercicioEx2{
    public static void main(String[] args) {
      System.out.println("Este programa calcula el precio de un desayuno");
      System.out.print("Por favor, introduzca que desea comer (Palmera, Donut o Pitufo): ");
      String desayuno = System.console().readLine().toLowerCase();
      /** Elección en caso de pitufo */
      double precioFinal = 0;
      String eleccionPitufo = "";
      if (desayuno.equals("pitufo")){
        System.out.println("Desea que el pitufo sea de aceite(1) o de tortilla(2): ");
        int pitufo = Integer.parseInt(System.console().readLine());
        
        switch(pitufo){
          case 1:
              eleccionPitufo = "Usted ha elegido el pitufo de aceite";
              precioFinal = precioFinal + 1.20;
              break;
          case 2:
              eleccionPitufo = "Usted ha elegido el pitufo de tortilla";
              precioFinal = precioFinal + 1.8;
              break;
        }
       }
       /**Caso palmera y donut */
      if (desayuno.equals("palmera")){
        precioFinal = precioFinal + 1.4;
      } else if (desayuno.equals("donut")){
        precioFinal = precioFinal + 1;
      }
      /** Bebida*/ 
      System.out.print("Por favor, introduzca la bebida que desea (zumo o cafe): ");
      String bebida = System.console().readLine().toLowerCase();
      if (bebida.equals("zumo")){
        precioFinal = precioFinal + 1.5;
      } else if (bebida.equals("cafe")){
        precioFinal = precioFinal + 1.25;
      }
    


      System.out.println("Usted ha elegido como desayuno: " + desayuno);
      if (desayuno.equals("pitufo")){
        System.out.println(eleccionPitufo);
      }
      System.out.println("Usted ha elegido como bebida: " + bebida);
      System.out.println("El precio final es de: " + precioFinal);

    }
  }			
  
  