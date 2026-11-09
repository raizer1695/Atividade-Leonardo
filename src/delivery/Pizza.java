package delivery;
public class Pizza extends Produto {

    public Pizza(String nome, double preco) {
        super(nome, preco);
    }
    @Override
    public double calcularPreco() {

        return getPreco();

    }
}