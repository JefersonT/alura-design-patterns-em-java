package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 2);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("300"), 7);
        CalculadoraDeDescontos descontos = new CalculadoraDeDescontos();

        System.out.println(descontos.calcular(orcamento));
        System.out.println(descontos.calcular(orcamento2));
    }
}
