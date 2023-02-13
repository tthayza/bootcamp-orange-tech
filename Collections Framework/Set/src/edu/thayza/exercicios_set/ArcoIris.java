package edu.thayza.exercicios_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArcoIris {
  public static void main(String[] args) {
    List<String> cores = new ArrayList<>();
    cores.add("rosa");
    cores.add("verde");
    cores.add("violeta");
    cores.add("laranja");
    cores.add("vermelho");
    cores.add("azul");
    cores.add("amarelo");

    System.out.println("Exiba todas as cores uma embaixo da outra: ");
    for (String cor : cores) {
      System.out.println(cor);
    }

    System.out.println("A quantidade de cores do arco íris é " + cores.size());


    Collections.sort(cores);
    System.out.println("Exiba as cores em ordem alfabética: " + cores);

    Collections.reverse(cores);
    System.out.println("Exiba as cores na ordem inversa da que foi informada: " + cores);


    System.out.println("Exiba todas as cores que começam com a letra 'v': ");
    for (String cor : cores) {
      if (cor.charAt(0) == 'v') System.out.println(cor);
    }

    System.out.println("Remova todas as cores que não começam com a letra 'v': ");
    System.out.println(cores);
    List<String> novasCores = new ArrayList<>();
    for(int i = 0; i < cores.size(); i++) {
      String cor = cores.get(i);
      if (cor.charAt(0) != 'v') {
        novasCores.add(cor);
      }
    }
    cores = novasCores;
    System.out.println(cores);

    cores.clear();
    System.out.println("Limpe o conjunto: " + cores);

    System.out.println("Confira se o conjunto está vazio: " + cores.isEmpty());
    }

  }



