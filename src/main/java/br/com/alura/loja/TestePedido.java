package br.com.alura.loja;

import br.com.alura.loja.acao.EnviarEmailPedido;
import br.com.alura.loja.acao.SalvarPedidoNoBancoDeDados;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.LogPedido;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestePedido {
    public static void main(String[] args) {
        String cliente = "Antonia Maria";
        List<ItemOrcamento> itens = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            itens.add(new ItemOrcamento(new BigDecimal("500")));
        }


        GeraPedido gerador = new GeraPedido(cliente, itens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido(), new LogPedido())
        );
        handler.execute(gerador);
    }
}
