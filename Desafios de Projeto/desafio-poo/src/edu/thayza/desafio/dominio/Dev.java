package edu.thayza.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
  private String nome;
  private Set<Conteudo> cursosInscritos = new LinkedHashSet<>();
  private Set<Conteudo> cursosConcluidos = new LinkedHashSet<>();


  public Dev(String nome, Set<Conteudo> cursosInscritos, Set<Conteudo> cursosConcluidos) {
    this.nome = nome;
    this.cursosInscritos = cursosInscritos;
    this.cursosConcluidos = cursosConcluidos;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public Set<Conteudo> getCursosInscritos() {
    return cursosInscritos;
  }
  public void setCursosInscritos(Set<Conteudo> cursosInscritos) {
    this.cursosInscritos = cursosInscritos;
  }
  public Set<Conteudo> getCursosConcluidos() {
    return cursosConcluidos;
  }
  public void setCursosConcluidos(Set<Conteudo> cursosConcluidos) {
    this.cursosConcluidos = cursosConcluidos;
  }

  public void inscreveNoBootcamp(Bootcamp bootcamp) {
    this.cursosInscritos.addAll(bootcamp.getConteudos());
    bootcamp.getDevsInscritos().add(this);
  };

  public void progredir() {
    Optional<Conteudo> conteudo = this.cursosInscritos.stream().findFirst();
    if (conteudo.isPresent()) {
      this.cursosConcluidos.add(conteudo.get());
      this.cursosInscritos.remove(conteudo.get());
    } else {
      System.err.println("Você não está matriculado em nenhum conteúdo.");
    }

  };

  public double calculaTotalXp() {
    return this.cursosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((cursosInscritos == null) ? 0 : cursosInscritos.hashCode());
    result = prime * result + ((cursosConcluidos == null) ? 0 : cursosConcluidos.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Dev other = (Dev) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (cursosInscritos == null) {
      if (other.cursosInscritos != null)
        return false;
    } else if (!cursosInscritos.equals(other.cursosInscritos))
      return false;
    if (cursosConcluidos == null) {
      if (other.cursosConcluidos != null)
        return false;
    } else if (!cursosConcluidos.equals(other.cursosConcluidos))
      return false;
    return true;
  };


}
