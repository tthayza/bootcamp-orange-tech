package edu.thayza.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

import javax.swing.*;

public class Banco {
  private Set<Conta> contas = new LinkedHashSet<>();

  public void abrirConta() {
    String nome = JOptionPane.showInputDialog("Informe seu nome:");
    String tipoConta = JOptionPane.showInputDialog("Informe o tipo de conta:");
    // if (tipoConta.equalsIgnoreCase("conjunta")) {
    //   Optional<String> nome2 = JOptionPane.showInputDialog("Informe seu nome:");
    // }
    String conta = "";
    Random random = new Random();
    for (int i = 1; i < 9; i++) {
      int numero = random.nextInt(9);
      conta = conta + Integer.toString(numero);
    }
    Integer contaFinal = Integer.parseInt(conta);
    JOptionPane.showMessageDialog(null, "O número da sua conta é " + contaFinal);

    adicionaContas(nome, tipoConta, contaFinal);
  }
  // Optional<String> nome2
  public void adicionaContas(String nome, String tipoConta, Integer conta) {
    // if (nome2.isPresent() && tipoConta.equalsIgnoreCase("conjunta")) {
    //   String titular2 = nome2.get();
    //   this.contas.add(new ContaConjunta(nome, conta, null, titular2));
    // }
    if (tipoConta.equalsIgnoreCase("poupanca")) {
      this.contas.add(new ContaPoupanca(nome, conta, null));
    }
    else if (tipoConta.equalsIgnoreCase("corrente")) {
      this.contas.add(new ContaCorrente(nome, conta, null));
    }
    else {
      JOptionPane.showMessageDialog(null, "Dados incorretos!");
    }
  }

  private void add(ContaPoupanca contaPoupanca) {
  }

  public void encerrarConta() {

  }

}


