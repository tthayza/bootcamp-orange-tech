package edu.thayza.exercicios_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class ExemploList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione sete notas: ");

        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas.toString());
        System.out.println("Retorne a posição da nota 5.0: " + notas.indexOf(5.0));
        notas.add(4, 8d);
        System.out.println("Adicione 8.0 na posição 4: " + notas);
        notas.set(notas.indexOf(5d), 6d);
        System.out.println("Substitua 5.0 por 6.0: " + notas);
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas) System.out.println(nota);


        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma das notas: " + soma );
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));
        notas.remove(0d);
        System.out.println("Remova a nota 0 " + notas);
        notas.remove(0);
        System.out.println("Remova a nota na posição 0 " + notas);
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println("Remova as notas menores que 7 e exiba a lista: " + notas);
        notas.clear();
        System.out.println("Remova sua lista: " + notas);
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
    }
}