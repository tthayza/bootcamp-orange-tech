package edu.thayza.exercicios_loops;

import java.util.Scanner;

// 🔸Maior e Média:
// Faça um programa que leia 5 números e
// informe o maior número e a média desses números.

public class MaiorMedia {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numero;
    int contador = 0;
    int maior = 0;
    int media = 0;
    do {
      System.out.println("Informe o número: ");
      numero = scan.nextInt();
      media = media + numero;
      if (numero > maior)  maior = numero;
      contador++;
    } while(contador < 5);
    media = media / 5;

    System.out.println("O número maior é " + maior);
    System.out.println("A média dos números é: " + media);

  }

}
