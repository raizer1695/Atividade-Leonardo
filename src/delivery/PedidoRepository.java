package delivery;
public class PedidoRepository {

    public void salvar(Pedido pedido) {
        System.out.println("Pedido " + pedido.getNumero() + " salvo com sucesso.");

    }
}