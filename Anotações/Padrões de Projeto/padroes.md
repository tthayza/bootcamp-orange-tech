
<h3 align="center"><strong>PADRÕES DE PROJETO</strong></h3>

<p>São soluções consolidadas para problemas recorrentes no desenvolvimento e manutenção de software orientado a objetos.
São comumente classificados nas seguintes categorias: </p>

- Padrões Criacionais: Abstract Factory, Builder, Factory Method, Prototype, Singleton.
  - Possuem relação direta com alguma instanciação de um objeto ou criação de múltiplos objetos.

- Padrões Comportamentais: Chain of Responsibility, Iterator, Observer, Strategy, Template Method.
  - Se relaciona com a maneira estruturada inferir determinados comportamentos dentro da implementação de código.

- Padrões Estruturais: Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy.
  - Possuem por características fazer transformações de informações, ou até mesmo, orquestrar eventuais integrações e chamadas externas.

#

__Singleton__
<p>Permite a criação de uma única instância de uma classe e fornece modo para que seja recuperada.</p>

__Strategy__
<p>É um padrão de projeto que tem a função de simplicar a variação de determinados algoritmos a partir de uma mesma interface.</p>

__Facade__
<p>Sua essência é prover a interface que simplifique a integração entre subsistemas.</p>

#

__Explorando alguns padrões de projetos com Spring__
- Singleton: @Bean e @Autowired;
- Strategy: @Service e @Repository;
- Facade: construção de uma API REST com o objetivo de abstrair a complexidade das integrações Spring Data JPA, utilizando o h2 e ViaCep (Feign).
