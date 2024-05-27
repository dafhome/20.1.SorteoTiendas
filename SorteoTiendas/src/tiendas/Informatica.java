package tiendas;

import java.util.ArrayList;
import java.util.Scanner;

import metodos.Metodos;

public class Informatica {
    private static int maxId = 0;
    
    private String componente;
    private double precio;
    private static ArrayList<Cliente> clientesInformatica = new ArrayList();
    public Informatica(String componente, double precio) {
        this.componente = componente;
        this.precio = precio;
    }
    public String getComponente() {
        return componente;
    }
    public void setComponente(String componente) {
        this.componente = componente;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Informatica [componente=" + componente + ", precio=" + precio + "]";
    }

    public static void inscribirCliente (Scanner scan){
        System.out.println();
        System.out.println("Vamos a inscribir un cliente en el sorteo de la tienda de informatica: ");
        System.out.print("Nombre: ");
        String nombre = scan.nextLine();
        System.out.print("Telefono: ");
        int telefono = Metodos.validarInt(scan);
        clientesInformatica.add(new Cliente(maxId, nombre, telefono));
        System.out.println("Cliente inscrito correctamente.");
        maxId++;
    }

    public static void comunicarResultado(){
        if (clientesInformatica.isEmpty()) {
            System.out.println("Lo siento, no hay participantes todavía");
        } else {
            System.out.println();
            System.out.println("Vamos a ver quien es el ganador en la papeleria!");
            int ganador = (int) Math.round(Math.random() * (clientesInformatica.size() - 1));

            System.out.println("El ganador es " + clientesInformatica.get(ganador).getNombre() + " con telefono "
                    + clientesInformatica.get(ganador).getTelefono());
        }
    }
    
    
    public static void mostrarInscritos(){
        if (clientesInformatica.isEmpty()) {
            System.out.println("Lo siento, no hay participantes todavía.");
        }
        else{
            for (Cliente cliente : clientesInformatica) {
                System.out.println(cliente);
            }
        }
    }



}
