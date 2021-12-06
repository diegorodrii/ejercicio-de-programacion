
/* 
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas).
 * 
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    System.out.println("Este programa crea una quiniela");

    int numero = 0;

    int numeroFila = 0;
    for (int i = 1; i <= 14; i++) {
      
      numeroFila++;
      if (numeroFila <=9) {
        System.out.print(numeroFila + ".  ");
      } else {
        System.out.print(numeroFila + ". ");
      }
     
      for (int o = 1; o <= 3; o++) {
        numero = ((int) (Math.random() * 3));
        if (numero == 0) {
          System.out.print("|1    |  ");
        }
        if (numero == 1) {
          System.out.print("|  X  |  ");
        }
        if (numero == 2) {
          System.out.print("|    2|  ");
        }
      }
      System.out.println();

    }
    int pleno = ((int) (Math.random() * 4));
    
    switch (pleno){
      case 3: 
      
      System.out.print("PLENO AL 15 - LOCAL... M" );  
      break;

      default: System.out.print("PLENO AL 15 - LOCAL... " + pleno );  
    } 
    
    pleno = ((int) (Math.random() * 4));
    switch (pleno){
      case 3: 
  
      System.out.print("   VISITANTE... M");
      break;
      default: System.out.print("   VISITANTE..." + pleno);
    }
   
    System.out.println("");
  }
}
