
public class Producto {

    // Atributos privados: encapsulamiento.
    private int codigo;
    private String nombre;
    private double precio;

    // Constructor
    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = 0;
        setPrecio(precio);
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }

    public String toString() {
        return codigo + " - " + nombre + " - ₡" + precio;
    }
}
