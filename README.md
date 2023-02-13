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

Para saber mais sobre a parte teórica deste padrão, e analisar diferentes implementações, você pode conferir este link:

https://refactoring.guru/design-patterns/chain-of-responsibility.

Nesta aula, aprendemos:
- A diferenciar casos onde padrões semelhantes podem ser aplicados;
- Como criar uma cadeia de possíveis algoritmos como **Chain of Responsibility**;
- A utilizar o padrão para aplicar um desconto dentro de uma cadeia de possíveis descontos.

## AULA 03. Template Method
As aplicações do padrão **Template Method** são muitas, mas além de entender a parte prática, é muito importante ler sobre a teoria por trás do padrão.

Para entendê-lo melhor, você pode conferir este link: https://refactoring.guru/design-patterns/template-method.

Nesta aula, aprendemos:

- Reforçamos a ideia de que repetição de código é problemática;
- Criamos um template de algoritmo que estava sendo replicado em mais de uma classe e utilizamos herança para reaproveitar esse código:
  - Aprendemos que a esta técnica foi dado o nome de **Template Method**;
- Vimos que é possível aplicar mais de um padrão no mesmo código.

## AULA 04. State
Para que você entenda melhor como aplicar o padrão **State** em outras situações, é interessante conhecer toda sua parte teórica, como motivação, aplicações, etc.

Para isso, você pode conferir este link: https://refactoring.guru/design-patterns/state.

Nesta aula, aprendemos:

- Que é possível que um objeto se comporte de formas diferentes, dependendo do seu estado;
- Que, se o resultado de uma chamada de método depende do estado, podemos delegar esta ação para uma classe específica do estado atual:
  - Aprendemos que a esta técnica foi dado o nome de **State**.

[//]: # (## AULA 05.)

[//]: # (## AULA 06. )
