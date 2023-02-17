package edu.thayza.desafio.dominio;

public abstract class Conteudo {

  protected String titulo;
  protected String descricao;

  public Conteudo(String titulo, String descricao) {
    this.titulo = titulo;
    this.descricao = descricao;
  }

  protected static double XP_PADRAO = 10d;

  public abstract double calcularXp();

  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }



}
