package br.com.alura.loja.orcamento;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.Finalizado;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class Orcamento implements Orcavel{

    @Setter
    private SituacaoOrcamento situacao;
    private BigDecimal valor;
    private List<Orcavel> items;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.items = new ArrayList<>();
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

    public void addItem(Orcavel item) {
        this.items.add(item);
        this.valor = valor.add(item.getValor());
    }

    public int getQuantidadeDeItems() {
        return this.items.size();
    }
}
