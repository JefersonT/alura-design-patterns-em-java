package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento();
        dados.getItens().forEach(itemOrcamento -> orcamento.addItem(itemOrcamento));

        Pedido pedido = new Pedido(dados.getCliente(), LocalDate.now(), orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));
    }
}
