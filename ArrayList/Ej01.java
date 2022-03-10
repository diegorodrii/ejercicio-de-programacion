import java.util.ArrayList;

public class Ej01 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("José Manuel");
        a.add("Salvador");
        a.add("Rubén");
        a.add("Irene");
        a.add("Noemí");
        a.add("Begoña");
        System.out.println("Contenido de la lista: ");
        for (String nombre : a) {
            System.out.println(nombre);
        }
    }
}