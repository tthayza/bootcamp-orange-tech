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
    Double soma = 0d;
    for (Double valor : temperatura) {
      soma += valor;
    }
    Double media = soma / temperatura.size();

    List<String> resultado = new ArrayList<>();
    for (Double temp : temperatura) {
      int index = temperatura.indexOf(temp);
      if (temp > media) {
        String mes = "";
        switch (index) {
          case 1:
            mes = "Janeiro";
            break;
          case 2:
            mes = "Fevereiro";
            break;
          case 3:
            mes = "Março";
            break;
          case 4:
            mes = "Abril";
            break;
          case 5:
            mes = "Maio";
            break;
          case 6:
            mes = "Junho";
            break;
        }
        String indiceAtual = temp.toString() + " " + "-" + " " + mes;
        resultado.add(indiceAtual);
      }

    }
    System.out.print(resultado);
  }
}
