/**
 * Escribe un programa que traduzca cada uno de los números de un PIN de 4 dígitos
 * introducido por el usuario a su correspondiente palabra. Si el usuario introduce un número de
 * menos de 4 dígitos, se entiende que el PIN tiene ceros a la izquierda hasta completar esos 4
 * dígitos.
 * Autor Diego Rodríguez Barcos
 * 04-11-2021
 */
 
public class Ex17drb01{
  public static void main(String[] args) {
    System.out.println("Este programa traduce cada uno de los números de un PIN de 4 dígitos");
    System.out.print("Por favor, introduzca el PIN: ");
    int pin = Integer.parseInt(System.console().readLine());

    
    int unidad = 0;
    int decena = 0;
    int centena = 0;
    int millar = 0;

    
    if ((pin >= 0) && (pin < 9)){
      unidad = pin;
    } else if ((pin >= 10) && (pin <= 99)){
      unidad = pin % 10;
      decena = pin / 10;
    } else if ((pin >= 100) && (pin <= 999)){
      unidad = pin % 10; 
      decena = (pin / 10) % 10;
      centena = pin / 100;
    } else if ((pin >= 1000) && (pin <= 9999)){
      unidad = pin % 10;
      decena = (pin / 10) % 10;
      centena = (pin / 100) % 10;
      millar = pin / 1000; 
    } 
    
    
    String millarEscrito = "";
    switch (millar){
      case 1:
      millarEscrito = "uno ";
      break;
    
      case 2:
      millarEscrito = "dos ";
      break;
    
      case 3:
      millarEscrito = "tres ";
      break;
  
      case 4:
      millarEscrito = "cuatro ";
      break;
    
      case 5:
      millarEscrito = "cinco ";
      break;
    
      case 6:
      millarEscrito = "seis ";
      break;
   
      case 7:
      millarEscrito = "siete ";
      break;
    
      case 8:
      millarEscrito = "ocho ";
      break;
    
      case 9:
      millarEscrito = "nueve ";
      break;
     
      case 0:
      millarEscrito = "cero ";
      break;
    }
    String centenaEscrito = "";
    switch (centena){
      case 1:
      centenaEscrito = "uno ";
      break;
    
      case 2:
      centenaEscrito = "dos ";
      break;
    
      case 3:
      centenaEscrito = "tres ";
      break;
  
      case 4:
      centenaEscrito = "cuatro ";
      break;
    
      case 5:
      centenaEscrito = "cinco ";
      break;
    
      case 6:
      centenaEscrito = "seis ";
      break;
   
      case 7:
      centenaEscrito = "siete ";
      break;
    
      case 8:
      centenaEscrito = "ocho ";
      break;
    
      case 9:
      centenaEscrito = "nueve ";
      break;
     
      case 0:
      centenaEscrito = "cero ";
      break;
    }
    String decenaEscrito = "";
    switch (decena){
      case 1:
      decenaEscrito = "uno ";
      break;
    
      case 2:
      decenaEscrito = "dos ";
      break;
    
      case 3:
      decenaEscrito = "tres ";
      break;
  
      case 4:
      decenaEscrito = "cuatro ";
      break;
    
      case 5:
      decenaEscrito = "cinco ";
      break;
    
      case 6:
      decenaEscrito = "seis ";
      break;
   
      case 7:
      decenaEscrito = "siete ";
      break;
    
      case 8:
      decenaEscrito = "ocho ";
      break;
    
      case 9:
      decenaEscrito = "nueve ";
      break;
     
      case 0:
      decenaEscrito = "cero ";
      break;
    }
    String unidadEscrito = "";
    switch (unidad){
      case 1:
      unidadEscrito = "uno ";
      break;
    
      case 2:
      unidadEscrito = "dos ";
      break;
    
      case 3:
      unidadEscrito = "tres ";
      break;
  
      case 4:
      unidadEscrito = "cuatro ";
      break;
    
      case 5:
      unidadEscrito = "cinco ";
      break;
    
      case 6:
      unidadEscrito = "seis ";
      break;
   
      case 7:
      unidadEscrito = "siete ";
      break;
    
      case 8:
      unidadEscrito = "ocho ";
      break;
    
      case 9:
      unidadEscrito = "nueve ";
      break;
     
      case 0:
      unidadEscrito = "cero ";
      break;
    }
    
    
    
    if ((pin >= 0) && (pin <= 9999)){
      System.out.print(millarEscrito);
      System.out.print(centenaEscrito);
      System.out.print(decenaEscrito);
      System.out.print(unidadEscrito);
    } else {
      System.out.println("No es un PIN correcto");
    }
  
  
    
  }
}
  
