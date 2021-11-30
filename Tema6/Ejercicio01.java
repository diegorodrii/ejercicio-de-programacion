
/* 
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
*/
public class Ejercicio01 {
    public static void main(String[] args) {
      System.out.println("Este programa muestra la tirada de tres dados. También su suma total");
  
    int tirada;
    int suma = 0;
    

    for (int i = 1; i <= 3; i++){
        tirada = (int)(Math.random() * 6) + 1;
        System.out.println("Con la tirada " + i + " hemos obtenido el número " + tirada );
        suma += tirada;
        
    }

      System.out.println("La suma de todo es " + suma);
    }
  }
  