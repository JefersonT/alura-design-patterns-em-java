package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Pedido {
    private String cliente;
    private LocalDate dataPedido;
    private Orcamento orcamento;
}
