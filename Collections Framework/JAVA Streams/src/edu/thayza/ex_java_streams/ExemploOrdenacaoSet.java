package edu.thayza.ex_java_streams;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
  public static void main(String[] args) {
    System.out.println("--\tOrdem Aleatória\t--");
    Set<Serie> minhasSeries = new HashSet<>() {
      {
        add(new Serie("brooklyn99", "comédia", 20));
        add(new Serie("manifest", "ficção", 40));
        add(new Serie("dr house", "médico", 40));
      }
    };

    for (Serie serie : minhasSeries) {
      System.out.println((serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio()));
    }

    System.out.println("--\tOrdem de Inserção\t--");
    Set<Serie> minhasSeries1 = new LinkedHashSet<>() {
      {
        add(new Serie("brooklyn99", "comédia", 20));
        add(new Serie("manifest", "ficção", 40));
        add(new Serie("dr house", "médico", 40));
      }
    };
    for (Serie serie : minhasSeries1) System.out.println((serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio()));


    System.out.println("--\tOrdem Natural (tempoEpisodio)\t--");
    Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
    for (Serie serie : minhasSeries2) {
      System.out.println((serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio()));
    }


    System.out.println("--\tOrdem Nome/Genero/TempoEpisodio\t--");
    Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
    minhasSeries3.addAll(minhasSeries);
    for (Serie serie : minhasSeries3) {
      System.out.println((serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio()));
    }
  }
}

class Serie implements Comparable<Serie> {
  private String nome;
  private String genero;
  private Integer tempoEpisodio;

  public Serie(String nome, String genero, Integer tempoEpisodio) {
    this.nome = nome;
    this.genero = genero;
    this.tempoEpisodio = tempoEpisodio;
  }

  public String getNome() {
    return nome;
  }

  public String getGenero() {
    return genero;
  }

  public Integer getTempoEpisodio() {
    return tempoEpisodio;
  }

  @Override
  public String toString() {
    return "{" +
        "nome='" + nome + '\'' +
        ", genero='" + genero + '\'' +
        ", tempoEpisodio=" + tempoEpisodio +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Serie serie = (Serie) o;
    return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, genero, tempoEpisodio);
  }

  @Override
  public int compareTo(Serie serie) {
    int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), (serie.getTempoEpisodio()));
    if (tempoEpisodio != 0) {
      return tempoEpisodio;
    }
    return this.getGenero().compareTo(serie.getGenero());
    // return Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
  }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{
  @Override
  public int compare(Serie s1, Serie s2) {
    int nome = s1.getNome().compareTo(s2.getNome());
    if (nome != 0) {
      return nome;
    }

    int genero = s1.getGenero().compareTo(s2.getGenero());
    if (genero != 0) {
      return genero;
    }
    return Integer.compare(s1.getTempoEpisodio(), (s2.getTempoEpisodio()));
  }
}

