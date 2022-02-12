import java.util.Scanner;

import javax.print.attribute.ResolutionSyntax;

import org.omg.Messaging.SyncScopeHelper;

/**
 * 2. Realiza una función que devuelva el número “parizado” a otro que se pasa
 * como parámetro. Cada
 * dígito del número parizado es el mismo dígito del número original en caso de
 * que éste sea par, o el
 * siguiente par en caso de que el dígito original sea impar (el siguiente par
 * del 9 será el 0). Por ejemplo
 * el parizado de 308566 es el 408666 y el parizado de 92491 es el 2402. A
 * continuación se muestra la
 * cabecera de la función:
 * public static long parizado(long x)
 */

public class Parizado {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe un número y te escribo el parizado: ");
        long num = Long.parseLong(s.nextLine());

        System.out.println("El número parizado es: " + parizado(num));
    }

    // FUNCION

    public static long voltear(long numAVoltear) {
        long numVolteado = 0;
        while (numAVoltear > 0) {

            numVolteado = (numVolteado * 10) + (numAVoltear % 10);
            numAVoltear = numAVoltear / 10;

        }
        return numVolteado;

    }

    public static long parizado(long x) {
        long numVolteado = voltear(x);
        long digito = 0;
        long multiplicador = 1;
        long resultado = 0;
        while (numVolteado > 0) {
            digito = numVolteado % 10;

            if (digito % 2 != 0) {
                if (digito == 9) {
                    digito = 0;
                } else {
                    digito++;
                }

            }

            resultado = resultado + digito * multiplicador;
            numVolteado = numVolteado / 10;
            multiplicador = multiplicador * 10;

        }
        resultado = voltear(resultado);
        return resultado;
    }
    
}