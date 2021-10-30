/**
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 * hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 * por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
 * a las 15:00h.
 */
 
public class ejercicio22{
  public static void main(String[] args) {
    System.out.println("Este programa calcula cuantos minutos faltan para el fin de semana");
    System.out.print("Por favor, introduzca el número del día la semana: ");
    int dia = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca la hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());

    int minutosFinde = 5 * 1440 + 900;  /* Calculamos aquí el total de minutos que habría desde el fin del último finde hasta la entrada del próximo*/

    int conversionHoras = hora * 60;
    int conversionDias = dia * 1440;

    int minutosTotal = minutosFinde - conversionHoras - conversionDias - minutos;


    if ((dia > 5) || (dia <= 0)){
      System.out.println("El día introducido no es correcto");
    } else if ((hora > 24) || (hora < 0)){
      System.out.println("La hora introducida no es correcta");
    } else if ((minutos > 60) || (minutos < 0)){
      System.out.println("Los minutos introducidos no son correctos");
    } else {
      System.out.println("La cantidad de minutos que faltan para que llegue el fin de semana es " + minutosTotal );

    }
  }
}			

