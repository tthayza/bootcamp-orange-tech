package edu.thayza.operadores;
public class Operadores {
    // public static void main(String[] args) throws Exception {
    //     String concatenacao = "?";
    //     concatenacao = 1+1+1+"1"; //31 fez a soma dos primeiros três numeros e concatenou o final //
    //     System.out.println(concatenacao);

    //     concatenacao = 1+"1"+1+1; // 1111 ao identificar a concatenação, o fez até o fim//
    //     concatenacao = 1 +"1"+1+"1"; // 1111 ao identificar a concatenaçao, o fez até o fim
    //     concatenacao = "1"+1+1+1; //1111 ao identificar o primeiro caractere concatenou tudo//
    //     concatenacao = "1"+ (1+1+1) //13, pois realizou primeiramente a operação em evidência nos parênteses e depois concatenou//

    // }

    // public static void main(String[] args) throws Exception{
    //     int numero = 5;
    //     numero = numero * -1;
    //     System.out.println(numero);

    // }

    // public static void main(String[] args) throws Exception{
    //     // regra de precedência e posterioridade, aplicado à regra de incremento e decremento//
    //     int numero = 1;

    //     //INCREMENTO//
    //     System.out.println(++numero); // dessa forma, o número é incrementado antes e printado depois//
    //     System.out.println(numero++); // dessa forma, o número é printado primeiro e depois incrementado//

    //     //DECREMENTO//
    //     System.out.println(--numero); // dessa forma, o número é decrementado antes e printado depois//
    //     System.out.println(numero--); // dessa forma, o número é printado primeiro e depois decrementado//

    // }

    // public static void main(String[] args) throws Exception{
    //     Boolean variavel = true;
    //     System.out.println(!variavel); // faz inversão no valor da variável, ou seja, nesse caso, a torna false (somente no print e nao na memoria//
    //     variavel = !variavel; // valor invertido agora registrado em memória//
    // }

        // OPERADOR TERNARIO//
    // public static void main(String[] args) throws Exception{
    //     int a = 5;
    //     int b = 5;
    //     // if (a==b)
    //     //     resultado = "verdadeiro";
    //     // else
    //     //     resultado = "falso";
    //     String resultado =  (a==b) ?  "verdadeiro" : "falso";
    //     System.out.println(resultado);
    //         }

    public static void main(String[] args) throws Exception{
    //   int numero1 = 5;
    //   int numero2 = 8;

    //   boolean simOuNao = numero1 == numero2;

    //   System.out.println("Numero 1 é igual ao numero 2? " + simOuNao);

    //   simOuNao = numero1 != numero2;

    //   System.out.println("Numero 1 é diferente do numero 2? " + simOuNao);

      // para comparar objetos ou textos, faz a comparação dos conteúdos//
    //   String nomeUm = "Thayza";
    //   String nomeDois = new String("Thayza");

    //   System.out.println(nomeUm.equals(nomeDois));

    // OPERADORES LÓGICOS //

    boolean condicao1 = true;
    boolean condicao2 = true;

    if (condicao1 && condicao2)
        System.out.println("as duas condiçoes sao verdadeiras");
    if (condicao1 || condicao2)
        System.out.println("uma das condiçoes é verdadeira");

    System.out.println("fim");


    }

}
