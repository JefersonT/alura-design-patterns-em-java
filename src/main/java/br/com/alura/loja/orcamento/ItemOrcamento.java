package br.com.alura.loja.orcamento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@Setter
public class ItemOrcamento implements Orcavel{
    private BigDecimal valor;
}
