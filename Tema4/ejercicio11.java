/**
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan para llegar a la medianoche.
 * 
 * 
 */
 
public class ejercicio11{
  public static void main(String[] args) {
    System.out.println("Este programa determina los segundos que faltan para llegar a la medianoche");
    System.out.print("Por favor, introduzca la hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int 
    
    switch (mes){
      case 1 :
      if (dia >= 21){
      horoscopo = "Aries";
    }
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

