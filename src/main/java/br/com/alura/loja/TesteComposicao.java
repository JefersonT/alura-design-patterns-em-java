package br.com.alura.loja;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteComposicao {
    public static void main(String[] args) {
        Orcamento orcamentoAntigo = new Orcamento();
        orcamentoAntigo.addItem(new ItemOrcamento(new BigDecimal("500")));
        orcamentoAntigo.reprovar();

        Orcamento orcamentoNovo = new Orcamento();
        orcamentoNovo.addItem(new ItemOrcamento(new BigDecimal("1000")));
        orcamentoNovo.addItem(orcamentoAntigo);

        System.out.println(orcamentoNovo.getValor());
    }
}
