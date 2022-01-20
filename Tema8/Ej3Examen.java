/**
 * Crea la función linea para pintar lineas de caracteres que tienen un
 * determinado carácter en los
 * extremos y otro carácter de relleno.
 * public static String linea(int longitud, char extremo, char relleno)
 * Ejemplos:
 * linea(5, ‘*’, ‘ ‘) devuelve “* *
 * linea(5, ‘*’, ‘*‘) devuelve “*****
 * linea(6, ‘X’, ‘-‘) devuelve “X----X
 * linea(3, ‘&’, ‘$‘) devuelve “&$&
 * linea(2, ‘&’, ‘$‘) devuelve “&&
 * linea(1, ‘&’, ‘$‘) devuelve “&
 * linea(0, ‘&’, ‘$‘) devuelve “
 * linea(-3, ‘&’, ‘$‘) devuelve “
 * Utiliza esta función para pintar una pirámide hueca cuya altura se pide por
 * teclado. Podemos suponer
 * que el usuario va a introducir un número mayor o igual a 1.
 * 
 * 
 */
public class Ej3Examen {
    public static void main(String[] args) {
        System.out.println("Introduzca una altura: ");
        int alturaIntroducida = Integer.parseInt(System.console().readLine());

        System.out.println(espacios(alturaIntroducida));
        
        int longitud = 1;
        char extremo = '*';
        char relleno = ' ';

        int numEspacios = alturaIntroducida;
        int base = 1;

        for (int i = 0; i < alturaIntroducida-1; i++) {
            System.out.print(espacios(numEspacios));
            System.out.println(extremo);
            
            
            if (base <= alturaIntroducida - 1){
                System.out.print(linea(longitud, extremo, relleno));
            } else {
                relleno = '*';
                System.out.print(linea(longitud, extremo, relleno));
            }
            numEspacios--;
            longitud += 2;
            base++;
        }
    }

    public static String espacios(int n) {
        return linea(n, ' ', ' ');
    }

    public static String linea(int longitud, char extremo, char relleno){
        System.out.print(extremo);
        for (int i = 0; i < longitud -2; i++){
            System.out.print(relleno);
        }
        if (longitud > 1){
            System.out.print(extremo);
        }
        return "";
    }
    public static String espaciosPorDelante(int numespacios,char relleno){
        return linea(numespacios,' ',relleno);
    }
    

}
