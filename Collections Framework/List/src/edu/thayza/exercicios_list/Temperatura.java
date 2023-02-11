package edu.thayza.exercicios_list;

import java.util.ArrayList;
import java.util.List;

public class Temperatura {
  public static void main(String[] args) {
    List<Double> temperatura = new ArrayList<>();
    temperatura.add(35.4);
    temperatura.add(44.9);
    temperatura.add(70.4);
    temperatura.add(65.2);
    temperatura.add(34.0);
    temperatura.add(31.8);

    System.out.println(temperatura);
    double soma = 0;
    for (Double valor : temperatura) {
      soma +=valor;
    }
    double media = soma/temperatura.size();

    for (Double temp : temperatura) {
      int index = temperatura.indexOf(temp);

      List<String> resultado = new ArrayList<>();
      if (temp > media) {
        String mes;
        switch(index) {
          case 1:
            mes = "Janeiro";
          case 2:
            mes = "Fevereiro";
          case 3:
            mes = "Março";
          case 4:
            mes = "Abril";
          case 5:
            mes = "Maio";
          case 6:
            mes = "Junho";
        String indiceAtual = temp.toString()+" " +mes;
        resultado.add(indiceAtual);
        }

        }

      }

      }
    }

