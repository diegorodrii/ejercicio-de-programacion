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

    
        System.out.println(fraccion1);
        System.out.println(invertida);

    }

}
