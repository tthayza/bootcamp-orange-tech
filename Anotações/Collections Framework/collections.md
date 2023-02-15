# __COLLECTIONS FRAMEWORK__

### Se refere a um objeto que agrupa múltiplos elementos(variáveis primitivas ou objetos) dentro de uma única unidade. Possui como função armazenar e processar coleções de dados de forma eficiente.

#

### __► Composição__

  - Interfaces;
  - Implementações ou Classes;
  - Algoritmos;

#

### __► Hierarquia__

| Interface List | Interface Set | Interface Map |
|----------------|:-------------:|--------------:|
|    arrayList   |    HashSet    |    HashMap    |
|   LinkedList   | LinkedHashSet | LinkedHashMap |



#### __TreeSet e TreeMap__ são alguns métodos que se caracterizam por possuir uma estrutura de árvore binária.


#### __Vector e HashTable__ são _thread safe_.

#

### __► INTERFACE LIST__

~~~~java
java.util.List
~~~~

### Permite elementos duplicados e garante ordem de inserção.
<br>

### __IMPLEMENTAÇÕES__

#### __Vector__ - (sincronia) _threads_, refere-se a implementação _thread safe_.

#### __ArrayList__ - implementa somente _Interface List_. Deve ser usado onde mais operações de pesquisa são necessárias.

#### __LinkedList__ - implementa duas interfaces e deve ser usado onde mais operações de inserção e exclusão são necessárias.

#

### __► INTERFACE SET__
~~~java
java.util.Set
~~~

#### As principais características dessa interface são que não permite elementos duplicados, diferentemente da interface _List_ , não possui índice, além de não utilizar métodos _set_, _get_, _indexof_, e consequentemente, não há como fazer pesquisas.
<br>

### __IMPLEMENTAÇÕES__

#### __HashSet__ utiliza implementação _HashMap_ para armazenar elementos, não mantém a ordem dos elementos e permite no máximo um elemento _null_.

#### __LinkedHashSet__ utiliza implementação _LinkedHashMap_ para armazenar elementos, mantém a ordem de inserção dos elementos e permite no máximo um elemento _null_.

#### __TreeSet__ utiliza _TreeMap_ para armazenar elementos, é muito relevante em se tratando de ordenações, mantém por _default_ a ordem natural dos elementos e não permite nenhum elemento _null_.

#

### __► Interface Map__
#### Suas principais características são a organização de seu conteúdo, que são organizados em elementos únicos [_```key```_] para cada valor que podem ser repetidos [_```value```_]. Para utilizar esta interface, é necessário sobrescrever _hashcode_ e _equals_.
<br>

### __IMPLEMENTAÇÕES__

#### __HashTable__ (sincronia) _threads_, refere-se a implementação _thread safe_.

#### __TreeMap__ possui muita relevância na utilização em comparações e ordenações. Seus elementos se organizam de acordo com a ordem natural das chaves.

#### __HashMap__ suas iterações ocorrem de maneira aleatóriamente.

#### __LinkedHashMap__ suas iterações organizam-se de acordo com a inserção dos dados.

<br>

### __► JAVA Streams__

#### __Classe Anônima__ é uma classe que não recebeu um nome e é tanto declarado quanto instanciado em uma única instrução. Seu uso pode ser pensando no momento de precisar para criar uma classe que será instanciado apenas uma vez.

<br>

#### ___Functional Interface___ qualquer interface com um SAM (_Single Abstract Method_) é uma interface funcional e sua implementação pode ser tratada como expressões lambda.

<br>

#### ___Lambda Expressions___ se refere a uma função sem declaração e a ideia é que o método seja declarado no mesmo lugar em que será usado. Pode ser entendido visualmente como a simplificação de uma classe anônima. A estrutura é denominada como o exemplo abaixo:
~~~java
(argumento) -> (corpo)
~~~

<br>

#### ___Reference Method___ permite fazer referência a um método ou construtor de uma classe (de forma funcional) e assim indicar que ele deve ser utilizado em um ponto específico do código. Pode ser entendida como uma simplificação da _lambda expression_.
~~~java
NomeDaClasse :: nomeDoMétodo
~~~

<br>

#### ___Streams API___ tem como intuito facilitar a manipulação de _collections_ seguindo os princípios da programação funcional. Em conjunto com _lambda expressions_ oferece uma maneira simples e concisa de escrita de código, resultando em facilidade de manutenção e paralelização sem efeitos indesejados durante sua execução.

