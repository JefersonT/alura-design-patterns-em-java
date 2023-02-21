# Design Patterns em Java I: boas práticas de programação
## AULA 01. Strategy
Todos os padrões de projeto definidos pela Gang of Four (GoF) possuem uma motivação: resolver um problema recorrente.

O padrão Strategy pode ser utilizado quando há diversos possíveis algoritmos para uma ação (como calcular imposto, por exemplo). Nele, nós separamos cada um dos possíveis algoritmos em classes separadas. 

Todo padrão de projeto possui sua explicação teórica com motivação, aplicação, seus participantes, consequências, etc.

O livro **Padrões de Projeto - Soluções reutilizáveis de software orientado a objetos** é um catálogo para todos estes padrões, com todas as explicações necessárias.

Caso não possa (ou não queira) ler o livro, existem sites que resumem cada um dos padrões. Aqui está um que é bastante utilizado, já na página específica sobre o **Strategy**: https://refactoring.guru/design-patterns/strategy.

Nesta aula, aprendemos:
- Padrões de projeto são soluções genéricas para problemas recorrentes do desenvolvimento de software orientado a objetos;
- Existem três principais categorias de padrões de projeto:
  - Comportamentais (que serão vistos neste treinamento)
  - Estruturais
  - Criacionais
- Como diminuir a complexidade do nosso código, trocando múltiplas condicionais por classes:
  - Esta técnica é chamada de **Strategy**, que é um dos padrões de projeto

## AULA 02. Chin of Responsibility
Assim como qualquer outro conceito em computação, existe mais de uma forma de implementar o padrão de projeto **Chain of Responsibility**.

Para saber mais sobre a parte teórica deste padrão, e analisar diferentes implementações, você pode conferir este link: [Strategy](https://refactoring.guru/design-patterns/chain-of-responsibility).

Nesta aula, aprendemos:
- A diferenciar casos onde padrões semelhantes podem ser aplicados;
- Como criar uma cadeia de possíveis algoritmos como **Chain of Responsibility**;
- A utilizar o padrão para aplicar um desconto dentro de uma cadeia de possíveis descontos.

## AULA 03. Template Method
As aplicações do padrão **Template Method** são muitas, mas além de entender a parte prática, é muito importante ler sobre a teoria por trás do padrão.

Para entendê-lo melhor, você pode conferir este link: [Template Method](https://refactoring.guru/design-patterns/template-method).

Nesta aula, aprendemos:

- Reforçamos a ideia de que repetição de código é problemática;
- Criamos um template de algoritmo que estava sendo replicado em mais de uma classe e utilizamos herança para reaproveitar esse código:
  - Aprendemos que a esta técnica foi dado o nome de **Template Method**;
- Vimos que é possível aplicar mais de um padrão no mesmo código.

## AULA 04. State
Para que você entenda melhor como aplicar o padrão **State** em outras situações, é interessante conhecer toda sua parte teórica, como motivação, aplicações, etc.

Para isso, você pode conferir este link: [State](https://refactoring.guru/design-patterns/state).

Nesta aula, aprendemos:

- Que é possível que um objeto se comporte de formas diferentes, dependendo do seu estado;
- Que, se o resultado de uma chamada de método depende do estado, podemos delegar esta ação para uma classe específica do estado atual:
  - Aprendemos que a esta técnica foi dado o nome de **State**.

## AULA 05. Command
O padrão de projetos **Command** é, provavelmente, um dos que mais gera confusão, principalmente no mundo de desenvolvimento web em geral, já que alguns conceitos mais específicos pro mundo da web surgiram e são diferentes dos existentes em aplicações desktop.

Para você entender melhor sobre o padrão _Command_ "original" (definido no livro da **GoF**), você pode dar uma olhada nesse link: [Command](https://refactoring.guru/design-patterns/command).

Também é muito interessante o estudo de alguns padrões de arquitetura de software, como **Domain Driven Design** e **Clean Architecture**, pois você vai esbarrar no padrão de _Command Handlers_ (que foi aplicado de forma bem simples nesta aula).

Nesta aula, aprendemos:

- Que um caso de uso em nossa aplicação pode ter várias ações (salvar no banco, enviar e-mail, etc);
- Que um caso de uso deve ser extraído para uma classe específica, ao invés de estar no arquivo da CLI, controller ou algo do tipo;
- Que a técnica de extração do caso de uso para uma classe específica pode ser chamada de padrão Command;
- A diferença do padrão _Command_ da GoF para o padrão que utiliza _Command Handler_ (muito utilizado no padrão de arquitetura Domain Driven Design).

## AULA 06. Observer
O padrão **Observer** é comumente utilizado por diversas bibliotecas que trabalham com eventos. Muitas tecnologias em Java, como o Spring e o CDI, possuem componentes que nos auxiliam a trabalhar com eventos.

A forma como o padrão foi implementado aqui na aula é a mais simples e pura, mas existem diversas modificações que podem ser feitas.

Para entender mais sobre a teoria deste padrão, você pode conferir este link: [Observer](https://refactoring.guru/design-patterns/observer).

Nesta aula, aprendemos:

- Que deixar a implementação de todas as tarefas de um caso de uso da aplicação na mesma classe pode trazer problemas:
  - Dificuldade de manutenção;
  - Classes muito grandes e difíceis de ler;
  - Problemas quando precisar alterar a implementação de uma das tarefas.
- Que é mais interessante separar cada ação em uma classe separada;
- Como ligar um evento ocorrido com suas ações, através do padrão **Observer**.

# Design Patterns em Java II: Avançando nas boas práticas de programação
## AULA 01. Adapters para reutilizar dependências
Quando precisamos utilizar código legado ou código de componentes externos em nosso sistema, é muito comum não ter a interface (métodos públicos) batendo com o que a gente precisa, então nesses casos nós criamos **adapters**.

Esse padrão é muito simples e muito utilizado no dia a dia do desenvolvimento, então vale a pena a sua leitura com mais calma: [Adapter](https://refactoring.guru/design-patterns/adapter).

Nesta aula, aprendemos:

- Que padrões estruturais nos ajudam a relacionar diversas classes de forma organizada
- Que detalhes de infraestrutura devem ser abstraídos através de interfaces
- Como o padrão **_Adapter_** pode nos ajudar a trocar detalhes de infraestrutura, sem muitas dores de cabeça

## AULA 02. Mais de um imposto com Decorators
O padrão **_Decorator_** é muito poderoso e bastante comum de ser implementado, mas possui alguns detalhes importantes a serem observados, como o fato do _Decorator_ precisar possuir a mesma interface do objeto que ele está decorando.

Para entender melhor a teoria do padrão e estes detalhes, você pode conferir este link: [Decorator](https://refactoring.guru/design-patterns/decorator).

Nesta aula, aprendemos:

- Que é possível adicionar comportamento a classes em tempo de execução;
- A aplicar esse conhecimento para combinar impostos;
- Que comportamentos adicionados em tempo de execução são possíveis, através do padrão **_Decorator_**.

## AULA 03. Compondo orçamentos com Composite
É bastante comum nós precisarmos trabalhar com coleções de itens que podem ter mais de uma implementação. Se essa estrutura pode ser descrita como uma árvore (no modelo computacional), então o padrão **_Composite_** pode ser muito útil.

Para entender melhor os conceitos por trás do padrão, dá uma olhada nesse link: [Composite](https://refactoring.guru/design-patterns/composite).

Nesta aula, aprendemos:

- Por alto o que é uma representação de árvore;
- Como representar itens e orçamentos de forma semelhante;
- A percorrer a estrutura de árvores utilizando o padrão **_Composite_**.