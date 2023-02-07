package edu.thayza.exercicios_metodos;

public class Emprestimo {
  public static int getDuasParcelas() {
    return 2;
  }
  public static int getTresParcelas() {
    return 3;
  }
  public static double getTaxaDuasParcelas() {
    return 0.3;
  }
  public static double getTaxaTresParcelas() {
    return 0.45;
  }

  public static void calcular(double valor, int parcelas) {
    if (parcelas == 2) {
      double valorFinal = valor + (valor * getDuasParcelas());
      System.out.println("O valor final é " + valorFinal);
    }
    else if (parcelas == 3) {
      double valorFinal = valor + (valor * getTaxaTresParcelas());
      System.out.println("O valor final é " + valorFinal);
    }
    else {
      System.out.println("Não aceito para quantidades de parcelas informada.");
    }

  }
}
