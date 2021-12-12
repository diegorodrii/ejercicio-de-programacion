
/* 
 * Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
 * y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
 * cuadrado se deben almacenar los cuadrados de los valores que hay en el array
 * numero. En el array cubo se deben almacenar los cubos de los valores que hay en
 * numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
 * columnas.
 * 
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra números en orden inverso.");

   

    int [] num = new int [20];
    int [] cuadrado = new int [20];
    int [] cubo = new int [20];

    int i;

    for(i = 0; i < 20; i++){
      num [i] =(int) (Math.random() * 101);
      cuadrado [i] = num [i] * num [i];
      cubo [i] = num [i] * num [i] * num [i];
      
    }
    System.out.println("|   n¹   |   n²   |   n³   |");
    System.out.println(" ----------------------------");
    for (i = 0; i < 20; i++){
      System.out.printf("%6d   |%6d  |%7d |\n", num[i], cuadrado[i], cubo[i]);
    }
    
  }
}
