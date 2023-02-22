package br.com.alura.loja;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.OrcamentoProxy;

import java.math.BigDecimal;

public class TesteProxy {
    public static void main(String[] args) {
        Orcamento orcamentoAntigo = new Orcamento();
        orcamentoAntigo.addItem(new ItemOrcamento(new BigDecimal("500")));
        orcamentoAntigo.reprovar();

        Orcamento orcamentoNovo = new Orcamento();
        orcamentoNovo.addItem(new ItemOrcamento(new BigDecimal("1000")));
        orcamentoNovo.addItem(orcamentoAntigo);

        OrcamentoProxy proxy = new OrcamentoProxy(orcamentoNovo);

        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
    }
}
