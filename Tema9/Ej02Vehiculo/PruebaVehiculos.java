package Ej02Vehiculo;

import java.util.Scanner;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Bicicleta bici1 = new Bicicleta();
        Coche coche1 = new Coche();

        Scanner s = new Scanner(System.in);

        int eleccion = 0;
        int km = 0;
        while (eleccion != 8) {
            System.out.println("Vehículos");
            System.out.println("=========");
            System.out.println("Elige que quieres hacer en el siguiente menú: ");
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.print("Elige una opción (1-8): ");
            eleccion = Integer.parseInt(s.nextLine());
            boolean salir = false;
            switch (eleccion) {
                case 1:
                    System.out.println("La la la la voy con mi bicicleta!");
                    System.out.print("Cuantos km quieres que recorra?: ");
                    km = Integer.parseInt(s.nextLine());
                    bici1.recorre(km);

                    break;
                case 2:
                    bici1.caballito();
                    break;
                case 3:
                    System.out.print("Cuantos km quieres que recorra?: ");
                    km = Integer.parseInt(s.nextLine());
                    coche1.recorre(km);
                    break;
                case 4:
                    coche1.quemaRueda();
                    break;
                case 5:
                    System.out.println("La bici lleva recorridos " + bici1.getKilometrosRecorridos());
                    break;
                case 6:
                    System.out.println("La bici lleva recorridos " + coche1.getKilometrosRecorridos());
                    break;
                case 7:
                    System.out.println("El total de kilometraje es " + Vehiculo.getKilometrosTotales());
                    
                    break;
                case 8:
                    System.out.println("Hasta luego!");
                    salir = true;
                    break;

            }
        }
    }
}
