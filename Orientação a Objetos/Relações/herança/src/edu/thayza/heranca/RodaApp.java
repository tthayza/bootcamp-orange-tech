package edu.thayza.heranca;

class RodarApp {
  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario();

    //upCast

    Funcionario gerente = new Gerente();
    Funcionario vendedor = new Vendedor();
    Funcionario faxineiro = new Faxineiro();

    //downCast
    Vendedor vendedora = (Vendedor) new Funcionario();

  }
}