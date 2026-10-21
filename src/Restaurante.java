
public class Restaurante {

    // Atributos
    private String nombre;

    // Agregación: estos objetos se crean fuera de Restaurante.
    private Producto[] productos;
    private Mesa[] mesas;
    private Pedido[] pedidos;

    private int cantidadProductos;
    private int cantidadMesas;
    private int cantidadPedidos;

    // Constructor
    public Restaurante(String nombre) {

        this.nombre = nombre;

        this.productos = new Producto[10];
        this.mesas = new Mesa[10];
        this.pedidos = new Pedido[10];

        this.cantidadProductos = 0;
        this.cantidadMesas = 0;
        this.cantidadPedidos = 0;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Registrar producto
    public String registrarProducto(Producto producto) {

        if (producto == null
                || cantidadProductos == productos.length) {

            return "No se pudo registrar el producto.";
        }

        productos[cantidadProductos] = producto;
        cantidadProductos++;

        return "Producto registrado correctamente.";
    }

    // Registrar mesa
    public String registrarMesa(Mesa mesa) {

        if (mesa == null || cantidadMesas == mesas.length) {

            return "No se pudo registrar la mesa.";
        }

        mesas[cantidadMesas] = mesa;
        cantidadMesas++;

        return "Mesa registrada correctamente.";
    }

    // Registrar pedido
    public String registrarPedido(Pedido pedido) {

        if (pedido == null || cantidadPedidos == pedidos.length) {

            return "No se pudo registrar el pedido.";
        }

        pedidos[cantidadPedidos] = pedido;
        cantidadPedidos++;

        return "Pedido registrado correctamente.";
    }

    // Mostrar productos
    public void mostrarCatalogo() {

        System.out.println("===== MENÚ DE " + nombre + " =====");

        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println(productos[i]);
        }
    }

    // Mostrar mesas
    public void mostrarMesas() {

        System.out.println("===== MESAS =====");

        for (int i = 0; i < cantidadMesas; i++) {
            System.out.println(mesas[i]);
        }
    }

    // Mostrar pedidos
    public void mostrarPedidos() {

        System.out.println("===== PEDIDOS =====");

        for (int i = 0; i < cantidadPedidos; i++) {
            pedidos[i].mostrarPedido();
        }
    }

    // Dependencia:
    // Restaurante utiliza ImpresoraRecibos como parámetro.
    public void imprimirRecibo(Pedido pedido,
                               ImpresoraRecibos impresora) {

        if (impresora != null) {
            impresora.imprimirPedido(pedido);
        }
    }
}
