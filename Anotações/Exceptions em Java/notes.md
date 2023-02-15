<h1 align="center"><strong>TRATAMENTO DE EXCEÇÕES</strong></h1>

<p align="justify"><em>Exception</em> é um evento que interrompe o fluxo normal do processamento de uma classe.
As exceptions são herdadas da classe Throwable, e se referem a condições excepcionais que já foram checadas pelo compilador, ou seja, tratam-se de eventos recuperáveis. Exceptions são lançadas através de métodos ou objetos, e assim que lançadas necessitam do devido tratamento.</p>

<br>

<h2 ><strong> TIPOS DE EXCEPTIONS </strong></h2>

<p ><strong>Error:</strong> indica que há algum problema de recurso do programa, tornando impossível continuar sua execução.</p>

<p ><strong>Unchecked (runtime)</strong> exceções que podem ser evitadas se tratradas e analisadas.</p>

<p ><strong>Checked Exception </strong> exceções que devem ser evitadas e tratadas.</p>

<br>


<h2 ><strong>Mas, como esse tratamento pode ser feito?</strong></h2>

<p ><strong>try, catch, finally:</strong> cada uma dessas palavras, juntas, definem blocos para o tratamento de exceptions.</p>

<p ><strong>throws:</strong> indica que um método pode lançar uma ou várias exceções.</p>

<p ><strong>throw:</strong> lança explicitamente uma exception.</p>