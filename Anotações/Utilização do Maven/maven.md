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

### Características do POM - _Project Object Model_
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
