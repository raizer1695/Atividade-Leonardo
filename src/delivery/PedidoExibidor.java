package delivery;
public class PedidoExibidor {

    public void exibir(Pedido pedido) {

        System.out.println("----- PEDIDO -----");
        System.out.println("Número: " + pedido.getNumero());
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Descrição: " + pedido.getDescricao());
        System.out.printf("Valor: R$ %.2f%n", pedido.getValor());

    }
}

