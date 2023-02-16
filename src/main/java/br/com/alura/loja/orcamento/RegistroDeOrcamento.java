package br.com.alura.loja.orcamento;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;
import lombok.AllArgsConstructor;

import java.util.Map;

@AllArgsConstructor
public class RegistroDeOrcamento {

    private HttpAdapter http;

    public void registrar(Orcamento orcamento) {
        if (!orcamento.isFinalizado()){
            throw new DomainException("Orçamento não foi Finalizado!");
        }
        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeDeItems()
        );
        http.post(url, dados);
    }

}
