package ExemplosStrategyPattern;

import InterfacesStrategyPattern.EstrategiaPagamento;

public class EstrategiaBoleto implements EstrategiaPagamento {

    private String dataVencimento;

    public EstrategiaBoleto(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public void pagar(int qtd) {
        System.out.println(qtd + " pagar com boleto");
    }
}
