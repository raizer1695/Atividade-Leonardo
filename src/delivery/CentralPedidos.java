package delivery;
public class CentralPedidos implements PedidoGerenciavel {
    @Override
    public void criarPedido(Pedido pedido) {

        System.out.println("Pedido " + pedido.getNumero() + " criado.");

    }
}

