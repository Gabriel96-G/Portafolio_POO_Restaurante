
public class Pedido {

    // Atributos
    private int numero;
    private Mesa mesa;
    private DetallePedido[] detalles;
    private int cantidadDetalles;

    // Constructor
    public Pedido(int numero, Mesa mesa) {
        this.numero = numero;
        this.mesa = mesa;
        this.detalles = new DetallePedido[10];
        this.cantidadDetalles = 0;
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public int getCantidadDetalles() {
        return cantidadDetalles;
    }

    // Agregar producto al pedido
    public String agregarProducto(Producto producto, int cantidad) {

        if (producto == null || cantidad <= 0) {
            return "No se puede agregar: producto o cantidad no válidos.";
        }

        if (cantidadDetalles == detalles.length) {
            return "No se pueden agregar más detalles al pedido.";
        }

        // Composición: el Pedido crea sus propios DetallePedido.
        detalles[cantidadDetalles] =
                new DetallePedido(producto, cantidad);

        cantidadDetalles++;

        return "Producto agregado al pedido.";
    }

    // Calcular el total
    public double calcularTotal() {

        double total = 0;

        for (int i = 0; i < cantidadDetalles; i++) {
            total = total + detalles[i].calcularSubtotal();
        }

        return total;
    }

    // Mostrar los datos del pedido
    public void mostrarPedido() {

        System.out.println(
                "Pedido #" + numero + " - Mesa " + mesa.getNumero()
        );

        for (int i = 0; i < cantidadDetalles; i++) {
            System.out.println(detalles[i]);
        }

        System.out.println(
                "Total del pedido: ₡" + calcularTotal()
        );
    }
}
