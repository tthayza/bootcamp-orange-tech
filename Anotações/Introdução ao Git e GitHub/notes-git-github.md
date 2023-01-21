#   • __Introdução ao Git e GitHub__ •
##### (anotações feitas com base nas aulas do Bootcamp Orange Tech+ Backend da DIO)
#



## __Mas, o que é GIT? E o que é GitHub__
### Trata-se de um sistema de versionamento de código, que foi criado pelo Linus Torvalds, conhecido por desenvolver o Linux.
### Já o GitHub trata-se de uma plataforma que hospeda o controle de versão do GIT, por exemplo, fazendo a hospedagem do código fonte.

#


## __GIT *por baixo dos panos*__
### Funciona através de objetos, sendo os seguintes:
- __BLOBS__ *(ou bolhas)*: contém metadados, do tipo objeto e possuem um tamanho.
- __TREES__ *(ou árvores)*: fazem o armazenamento e apontam para *blobs* distintas ou outras *trees* e também commits, além de guardarem nomes de arquivos.
- __COMMIT__ : aponta para *tree*, último commit, autor, mensagem, data/hora.
- Além disso, vale ressaltar que SHA1 é um código de 40 caracteres e identifica e representa de maneira curta cada arquivo.
#

## __Alguns Comandos Importantes__
- __git init__ : inicializa um repositório;
- __git add__ : adiciona arquivos para a *staged area*;
- __git commit__ : faz o commit;
- __git pull__ : "traz" o código do repositório remoto para o repositório local;
- __git push__ : "empurra" o código do repositório local para o repositório remoto;
- __git status__ : verifica estados (arquivos/diretórios);
- __git log__ : exibe histórico;
- __git clone__ : faz o clone do repositório remoto;
- __git branch__ : lista as branches.
#
## __Estados de arquivos__

- __Untraked__ : estado que se estabelece quando não há arquivos adicionados ao Git;
- __Unmodified__ : estado em que não há nenhuma alteração, se comparado ao último commit;
- __Modified__ : estado em que há alterações, se comparado ao último commit;
- __Staged ou Index__: estado em que se encontram arquivos commitados.



