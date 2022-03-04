package Ej03;

public class Examen {
    private String asignatura;
    private int trimestre;
    private String estado = "sin revisar";
    private String frase = "";

    public Examen(String asignatura, int trimestre) {
        this.asignatura = asignatura;
        this.trimestre = trimestre;
    }

    

    public String getEstado() {
        return estado;
    }



    public void setEstado(String estado) {
        this.estado = estado;
    }


    public void revisa(){
        estado="revisado";
    }

  

    public void revisa(String resultado) {
        estado = "revisado"; 
        frase = ", " + resultado;  
    }

    @Override
    public String toString() {
        return "Examen de " + asignatura + " del trimestre " + trimestre +  ", " + estado + frase;
    }
  
    
}
