package br.com.alura.loja;

import br.com.alura.loja.imposto.*;
import br.com.alura.loja.orcamento.Orcamento;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class TesteImposto {

	public static void main(String[] args) {
//		SpringApplication.run(MainApplication.class, args);
		Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 1);
		CalcularoraDeImpostos calcularora = new CalcularoraDeImpostos();
		ICMS icms = new ICMS();
		ISS iss = new ISS();

		System.out.println(calcularora.calcular(orcamento, icms));
		System.out.println(calcularora.calcular(orcamento, iss));
	}

}
