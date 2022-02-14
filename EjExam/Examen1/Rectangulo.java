package Examen1;

public class Rectangulo {
    private int alto;
    private int ancho;
    private boolean estaRelleno;

    public Rectangulo(int alto, int ancho, boolean estaRelleno) {
        this.alto = alto;
        this.ancho = ancho;
        this.estaRelleno = estaRelleno;
    }

    public void pinta() {
        if (estaRelleno) {
            for (int i = 0; i < alto; i++) {
                for (int j = 0; j < ancho; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println();
            for (int i = 0; i < ancho; i++) {
                System.out.print("*");
            }
            System.out.println();

            // centro de la forma
            for (int i = 0; i < alto - 2; i++) {
                System.out.print("*");
                for (int j = 0; j < ancho - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            // Linea inferior
            for (int i = 0; i < ancho; i++) {
                System.out.print("*");
            }
        }
    }

    @Override
    public String toString() {
        return "";
    }

}
