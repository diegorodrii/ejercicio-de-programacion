
/* 
 * Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
 * aleatorio. La cabeza se representará con el carácter @ y se debe colocar
 * exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
 * el cuerpo irá serpenteando de la siguiente manera: se generará de forma
 * aleatoria un valor entre tres posibles que hará que el siguiente carácter se
 * coloque una posición a la izquierda del anterior, alineado con el anterior o una
 * posición a la derecha del anterior. La longitud de la serpiente se pedirá por
 * teclado y se supone que el usuario introducirá un dato correcto.
 */
public class Ejercicio22 {
  public static void main(String[] args) {
    System.out.println("Este programa pinta una serpiente");
    
    System.out.println("Introduce la longitud de la serpiente: ");
    int longitud = Integer.parseInt(System.console().readLine());

    

    System.out.println("             @");
    System.out.println("             #");
    int x = 13;
    int i;

    while (longitud - 1 > 1){
      x += (int)((Math.random() * 3) -1 );
      
      for (i = 1; i < x; i++){
        System.out.print(" ");
      }

      System.out.println("#");

      longitud--;
    }
    
  }
}
