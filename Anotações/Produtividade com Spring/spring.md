<h1 align="center"><strong>SPRING FRAMEWORK</h1></strong>

### FUNDAMENTOS
#### É um framework open source para a plataforma Java baseado nos padrões de projetos de inversão de controle que atribui responsabilidade a um container e através da injeção de independência adquirindo os recursos necessários para aplicação. Sua estrutura é composta por módulos, existindo módulos específicos para cada uma das funcionalidades da aplicação desenvolvida.

- __Módulo Core Container__
  - Iniciação é feita através de seu contexto;
  - Com a criação de beans - objetos gerenciados pelo container - temos baixa dependência e acoplamento nas aplicações.
  - É possível integrar com banco de dados com o JDBC.
  - Composição com a Web através de Servlet ou web, conforme o padrão Spring.

#### Um container é inicializado já para obter instâncias, configurações necessárias para que com a inversão de controle não seja necessário mais haver responsabilidade no gerenciamento de objetos, mas sim que o container assuma tais funções como: instanciação, gerenciamento de recursos, alocação na memória e objetos existentes na aplicação.

#### Ao iniciar uma aplicação, o container é carregado e todos os objetos que precisarem existir, já estarão no container. E quando for necessário usar algum objeto, requista-se ao container suas respectivas instâncias.

#

### __SPRING X JAVA EE__
#### Spring surgiu a partir da verbosidade do JAVA EE, visto que era necessário maior flexibilidade e atualizações mais recorrentes. Porém, JAVA EE não deixou de ser requisitado em aplicações. Mas hoje em dia, tanto Spring quanto Java EE possuem inúmeras _features_ essenciais para um ambiente corporativo, a depender da metodologia e filosofia corporativa.

- __Inversão de Controle - Inversion of Control ou IoC__
   - Se refere ao redirecionamento do fluxo de execução de um código retirando parcialmente o controle sobre ele e delegando-o para um container.
   - O principal propósito é minimizar o acoplamento do código.

- __Injeção de Dependências__
  - É um padrão de desenvolvimento com o objetivo de manter o baixo nível de acoplamento entre os módulos de um sistema.
  - Através da IoC, é possível injetar uma especificação para interfaces.

### __Escopos__
#### Existem 5 tipos de escopos, caracterizados por __Stand Alone__ e __conceitos HTTP__.

- __STAND ALONE__
  - __Singleton__
  - Um único objeto sendo compartilhado por toda aplicação quando solicitado.
  - __Prototype__
  - Criado uma nova instância a cada requisição de um objeto/referência ao container, para não inferir mudança na estrutura do objeto.
  #### Exemplo:
  ~~~java
  @Scope("prototype")
  ~~~



- __HTTP__
  - __Request__ - Um bean será criado para cada requisição HTTP, os objetos existirão enquanto a requisição estiver em execução.
  - __Session__ - Um bean será criado para cada sessão de usuário. Precisa acessar a mesma solicitação duas vezes para testar os escopos específicos da web.
  - __Global__ - Ou Application Scope, cria um bean para o ciclo de vida do contexto da aplicação. Objetos compartilhados por toda a aplicação.

### __Autowired__
#### É uma indicação de onde deverá ocorrer uma injeção automática de dependência. É possível buscar por meio de:
- __byName:__ busca um método set que corresponde ao nome do bean.
- __bytType:__ no qual é considerado o tipo da classe para inclusão do bean.
- __byConstrutor:__ usa-se o construtor para incluir a dependência.

#

### __Springboot__
#### É focado na configuração automática, produtividade, padrões de estruturação de projetos.

__Starters:__ São descritores de dependências, que trazem alguns benefícios como: coesão, versões compatíveis, ótimização do tempo, configuração simples, foco no negócio.

  - __Mais utilizados:__
    - data-jpa: integração ao banco de dados via JPA - Hibernate
    - data-mongodb: interação com banco de dados MongoDB
    - web: inclusão do container Tomcat para aplicações REST.
    - web-services: Webservices baseados na arquitetura SOAP.
    - batch: implementação de JOBs de processos.
    - test: disponibilicação de recursos para testes unitários como JUnit.
    - openfeign: Client HTTP baseado em interfaces.
    - actuator: Gerennciamento de monitoramento da aplicação.

### __BEANS X COMPONENT__
#### Sabendo que são anotações de iniciação de objetos, quando cada um deve ser usado?

__Component:__ quando os objetos serão scanneados na aplicação, quando se tem acesso ao código-fonte.
__Bean:__ quando se refere a um classe externa, e seria interessante implementar a construção dessa classe, como o CommandLineRunner por exemplo.


### __PROPERTIES VALUE__
#### Nem todas as atribuições precisam ser explícitas de forma declarativa no código-fonte. Determinados valores podem estar centralizados no arquivo '```application.properties```' que pode manter estados, informações da aplicação, propriedades que são garantidos que não haverão alterações de seus valores no decorrer da execução.

#

### __Java Persistence API - ou JPA__

__- Conceito de ORM e JPA__
    - ORM - _Object-Relational Mapping_, em português é um mapeamento de um objeto-relacional. É utilizado como um recurso para aproximar o paradigma de Orientação a Objetos ao contexto de Banco de Dados relacional. O uso é realizado através do mapeamento do objeto para uma tabela por uma biblioteca ou framework.

    - JPA é uma especificação baseada em interfaces, que através de um framework realiza operações de persistência de objetos em Java. Entendido como somente um descritor, mas é configurado para que promova um mecanismo de interação com o banco de dados, um desses framework pode ser o Hibernate.

### __EntityManager__
#### É capaz de realizar todas as operações CRUDs, incluindo seleções.

### __Mapeamento__

- É imprescíndivel que a classe tenha uma __identificação__;
- É necessário que através os atributos realizem __definições__, muito associadas ao DDL;
- Aplicação de __relacionamento__ entre as entidades, que é uma representação da relação entre tabelas;
- Utilizando __herança__ dentro da estrutura de aplicação, para manutenção da compatilidade estrutural com o BD;
- Determinadas anotações realizam __persistências__, com isso é possível a definição de dados sem explicitação.




