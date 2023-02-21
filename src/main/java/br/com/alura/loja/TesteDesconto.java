package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {
    public static void main(String[] args) {
        ItemOrcamento item1 = new ItemOrcamento(new BigDecimal("1000"));
        ItemOrcamento item2 = new ItemOrcamento(new BigDecimal("300"));

        Orcamento primeiro = new Orcamento();
        primeiro.addItem(item1);

        Orcamento segundo = new Orcamento();
        segundo.addItem(item2);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
    }
}
