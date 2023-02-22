package br.com.alura.loja.orcamento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class ItemOrcamento implements Orcavel{
    private BigDecimal valor;
}
