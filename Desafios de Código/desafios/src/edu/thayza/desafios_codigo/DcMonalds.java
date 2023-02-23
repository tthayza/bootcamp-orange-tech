package edu.thayza.desafios_codigo;

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.
// - O método .split() quebra uma String em várias substrings a partir de um caracter definido por você e coloca em um array.

import java.util.Scanner;

public class DcMonalds {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = ingredientes.split(";");

        for (String string : listaIngredientes) {
          System.out.println(string);
        }


    }
}