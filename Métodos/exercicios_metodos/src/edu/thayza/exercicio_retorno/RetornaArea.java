package edu.thayza.exercicio_retorno;

public class RetornaArea {
    public static double calculaArea(double lado) {
      double areaQuadrado = lado * lado;
      return areaQuadrado;
    }
    public static double calculaArea(double base, double altura) {
      double areaRetangulo = base * altura;
      return areaRetangulo;
    }
    public static double calculaArea(double baseMaior, double baseMenor, double altura) {
      double areaTrapezio = ((baseMaior + baseMenor) * altura) / 2;
      return areaTrapezio;
    }
    public static void main(String[] args) {
      // retornando

      double areaQuadrado = RetornaArea.calculaArea(5);
      System.out.println("Área do quadrado é " + areaQuadrado);

      double areaRetangulo = RetornaArea.calculaArea(5, 5);
      System.out.println("Área do retângulo é " + areaRetangulo);

      double areaTrapezio = RetornaArea.calculaArea(5, 6, 8);
      System.out.println("Área do trapézio é " + areaTrapezio);
    }

  }

