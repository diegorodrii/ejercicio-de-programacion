
/* 
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
 * continuación, el programa deberá dar la posición tanto del máximo como del
 * mínimo.
 * 
 */
public class Ejercicio06v2 {
  public static void main(String[] args)  throws InterruptedException {

    int [] numUnidad = new int [60];  //aqui se asignan los valores sin repetir 
    int[][] num = new int[6][10]; // array bidimensional donde se asignará el resultado
    int numPropuesto; //generador de números
    int numNumeros = 0; //contador 

    int fila;
    int columna;

    int numMin = 0;
    int filaMin = 0;
    int columnaMin = 0;

    int indiceFila; //esta variable indica la fila en la que se encuentra el número
    int indiceColumna; //esta variable indica la columna donde se encuentra el número

    int numMax = 0;
    int filaMax = 0;
    int columnaMax = 0;

    int indice = 0;
    while(numNumeros < 60) { 
      numPropuesto = ((int)(Math.random() * 1001)); //se generará un número aleatorio
      boolean repetido = false; //con esta variable booleana determinaremos si el numero está repetido o no

      while(!repetido) { //mientras la variable sea falsa este bucle anidado se seguirá repitiendo
        for(indice = 0; indice < numNumeros; indice++) { //con este bucle se irá comprobando si el número generado aleatoriamente es igual a alguno de los números presentes en el array unidimensional
          if(numPropuesto == numUnidad[indice]) { //si el número generado coincide con alguno de los números ya existentes la vaiable será verdadera y el programa saldrá del bucle
            repetido = true;
          }
        } //for

        if(!repetido) { //si el número generado no coincide con ninguno de los números que había en el array se asignará al array y se pasará a la siguiente posición. Si no comenzará de nuevo el bucle y se generará otro número
          numUnidad[numNumeros] = numPropuesto;
          numNumeros++;
        } //if
      } //while
    } //while

      numNumeros = 0;

      for (indiceFila = 0; indiceFila < 6; indiceFila++) {
        for (indiceColumna = 0; indiceColumna < 10; indiceColumna++) {
          num[indiceFila] [indiceColumna] = numUnidad[numNumeros]; //se asigna cada valor en su posición
  
          if (numNumeros == 0) {
            numMin = num[indiceFila] [indiceColumna]; //el primer número será siempre tomado en cuenta como el menor de primera hora (también sería el máximo ya que no hay ningún otro número)
          } else if (num[indiceFila] [indiceColumna] > numMax) {
            numMax = num[indiceFila] [indiceColumna]; //si el siguiente número generado es mayor que el número que era el máximo hasta ahora el nuevo número será el máximo
            filaMax = indiceFila;
            columnaMax =indiceColumna;
          } else if (num[indiceFila] [indiceColumna] < numMin) {
            numMin = num[indiceFila] [indiceColumna];
            filaMin = indiceFila;
            columnaMin = indiceColumna; //si el siguiente número generado es menor que el que hasta ahora el mínimo el nuevo nuevo pasará a ser el mínimo

          } //if
  
          //¿por qué calculo así el menor? según se vayan introduciendo números el mínimo irá cambiando. El primer número generado cuando no se ha generado ningún otro es el primer mínimo,
          //por eso lo declaro como tal cuando el contador (numNumeros) está a 0. Si el siguiente número generado es menor, el número mínimo cambiará, así hasta llegar al sexagésimo número
  
          numNumeros++;
        } //for
      } //for

      System.out.println("┌───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┐");

      System.out.print("| Array num |");

      for (indiceColumna = 0; indiceColumna < 10; indiceColumna++) {
        System.out.print(" Columna " + indiceColumna + " |");
      }
      
      System.out.println(" ");

      for (indiceFila = 0; indiceFila < 6; indiceFila++) {
        System.out.println("├───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┤");
        System.out.print("|  Fila " + indiceFila + "   |");
  
        for (indiceColumna = 0; indiceColumna < 10; indiceColumna++) {
          System.out.printf("   %4d    %-1s" ,num[indiceFila] [indiceColumna] ,"|");
        }
        System.out.println(" ");
      } //for
  
      System.out.println("└───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┘");
  
      System.out.println(" ");
  
      System.out.println("El número mínimo es el " + numMin + " , en la columna " + columnaMin + " y fila " + filaMin +  "y el máximo es el " + numMax + " , en la columna " + columnaMax + " y fila " + filaMax);

   
  }
}
