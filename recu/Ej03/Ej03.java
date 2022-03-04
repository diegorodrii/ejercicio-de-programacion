package Ej03;

/**
 * Se quiere llevar un registro de las revisiones de exámenes. Implementa la
 * clase Examen. Sobre cada
 * examen se debe saber de qué asignatura se hace, el trimestre, el estado de la
 * revisión (“sin
 * revisar” o “revisado”) y, en caso de haberse revisado, opcionalmente se puede
 * anotar una
 * observación.
 * Por ejemplo Examen fol3 = new Examen("FOL", 3) registraría un examen de FOL
 * que tuvo
 * lugar en el tercer trimestre; en principio se marcaría como que está “sin
 * revisar”. Si posteriormente se
 * realiza la revisión con fol3.revisa(), quiere decir que el examen se ha
 * revisado y no ha supuesto
 * ningún cambio en la nota. Por el contrario si se hace fol3.revisa(“Error al
 * sumar los
 * puntos. Sube la nota a 7.”) se quedaría registrada la observación que se ha
 * hecho.
 * A continuación se muestran el contenido del main y la salida esperada.
 */



 public class Ej03 {
    public static void main(String[] args) {
        Examen e1 = new Examen("Programación", 1);
        Examen e2 = new Examen("Bases de datos", 2);
        System.out.println(e1);
        System.out.println(e2);
        e1.revisa();
        e2.revisa("Se sube 0'25 la nota.");
        System.out.println(e1);
        System.out.println(e2);
        Examen e3 = new Examen("FOL", 1);
        e3.revisa();
        System.out.println(e3);
        // Se revisa por segunda vez
        e3.revisa("Se detectan errores pero no se baja la nota.");
        System.out.println(e3);
    }

}
