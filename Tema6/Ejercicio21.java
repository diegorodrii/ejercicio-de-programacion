
/* 
 * Realiza un programa que genere una secuencia de cinco monedas de curso
 * legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
 * 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
 * posiciones posibles son cara y cruz.
 */
public class Ejercicio21 {
  public static void main(String[] args) {
    System.out.println("Este programa tira al aire 5 monedas");
    
    

    String moneda = "";
    String lado = "";
   
    for(int i = 5; i > 0; i--){
    int posibilidades = ((int) (Math.random() * 8));
    int caraOCruz = (int) (Math.random() * 2) + 1;
    switch (posibilidades){
      case 1:
      moneda = "1 céntimo";
      break;

      case 2:
      moneda = "2 céntimos";
      break;

      case 3:
      moneda = "10 céntimos";
      break;

      case 4:
      moneda = "20 céntimos";
      break;

      case 5:
      moneda = "50 céntimos";
      break;

      case 6:
      moneda = "1 euro";
      break;

      case 7:
      moneda = "2 euros";
      break;
    }
    switch(caraOCruz){
      case 1:
      lado = "Ha salido cara";
      break;
      case 2:
      lado = "Ha salido cruz";
      break;
    }
    System.out.println(moneda + ": " + lado );
    }
  }
}
