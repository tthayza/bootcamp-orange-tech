# __LÓGICA CONDICIONAL__

### Faz utilização de operadores relacionais e/ou lógicos para solucionar expressões e executar o código fonte.

#


## __Operadores Relacionais__
- Opera com no mínimo dois operandos
- __Similaridade:__ igual (__==__) ou diferente (__!=__)
- __Diferença:__ maior (__>__), maior ou igual (__<=__), menor (__<__) e maior igual (__<=__)

## __Operadores Lógicos__
- __Conjunção:__ é o mesmo que "e", todos os valores devem seguir o mesmo preceito. Representação: __&&__

- __Disjunção:__ signfica "ou", ou um ou outro valor deve estar de acordo com a condição relacionada. Representação: __| |__

- __Disjunção Exclusiva:__ Trata-se de quando ambos os operandos ou expressões são opostos. Representação: __^__

- __Negação:__ Tem como função inverter o valor em questão. Representação: __!__

#

## __Algumas curiosidades de operadores utilizados em baixo nível de uso raro__

### __Operadores Bitwise:__ Representado por (__&__ e __|__) Opera com os bits de números inteiros e não são operadores lógicos.

### __Operadores Shift:__ Pode ser representado pelos seguintes símbolos (__~__, __>>__, __>>>__, __<<__) e pode inverter os bits de um número, ou operar nos zeros à esquerda ou direta.


#

## __Controles de Fluxos__

### __Decisão:__ *if*, *if else*, *if else if*, *switch* e operador ternário.
### Estrutura que avalia uma condição booleana ou variável para destinar o fluxo da execução.
### __Operador Ternário:__ É muito semelhante ao *if* mas escrito em uma única linha. Deve ser escrito da seguinte forma:
#### ```<condiçao> ? <se for verdade, faz o que está aqui> : <se for falso faz o que está aqui>;```
### __*Switch*:__ Verifica os casos possíveis de uma determinada variável e possui um retorno padrão. Deve ser escrito da seguinte forma:


```
  switch (variavel) {
    case 1:
      faz isso aqui;
    case 2:
      faz o que está aqui;
    default:
      faz o que está aqui dentro;
```

#


## __Boas Práticas__
- Evitar usar *default* para cases genéricos.
- *Switch* é usado para valores exatos.


_________

