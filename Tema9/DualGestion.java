public class DualGestion {
  public static void main(String[] arvgs) {
    System.out.println("Dual Gestion ");
    System.out.println("=============");
    System.out.println();

    Alumno alumno1 = new Alumno();
    Alumno pepillo = new Alumno(1234, "Jesús", "Rodríguez Jaramillo");
    Alumno alvaro = new Alumno(8888,"Álvaro", "Aguilera","7181294","ASMR",2000,true );

    System.out.println(pepillo);
    pepillo.saluda();
    alvaro.saluda();
    alvaro.saluda("fuerte");
    alvaro.ficha();
    System.out.println(pepillo.getNombre());
    System.out.println(alvaro.getTelefono());
  }
}