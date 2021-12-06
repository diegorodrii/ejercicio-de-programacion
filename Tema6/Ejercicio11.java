
/* 
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc.
 * 
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra 20 notas.");

    int numeroNotas = 20;
    int contadorNotas = 0;
    int numeroInsuficientes = 0;
    int numeroSuficientes = 0;
    int numeroBienes = 0;
    int numeroNotables = 0;
    int numeroSobresalientes = 0;

    do {
      int nota = (int) (Math.random() * 11);

      contadorNotas++;
      System.out.println(contadorNotas + ". " + nota);

      numeroNotas--;
      if (nota < 5){
        numeroInsuficientes++;
      }
      if ((nota >= 5) && (nota < 6)){
        numeroSuficientes++;
      }
      if ((nota >= 6) && (nota < 7)){
        numeroBienes++;
      }
      if ((nota >= 7) && (nota < 9)){
        numeroNotables++;
      }
      if ((nota >= 9) && (nota <= 10)){
        numeroSobresalientes++;
      }
     
    } while (numeroNotas > 0);

    System.out.println();
    System.out.println();
    
    System.out.println("Número de Insuficientes: " + numeroInsuficientes);
    System.out.println("Número de Suficientes: " + numeroSuficientes);
    System.out.println("Número de Bienes: " + numeroBienes);
    System.out.println("Número de Notables: " + numeroNotables);
    System.out.println("Número de Sobresalientes: " + numeroSobresalientes);
    

    System.out.println();

  }
}
