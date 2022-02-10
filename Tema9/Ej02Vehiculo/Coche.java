package Ej02Vehiculo;
import java.util.Scanner;

public class Coche extends Vehiculo{
    Scanner s = new Scanner(System.in);

    String color;
    String matricula;
    int numeroCochesCreados;
    int kilometrosRecorridos;

    public void cuantosKm(){
        System.out.println();
    }

    public void andaCoche(){
        System.out.print("Cuantos km quieres que recorra?: ");
        int recorridoCoche = Integer.parseInt(s.nextLine());
        kilometrosRecorridos += recorridoCoche;
    }

    public void quemaRueda(){
        System.out.println("Mira como gamberreo soy un super chulo!");
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    

    
}

