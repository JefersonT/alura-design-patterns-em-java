package br.com.alura.loja.orcamento;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.Finalizado;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;
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

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }

    public boolean isFinalizado() {
        return situacao instanceof Finalizado;
    }
}
