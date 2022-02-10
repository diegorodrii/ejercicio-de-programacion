import java.util.Scanner;

import Ej02Vehiculo.Bicicleta;
import Ej02Vehiculo.Coche;
import Ej02Vehiculo.Vehiculo;
import caballo.Caballo;
import fraccion.Fraccion;

public class Execute {
    public static void main(String[] args) {    

        Caballo eduardo = new Caballo("Eduardo", "Puente Genil", "platano");
        eduardo.relincha();
        eduardo.presentacion();
        
        Fraccion fraccion1 = new Fraccion(1, 2);

        Fraccion fraccion2 = new Fraccion(2, 4);
    
    
        Fraccion invertida = fraccion1.invierte();


        Bicicleta bici1 = new Bicicleta();
        Coche coche1 = new Coche();
    
        System.out.println(fraccion1);
        System.out.println(invertida);


        Scanner s = new Scanner(System.in);
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
        int eleccion = Integer.parseInt(s.nextLine());
        boolean salir = false;
        switch (eleccion){
            case 1:
            bici1.andaBici();
            break;
            case 2:
            bici1.caballito();
            break;
            case 3:
            coche1.andaCoche();
            break;
            case 4: 
            coche1.quemaRueda();
            break;
            case 5: 
            bici1.getKilometrosRecorridos();
            break;
            case 6: 
            coche1.getKilometrosRecorridos();
            break;
            case 7: 
            coche1.quemaRueda();
            break;
            case 8: 
            System.out.println("Hasta luego!");
            salir = true;
            break;
            
        }




    }

}
