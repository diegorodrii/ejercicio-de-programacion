/**
 * Implementa un programa que calcule el número de latidos del corazón de una persona
 * durante el transcurso de varios años. Al usuario se le solicitará el tiempo transcurrido,
 * expresado en años, y el ritmo cardíaco medio durante todos esos años, medido en latidos por
 * minuto. No es necesario considerar los años bisiestos, se considera que todos los años tienen
 * 365 días.
 * Autor Diego Rodríguez Barcos
 * 04-11-2021
 */
 
public class Ex17drb02{
  public static void main(String[] args) {
    System.out.println("Este programa calcula cuantos latidos ha tenido una persona al transcurso de varios años");
    System.out.print("Por favor, introduzca su ritmo cardíaco medio en pulsaciones por minuto: ");
    int ritmo = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca el tiempo en años: ");
    int tiempo = Integer.parseInt(System.console().readLine());

    
    int pulsacionesHora = ritmo * 60;
    int pulsacionesDia = pulsacionesHora * 24;
    int pulsacionesAño = pulsacionesDia * 365;
    int pulsacionesTotales = pulsacionesAño * tiempo;

    System.out.println("Su corazón habrá realizado un total de " + pulsacionesTotales + " latidos");
  
  }	
}
  
