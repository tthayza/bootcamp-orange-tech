package edu.thayza.metodos;

public class metodos {
  public double somar(int num1, int num2) {
    double resultado = num1 + num2;
    return resultado;
  }

  public void imprimir(String texto) {
    // não precisa de return;//
    // lógica aqui //
  }

  // throws Exception indica que o método usado pode gerar exceção;
  public double dividir(int dividendo, int divisor) throws Exception {
    // se o divisor informado for 0, será uma exceção;
    double resultado = dividendo / divisor;
    return resultado;

  }

  private void metodoPrivado() {
    // esse método nao pode ser visto por outras classes;
  }

}