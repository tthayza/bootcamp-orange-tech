package edu.thayza.desafio.dominio;

public class ContaConjunta extends Conta {
  protected String titular2;

  public ContaConjunta(String titular, Integer numeroConta, Double saldo, String titular2) {
    super(titular, numeroConta, saldo);
    this.titular2 = titular2;
  }

  @Override
  public String getTitular() {
    return this.titular + this.titular2;
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
