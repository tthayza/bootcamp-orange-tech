package edu.thayza.exercicios_map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

public class ExemploEstados {
  public static void main(String[] args) {
    System.out.println("Crie um dicionário e relacione os estados e suas populações");
    Map<String, Integer> estados = new HashMap<>() {
      {
        put("PE", 9616621);
        put("AL", 3351543);
        put("CE", 9187103);
        put("RN", 3534265);
      }
    };
    System.out.print(estados.toString());

    System.out.println("Substitua a população do estado RN por 3534165");
    estados.put("RN", 3534165);
    System.out.println(estados);

    System.out.println("Confira se o estado PB está no dicionário, caso não, adicione PB 4039277");
    System.out.println(estados.containsKey("PB"));
    estados.put("PB", 4039277);
    System.out.println(estados);

    System.out.println("Exiba a população de PE: " + estados.get("PE"));

    System.out.println("Exiba todos os estados e suas populações na ordem que foi informado");

    Map<String, Integer> estados1 = new LinkedHashMap<>() {
      {
        put("PE", 9616621);
        put("AL", 3351543);
        put("CE", 9187103);
        put("RN", 3534265);
        put("PB", 4039277);
      }
    };

    System.out.println(estados1);

    System.out.println("Exiba os estados em ordem alfabética: ");
    Map<String, Integer> estados2 = new TreeMap<>(estados);
    System.out.println(estados2);

    Integer menorPopulacao = Collections.max(estados.values());
    Integer maiorPopulacao = Collections.min(estados.values());
    String estadoMenorPopulacao = "";
    String estadoMaiorPopulacao = "";
    for (Map.Entry<String, Integer> entry : estados.entrySet()) {
      if (entry.getValue().equals(maiorPopulacao))
        estadoMaiorPopulacao = entry.getKey();
      if (entry.getValue().equals(menorPopulacao))
        estadoMenorPopulacao = entry.getKey();
    }

    System.out.println("Exiba o estado com a menor população e sua quantidade: " + estadoMenorPopulacao + " - "
        + menorPopulacao);
    System.out.println("Exiba o estado com a maior população e sua quantidade: " + estadoMaiorPopulacao + " - "
        + maiorPopulacao);


    Iterator<Integer> iterator = estados.values().iterator();
    Integer soma = 0;
    while (iterator.hasNext()) {
      soma+= iterator.next();
    }

    System.out.println("Exiba a soma da população dos estados: " + soma);

    System.out.println("Exiba a média da população dos estados: " + soma/estados.size());

    System.out.println("Remova os estados com a população menor que 4.000.000");

    Iterator<Integer> iterator1 = estados.values().iterator();
    while(iterator1.hasNext()) {
      if (iterator1.next() <= 4000000) iterator1.remove();
    }

    System.out.println(estados);

    estados.clear();
    System.out.println("Apague o dicionário dos estados: " + estados);

    System.out.println("Confira se o dicionário está vazio: " + estados.isEmpty()
    );
  }


}
