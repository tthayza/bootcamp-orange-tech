package edu.thayza.exercicios_arrays;

import java.util.Random;

public class Ex4_Matriz {
  public static void main(String[] args) {
    Random random = new Random();
    int[][] matriz = new int[4][4];
    for (int linha=0; linha < matriz.length; linha++){
      for (int coluna=0 ; coluna < matriz[linha].length ; coluna++) {
        matriz[linha][coluna] = random.nextInt(9);
      }
    }
    System.out.println("Elementos da Matriz: ");
    for (int[] linha : matriz) {
      for (int coluna : linha) {
        System.out.print(coluna + " ");

      }
      System.out.println();
    }
  }
}
