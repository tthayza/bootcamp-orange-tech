<h1 align="center"><strong>PRINCIPAIS PROTOCOLOS DE COMUNICAÇÃO DA INTERNET</strong></h1>


<p align="center">Clientes, servidores e APIS se comunicam através de um protocolo de comunicação e este protocolo é responsável por reger a comunicação e determinar o comportamento dessas partes.</p>

<br>

###  __FUNCIONAMENTO DO PROTOCOLO HTTP__
#### _HyperText Transfer Protocol_- transferência de hiper texto.
#### Determina como cliente e servidor irão se comunicar. De modo que, o _browser_ implementa o cliente HTTP, o servidor hospeda os objetos e recursos que o cliente solicita, cliente requisita recursos para consumo e o servidor responde utilizando o protocolo TCP.


### __TCP__

#### É o protocolo de camada de transporte que oferece controle de fluxo entre servidor e cliente, permitindo dois tipos de comunicação:
#### - Persistente: uma vez que a conexão é estabelecida, só se encerra a partir de uma ação de encerramento.
#### - Não Persistente:  uma vez que o que foi pedido foi recebido, a comunicação é encerrada, ou seja, não detecta redundâncias.


<br>

#### Os dados recebidos podem ser mapeados ou organizados e os dois formatos mais utilizados são XML através de _tags_, e _json_ como objetos.
#### A estrutura organizacional de dados tem como intuito, armazenar, transmitir e reconstruir esses dados, tanto no envio quanto no recebimento. São de fácil compreensão, há uma ordem hierárquica que estrutura dependências entre variáveis e valores. São independentes de linguagens de programação.
#### __XML__
- Contém metadados;
- Seu visual se assemelha ao HTML;
- Faz utilização de tags.
#### __JSON__
- É baseado na sintaxe do javascript;
- É _lightweight_ (sintaxe mais leve e legível);
- Sua estrutura se baseia em dicionário, organizando-se por chave e valor e permite utilização de _arrays_.

#

### __MENSAGENS HTTP - Request e Response__
#### Seu conteúdo de texto é escrito em ASCII. A estrutura da _Request_ é constituída por:
#### __ESTRUTURA REQUEST__
- __Request Line__ que contém o método, nome da url e versão;
- __Header Line__ contém o host no qual se localiza o endereço, tipo de conexão, user-agent é o agente que realiza a requisição, sendo o browser e sua versão, accept é o tipo de informação em que o recebimento é aceito, accept-language é um campo que define a linguagem adotada por parte do cliente, accept-encoding se refere a comunicação que é aceita.

#### __ESTRUTURA DE RESPONSE__
- __Status line:__ que define versão, status code e status da mensagem.
- __Header Line:__
  - Conexão: que pode ser persistente ou não.
  - Dados da mensagem: servidor, data, última modificação.
- __Entity Body:__
  - _Content-Type_ que é o tipo de conteúdo que está recebendo.
  - _Content-Lenght_ define o tamanho do conteúdo.

<br>

#### __Alguns dos exemplos de Status Code__
- 200 OK: request bem sucedida e objeto enviado;
- 301: Moved Permanently: objeto realocado em nova url;
- 400: Bad Request: servidor não compreendeu a mensagem (resposta genérica);
- 404 Not Found: documento solicitado é inexistente;
- 505 HTTP Version Not Supported: versão do protocolo nao suportada pelo servidor;

### __Classificação dos _Status Code_:__
- _Information response:_ 100-199
- _Sucessfull response:_ 200-299
- _Redirection response:_ 300-399
- _Client error response:_ 400-499
- _Server error response:_ 500-599


### __Algumas requisições que podem ser efetuadas:__

- GET: solicita recurso;
- HEAD: get sem corpo de resposta;
- POST: submete uma entidade a um recurso;
- PUT: substituiçao parcial de recursos por dados de request;
- DELETE: remove um recurso;
- TRACE: chama loop-back a um recurso, ótimo para diagnótisco da rede;
- OPTION: retorna quais as opções de comunicação c/ recurso;
- CONNECT: faz tunelamento identificado pelo recurso entre cliente e servidor;
- PATCH: modifica parcialmente.

#

### __PAPEL DOS COOKIES E CACHE__

#### Cookies são necessários para rastrear as informações do cliente, compostos por pequenos blocos de dados criados e utilizados pelo servidor para persistir dados no dispositivo do cliente. Através de coleta de informações podem acabar se tornando invasivos por essa prática, e por isso é solicitado o consentimento do usuário devido a LGPD (Lei Geral de Proteção aos Dados Pessoais). Mas podem ter diferentes tipos, como por exemplo:

#### __Cookies de Sessão:__ A partir do momento que a sessão se encerra, são deletados.

#### __Cookies de Persistentes:__ São mantidos por muito tempo dentro do computador, alguns exemplo são _login_ ativo, carrinho de _ecommerce_.

#

### __WEB CACHE__
#### Também chamado de __proxy server__ por se tratar de um intermediário, que checa se as informações que foram requisitadas existem e faz a comparação do que é requisitado e do que está guardado. A comunicação é feita da seguinte forma: o usuário envia ao _proxy_ (que nesse momento, entende-se como servidor), o proxy verifica e faz atualização se necessário e reenvia ao cliente. Caso o _proxy_ não possua determinada informação, ele envia essa requisição ao HTTP _server_ (e nesse momento, o _proxy_ é cliente). Isso resulta em algumas vantagens, como: redução do tráfego e redução no tempo de resposta.

#

### __HTTP 2.0__
#### Atualizações do protocolo:

- Única conexão persistentes, com envio de _streams_ dentro dessa conexão principal.
- Compressão do _Header_, segmentando data e header ainda contém a compressão e reutilização.
- PUSH, lado em que o servidor impõe ao cliente dado uma determinada requisição, mas necessita que o cliente tenha suporte habilitado.
- HTTPS por padrão.
- Negociação no _handshake_.


