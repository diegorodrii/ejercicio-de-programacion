public class Caballo {
    private int numCaballo;
    private String nombre;
    private String ubicacion;
    private String comidaFavorita;
    private String cuidador;
    private int anos;
 
    public void relincha() {
        System.out.println("JI JIJIJII");
    }

  
    public void presentacion(){
        System.out.println("Soy " + this.nombre + ", vivo en " + this.ubicacion + " y mi comida favorita es el " + this.comidaFavorita );
    }


    public Caballo(String nombre, String ubicacion, String comidaFavorita) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.comidaFavorita = comidaFavorita;
    }

}
