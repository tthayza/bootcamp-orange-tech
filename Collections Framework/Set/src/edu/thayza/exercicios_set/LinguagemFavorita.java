package edu.thayza.exercicios_set;

import java.util.Comparator;
import java.util.LinkedHashSet;

import java.util.Set;
import java.util.TreeSet;

public class LinguagemFavorita {
  public static void main(String[] args) {
    System.out.println("----\tOrdem de Inserção\t----");
    Set<Linguagem> minhasLinguagens = new LinkedHashSet<>() {
      {
        add(new Linguagem("JavaScript", 1995, "VScode"));
        add(new Linguagem("Java", 1991, "IntelliJ"));
        add(new Linguagem("Python", 1991, "Thonny"));
      }
    };
    for (Linguagem linguagem : minhasLinguagens)
      System.out.println((linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde()));

    System.out.println("--\tOrdem Natural (Nome)\t--");
    Set<Linguagem> minhasLinguagens1 = new TreeSet<Linguagem>(minhasLinguagens);
    for (Linguagem linguagem : minhasLinguagens1) {
      System.out.println((linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde()));
    }

    System.out.println("--\tOrdem Natural (IDE)\t--");
    Set<Linguagem> minhasLinguagens2 = new TreeSet<Linguagem>(new ComparatorIde());
    minhasLinguagens2.addAll(minhasLinguagens);
    for (Linguagem linguagem : minhasLinguagens2) {
      System.out.println((linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde()));
    }

    System.out.println("--\tOrdem Natural (Ano de criação/Nome)\t--");
    Set<Linguagem> minhasLinguagens3 = new TreeSet<Linguagem>(new ComparatorAnoDeCriacaoNome());
    minhasLinguagens3.addAll(minhasLinguagens);
    for (Linguagem linguagem : minhasLinguagens2) {
      System.out.println((linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde()));
    }

    System.out.println("--\tOrdem Natural (Nome / Ano de Criação / Ide)\t--");
    Set<Linguagem> minhasLinguagens4 = new TreeSet<Linguagem>(new ComparatorNomeAnoDeCriacaoIde());
    minhasLinguagens4.addAll(minhasLinguagens);
    for (Linguagem linguagem : minhasLinguagens4) {
      System.out.println((linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde()));
    }





  }

}

class Linguagem implements Comparable<Linguagem>{
  private String nome;
  private Integer anoDeCriacao;
  private String ide;

  public Linguagem(String nome, Integer anoDeCriacao, String ide) {
    this.nome = nome;
    this.anoDeCriacao = anoDeCriacao;
    this.ide = ide;
  }

  public String getNome() {
    return nome;
  }

  public Integer getAnoDeCriacao() {
    return anoDeCriacao;
  }

  public String getIde() {
    return ide;
  }

  @Override
  public String toString() {
    return "{" +
        "nome='" + nome + '\'' +
        ", anoDeCriacao='" + anoDeCriacao + '\'' +
        ", ide=" + ide +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Linguagem linguagem = (Linguagem) o;
    return nome.equals(linguagem.nome) && anoDeCriacao.equals(linguagem.anoDeCriacao) && ide.equals(linguagem.ide);
  }

  @Override
  public int compareTo(Linguagem linguagem) {
      return this.nome.compareTo(linguagem.nome);
  }

}

class ComparatorIde implements Comparator<Linguagem> {
  @Override
  public int compare(Linguagem l1, Linguagem l2) {
    return l1.getIde().compareToIgnoreCase(l2.getIde());
  }
}

class ComparatorAnoDeCriacaoNome implements Comparator<Linguagem> {
  @Override
  public int compare(Linguagem l1, Linguagem l2) {
    int anoDeCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
    if (anoDeCriacao != 0) return anoDeCriacao;
    return l1.getNome().compareToIgnoreCase(l2.getNome());
  }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<Linguagem> {
  public int compare(Linguagem l1, Linguagem l2) {
    int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
    int anoDeCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
    if (nome!= 0) return nome;
    else if (anoDeCriacao != 0) return anoDeCriacao;
    return l1.getIde().compareToIgnoreCase(l2.getIde());
}
}
