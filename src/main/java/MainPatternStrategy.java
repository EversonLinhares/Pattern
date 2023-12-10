import ExemplosStrategyPattern.CarrinhoDeCompras;
import ExemplosStrategyPattern.EstrategiaBoleto;
import ExemplosStrategyPattern.EstrategiaCartaoCredito;
import ExemplosStrategyPattern.Item;

public class MainPatternStrategy {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        Item item1 = new Item("a", 35);
        Item item2 = new Item("b", 44);

        carrinhoDeCompras.addItem(item1);
        carrinhoDeCompras.addItem(item2);

        carrinhoDeCompras.pagar(new EstrategiaBoleto("10-12-2023"));
        carrinhoDeCompras.pagar(new EstrategiaCartaoCredito(
                "Everson", "123456789", "123","10-12-2023"));
    }

}
