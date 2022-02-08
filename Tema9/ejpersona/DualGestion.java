package ejpersona;

public class DualGestion {
  public static void main(String[] args) {
    System.out.println("Dual Gestion ");
    System.out.println("=============");
    System.out.println();

    Alumno alumno1 = new Alumno();
    Profesor profe1 = new Profesor();
    
    alumno1.saluda();
    alumno1.atiende();
    profe1.explica();
    profe1.saluda();
    System.out.println(alumno1.getEstudiosPrevios());
  }


}


// atributos publicos metodos privados