package edu.thayza.exercicios_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Perguntas {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    List<String> resposta = new ArrayList<>();

    System.out.print("Telefonou para a vítima: ");
    resposta.add(leitor.next());

    System.out.print("Esteve no local do crime: ");
    resposta.add(leitor.next());

    System.out.println("Mora perto da vítima: ");
    resposta.add(leitor.next());

    System.out.println("Devia para a vítima: ");
    resposta.add(leitor.next());

    System.out.println("Já trabalhou com a vítima: ");
    resposta.add(leitor.next());

    int qtdSim = 0;
    for (String indice : resposta) {
      if (indice.equalsIgnoreCase("S")) qtdSim+=1;
    }
    if (qtdSim == 2) System.out.println("Suspeita");
    else if (qtdSim == 3 | qtdSim == 4) System.out.println("Cúmplice");
    else if (qtdSim == 5) System.out.println("Assassina");
    else System.out.println("Inocente");

    leitor.close();
  }
}
