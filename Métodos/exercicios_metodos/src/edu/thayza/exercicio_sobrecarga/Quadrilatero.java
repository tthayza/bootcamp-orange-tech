package edu.thayza.exercicio_sobrecarga;

public class Quadrilatero {
  public static void calculaArea(double lado) {
    double areaQuadrado = lado * lado;
    System.out.println("A área do quadrado é " + areaQuadrado);
  }
  public static void calculaArea(double base, double altura) {
    double areaRetangulo = base * altura;
    System.out.println("A área do retângulo é " + areaRetangulo);
  }
  public static void calculaArea(double baseMaior, double baseMenor, double altura) {
    double areaTrapezio = ((baseMaior + baseMenor) * altura) / 2;
    System.out.println("A área do quadrado é " + areaTrapezio);
  }

  public static void main(String[] args) {
    System.out.println();
    Quadrilatero.calculaArea(3);
    Quadrilatero.calculaArea(5, 5);
    Quadrilatero.calculaArea(7, 8, 9);
  }

}
