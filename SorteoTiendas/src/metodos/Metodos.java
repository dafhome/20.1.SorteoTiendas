package metodos;
import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {
    static void imprimir(String frase, int enter, int sleep) {
        try {
            for (int i = 0; i < frase.length(); i++) {
                System.out.print(frase.charAt(i));
                if (sleep == 1) {
                    Thread.sleep(20);
                }

            }
            if (enter == 1) {
                System.out.println(" ");
            }

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static int validarInt(Scanner scan) {
        boolean validar = false;
        int valor = 0;
        while (!validar) {

            if (scan.hasNextInt()) {
                validar = true;
                valor = scan.nextInt();
                scan.nextLine();
            } else {
                System.out.print("Introduce un valor con formato válido:");
                scan.next();
            }

        }
        return valor;
    }


 


}
