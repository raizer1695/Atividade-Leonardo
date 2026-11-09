package delivery;
public class Hamburguer extends Produto {
    public Hamburguer(String nome, double preco) {
        super(nome, preco);
    }
    @Override
    public double calcularPreco() {
        return getPreco();

    }
}