package tiendas;

public class Cliente {
    
    protected int id;
    protected String nombre;
    protected int telefono;
    public Cliente(int id, String nombre, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + "]";
    }
    

    

}
