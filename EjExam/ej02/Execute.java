package ej02;

/**
 * El ayuntamiento nos va a cotnratar para implemetar un nuevo programa que
 * lelvara el control de los aparcamientos municipales.
 * Crea la clase Tique de tal fomra que cuando se crea un nuevo tique de
 * aparcamiento se guarde el momento en el que es creado.
 * Cada tique llevara un numero consecutivo, empezando por el 1. El precio es de
 * 2 centimos por minuto (0'02).
 * 
 * Tique nº 1. Debe pagar 1,10 euros. Gracias.
 * Tique nº 3. Debe pagar 3,30 euros. Gracias.
 * Tique nº 2. Debe pagar 4,60 euros. Gracias.
 * Recaudación: 9,00 euros
 */

public class Execute {
    public static void main(String[]args) {
        Tique t1 = new Tique(10.5);
        Tique t2 = new Tique(14.30);
        Tique t3 = new Tique(15.00);
        t1.paga(11.00);
        t3.paga(17.45);
        t2.paga(18.20);
        System.out.println("Recaudación: "+ Tique.getRecaudacion() + "euros");
        
    }

}
