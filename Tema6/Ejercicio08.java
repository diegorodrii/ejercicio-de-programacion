
/* 
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea
 * de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
 * 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 * 
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    System.out.println("Este programa crea una quiniela");

    double numero = 0;

    int numeroFila = 0;
    for (int i = 1; i <= 14; i++) {
      
      numeroFila++;
      if (numeroFila <=9) {
        System.out.print(numeroFila + ".  ");
      } else {
        System.out.print(numeroFila + ". ");
      }
     
      for (int o = 1; o <= 3; o++) {
        numero = Math.random();
        if (numero <= 0.5) {
          System.out.print("|1    |  ");
        }
        if ((numero >= 0.5) && (numero <= 0.83)  ) {
          System.out.print("|  X  |  ");
        }
        if (numero > 0.83) {
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
