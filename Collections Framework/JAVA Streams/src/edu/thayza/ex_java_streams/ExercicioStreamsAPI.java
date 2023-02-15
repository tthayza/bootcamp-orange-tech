package edu.thayza.ex_java_streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class ExercicioStreamsAPI {
  public static void main(String[] args) {
    List<String> numeros = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
    System.out.println("Imprima todos os números da lista: ");
    numeros.forEach(s -> System.out.print(s + " "));

    System.out.println(" ");

    System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
    numeros.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

    System.out.println(" ");

    System.out.println("Transforme a lista de String para uma lista de Inteiros: ");
    List<Integer> collectList = numeros.stream().map(Integer::parseInt).collect(Collectors.toList());
    System.out.println(collectList);

    System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
    List<Integer> newList = collectList.stream().filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList());
    System.out.println(newList);

    System.out.println("Mostre a média dos números: ");
    numeros.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

    System.out.println("Remova os números ímpares: ");
    collectList.removeIf(integer -> integer % 2 != 0);
    System.out.println(collectList);

    System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
    collectList.stream().skip(3).forEach(System.out::println);

    long numerosUnicos = collectList.stream().distinct().count();
    System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + numerosUnicos);

    System.out.print("Mostre o menor valor da lista: ");
    collectList.stream().mapToInt(Integer::intValue).min().ifPresent(System.out::println);

    System.out.print("Mostre o maior valor da lista: ");
    collectList.stream().mapToInt(Integer::intValue).max().ifPresent(System.out::println);

    int somaNumerosPares = collectList.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
    System.out.println("Pegue apenas os números pares e some: " + somaNumerosPares);

    System.out.println("Mostre a lista na ordem númerica: ");
    List<Integer> numerosOrdemNatural = collectList.stream().sorted(Comparator.naturalOrder())
        .collect(Collectors.toList());
    System.out.println(numerosOrdemNatural);

    System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
    Map<Boolean, List<Integer>> collectNumerosMultiplos3e5 = collectList.stream()
        .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
    System.out.println(collectNumerosMultiplos3e5);
  }
}
