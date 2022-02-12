package Ej02Vehiculo;

import java.util.Scanner;

public class Bicicleta extends Vehiculo{
    Scanner s = new Scanner(System.in);
    String color;
    int kilometrosRecorridos;
    int numeroBicicletasCreadas;

    public void andaBici(){
        System.out.println("La la la la voy con mi bicicleta!");
        System.out.print("Cuantos km quieres que recorra?: ");
        int recorridoBici = Integer.parseInt(s.nextLine());
        kilometrosRecorridos += recorridoBici;
    }

    public void caballito(){
        System.out.println("Mira estoy haciendo el caballito!");
    }

    public int getKilometrosRecorridos() {
        return recorridoBici;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

  


}

