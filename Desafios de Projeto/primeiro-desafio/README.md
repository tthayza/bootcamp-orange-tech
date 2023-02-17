<h1 align="center"><strong> Abstraindo um Banco com Orientação a Objetos </strong></h1>


<p> Esse projeto está entre um dos desafios no Bootcamp e tem a proposta de fazer com que o dev desenvolva um projeto utilizando conceitos do paradigma de Programação Orientada a Objetos através de uma situação real, e o caso que escolhi para abstrair este paradigma, foi uma Instituição Bancária.
 Sendo assim, podemos trazer o banco para o mundo computacional, de maneira que sabemos que o banco possui contas e essas contas podem ser conta corrente, poupança, conjunta e entre outros tipos.
<p> Nesse projeto, foram criadas duas classes abstratas principais que são Banco e Conta, além da criação de classes "filhas" (Conta Conjunta, Conta Corrente e Conta Poupança) que herdam a classe "mãe" Conta.</p>

#

<h2><strong>Classe Banco</strong></h3>
<p><strong> MÉTODOS </strong></p>
<strong>Iniciação do Programa</strong>
<p>A função desse método é inicializar o programa <br> e encaminhar o usuário para os outros métodos.</p>
<strong>Abertura de Conta</strong>
<p> Tem como função recolher informações do cliente, solicitando dados <br>como nome do(s) titular(es) e o tipo de conta, gerando um número aleatório<br> de conta  e por fim, organizando essas informações para serem encaminhados <br>ao Map da classe Banco.</p>
<strong>Adicionar Contas</strong>
<p> Sua função é recolher os dados enviados pelo método 'Abertura de Contas', <br> transformando então, o número da conta em [key] do Map do Banco, e os <br> [values] (que são nome(s) do(s) titular(es) e tipo de conta) são um objeto Map.</p>
<strong>Encerrar Conta</strong>
<p> A função desse método tem como objetivo principal encerrar uma conta que <br>está no Map do Banco. Ou seja, faz a verificação se o número da conta está <br> presente no Map e exclui se estiver, caso não esteja é retornada uma mensagem <br> informando a situação.</p>

#

<h2><strong>Classe Conta</strong></h3>
<p><strong> MÉTODOS </strong></p>
<strong>Verificação do Titular</strong>
<p>A função desse método é inicializar o programa <br> e encaminhar o usuário para os outros métodos.</p>
<strong>Consulta Saldo</strong>
<p> Tem como função recolher informações do cliente, solicitando dados <br>como nome do(s) titular(es) e o tipo de conta, gerando um número aleatório<br> de conta  e por fim, organizando essas informações para serem encaminhados <br>ao Map da classe Banco.</p>
<strong>Efetua Saque</strong>
<p> Sua função é recolher os dados enviados pelo método 'Abertura de Contas', <br> transformando então, o número da conta em [key] do Map do Banco, e os <br> [values] (que são nome(s) do(s) titular(es) e tipo de conta) são um objeto Map.</p>


#

<h2><strong>Métodos das Classes Herdeiras</strong></h3>
<p>As classes herdadas de Conta são <strong>Conta Corrente, Conta Poupança e Conta Conjunta</strong> possuem os métodos sobreescritos da classe "mãe", porém a classe Conta Conjunta possui um complemento, sendo assim, ocorre a necessidade de sobrecarregar determinado método que solicita os dados do cliente, visto que uma conta conjunta possui dois titulares e não somente um.</p>

<br>

<strong>PARTICULARIDADES DE CADA CLASSE </strong>


<h4><strong> Conta Corrente </h4></strong>
<p>- possui todos os métodos sobreescritos da classe "mãe";</p>
<h4><strong> Conta Poupança </h4></strong>
<p>- somente possui o método de retorno do saldo da conta;</p>
<h4><strong> Conta Conjunta </h4></strong>
<p>- possui todos os métodos sobreescritos, e o método de abertura de conta sobrecarregado.</p>


