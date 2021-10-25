/**
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido
 * por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
 * etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
 * de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
 * hacia la derecha.
 * 
 * 
 */
 
public class ejercicio15{
  public static void main(String[] args) {
    System.out.println("Este programa pinta por pantalla una pirámide rellenada por el carácter que introduzca");
    System.out.print("Por favor, introduzca un caracter: ");
    String x = System.console().readLine();

    System.out.println("Por favor, introduzca la dirección hacia donde quiere que apunte el vértice de la pirámide: arriba , derecha, abajo, izquierda");
    String direccion = System.console().readLine();
    
    if (direccion.equals("arriba")){
    System.out.println("\n    " + x + "    \n   " + x + x + x + "   ");
    System.out.println("  " + x + x + x + x + x + "  ");
    System.out.println(" "+ x + x + x + x + x + x + x + " ");
    System.out.print("" + x + x + x + x + x + x);
    System.out.print("" + x + x + x + "\n");


 
			}

    if (direccion.equals("abajo")){
		System.out.println("" + x + x + x +x +x + x + x + "");
		System.out.println(" " + "" + x + x + x + x + x );
		System.out.println(" "+ x + x + x + x + x + x + x + " ");
		System.out.println("  " + x + x + x + x + x + "  ");
		System.out.println("\n    " + x + "    \n   " + x + x + x + "   ");
		
			}
    if (direccion.equals("derecha")){
        System.out.println(x);
        System.out.println(x + " " + x);
        System.out.println(x + " " + x + " " + x);
        System.out.println(x + " " + x);
        System.out.println(x);
		
			}
    if (direccion.equals("izquierda")){
        System.out.println("    " + x);
        System.out.println("  " + x + " " + x);
        System.out.println(x + " " + x + " " + x);
        System.out.println("  " + x + " " + x);
        System.out.println("    " + x);
		
			}
  }
}			

