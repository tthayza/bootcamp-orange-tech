package edu.thayza.desafios_codigo;

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

public class PontosNaCarteira {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();

        // TODO: Crie a condição necessária para verificar se os carros estão acima da velocidade
        // TODO2: Crie a condição para verificar se os motoristas receberão ou não pontos na carteira de habilitação
        if (velocidade > 80) {
            multas++;
        }
        String retorno = multas >= 3 ? " multas. Levou pontos na carteira" : " multas. Nao levou pontos na carteira";
        System.out.println(multas + retorno);
    }
}
