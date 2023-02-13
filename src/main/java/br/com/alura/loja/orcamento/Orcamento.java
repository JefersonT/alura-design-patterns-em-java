package br.com.alura.loja.orcamento;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
public class Orcamento {

    @Setter
    private SituacaoOrcamento situacao;
    private BigDecimal valor;
    private int quantidadeDeItems;

    public Orcamento(BigDecimal valor, int quantidadeDeItems) {
        this.valor = valor;
        this.quantidadeDeItems = quantidadeDeItems;
        this.situacao = new EmAnalise();
    }
}
