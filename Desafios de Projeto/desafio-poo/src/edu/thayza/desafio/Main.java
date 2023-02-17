package edu.thayza.desafio;

import java.time.LocalDate;

import edu.thayza.desafio.dominio.Curso;
import edu.thayza.desafio.dominio.Mentoria;

public class Main {
  public static void main(String[] args) {
    Curso curso1 = new Curso(null, null, null);

    curso1.setTitulo("Java");
    curso1.setDescricao("descriçao");
    curso1.setCargaHoraria(8);
    System.out.println(curso1);

    Mentoria mentoria = new Mentoria(null, null, null);

    mentoria.setData(LocalDate.now());
    mentoria.setDescricao("descriçao");
    mentoria.setTitulo("mentoria");

    System.out.println(mentoria);


  }
}
