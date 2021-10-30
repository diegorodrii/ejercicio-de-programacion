/**
 * Ejercicio 16 Tema 4. Realiza un programa que nos diga si hay probabilidad de
 * que nuestra pareja nos está siendo infiel. El programa irá haciendo preguntas
 * que el usuario contestará con verdadero o falso. Cada pregunta contestada
 * como verdadero sumará 3 puntos. Las preguntas contestadas con falso no suman
 * puntos. A continuación se listan las preguntas del test. 1. Tu pareja parece
 * estar más inquieta de lo normal sin ningún motivo aparente. 2. Ha aumentado
 * sus gastos de vestuario 3. Ha perdido el interés que mostraba anteriormente
 * por ti 4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora
 * se arregla el pelo y se asea con más frecuencia (si es mujer) 5. No te deja
 * que mires la agenda de su teléfono móvil 6. A veces tiene llamadas que dice
 * no querer contestar cuando estás tú delante 7. Últimamente se preocupa más en
 * cuidar la línea y/o estar bronceado/a 8. Muchos días viene tarde después de
 * trabajar porque dice tener mucho más trabajo 9. Has notado que últimamente se
 * perfuma más 10. Se confunde y te dice que ha estado en sitios donde no ha ido
 * contigo
 * 
 * @author Diego Aguilera Martín
 * @author Diego Rodríguez Barcos
 */
public class ejercicio16 {
    public static void main(String[] args) {

        int puntuacion = 0;

        System.out.println(
                "Éste programa te va a ayudar a ir a las islas de las tentaciones. Introduce verdadero o falso para cada pregunta");
        System.out.println("");

        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente: V o F ");
        String respuesta1 = System.console().readLine().toLowerCase();
        if (respuesta1.equals("verdadero")) {
            puntuacion++;

        } else {

        }
        System.out.println("2. Ha aumentado sus gastos de vestuario: verdadero o falso ");
        String respuesta2 = System.console().readLine().toLowerCase();
        if (respuesta2.equals("verdadero")) {
            puntuacion++;

        } else {

        }
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti: verdadero o falso ");
        String respuesta3 = System.console().readLine().toLowerCase();
        if (respuesta3.equals("verdadero")) {
            puntuacion++;

        } else {

        }
        System.out.println(
                "4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer): verdadero o falso ");
        String respuesta4 = System.console().readLine().toLowerCase();
        if (respuesta4.equals("verdadero")) {
            puntuacion++;

        } else {

        }
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil: verdadero o falso ");
        String respuesta5 = System.console().readLine().toLowerCase();
        if (respuesta5.equals("verdadero")) {
            puntuacion++;

        } else {

        }
        System.out.println(
                "6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante: verdadero o falso ");
        String respuesta6 = System.console().readLine().toLowerCase();
        if (respuesta6.equals("verdadero")) {
            puntuacion++;

        } else {

        }
        System.out
                .println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a: verdadero o falso ");
        String respuesta7 = System.console().readLine().toLowerCase();
        if (respuesta7.equals("verdadero")) {
            puntuacion++;

        } else {

        }
        System.out.println(
                "8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo: verdadero o falso ");
        String respuesta8 = System.console().readLine().toLowerCase();
        if (respuesta8.equals("verdadero")) {
            puntuacion++;

        } else {

        }
        System.out.println("9. Has notado que últimamente se perfuma más: verdadero o falso ");
        String respuesta9 = System.console().readLine().toLowerCase();
        if (respuesta9.equals("verdadero")) {
            puntuacion++;

        } else {

        }
        System.out.println(
                "10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo: verdadero o falso ");
        String respuesta10 = System.console().readLine().toLowerCase();
        if (respuesta10.equals("verdadero")) {
            puntuacion++;

        } else {

        }

        int puntuacionFinal = puntuacion * 3;
        if ((puntuacionFinal >= 0) && (puntuacionFinal <= 10)) {
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel" + puntuacionFinal);

        } else if ((puntuacionFinal <= 22) && (puntuacionFinal >= 11)) {
            System.out.println(
                    "Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia"
                            + puntuacionFinal);
        } else if ((puntuacionFinal <= 30) && (puntuacionFinal >= 23)) {
            System.out.println(
                    "Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza."
                            + puntuacionFinal);
        }

    }
}
