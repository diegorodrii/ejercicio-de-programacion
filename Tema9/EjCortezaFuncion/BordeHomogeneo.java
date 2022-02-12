package EjCortezaFuncion;

/*
Se dice que una matriz (un array bidimensional) tiene el borde homogéneo cuando todos los dígitos
que se encuentran en el borde son iguales. Por ejemplo, la siguiente matriz tiene el borde homogéneo:
2 2 2 2 2
2 4 1 5 2
2 0 9 8 2
2 2 2 2 2
Realiza una función que diga si una matriz dada tiene o no el borde homogéneo y pruébala en un
programa. Los valores de los arrays de prueba deben estar asignados en el programa, no se piden por
teclado. La cabecera de la función es la siguiente:
public static boolean tieneBordeHomogeneo(int[ ][ ] a)
*/

public class BordeHomogeneo {
    public static void main(String[] args) {

        int[][] array = new int[5][5];
        array[0][0] = 0;
        array[0][1] = 0;
        array[0][2] = 0;
        array[0][3] = 0;
        array[0][4] = 0;
        array[1][0] = 0;
        array[1][1] = 3;
        array[1][2] = 4;
        array[1][3] = 3;
        array[1][4] = 0;
        array[2][0] = 0;
        array[2][1] = 2;
        array[2][2] = 2;
        array[2][3] = 2;
        array[2][4] = 0;
        array[3][0] = 0;
        array[3][1] = 6;
        array[3][2] = 7;
        array[3][3] = 8;
        array[3][4] = 0;
        array[4][0] = 0;
        array[4][1] = 0;
        array[4][2] = 0;
        array[4][3] = 0;
        array[4][4] = 0;
        muestraArrayBiInt(array);
        if (tieneBordeHomogeneo(array)){
            System.out.println("Tiene el borde Homogeneo"); //Si es verdadero :
        }else{
            System.out.println("NO tiene el Borde Homogeo");//Si es falso :
        }
    }

    public static void muestraArrayBiInt(int arrayBi[][]) {
        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[0].length; j++) {
                System.out.print(arrayBi[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private static boolean tieneBordeHomogeneo(int[][] a) {
        int filas = a.length;
        int columnas = a[0].length;
        int [] resultado = new int[filas * 2 + columnas * 2 - 4];
        
        int j = 0;

        for (int i = 0; i < columnas - 1; i++) { // - resto una para no llegar al final ya que este lo sacara el siguiente for.
            resultado[j++] = a[0][i]; //Saco la primera fila
        }
        // Columna derecha
        for (int i = 0; i < filas - 1; i++) {
            resultado[j++] = a[i][columnas - 1];//Saco la primera columna
        }
        // Fila inferior
        for (int i = columnas - 1; i > 0; i--) {
            resultado[j++] = a[filas - 1][i];//Saco la ultima fila
        }
        // Columna izquierda
        for (int i = filas - 1; i > 0; i--) {
            resultado[j++] = a[i][0];//Saco la ultima columna
        }
        boolean BordeHomogeneo = true;
        int indice = 0;
        while ((indice < resultado.length)&&(BordeHomogeneo)){ // Mientras el indice sea menor a la longitud del array resultado y sea verdadero
            if (resultado[indice++] != 0){ //Compruebo mientras recorro el array que todos sean 0, y si hay algun otro numero devolvera false
                BordeHomogeneo = false;//Por lo que rompera el bucle
            } 
        }
        return BordeHomogeneo; // devuelvo si es verdadero o falso
        
    }
    

}
