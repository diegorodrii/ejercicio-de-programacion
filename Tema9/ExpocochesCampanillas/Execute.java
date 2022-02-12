package ExpocochesCampanillas;

import java.util.Scanner;

public class Execute {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Zona principal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);
        int eleccion = 0;

        while (eleccion != 3) {
            System.out.println("Menú Expocoches");
            System.out.println("---------------");
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            eleccion = Integer.parseInt(s.nextLine());

            switch (eleccion) {
                case 1:
                    System.out.println("Quedan el siguiente numero de entradas: ");
                    System.out.println("Principal: " + principal.getEntradasPorVender());
                    System.out.println("Compra-venta: " + compraVenta.getEntradasPorVender());
                    System.out.println("Vip: " + vip.getEntradasPorVender());

                    System.out.println();
                    break;

                case 2:
                    System.out.print("En que zona desea comprar la entrada?: 1.Principal; 2.Compra-venta; 3.Vip: ");
                    int eleccionEntrada = Integer.parseInt(s.nextLine());
                    System.out.print("Cuantas entradas desea? ");
                    int numEntradas = Integer.parseInt(s.nextLine());
                    switch (eleccionEntrada) {
                        case 1:
                            principal.vender(numEntradas);
                            break;

                        case 2:
                            compraVenta.vender(numEntradas);
                            break;

                        case 3:
                            vip.vender(numEntradas);
                            break;
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Esperamos que vuelva!");
                    break;

            }
        }
    }

}
