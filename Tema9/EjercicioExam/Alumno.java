package EjercicioExam;

public class Alumno {
    private String nombre;
    private String apellido;
    private String email;
    private static int expedienteInicial;
    private int expediente;


    public static void setExpedienteInicial(int i) {
        Alumno.expedienteInicial = i;
    }

    public Alumno( String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.expediente = expedienteInicial;
        expedienteInicial++;
    }


    @Override
    public String toString() {
        return expediente+ ", " + apellido + ", " + nombre + ", " + "<" + email + ">" ;
        
    }

    

}