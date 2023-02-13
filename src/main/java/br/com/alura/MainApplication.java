package br.com.alura;

import br.com.alura.loja.imposto.*;
import br.com.alura.loja.orcamento.Orcamento;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
//		SpringApplication.run(MainApplication.class, args);
		Orcamento orcamento = new Orcamento(new BigDecimal("1000"));
		CalcularoraDeImpostos calcularora = new CalcularoraDeImpostos();
		ICMS icms = new ICMS();
		ISS iss = new ISS();

		System.out.println(calcularora.calcular(orcamento, icms));
		System.out.println(calcularora.calcular(orcamento, iss));
	}

}
