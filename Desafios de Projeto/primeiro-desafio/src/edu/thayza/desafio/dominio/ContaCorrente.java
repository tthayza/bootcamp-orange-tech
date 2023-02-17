package edu.thayza.desafio.dominio;

public class ContaCorrente extends Conta{

  public ContaCorrente(String titular1, Integer numeroConta, Double saldo) {
    super(titular1, numeroConta, saldo);
  }

  @Override
  public void consultarSaldo() {
    super.consultarSaldo();
  }

  @Override
  public void fazerDeposito(Double valor) {
    super.fazerDeposito(valor);
  }

  @Override
  public Integer getNumeroConta() {
    return super.getNumeroConta();
  }

  @Override
  public String getSaldo() {
    return super.getSaldo();
  }

  @Override
  public String getTitular() {
    return super.getTitular();
  }

  @Override
  public void sacar(Double valor) {
    super.sacar(valor);
  }

  @Override
  public void setNumeroConta(Integer numeroConta) {
    super.setNumeroConta(numeroConta);
  }

  @Override
  public void setSaldo(Double saldo) {
    super.setSaldo(saldo);
  }

  @Override
  public void setTitular(String titular) {
    super.setTitular(titular);
  }

  @Override
  public String toString() {
    return super.toString();
  }

  @Override
  public boolean verificaTitular() {
    return super.verificaTitular();
  }




}
