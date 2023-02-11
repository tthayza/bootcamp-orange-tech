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

### __INTERFACE LIST__

~~~~java
java.util.List
~~~~

### Permite elementos duplicados e garante ordem de inserção.



#### __Vector__ - (sincronia) _threads_, refere-se a implementação thread safe.

#### __ArrayList__ - implementa somente Interface List. Deve ser usado onde mais operações de pesquisa são necessárias.

#### __LinkedList__ - implementa duas interfaces e deve ser usado onde mais operações de inserção e exclusão são necessárias.