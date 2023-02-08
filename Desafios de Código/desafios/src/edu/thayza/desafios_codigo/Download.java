package edu.thayza.desafios_codigo;

import java.util.Scanner;

public class Download {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();

        // TODO: Crie a condição necessária para que, de acordo com o tamanho, seja printado no console barras representando o download

        for (int i=0; i < tamanho; i++) {
          System.out.print("/" + "");
        }

    }
}
