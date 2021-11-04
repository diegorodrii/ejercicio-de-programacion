/**
 * Realiza un programa que calcule y muestre por pantalla el número de vueltas que da el 
 * planeta Tierra en 400 años en los dos siguientes supuestos:
 *  a) Sin tener en cuenta los años bisiestos.
 *  b) Desde el año 1601 al 2000, ambos incluidos.
 * Nota: Los años bisiestos tienen 366 días en lugar de 365. Fueron bisiestos los años 1604,
 * 1608, 1612, 1616, …, 1988, 1992, 1996, 2000 (en total 97 años bisiestos).
 * 
 * Autor Diego Rodríguez Barcos
 * 04-11-2021
 */
 
public class Ex17drb04{
  public static void main(String[] args) {
    System.out.println("Este programa calcula cuantas vueltas da la Tierra sobre sí misma en 400 años");

    int vueltasAñoNormal= 400 * 365;
    int vueltasAñoBisiesto = vueltasAñoNormal + 97;


    System.out.println("Apartado A");
    System.out.println("Sin tener en cuenta los años bisiestos, la Tierra ha dado " + vueltasAñoNormal + " vueltas");
    System.out.println("Apartado B");
    System.out.println("Teniendo en cuenta los años bisiestos desde el año 1601 al 2000, la Tierra ha dado " + vueltasAñoBisiesto + " vueltas");


  
  }	
}
  
