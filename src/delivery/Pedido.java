package delivery;
public class Pedido {

    private int numero;
    private String cliente;
    private String descricao;
    private double valor;

    public Pedido(int numero, String cliente, String descricao, double valor) {
        this.numero = numero;
        this.cliente = cliente;
        this.descricao = descricao;
        this.valor = valor;
    }
    public int getNumero() { return numero; }
    public String getCliente() { return cliente; }
    public String getDescricao() { return descricao; }
    public double getValor() { return valor; }
}

