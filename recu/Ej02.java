
import java.util.Scanner;

/*Crea la función borraFila() que recibe como parámetros un array bidimensional de números
enteros y un número de fila. La función debe devolver otro array habiendo quitado la fila indicada. Si el
número de fila que se pasa como parámetro está fuera de rango, es decir, si es negativo o es superior
al índice máximo, se devolverá una copia del mismo array. Las filas se empiezan a contar en la cero.
public static int[][] borraFila(int a[][], int fila)
Utiliza esta función para quitar la fila de un array cuadrado con números aleatorios entre el 1 y el 99 de
forma interactiva, como se indica en los ejemplos.
Si el programa extrae la fila sin hacer uso de la función borraFila(), no se dará por bueno.
*/

public class Ej02 {
   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [][] array = new int [5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int)(Math.random() * 99);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%4d ", array[i][j]);
            }
            System.out.println();
        }
        System.out.println("Que fila desea eliminar? ");
        System.out.print(">> ");
        int filaEliminar = Integer.parseInt(s.nextLine());
        borraFila(array, filaEliminar);
    }

    public static int[][] borraFila(int a[][], int fila){
        
        for (int i = 0; i < a.length; i++) {
            if (i==fila){
                i++;
            }
            for (int j = 0; j < a.length; j++) {
                System.out.printf("%4d ",a[i][j]);
            }
            System.out.println();
        }
        return a;
    }
}
