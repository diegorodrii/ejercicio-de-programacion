/**
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida. Pásale el minicuestionario a
 * tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
 * en las diferentes asignaturas del curso.
 * 
 * 
 */
 
public class ejercicio12{
  public static void main(String[] args) {
    System.out.println("Este programa es un minicuestionario");
    System.out.print("¿Cuál es el lenguaje de programación que utilizamos con Luis? ");
    String pregunta1 = System.console().readLine().toLowerCase();
    
    System.out.print("¿Cómo se llama la herramienta de trabajo que utilizamos en Lenguaje de Marcas? ");
    String pregunta2 = System.console().readLine().toLowerCase(); 
       
    System.out.print("¿Cuál es la web que utilizamos para anotar apuntes de clase en Entornos? ");
    String pregunta3 = System.console().readLine().toLowerCase(); 
       
    System.out.print("¿La placa base es software o hardware?");
    String pregunta4 = System.console().readLine().toLowerCase();
    
    System.out.print("¿Cuál es el gestor de base de datos que utilizamos en Base de Datos?");
    String pregunta5 = System.console().readLine().toLowerCase(); 
       
    System.out.print("El software es la parte física del ordenador. Verdadero o falso ");
    String pregunta6 = System.console().readLine().toLowerCase(); 
       
    System.out.print("¿Hay que estar constantemente actualizando los repositorios de GitHub? ");
    String pregunta7 = System.console().readLine().toLowerCase();
    
    System.out.print("¿Cuál es la asignatura favorita de la gran mayor parte de la clase?");
    String pregunta8 = System.console().readLine().toLowerCase(); 
       
    System.out.print("¿Cuál es la nota media que hay que sacar para entrar en la DUAL? ");
    String pregunta9 = System.console().readLine().toLowerCase();    
    
    System.out.print("If en programación sirve para declarar una variable. Verdadero o falso ");
    String pregunta10 = System.console().readLine().toLowerCase();    
    
    int puntuacion = 0;
    
    if (pregunta1.equals("java")) {
    puntuacion++;
}   
     if (pregunta2.equals("visual study code")) {
    puntuacion++;
} 
     if (pregunta3.equals("notion")) {
    puntuacion++;
}
     if (pregunta4.equals("hardware")) {
    puntuacion++;
}
     if (pregunta5.equals("mysql")) {
    puntuacion++;
}

     if (pregunta6.equals("verdadero")) {
    puntuacion++;
}
     if (pregunta7.equals("si")) {
    puntuacion++;
}
     if (pregunta8.equals("fol")) {
    puntuacion++;
}
     if (pregunta9.equals("seis")) {
    puntuacion++;
}
     if (pregunta10.equals("falso")) {
    puntuacion++;
}

    System.out.println("La puntuacion final es: " + puntuacion);



		}	
  }


