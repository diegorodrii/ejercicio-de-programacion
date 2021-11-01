/**
 * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
 * su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
 * incorrecta, el programa deberá mostrar un mensaje de error.
 */
 
public class ejercicio28{
  public static void main(String[] args) {
    System.out.println("Este programa es un juego de piedra papel tijera de dos jugadores");
    System.out.print("Por favor, díganos que escoge el primer jugador (1-piedra  2-papel  3-tijera): ");
    int usuario1 = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, díganos que escoge el segundo jugador (1-piedra  2-papel  3-tijera): ");
    int usuario2 = Integer.parseInt(System.console().readLine());


    /**Elecciones */
    String eleccion1 = "";
    switch(usuario1){
      case 1:
      eleccion1 = "El jugador 1 elige piedra";
      break;

      case 2:
      eleccion1 = "El jugador 1 elige papel";
      break;

      case 3:
      eleccion1 = "El jugador 1 elige tijera";
      break;
  
      default:
      eleccion1 = "Esta opción no es correcta";
    }   
    String eleccion2 = "";
    switch(usuario2){
      case 1:
      eleccion2 = "El jugador 2 elige piedra";
      break;

      case 2:
      eleccion2 = "El jugador 2 elige papel";
      break;

      case 3:
      eleccion2 = "El jugador 2 elige tijera";
      break;
      
      default: 
      eleccion2 = "Esta opción no es correcta";
    }
 
    /**Combates */
    String resultado = "";
    if ((usuario1 == 1) && (usuario2 == 2)){
      resultado = "Gana el Jugador 2";
    } else if ((usuario1 == 1) && (usuario2 == 3)){
      resultado = "Gana el Jugador 1";
    } if ((usuario1 == 2) && (usuario2 == 1)){
      resultado = "Gana el Jugador 1";
    } else if ((usuario1 == 2) && (usuario2 == 3)){
      resultado = "Gana el Jugador 2";
    }else if ((usuario1 == 3) && (usuario2 == 1)){
      resultado = "Gana el Jugador 2";
    } else if ((usuario1 == 3) && (usuario2 == 2)){
      resultado = "Gana el Jugador 1";
    } 

   
    System.out.println(eleccion1);
    System.out.println(eleccion2);
    if ((usuario1 == 1) && (usuario2 == 1)){
      System.out.println("El resultado es empate");
    } else if ((usuario1 == 2) && (usuario2 == 2)){
      System.out.println("El resultado es empate");
    } else if ((usuario1 == 3) && (usuario2 == 3)){
      System.out.println("El resultado es empate");
    } else {
      System.out.println(resultado);
    }
  } 
}			

