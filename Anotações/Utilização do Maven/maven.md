<h1 align="center"><strong>Gerenciamento de Dependências e Build em Java com Maven</strong></h1>

### __O que é o Apache Maven?__
#### É uma ferramenta para gerenciar _build_ e dependências de um projeto. Pode auxiliar com o empacotamento da aplicação no formato desejado, compilar fontes e executar testes. Suas funções englobam endereçamento de como o software foi construído e suas dependências através do POM (_Project Object Model_), além de ser possível fornecer informações de qualidade, através de _plugins_ que possibilitam determinada verificação assegurando a qualidade do projeto.

#

### __Comandos que auxiliam o dia a dia utilizando Apache Maven__
- Para compilar o código: _compile_
- Para testar a aplicação: _test_
- Para empacotar o software: _package_
- Para limpar o diretório de trabalho: _clean_

#

### __Utilizando Maven Archetype para desenvolver diferentes projetos__
#### Se refere a um template que possibilita a personalização e a configuração de como um projeto será construído. Nesse tipo de arquivo, define-se versões de componentes, quais componentes serão inseridos automaticamente, organização de pacotes e arquivos.

#

### __Características do POM - _Project Object Model___
- É a unidade fundamental de trabalho do Apache Maven;
- Utiliza o formato xml;
- Está na raíz do projeto;
- Detalha o projeto, sua construção ou como _"buildar"_;
- Maven sempre procura pelo '```pom.xml```' para realizar sua execução.

#### Maven trabalha com conceito de herança, e esse conceito de herança extende-se para configurações do POM. Caso seja passado somente as informações básicas obrigatórias, as outras informações serão extendidas da superclasse POM, no qual possui um modelo-base onde possuem todas as configurações padrão pelas quais o Maven utiliza.

#

### __Repositórios__
#### Repositórios são locais onde podemos encontrar _plugins_ e bibliotecas que o Maven provê. Existem dois tipos: local e remoto.
#### __Repositório Remoto__
#### Local central utilizado pelo Maven para buscar os artefatos, e é configurado automaticamente pelo Super POM para utilizar o Maven Central, que é um site com diversas dependências.

- ___Configuração___ pode ser feita via pom.xml do projeto, utilizando as tags '```project```', '```repositories```', e a referência de repositório. Quando o Maven for executado, utilizará a configuração de repositório remoto.

- Para modificar a configuração global do Apache Maven utiliza-se um repositório remoto específico, a partir do ```settings.xml```, dentro da tag '```mirror```' podemos inferir o repositório que será utilizado globalmente pelo Maven.

#### __Repositório Local__
#### É utilizado na máquina local pelo Maven para buscar os artefatos, trata-se de uma estratégia de '_caching_' para evitar que todas as execuções do Maven localmente tenham que efetuar uma busca externa. Localiza-se na pasta __.m2\repository__.

#

### __Dependências__

### __Como adicionar dependências ao projeto__
#### Basta localizar o pom.xml na tag ```<dependencies>``` e especificar determinadas informações, como:
- groupId: É entendido como o id da organização. Segue as regras de nomes de pacotes em java.
- artifactiid: Refere-se ao nome do projeto.
- version: Trata-se do número da versão que será utilizada.

<br>

### __Tipos de dependências__
__Direta:__ declaradas no pom.xml

__Transitiva:__ são as dependências que o componente que está sendo utilizado também declarou e são obrigatórias para o mesmo.

### __O Problema de Dependências Transitivas__
#### Ocorre quando se busca a referência e inferindo a dependência desejada para utilização e recebe, como consequência, diversas outras dependências que aquele componente está utilizando. Sendo assim, podem haver artefatos que não seriam úteis para a aplicação e ocorrências com conflito de versão.

#

### __Escopos__
#### Maven trabalha com escopos, e os provê para evitar/limitar tal transitividade de dependências. São inseridos dentro da tag <dependency> através da tag <scope>.
__CLASSPATH__
#### Referência que a aplicação tem para o momento atual de execução. Maven divide em runtime, test e compile.
#### Há 6 tipos de escopos para utilizar:
- __Escopo Default - Compile__
  - Será utilizado como padrão caso não tenha sido inferido nenhum tipo de escopo nas dependências.
  - É uma dependência transitiva e está disponível em todos os _classpaths_.

- __Escopo Provided__
  - A dependência será fornecida em tempo de execução por uma implementação na JDK ou via container. Exemplos: Servlet API, Java EE APIs
  - A dependência com o escopo Provided é adicionado no _classpath_ usado para compilação (compile) e teste (test) mas não em runtime.
  - Além disso, não é transitiva.

 - __Escopo Runtime__
    - Indica que a dependência é necessária apenas para o momento de execução e não para compilação.
    - Maven inclui no _classpath_ dos escopos de runtime e test.

 - __Escopo Test__
    - É disponível somente para compilação e execução dos testes.
    - Não é transitivo.

- __Escopo System__
    - Semelhante ao escopo Provided, porém é necessário prover o JAR explicitamente, através da tag <systemPath> apontando o jar diretamente.
    - A dependência com esse escopo é adicionado no _classpath_ usado para compilação e teste mas não em runtime.
    - Não é transitiva.

- __Escopo Import__
    - É disponível apenas com uma dependência do tipo '```pom```' e com tag <dependencyManagement>.
    - Indica um processo de reutilizar dependências de um projeto.

#

### __DICAS: ESCOPOS, DEPENDÊNCIAS OPCIONAIS E EXCLUSÕES__

#### Para visualizar o ClassPath e construção pelo Maven, basta escrever nas linhas de comando:
~~~java
mvn dependency:build-classpath -DincludeScope=compile
mvn dependency:build-classpath -DincludeScope=teste
mvn dependency:build-classpath -DincludeScope=runtime
~~~

<br>

### __Dependências Opcionais__

#### Utilizado quando uma dependência não é necessária para os projetos que irão reutilizar seu componente. É necessário fazer uso da tag <optional> no componente.

<br>

### __Exclusões__

#### Utilizado quando o componente que é usado compartilha uma biblioteca já utilizada ou que não gostaria que estivesse disponível, para isso, é necessário inserir a tag <exclusions> e <exclusion> dentro de <dependency>.

#

### __MAVEN BUILD LIFECYCLE__
- Conceito de ciclo de vida de construção: Entendendo como se constrói um software, ou seja, estruturando a arquitetura, pacotes, mvn compile, executar testes e caminhar até a publicação. Isso se estende aos comandos oferecidos pela ferramenta.
- Composto por 3 ciclos de vida, sendo cada uma desses ciclos possuindo fases e cada fase possui um objetivo.

- Default Lifecycle
#### É o principal ciclo, responsável pelo deploy local, composto por 23 fases, a seguir principais fases/comandos:
    - validate;
    - compile;
    - test-compile: faz compilação de teste;
    - test: execução de testes;
    - integration-test: faz testes de integração;
    - package: empacota o software;
    - install: publica localmente;
    - deploy;

- Clean Lifecycle
#### É o ciclo intermediário que foi embutido para que o projeto fosse preparado para uma publicação, e é responsável pela limpeza do projeto. Constitui-se por 3 fases que são:
    - pre-clean;
    - clean: limpeza dos arquivos da pasta target e sua remoção.
    - post-clean;

- Site LifeCycle
#### É o momento de publicação do projeto, ou seja, é o ciclo final, responsável pela criação do site de documentação do projeto. Suas fases são as seguintes:
    - pre-site;
    - site;
    - post-site;
    - site-deploy;

#

### __Projetos Multi-módulos__
#### É a existência de um projeto agregrador que contém componentes internos, chamados de sub-módulos.

#

### __Plugins__
#### A maioria das funcionalidades são providas por plugins, são a estrutura central da qual o Maven foi construído. É um estilo arquitetural para extensibilidade, ou seja, é possível personalizar a execução e configuração do plugin de acordo com o cenário e necessidade da execução. São escritos prioritariamente em Java e disponibilizados como JARs.
__Para utilização, basta inserir: mvn [plugin-name]:[goal-name]__
#### __goal-name:__ tarefa na qual o plugin irá executar, pode conter mais de uma.

#### Configuração de um plugin deve ser sempre feita pela tag <build> seguida da tag <plugins> seguida da tag <plugin>.

