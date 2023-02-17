package edu.thayza.desafio.dominio;

import javax.swing.*;

public abstract class Conta {
  protected String titular;
  protected Integer numeroConta;
  private Double saldo;
  protected boolean checkTitular;

  public Conta(String titular, Integer numeroConta, Double saldo) {
    this.titular = titular;
    this.numeroConta = numeroConta;
    this.saldo = saldo;
    this.checkTitular = false;
  }
  public boolean verificaTitular() {
    String checking = JOptionPane.showInputDialog("Você é o titular?");
    if (checking.equalsIgnoreCase("s"))
      this.checkTitular = true;
    else {
      this.checkTitular = false;
      JOptionPane.showMessageDialog(null, "Não será possível prosseguir.");
    }
    return checkTitular;
  }

  public void fazerDeposito(Double valor) {
    if (verificaTitular() == true && valor < saldo) {
      this.saldo -= valor;
      JOptionPane.showMessageDialog(null, "Depósito Realizado!");
    }
  }

  public void consultarSaldo() {
    if (verificaTitular() == true) {
      JOptionPane.showMessageDialog(null, "O saldo atual é R$" + this.getSaldo());
    }
  }

  public void sacar(Double valor) {
    if (verificaTitular() == true && saldo > 0 && valor < saldo) {
      this.saldo -= valor;
      JOptionPane.showMessageDialog(null, "Saque realizado!");
    }
  }

  @Override
  public String toString() {
    return "Conta [titular=" + titular + ", numeroConta=" + numeroConta + ", saldo=" + saldo%.1f + "]";
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public Integer getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(Integer numeroConta) {
    this.numeroConta = numeroConta;
  }

  public String getSaldo() {
    String saldo = String.format("%.2f", this.saldo);
    return saldo;
  }

  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }
}