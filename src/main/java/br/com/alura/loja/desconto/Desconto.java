package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public abstract class Desconto {
    protected Desconto proximo;

    public abstract BigDecimal calcular (Orcamento orcamento);

}
