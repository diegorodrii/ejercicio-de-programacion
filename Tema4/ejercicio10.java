/**
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
 * 
 * 
 */
 
public class ejercicio10{
  public static void main(String[] args) {
    System.out.println("Este programa determina tu horóscopo a partie de tu día y mes de nacimiento");
    System.out.print("Por favor, introduzca el día en el que nació: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca el número del mes en el que nació: ");
    int mes = Integer.parseInt(System.console().readLine());
  
    String horoscopo = "";
    
    switch (mes){
      case 4 :
      if (dia >= 21){
      horoscopo = "Aries";
    } else {
      horoscopo = "Tauro";
    }       
      break;
   
      case 5 :
      if (dia <= 20){
      horoscopo = "Tauro";
    } else {
      horoscopo = "Geminis";
    }       
      break;

      case 6 :
      if (dia <= 21){
      horoscopo = "Géminis";
    } else {
      horoscopo = "Cáncer";
    }       
      break;
   

      case 7 :
      if (dia <= 21){
      horoscopo = "Cáncer";
    } else {
      horoscopo = "Leo";
    }       
      break;
   

      case 8 :
      if (dia <= 23){
      horoscopo = "Leo";
    } else {
      horoscopo = "Virgo";
    }       
      break;
   

      case 9 :
      if (dia <= 23){
      horoscopo = "Virgo";
    } else {
      horoscopo = "Libra";
    }       
      break;
   

      case 10 :
      if (dia <= 23){
      horoscopo = "Libra";
    } else {
      horoscopo = "Escorpio";
    }       
      break;   

      case 11 :
      if (dia <= 23){
      horoscopo = "Escorpio";
    } else {
      horoscopo = "Sagitario";
    }       
      break;
   

      case 12 :
      if (dia <= 22){
      horoscopo = "Sagitario";
    } else {
      horoscopo = "Capricornio";
    }       
      break;
   

      case 1 :
      if (dia <= 22){
      horoscopo = "Acuario";
    } else {
      horoscopo = "Capricornio";
    }       
      break;
   
 
      case 2 :
      if (dia <= 20){
      horoscopo = "Acuario";
    } else {
      horoscopo = "Piscis";
    }       
      break;
       

      case 3 :
      if (dia <= 19){
      horoscopo = "Piscis";
    } else {
      horoscopo = "Aries";
    }       
   break;
 
    default:
     horoscopo = "Vuelve a introducir los datos";
	 }
   System.out.println("Tu horóscopo es: " + horoscopo);
  }
}

