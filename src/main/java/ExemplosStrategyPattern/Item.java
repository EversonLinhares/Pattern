package ExemplosStrategyPattern;

public class Item {

    private String upcCodigo;
    private int preco;

    public Item(String upcCodigo, int preco) {
        this.upcCodigo = upcCodigo;
        this.preco = preco;
    }

    public String getUpcCodigo() {
        return upcCodigo;
    }

    public int getPreco() {
        return preco;
    }

}
