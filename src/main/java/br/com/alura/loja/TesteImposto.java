package br.com.alura.loja;

import br.com.alura.loja.imposto.*;
import br.com.alura.loja.orcamento.Orcamento;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class TesteImposto {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 1);
		CalcularoraDeImpostos calcularora = new CalcularoraDeImpostos();


		System.out.println(calcularora.calcular(orcamento, new ISS(new ICMS(null))));
	}

}
