package ExemplosStrategyPattern;

import InterfacesStrategyPattern.EstrategiaPagamento;

public class EstrategiaCartaoCredito implements EstrategiaPagamento {

    private String nome;
    private String numeroCartao;
    private String cvc;
    private String DataVencimento;


    public EstrategiaCartaoCredito(String nome, String numeroCartao, String cvc, String dataVencimento) {
        this.nome = nome;
        this.numeroCartao = numeroCartao;
        this.cvc = cvc;
        this.DataVencimento = dataVencimento;
    }

    @Override
    public void pagar(int qtd) {
       System.out.println(qtd + " pagar com credito/debito cartão "+ this.nome);
    }
}
