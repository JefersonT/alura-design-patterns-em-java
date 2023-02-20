package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public abstract class Imposto {

    protected Imposto outroImposto;

    abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular (Orcamento orcamento){
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorDoOutroImposto = BigDecimal.ZERO;
        if (outroImposto != null){
            valorDoOutroImposto = outroImposto.realizarCalculo(orcamento);
        }
        return valorImposto.add(valorDoOutroImposto);
        }
}
