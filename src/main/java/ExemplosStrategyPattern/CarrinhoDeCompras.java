package ExemplosStrategyPattern;

import InterfacesStrategyPattern.EstrategiaPagamento;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> items;

    public CarrinhoDeCompras() {
        this.items = new ArrayList();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculaTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPreco();
        }
        return sum;
    }

    public void pagar(EstrategiaPagamento metodoPagamento){
        int qtd = calculaTotal();
        metodoPagamento.pagar(qtd);
    }
}
