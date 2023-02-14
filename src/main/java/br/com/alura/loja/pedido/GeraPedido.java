package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
public class GeraPedido {
    private String cliente;
    private BigDecimal valorPedido;
    private int quantidadeDeItens;

    public void executa(){
        Orcamento orcamento = new Orcamento(this.valorPedido, this.quantidadeDeItens);

        Pedido pedido = new Pedido(this.cliente, LocalDate.now(), orcamento);

        System.out.println("Salvar pedido no Banco de Dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}
