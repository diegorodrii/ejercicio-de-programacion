import java.util.Scanner;

public class Alumno {
   int numeroExpediente;
   String nombre;
   String apellidos;
   String telefono;
   String estudiosPrevios="Bachillerato";
   int anoNacimiento;
   boolean esRepetidor;

   public Alumno(){

   }
    public Alumno(int numeroExpediente, String nombre, String apellidos) {
        this.numeroExpediente = numeroExpediente;
        this.nombre = nombre;
        this.apellidos = apellidos;
     }
    public Alumno(int numeroExpediente, String nombre, String apellidos, String telefono, String estudiosPrevios,
            int anoNacimiento, boolean esRepetidor) {
        this.numeroExpediente = numeroExpediente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.estudiosPrevios = estudiosPrevios;
        this.anoNacimiento = anoNacimiento;
        this.esRepetidor = esRepetidor;
    }
    
    public void saluda(){
        System.out.println("Hola soy " + this.nombre);
    }

    public void saluda(String intensidad){

        String cadena = "Hola soy " + this.nombre;

        switch(intensidad){
            case "fuerte":
            cadena = cadena.toUpperCase();
            break;
            case "débil":
            cadena = cadena.toLowerCase();
            break;
            default:
        }
        System.out.println(cadena);
    }
   
    public void ficha(){
        System.out.println("Aquí tienes mi curriculum");
        System.out.println("---------------------------");
        System.out.println(this.nombre);
        System.out.println(this.apellidos);
        System.out.println(telefono);
        System.out.println("Tengo " + (2022 - this.anoNacimiento) + " años" );
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
//boton derecho, accion de origen, generate getters ad stters
