import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Una cadena de multicines nos ha encargado una aplicación para la venta
 * on-line de entradas. Como
 * parte de esa aplicación, tenemos que implementar una función que coloque a
 * los espectadores en una
 * fila de butacas. Una fila de butacas es un array de una dimensión. Cada celda
 * se corresponde a una
 * butaca que tiene el valor 0 si está libre y el valor 1 si está ocupada. La
 * función recibe como
 * parámetros el array con la información de la fila de butacas y un número que
 * es la cantidad de gente
 * que se quiere colocar en esa fila. Si se puede colocar a los espectadores con
 * éxito, la función
 * devolverá un 0 y si no se puede, devolverá un -1. Lo primero que tiene que
 * hacer la función es
 * comprobar si hay sitio, si no lo hay devolverá -1. Si hay sitio, primero
 * intentará colocar juntos a todo el
 * grupo y, si no puede, los irá colocando en los primeros huecos que encuentre.
 * Por ejemplo, si a = { 0, 1, 0, 0, 0, 1, 0 } y se quieren colocar 3 nuevos
 * espectadores, la función
 * devolverá 0 y el array se habrá modificado quedando así: a = { 0, 1, 1, 1, 1,
 * 1, 0 }.
 * Prueba la función desde un programa. La cabecera de la función es la
 * siguiente:
 * public static int ocupa(int[ ] fila, int usuarios)
 */

public class ButacaCine {
    public static void main(String[] aStrings) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[6];

        array[0] = 0;
        array[1] = 1;
        array[2] = 0;
        array[3] = 1;
        array[4] = 1;
        array[5] = 0;

        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            if (i == 5) {
                System.out.print(" " + array[i] + " ");
            } else {
                System.out.print(" " + array[i] + ", ");
            }

        }
        System.out.println("}");

        int eleccion = 0;
        while (eleccion != 2) {
            System.out.println("Menú CineButacas");
            System.out.println("=================");
            System.out.println("1. Comprar entradas");
            System.out.println("2. Salir");
            System.out.print(">> ");

            eleccion = Integer.parseInt(s.nextLine());
            switch (eleccion) {
                case 1:
                    System.out.print("Cuantos asientos quiere ocupar?: ");
                    int asientosPedidos = Integer.parseInt(s.nextLine());
                    ocupa(array, asientosPedidos);
                    System.out.print("{ ");
                    for (int i = 0; i < array.length; i++) {
                        if (i == 5) {
                            System.out.print(" " + array[i] + " ");
                        } else {
                            System.out.print(" " + array[i] + ", ");
                        }

                    }
                    System.out.println("}");
                    System.out.println();

                    break;

                case 2:
                    System.out.println("Esta bien, hasta luego!");
                    break;
            }
        }

    }

    // FUNCION
    public static int ocupa(int[] fila, int usuarios) {

        int asientosLibres = 0;
        int asientosOcupados = 0;
        boolean hayHueco = true;
        for (int i = 0; i < fila.length; i++) {
            if (fila[i] == 0) {
                asientosLibres++;
            } else {
                asientosOcupados++;
            }

        }
        if (asientosLibres >= usuarios) {

            System.out.println("Tenemos sitios para tí, aqui tienes tus asientos!");
            for (int j = 0; j < 6; j++) {
                if (fila[j] == 0) {
                    fila[j]++;
                    usuarios--;
                    if (usuarios == 0){
                        break;
                    }
                }
            }

        } else {
            System.out.println("No tengo huecos para ese número de usuarios");
            hayHueco = false;
        }

        if (hayHueco) {
            return 0;
        } else {
            return -1;
        }

    }
}
