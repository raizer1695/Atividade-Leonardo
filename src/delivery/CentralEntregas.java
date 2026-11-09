package delivery;
public class CentralEntregas implements EntregaGerenciavel {
    @Override
    public void atualizarStatusEntrega(int numeroPedido, String status) {

        System.out.println("Entrega do pedido " + numeroPedido + ": " + status);

    }
}