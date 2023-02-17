package edu.thayza.desafio.dominio;

public class ContaPoupanca extends Conta{

  public ContaPoupanca(String titular, Integer numeroConta, Double saldo) {
    super(titular, numeroConta, saldo);
  }

  @Override
  public String getTitular() {
    return super.getTitular();
  }

  @Override
  public boolean verificaTitular() {
    return super.verificaTitular();
  }


  @Override
  public void consultarSaldo() {
    // TODO Auto-generated method stub
    super.consultarSaldo();
  }

  @Override
  public String getSaldo() {
    // TODO Auto-generated method stub
    return super.getSaldo();
  }

  

  @Override
  public Integer getNumeroConta() {
    // TODO Auto-generated method stub
    return super.getNumeroConta();
  }

  @Override
  public void setNumeroConta(Integer numeroConta) {
    // TODO Auto-generated method stub
    super.setNumeroConta(numeroConta);
  }

  @Override
  public void setSaldo(Double saldo) {
    // TODO Auto-generated method stub
    super.setSaldo(saldo);
  }

  @Override
  public void setTitular(String titular) {
    // TODO Auto-generated method stub
    super.setTitular(titular);
  }

  @Override
  public String toString() {
    return "ContaPoupanca []";
  }






}
