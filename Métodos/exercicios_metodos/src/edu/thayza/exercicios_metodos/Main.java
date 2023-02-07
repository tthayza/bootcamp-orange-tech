package edu.thayza.exercicios_metodos;

public class Main {
  public static void main(String[] args) {
    //calculadora
    System.out.println("calculadora");
    Operacoes.substrai(12,6);
    Operacoes.soma(12,6);
    Operacoes.multiplica(12,6);
    Operacoes.divide(12,6);

    // mensagem
    Mensagem.obterMensagem(5);
    Mensagem.obterMensagem(24);
    Mensagem.obterMensagem(14);
    Mensagem.obterMensagem(30);

    // emprestimo

    Emprestimo.calcular(145, 5);
    Emprestimo.calcular(1445, 2);
    Emprestimo.calcular(178, 3);
    Emprestimo.calcular(178, Emprestimo.getDuasParcelas());
    Emprestimo.calcular(178, Emprestimo.getTresParcelas());
  }
}
