package delivery;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido(1, "João", "Pizza + Refrigerante", 49.90);
        new PedidoRepository().salvar(pedido);
        new PedidoExibidor().exibir(pedido);

        FormaPagamento pagamento = new PagamentoPix();
        pagamento.pagar(pedido.getValor());

        List<Produto> produtos = Arrays.asList(

                new Pizza("Pizza", 39.90),
                new Hamburguer("Hambúrguer", 25.00),
                new Bebida("Refrigerante", 7.00)
        );

        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + ": R$ "
                    + produto.calcularPreco());
        }
        new CentralPedidos().criarPedido(pedido);
        new CentralEntregas().atualizarStatusEntrega(1, "Saiu para entrega");
        new RelatorioPedidos().gerarRelatorio();

        ServicoNotificacao notificacao =
                new ServicoNotificacao(new NotificacaoWhatsApp());
        notificacao.notificar("11999999999", "Seu pedido está a caminho!");

    }
}