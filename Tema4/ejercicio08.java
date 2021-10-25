/**
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 * 
 * 
 */

    
public class ejercicio08{
  public static void main(String[] args) {
    System.out.println("Este programa calcula la nota media de las tres notas introducidas: ");
    System.out.print("Por favor, introduzca la nota del primer examen: ");
    double examen1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca la nota del segundo examen: ");
    double examen2 = Double.parseDouble(System.console().readLine());
        
    System.out.print("Por favor, introduzca la nota del tercer examen: ");
    double examen3 = Double.parseDouble(System.console().readLine());
    
    double media =( (double) examen1 + (double) examen2 + (double) examen3 ) / 3;

    
    if (media > 10) {
    System.out.println ("Las notas introducidas son incorrectas"); 
    }
    
    else if ((media <=10) && (media >= 9)){
    System.out.printf ("La nota media es: %1.2f , lo que corresponde a un sobresaliente", media );
    }
    
    else if ((media < 9) && (media >= 7 )){
    System.out.printf ("La nota media es: %1.2f , lo que corresponde a un notable", media );    
    }
    else if ((media < 7) && (media >= 6)){
    System.out.printf ("La nota media es: %1.2f , lo que corresponde a un bien", media );
    }   
    else if ((media < 6) && (media >= 5)){
    System.out.printf ("La nota media es: %1.2f , lo que corresponde a un suficiente", media );  
    }        
    else if ((media < 5) && (media >= 0)){
    System.out.printf ("La nota media es: %1.2f , lo que corresponde a un insuficiente", media );      
    }    

    else  (examen1 > 10){
      System.out.println("Las notas introducidas no son correctas");
    }
    else  (examen2 > 10){
      System.out.println("Las notas introducidas no son correctas");
    }
    else  (examen3 > 10){
      System.out.println("Las notas introducidas no son correctas");
      
    
  }     
}
