package edu.thayza.exercicios_loops;

import java.util.Scanner;

public class Fatorial {
  public static void main(String[] args) {
    Scanner scan =  new Scanner(System.in);
    System.out.println("Informe o número: ");
    int numero = scan.nextInt();
    int multiplicacao = 1;


    System.out.println( );
    for (int i = numero; i > 0; i --) {
      multiplicacao = multiplicacao * i ;

    }
    System.out.println(numero + "! = " + multiplicacao);
  }

}
