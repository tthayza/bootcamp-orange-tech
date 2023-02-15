package edu.thayza.exercicios_exceptions;

import javax.swing.JOptionPane;

public class ExemploUnchecked {
  public static void main(String[] args) {
    boolean continueLooping = true;

    do {

      String a = JOptionPane.showInputDialog("Numerador: ");
      String b = JOptionPane.showInputDialog("Denominador: ");

      /*
       * o bloco onde pode ocorrer uma exceção, colocar dentro do try
       *
       */
      try {
        int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
        System.out.println("resultado: " + resultado);
        continueLooping = false;
      } catch (NumberFormatException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Entrada inválida " + e.getMessage());
      } catch (ArithmeticException e) {
        JOptionPane.showMessageDialog(null, "Impossível divisão por 0 ");
      } finally {
        System.out.println("chegou no finally");
      }

    } while (continueLooping);
    System.out.println("código continua");
  }

  public static int dividir(int a, int b) {
    return a / b;
  }
}
