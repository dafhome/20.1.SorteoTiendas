package tiendas;

import java.util.ArrayList;
import java.util.Scanner;

import metodos.Metodos;

public class Papeleria {
    private static int maxId = 0;

    private String articulo;
    private double precio;
    private static ArrayList<Cliente> clientesPapeleria = new ArrayList();

    public Papeleria(String articulo, double precio) {
        this.articulo = articulo;
        this.precio = precio;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Informatica [componente=" + articulo + ", precio=" + precio + "]";
    }

    public static void inscribirCliente(Scanner scan) {
        System.out.println();
        System.out.println("Vamos a inscribir un cliente en el sorteo de la papeleria: ");
        System.out.print("Nombre: ");
        String nombre = scan.nextLine();
        System.out.print("Telefono: ");
        int telefono = Metodos.validarInt(scan);
        clientesPapeleria.add(new Cliente(maxId, nombre, telefono));
        System.out.println("Cliente inscrito correctamente.");
        maxId++;
    }

    public static void comunicarResultado() {

        if (clientesPapeleria.isEmpty()) {
            System.out.println("Lo siento, no hay participantes todavía");
        } else {
            System.out.println();
            System.out.println("Vamos a ver quien es el ganador en la papeleria!");
            int ganador = (int) Math.round(Math.random() * (clientesPapeleria.size() - 1));

            System.out.println("El ganador es " + clientesPapeleria.get(ganador).getNombre() + " con telefono "
                    + clientesPapeleria.get(ganador).getTelefono());
        }

    }

    public static void mostrarInscritos(){
        if (clientesPapeleria.isEmpty()) {
            System.out.println("Lo siento, no hay participantes todavía");
        }
        else{
            for (Cliente cliente : clientesPapeleria) {
                System.out.println(cliente);
            }
        }
    }

}
