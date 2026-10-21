
public class ImpresoraRecibos {

    // Recibe un Pedido para mostrar su recibo.
    public void imprimirPedido(Pedido pedido) {

        if (pedido == null) {

            System.out.println("No hay pedido para imprimir.");

        } else {

            System.out.println("===== RECIBO =====");

            pedido.mostrarPedido();

            System.out.println("==================");
        }
    }
}
