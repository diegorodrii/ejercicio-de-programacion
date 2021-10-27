/**
 * Ejercicio 17 Tema 4.
 * Éste ejercicio nos pide realizar un programa que diga cuál es la última cifra de un número entero introducido por teclado. 
 * @author Diego Aguilera Martín
 * @author Diego Rodríguez Barcos
 */
public class ejercicio17 {
  public static void main(String[] args) {

    System.out.println("Éste programa te dice cuál es la última cifra de un número entero.");
    System.out.println("");
    System.out.println("Por favor, introduzca la cifra: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int numero1Es1 = 1 % 1;
    int numero2Es1 = 2 % 1;
    int numero2Es2 = 2 % 2;
    int numero3Es1 = 3 % 1;
    int numero3Es3 = 3 % 3;
    int numero4Es1 = 4 % 1;
    int numero4Es2 = 4 % 2;
    int numero4Es4 = 4 % 4;
    int numero5Es1 = 5 % 1;
    int numero5Es5 = 5 % 5;
    int numero6Es1 = 6 % 1;
    int numero6Es2 = 6 % 2;
    int numero6Es3 = 6 % 3;
    int numero6Es6 = 6 % 6;
    int numero7Es1 = 7 % 1;
    int numero7Es7 = 7 % 7;
    int numero8Es1 = 8 % 1;
    int numero8Es2 = 8 % 2;
    int numero8Es4 = 8 % 4;
    int numero8Es8 = 8 % 8;
    int numero9Es1 = 9 % 1;
    int numero9Es3 = 9 % 3;
    int numero9Es9 = 9 % 9;
    int numero0Es0 = 0 % 0;

    if ((numero1Es1 == 0)){
			System.out.println ("El numero es 1.");
    } 
    if ((numero2Es1 == 1) && (numero2Es2 == 0)){
			System.out.println ("El numero es 2.");
    }        
    if ((numero3Es1 == 2) && (numero3Es3 == 0)){
			System.out.println ("El numero es 3.");
    } 
    if ((numero4Es1 == 3) && (numero4Es2 == 0) && (numero4Es4 == 0)){
			System.out.println ("El numero es 4.");
    } 
    if ((numero5Es1 == 4) && (numero5Es5 == 0)){
			System.out.println ("El numero es 5.");
    } 
    if ((numero6Es1 == 5) && (numero6Es2 == 0) && (numero6Es3 == 0) && (numero6Es6 == 0)){
			System.out.println ("El numero es 6.");
    } 
    if ((numero7Es1 == 6) && (numero7Es7 == 0)){
			System.out.println ("El numero es 7.");
    } 
    if ((numero8Es1 == 7) && (numero8Es2 == 0) && (numero8Es4 == 0) && (numero8Es8 == 0)){
			System.out.println ("El numero es 8.");
    } 
    if ((numero9Es1 == 8) && (numero9Es3 == 0) && (numero9Es9 == 0)){
			System.out.println ("El numero es 1.");
    } 
    if ((numero0Es0 == 0)){
			System.out.println ("El numero es 2.");

    } 
  }

}
