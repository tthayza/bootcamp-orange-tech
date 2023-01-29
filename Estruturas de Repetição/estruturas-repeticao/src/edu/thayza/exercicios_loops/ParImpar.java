package edu.thayza.exercicios_loops;

import java.util.Scanner;

public class ParImpar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int qtdNumeros;
    int qtdPares , int qtdImpares = 0;
    int numero;
    int contador = 0;

    System.out.println("Informe a quantidade de números:");
    qtdNumeros = scan.nextInt();
    do {
      System.out.println("Informe o número:");
      numero = scan.nextInt();
      if (numero % 2 == 0)
        qtdPares++;
      else
        qtdImpares++;
      contador++;
    } while (contador < qtdNumeros);
    System.out.println("Quantidade de Pares: " + qtdPares);
    System.out.println("Quantidade de Impares: " + qtdImpares);
  }

}
