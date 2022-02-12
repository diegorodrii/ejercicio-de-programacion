package Ej02Vehiculo;

import java.util.Scanner;


public abstract class Vehiculo {

    //atributos de la clase
    private static int vehiculosCreados;
    private static int kilometrosTotales;

    //atributos de la instancia 
    private static int kilometrosRecorridos;

    public Vehiculo() {
        this.kilometrosRecorridos = 0;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }


    public static int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void recorre(int k){
        this.kilometrosRecorridos += k;
        Vehiculo.kilometrosTotales += k;
        
    }
}
