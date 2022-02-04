/*
¿Cuáles serían los atributos de la clase PilotoDeFormula1? ¿Se te ocurren algunas
instancias de esta clase?
*/

public class PilotoDeFormula1 {
    int idPiloto;
    String nombrePiloto;
    String apellidoPiloto;
    String  DNIPilot;
    String modeloCochePilot;
    boolean esCampeon;



public PilotoDeFormula1(String nombrePiloto, String apellidoPiloto, String dNIPilot) {
    this.nombrePiloto = nombrePiloto;
    this.apellidoPiloto = apellidoPiloto;
    DNIPilot = dNIPilot;
}



public PilotoDeFormula1(String modeloCochePilot, boolean esCampeon) {
    this.modeloCochePilot = modeloCochePilot;
    this.esCampeon = esCampeon;
}




}