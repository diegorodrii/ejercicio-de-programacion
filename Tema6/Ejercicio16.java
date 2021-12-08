
/* 
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
 * perdido”.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
 * ha recuperado su moneda”.
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
 * 10 monedas”.
 *
 */
public class Ejercicio16 {
  public static void main(String[] args) {
    System.out.println("Este programa es una máquina tragaperras");

   
    int icono1 = 0;
    int icono2 = 0;
    int icono3 = 0;

    for (int i = 0; i < 3; i++) {
      int figura = (int) ((Math.random() * 5) + 1);
      String dibujo = "";
      switch (figura) {
        case 1:
          dibujo = "❤️";
         
          break;

        case 2:
          dibujo = "♦️";
        
          break;

        case 3:
          dibujo = "🦄";
          
          break;

        case 4:
          dibujo = "🔔";
         
          break;

        case 5:
          dibujo = "⭐";
          
          break;
          
      }
      
      if (i == 0){
        icono1 = figura;
      } else if (i == 1){
        icono2 = figura;
      } else if (i == 2){
        icono3 = figura;
      }

     
      System.out.print(dibujo);
      System.out.print(" ");
    }

    System.out.println();
    
    if ((icono1 != icono2) && (icono2 != icono3) && (icono3 != icono1)){
      System.out.println("Lo siento, ha perdido");
    }
    /** Si son dos iguales */
    if ((icono2 != icono3) && (icono1 == icono3) && (icono2 != icono1)){
      System.out.println("Ha recuperado su moneda!");
    }
    if ((icono1 != icono3) && (icono2 == icono3) && (icono2 != icono1)){
      System.out.println("Ha recuperado su moneda!");
    }
    if ((icono3 != icono2) && (icono1 == icono2) && (icono3 != icono1)){
      System.out.println("Ha recuperado su moneda!");
    }
    
    /** Si son 3 iguales */
    if ((icono1 == icono2) && (icono2 == icono3)){
      System.out.println("Enhorabuena, ha ganado 10 monedas!");
    }

    System.out.println();


  }
}
