/**
 * Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5.
 * 
 * 
 */
 
public class ejercicio14{
  public static void main(String[] args) {
    System.out.println("Este programa te indica si el número introducido es par o divisible entre 5");
    System.out.print("Por favor, introduzca el número: ");
    int numero = Integer.parseInt(System.console().readLine());

    double moduloDos = numero % 2;
    double moduloCinco = numero % 5;
    if ((moduloDos == 0) && (moduloCinco == 0)) {
			System.out.println ("Tú numero es par y divisible entre 5");
    } else if(moduloDos == 0){
        System.out.println("Tu número es par");
			}
        else if (moduloCinco == 0){
					System.out.println("Tu número es divisible entre cinco");
				}
				  else {
						System.out.println("Tu numero no es ni divisible entre 5 ni par");
				  }
					

 
        
  }
}			

