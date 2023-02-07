# Métodos em Java

### ► __Criação__
#### Refere-se a um bloco de código, disponibilizado por uma classe e é executado quando é requisitado.

#

### ► __Definiçao e Utilização__
#### Sua estrutura é determinada como o exemplo abaixo:
```<visibilidade*> <tipo*> <modificador*> retorno nome (<parâmetros*>) <exceções*> corpo.```

#### Nos quais...
- __Visibilidade__: pode ser determinado por _public_, _protected_ ou _private_.
- __Tipo__: podendo ser concreto ou abstrato.
- __Modificador__: que pode ser _static_ ou _final_.
- __Retorno__: descrito por um tipo de dado ou _void_ (tipos primitivos ou não primitivos, como objeto ou classe)
- __Nome__: no qual o método deve ser identificado.
- __Parâmetro__: que tratam-se de argumentos que o método pode receber.
- __Exceções__: que podem ser lançadas a depender do problema ou contexto.
- __Corpo__: código que corresponde ao que o método deve fazer.


#### Para utilizar, os métodos devem ser chamados a partir de um objeto ou a partir de uma classe. Como, por exemplo:

~~~java
NomeDaClasse.nomeDoMetodo();
nomeDoObjeto.nomeDoMetodo();
~~~
#
### ► __Aplicação de Boas Práticas__
#### Seguir algumas boas práticas são excelentes para que outros colegas de trabalho possam utilizar seu código, gerar uma boa compreensão e facilitar para encontrar alguns _bugs_. Algumas destas são:
- Nomes bem descritivos e curtos;
- Uso de _Camelcase_;
- Códigos de corpo devem conter entre 80 a 120 linhas;
- Evitar lista de parâmetros longa;
- Visibilidades adequadas ao método.

#

### ► __Sobrecarga de Métodos__
#### Se refere à capacidade de definir métodos para contextos diferentes de acordo com a necessidade de utilizar determinado código, porém irá ter seu nome de origem preservado e a sua lista de parâmetros será alterada de seguindo o contexto atual.
<br>

### ► __Retornos__

#### Trata-se de uma instrução de interrupção e está associado fortemente a métodos. A partir do seu uso, o programa finaliza retornando algum tipo de dado ou não retornando nada, apenas finaliza (desde que não encontre erros anteriores).


