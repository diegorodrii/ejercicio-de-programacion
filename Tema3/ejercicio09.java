/**
 * Escribe un programa que calcule el volumen de un cono según la fórmula V =
 * (1/3)πr2h
 */

    
public class ejercicio09 {
  public static void main(String[] args) {
		
    System.out.println("Este programa calcula el volumen de un cono");
    System.out.print("Por favor, introduzca la longitud del radio del cono en cm: ");
    double radio = Double.parseDouble(System.console() .readLine() ) ;
    
    System.out.print("Por favor, introduzca la altura del cono en cm: ");
    double altura = Double.parseDouble(System.console() .readLine() ) ;
    
    
    
    double volumenCono = 0.33 * 3.14 * radio * 2 * altura;
    
    System.out.printf(" \nOperación \n");
    System.out.println("---------------------------------------------------------------");
    System.out.printf("La longitud del radio del cono es %.2f y la altura del cono es %.2f \n",radio, altura);
    System.out.println("---------------------------------------------------------------");
    System.out.printf("El volumen del cono con radio %.2f y altura %.2f es: %.2f cm² \n",radio, altura, volumenCono);      

    
  }     
}

