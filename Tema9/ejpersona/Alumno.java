package ejpersona;

public class Alumno extends Persona {
   int numeroExpediente;
   String estudiosPrevios="Bachillerato";
   int anoNacimiento;
   boolean esRepetidor;

   
    
    public String getEstudiosPrevios(){
        return estudiosPrevios;
    }

    public void atiende() {
        System.out.println("Estoy atendiendo en clase");
      }

      
}
//boton derecho, accion de origen, generate getters ad stters
