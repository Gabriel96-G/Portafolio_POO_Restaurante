
public class Main {

    public static void main(String[] args) {

        System.out.println("===== PORTAFOLIO POO: RESTAURANTE =====");

        // Crear el restaurante
        Restaurante restaurante =
                new Restaurante("Sabores de Heredia");

        // Crear productos
        Producto hamburguesa =
                new Producto(1, "Hamburguesa", 3500);

        Producto jugo =
                new Producto(2, "Jugo natural", 1200);

        Producto casado =
                new Producto(3, "Casado", 4000);

        // Crear mesas
        Mesa mesa1 = new Mesa(1);
        Mesa mesa2 = new Mesa(2);

        // Agregación:
        // Los productos y las mesas se crean
        // independientemente del Restaurante.

        System.out.println(
                restaurante.registrarProducto(hamburguesa)
        );

        System.out.println(
                restaurante.registrarProducto(jugo)
        );

        System.out.println(
                restaurante.registrarProducto(casado)
        );

        System.out.println(
                restaurante.registrarMesa(mesa1)
        );

        System.out.println(
                restaurante.registrarMesa(mesa2)
        );

        restaurante.mostrarCatalogo();

        // Crear primer pedido
        mesa1.ocuparMesa();

        Pedido pedido1 = new Pedido(101, mesa1);

        System.out.println(
                pedido1.agregarProducto(hamburguesa, 2)
        );

        System.out.println(
                pedido1.agregarProducto(jugo, 1)
        );

        // Probar cantidad no válida
        System.out.println(
                pedido1.agregarProducto(casado, 0)
        );

        System.out.println(
                restaurante.registrarPedido(pedido1)
        );

        // Crear segundo pedido
        mesa2.ocuparMesa();

        Pedido pedido2 = new Pedido(102, mesa2);

        System.out.println(
                pedido2.agregarProducto(casado, 1)
        );

        System.out.println(
                restaurante.registrarPedido(pedido2)
        );

        // Mostrar mesas y pedidos
        restaurante.mostrarMesas();
        restaurante.mostrarPedidos();

        // Dependencia:
        // Restaurante utiliza ImpresoraRecibos.
        ImpresoraRecibos impresora =
                new ImpresoraRecibos();

        restaurante.imprimirRecibo(pedido1, impresora);

        // Pruebas de verificación
        System.out.println("===== VERIFICACIÓN =====");

        System.out.println(
                "Detalles del pedido 101: "
                        + pedido1.getCantidadDetalles()
        );

        System.out.println(
                "Total esperado pedido 101: ₡8200.0"
        );

        System.out.println(
                "Total obtenido pedido 101: ₡"
                        + pedido1.calcularTotal()
        );

        System.out.println(
                "Total esperado pedido 102: ₡4000.0"
        );

        System.out.println(
                "Total obtenido pedido 102: ₡"
                        + pedido2.calcularTotal()
        );

        // Liberar mesa
        mesa1.liberarMesa();

        System.out.println(
                "Estado final de mesa 1: " + mesa1
        );
    }
}
