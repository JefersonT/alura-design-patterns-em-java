package br.com.alura.loja;

import br.com.alura.loja.imposto.CalcularoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class TesteImposto {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento();
		orcamento.addItem(new ItemOrcamento(new BigDecimal("1000")));
		CalcularoraDeImpostos calcularora = new CalcularoraDeImpostos();


		System.out.println(calcularora.calcular(orcamento, new ISS(new ICMS(null))));
	}

}
