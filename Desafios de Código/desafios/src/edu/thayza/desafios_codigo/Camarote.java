package edu.thayza.desafios_codigo;

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

public class Camarote {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();


        // TODO: Crie a condição necessária para verificar quais números, de acordo com o range de entrada, são ímpares.
        int pessoasNoCamarote = tamanhoDaFila%2 == 0 ? tamanhoDaFila/2 : (tamanhoDaFila/2 +1);
        System.out.println(pessoasNoCamarote + " pessoas no camarote");
    }
}