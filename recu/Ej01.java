import java.util.Scanner;

/**
 * Crea la función desordenaArray() que recibe como parámetro un array de
 * cadenas de caracteres y
 * devuelve otro array del mismo tamaño con los elementos desordenados de forma
 * aleatoria. A
 * continuación se muestra la cabecera de la función:
 *
 * Prueba esta función con un programa que pida al usuario 5 palabras. Primero
 * se deben mostrar esas
 * palabras en el orden en el que las introdujo el usuario y luego desordenadas
 * de forma aleatoria.
 */
public class Ej01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] array = new String[5];
        System.out.println("Dame 5 palabras: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(">> ");
            array[i] = s.nextLine();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        System.out.println("Aqui las palabras desordenadas");
        desordenaArray(array);
    }

    public static String[] desordenaArray(String s[]) {
        s[0] = s[(int)(Math.random() * 5)];
        s[1] = s[(int)(Math.random() * 5)];
        s[2] = s[(int)(Math.random() * 5)];
        s[3] = s[(int)(Math.random() * 5)];
        s[4] = s[(int)(Math.random() * 5)];
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        return s;
    }
}
