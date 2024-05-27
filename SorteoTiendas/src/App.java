import java.util.Scanner;

import tiendas.*;
import metodos.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido!");
        int opcion;
        do {
            System.out.println();
            System.out.println("------------------------------------------------------------");
            System.out.println("A que tienda quieres entrar?");
            System.out.println("1.Informatica\n2.Papeleria\n0.Salir");
            System.out.println();
            System.out.print("Opcion: ");
            opcion = Metodos.validarInt(scan);
            switch (opcion) {
                case 1:
                    tienda(scan, opcion);
                    break;
                case 2:
                    tienda(scan, opcion);
                    break;
                case 0:
                    System.out.println("Gracias por venir!");
                    break;
                default:
                    System.out.println("Elige una tienda valida.");
                    break;
            }

        } while (opcion != 0);
    }

    public static void tienda(Scanner scan, int tienda) {
        int opcion2;
        String tiendaNombre = (tienda==1)?"Informatica":"Papeleria";
        
        do {
            System.out.println();
            System.out.println("------------------------------------------------------------");
            System.out.println("Que quieres hacer en la tienda de "+tiendaNombre+"?");
            System.out.println();
            System.out.println("1.Inscribir en el Sorteo\n2.Ver ganador\n3.Ver Inscritos\n0.Salir");
            System.out.println();
            System.out.print("Opcion: ");
            opcion2 = Metodos.validarInt(scan);
            switch (opcion2) {
                case 1:
                    if (tienda == 1)
                        Informatica.inscribirCliente(scan);
                    else
                        Papeleria.inscribirCliente(scan);
                    break;
                case 2:
                    if (tienda == 1)
                        Informatica.comunicarResultado();
                    else
                        Papeleria.comunicarResultado();
                    break;
                case 3:
                    if (tienda == 1)
                        Informatica.mostrarInscritos();
                    else
                        Papeleria.mostrarInscritos();
                    break;
                case 0:
                    System.out.println("Volvemos a la entrada de las tiendas.");
                    break;
                default:
                    System.out.println("Elige una opcion valida");
                    break;
            }

        } while (opcion2 != 0);
    }
}
