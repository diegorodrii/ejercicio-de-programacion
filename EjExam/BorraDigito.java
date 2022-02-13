import java.util.Scanner;

/**
 * Escribe una función que le borre un determinado dígito a un número. Si el
 * dígito aparece varias veces
 * en el número, se borran todas las ocurrencias. Se pasan dos parámetros: el
 * número y el dígito que se
 * quiere eliminar. Por ejemplo, borra(7486812, 8) devuelve el 74612 y
 * borra(390331, 3) devuelve
 * el 901.
 * La cabecera de la función es la siguiente:
 * public static long borra(long x, int d)
 */

public class BorraDigito {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el numero al que quiere eliminar un digito: ");
        long numero = Long.parseLong(s.nextLine());

        System.out.println("Introduce el digito a eliminar: ");
        int digito = Integer.parseInt(s.nextLine());

        System.out.println(borra(numero, digito)); 

    }

    // FUNCIONES

    public static long voltear(long numAVoltear) {
        long numVolteado = 0;
        while (numAVoltear > 0) {

            numVolteado = (numVolteado * 10) + (numAVoltear % 10);
            numAVoltear = numAVoltear / 10;

        }
        return numVolteado;

    }

    public static long borra(long x, int d) {
        long numVolteado = voltear(x);
        long numero = 0;
        int resultado = 0;
        int multiplicador = 1;

        while (numVolteado > 0){
           
            numero = numVolteado % 10;

            if (numero != d){
                resultado += numero * multiplicador;
                multiplicador *=10;
            }
           numVolteado /= 10;
        }

        return voltear(resultado);
    }

}
