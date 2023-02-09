package edu.thayza.exercicio;

class Calculadora implements OperacaoMatematica {
  @Override
  public void soma (double numero1, double numero2){
    System.out.println("Soma: " + (numero1+numero2));
  }
  @Override
  public void subtrai (double numero1, double numero2) {
    System.out.println("Subtração: " + (numero1-numero2));
  }

  @Override
  public void multiplica (double numero1, double numero2) {
    System.out.println("Multiplicação: " + (numero1*numero2));
  }

  @Override
  public void divide (double numero1, double numero2) {
    System.out.println("Divisão: " + (numero1/numero2));
  }
}
