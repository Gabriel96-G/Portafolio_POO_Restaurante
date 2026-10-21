
public class DetallePedido {

    // Atributos
    private Producto producto;
    private int cantidad;

    // Constructor
    public DetallePedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // Getters
    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    // Métodos
    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    public String toString() {
        return producto.getNombre() + " x " + cantidad
                + " = ₡" + calcularSubtotal();
    }
}
