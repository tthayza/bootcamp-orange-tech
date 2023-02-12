package edu.thayza.exercicios_set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
  public static void main(String[] args) {
    System.out.print("Crie um conjunto e adicione as notas: ");
    Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
    System.out.println(notas);

    System.out.println("Confira se a nota 5 está no conjunto: " + notas.contains(5d));

    System.out.println("Exiba a menor nota: " + Collections.min(notas));

    System.out.println("Exiba a maior nota: " + Collections.max(notas));


    Iterator<Double> iterator = notas.iterator();
    double soma = 0d;
    while(iterator.hasNext()) {
        Double next = iterator.next();
        soma += next;
    }
    System.out.println("Exiba a soma das notas: " + soma );


    System.out.println("Exiba a média das notas: " + soma/notas.size() );

    notas.remove(0d);
    System.out.println("Remova a nota 0: " + notas);


    Iterator<Double> iterator1 = notas.iterator();
    while(iterator1.hasNext()) {
        Double next = iterator1.next();
        if (next < 7) iterator1.remove();
    }
    System.out.println("Remova as notas menores que 7: " + notas);

    Set<Double> notas2 = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
    System.out.println("Exiba as notas na ordem em que foram informadas: " + notas2);

    Set<Double> notas3 = new TreeSet<>(notas2);
    System.out.println("Exiba as notas em ordem crescente: " + notas3);

    notas.clear();
    System.out.println("Apague o conjunto: " + notas);

    notas.isEmpty();
    System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
  }
}