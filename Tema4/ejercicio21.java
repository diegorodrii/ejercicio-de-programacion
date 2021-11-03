/**
 * Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
 * Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado y se mostrará la media. En caso de que la media sea un número
 * menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
 * ha sido el resultado de la recuperación? (apto/no apto). Si el resultado de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
 * la nota media anterior.
 * 
 * 
 */
 
public class ejercicio21{
  public static void main(String[] args) {
    System.out.println("Este programa calcula la nota de un trimestre de la asignatura de Programación");
    System.out.print("Por favor, introduzca la primera nota: ");
    double numero1 = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca la segunda nota: ");
    double numero2 = Double.parseDouble(System.console().readLine());
    
    double media = (numero1 + numero2) / 2;
    
    if (media >= 5){
			System.out.println("Tu media es de " + media + " , por lo que está aprobado");
			
		}
    

    
    if (media <= 5){
      System.out.print("Por favor, introduzca si en su recuperación es apto o no apto : ");
      String recuperacion = System.console().readLine();
    
			
			if (recuperacion.equals("apto")){
				System.out.println("Tu recuperación es apto y por tanto tu nota es un 5");
		  }
		  
			if (recuperacion.equals("no apto")){
				System.out.println("Tu recuperación no es apto y por tanto se mantiene tu nota media anterior de " + media);				
		  }		  
    }
  }
}			

