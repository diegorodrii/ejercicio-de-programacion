import java.util.Scanner;

/* 
* Minijuego "Busca el tesoro" 
* Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de
* cuatro filas por cinco columnas. El usuario intentará averiguar dónde
* está el tesoro. 
*/
public class MapaDelTesorov2 {
  public static void main(String[] args) throws InterruptedException {

    System.out.println("BUSCA EL TESORO!");
    System.out.println("-----------------");

    int indiceFila = 0;
    int indiceColumna = 0;
    int coordenadaX;
    int coordenadaY;
    int intentos = 4;



    String [][] cuadricula = new String [4][5];

    

    int tesoroX =(int) (Math.random() * 5);
    int tesoroY = (int)(Math.random() * 4);

    int minaX = tesoroX;
    int minaY = tesoroY;

    while ((tesoroX == minaX) == (minaY == tesoroY)){
      minaX = (int)(Math.random()* 5);
      minaY = (int)(Math.random() * 4);
    }

    String[] estado = {"¡Has encontrado la mina!", "¡Enhorabuena! ¡Has encontrado el tesoro!", "¡Cuidado! ¡Hay una mina cerca!", "Te has quedado sin intentos.", "Lo siento, has perdido"};
    int numEstado = 0;

    System.out.println("y");

    System.out.println("  ┌───┬───┬───┬───┬───┐");

    for (indiceFila = 0; indiceFila < 4; indiceFila++){
      System.out.print(indiceFila + " |");
      for (indiceColumna = 0; indiceColumna < 5; indiceColumna++){
        cuadricula[indiceFila] [indiceColumna] = " "; //se definen las posiciones del array como espacios vacíos
        System.out.print(" " + cuadricula[indiceFila] [indiceColumna] + " |");
      }
      System.out.println(" ");
      if (indiceFila < 3) {
        System.out.println("  ├───┼───┼───┼───┼───┤");
      } else {
        System.out.println("  └───┴───┴───┴───┴───┘");
      } //if
    }

    System.out.print("    ");
    for (indiceColumna = 0; indiceColumna < 5; indiceColumna++) {
      System.out.print(indiceColumna + "   ");
    } 

    System.out.print("x");

    System.out.println(" ");
    System.out.println(" ");

    boolean finDelJuego = false;

    while ((!finDelJuego) && (intentos > 0)){
      if (intentos > 1){
        System.out.println("Te quedan " + intentos + " intentos");
      } else {
        System.out.println("Te queda solo " + intentos + " intento");
      }
    }


    System.out.println(" ");

    System.out.println("Coordenada x: ");
    System.out.println("> ");
    coordenadaX = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    System.out.println("Coordenada y: ");
    System.out.println("> ");
    coordenadaY = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    System.out.println("y");
    for (indiceFila = 0; indiceFila < 4; indiceFila++) {
      System.out.print(indiceFila + " |");

      for (indiceColumna = 0; indiceColumna < 5; indiceColumna++) {
        if ((coordenadaY == tesoroY) && (coordenadaX == tesoroX)) { 
          cuadricula[coordenadaY] [coordenadaX] = "+"; //si la coordenada es la misma que la del tesoro el valor de esa posición en el array pasará de estar vacío a "+".
          finDelJuego = true; //el bucle terminará.
          numEstado = 1; //con este número posteriormente se mostrará el mensaje de que el jugador ha ganado.
        } else if ((coordenadaY == minaY) && (coordenadaX == minaX)) {
          cuadricula[coordenadaY] [coordenadaX] = "*"; //si la coordenada es la misma que la de la mina el valor de esa posición en el array pasará de estar vacío a "*".
          finDelJuego = true; //el bucl terminará.
          numEstado = 0; //con este número posteriormente se mostrará el mensaje de que el jugador ha encontrado la mina.
        } else {
          cuadricula[coordenadaY] [coordenadaX] = "x"; //si la posición consultada por el usuario no es ni la de la mina ni la del tesoro pasará de estar vacía a "x".
        } //if

        System.out.print(" " + cuadricula[indiceFila] [indiceColumna] + " |");
      } //for (indiceColumna = 0; indiceColumna < 5; indiceColumna++)

      System.out.println(" ");        
      
      if (indiceFila < 3) {
        System.out.println("  ├───┼───┼───┼───┼───┤");
      } else {
        System.out.println("  └───┴───┴───┴───┴───┘");
      } //if
    } //for (indiceColumna = 0; indiceColumna < 5; indiceColumna++)

    System.out.print("    ");

    for (indiceColumna = 0; indiceColumna < 5; indiceColumna++) {
      System.out.print(indiceColumna + "   ");
    } 

    System.out.print("x");

    System.out.println(" ");
    System.out.println(" ");

    if ((finDelJuego) && (numEstado == 0)) {
      System.out.println(estado[numEstado]); //si se encontró la mina se mostrará la posición del array estado que corresponde a ese texto.
      System.out.println(estado[4]); //también se mostrará el mensaje de que el jugador ha perdido de la misma manera.
    } else if ((finDelJuego) && (numEstado == 1)) {
      System.out.println(estado[numEstado]); // se el jugador encontró el tesoro se mostrará la posición del array estado correspondiente
    } else if ((!finDelJuego) && ((coordenadaX - minaX>= -1) && (coordenadaX - minaX<= 1) && (coordenadaY - minaY >= -1) && (coordenadaY - minaY <= 1))) {
      System.out.println(estado[2]); 
      //si el jugador ha consultado una posición que se encuentra a una casilla de la mina 
      //(la resta entre la coordenada introducida y la posición de la mina en la fila/columna está entre -1 y 1, ambos incluidos) 
      //se mostrará el correspondiente mensaje.
    } //if

    System.out.println(" ");

    intentos--;
  } //while ((!finDelJuego) && (intentos > 0))

  //si el jugador se ha quedado sin intentos antes de encontrar el tesoro o la mina se mostrará el correspodinte mensaje y el mensaje de la derrota.
  if ((intentos == 0) && (!finDelJuego)) {
    System.out.println(estado[3]);
    System.out.println(estado[4]);
  } //if 
}
}