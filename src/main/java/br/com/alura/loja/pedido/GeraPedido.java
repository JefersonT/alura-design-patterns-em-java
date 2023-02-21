package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Getter
public class GeraPedido {
    private String cliente;
    private List<ItemOrcamento> itens;

    public void executa(){
        Orcamento orcamento = new Orcamento();
        this.itens.forEach(itemOrcamento -> orcamento.addItem(itemOrcamento));

        Pedido pedido = new Pedido(this.cliente, LocalDate.now(), orcamento);

        System.out.println("Salvar pedido no Banco de Dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}
