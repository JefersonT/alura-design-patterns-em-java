package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@ToString
public class Pedido {
    private String cliente;
    private LocalDate dataPedido;
    private Orcamento orcamento;
}
