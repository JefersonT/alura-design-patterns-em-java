package br.com.alura.loja.orcamento;

import br.com.alura.loja.DomainException;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void emAnalise(Orcamento orcamento) {
        throw new DomainException("O oraçmento não pode ser aprovado!");
    }

    public void aprovar(Orcamento orcamento) {
        throw new DomainException("O oraçmento não pode ser aprovado!");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("O oraçmento não pode ser reprovado!");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("O oraçmento não pode ser finalizado!");
    }
}
