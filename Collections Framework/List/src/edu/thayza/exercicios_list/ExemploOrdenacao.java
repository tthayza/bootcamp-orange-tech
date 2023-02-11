package edu.thayza.exercicios_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*Dadas as seguintes características sobre gatos, crie uma lista e ordene esta lista exibindo:
 * nome - idade - cor
 *
 * Gato 1 = nome: Jon, Idade: 18, cor: preto
 * Gato 2 = nome: Simba, Idade: 6, cor: tigrado
 * Gato 3 = nome: Jon, Idade: 12, cor: amarelo
 */

public class ExemploOrdenacao {
  public static void main(String[] args) {
      List<Gato> gatos = new ArrayList<>(){{;
        add(new Gato("Jon", 18, "preto"));
        add(new Gato("Simba", 6, "tigrado"));
        add(new Gato("Jon", 12, "amarelo"));
    }
};
  System.out.println("--\tOrdem de inserção\t-- ");
  System.out.println(gatos);
  System.out.println("--\tOrdem Aleatória\t-- ");
  Collections.shuffle(gatos);
  System.out.println(gatos);
  System.out.println("--\tOrdem Natural (Nome) \t-- ");
  Collections.sort(gatos);
  System.out.println(gatos);
  System.out.println("--\tOrdem Natural (Idade) \t-- ");
  Collections.sort(gatos, new ComparatorIdade());
  System.out.println(gatos);
  System.out.println("--\tOrdem Natural (Idade) \t-- ");
  gatos.sort(new ComparatorCor());
  System.out.println(gatos);
  System.out.println("--\tOrdem NomeCorIdade \t-- ");
  gatos.sort(new ComparatorCorNomeIdade());
  System.out.println(gatos);


}

}


class Gato implements Comparable<Gato> {
  private String nome;
  private Integer idade;
  private String cor;

  public Gato(String nome, Integer idade, String cor) {
    this.nome = nome;
    this.idade = idade;
    this.cor = cor;
  }

  public String getNome() {
    return nome;
  }

  public Integer getIdade() {
    return idade;
  }

  public String getCor() {
    return cor;
  }

  @Override
  public String toString() {
    return "{" +
            "nome='" + nome + '\'' +
            ", idade=" + idade +
            ", cor='" + cor + '\'' +
            '}';
  }

  @Override
  public int compareTo(Gato gato) {
    return this.getNome().compareToIgnoreCase(gato.getNome());
  }
}

class ComparatorIdade implements Comparator<Gato> {
  @Override
  public int compare(Gato g1, Gato g2) {
    return Integer.compare(g1.getIdade(), g2.getIdade());
  }
}

class ComparatorCor implements Comparator<Gato> {
  @Override
  public int compare(Gato gato, Gato gato1) {
    return gato.getCor().compareToIgnoreCase(gato1.getCor());
  }
}
class ComparatorCorNomeIdade implements Comparator<Gato> {
  @Override
  public int compare(Gato g1, Gato g2) {
    int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
    if (nome != 0) return nome;

    int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
    if (cor != 0) return cor;

    return Integer.compare(g1.getIdade(), g2.getIdade());
  }
}