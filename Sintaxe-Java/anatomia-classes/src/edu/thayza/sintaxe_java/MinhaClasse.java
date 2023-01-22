package edu.thayza.sintaxe_java;

public class MinhaClasse {
  public static void main (String[] args) {
    String primeiroNome = "Thayza";
    String segundoNome = "Oliveira";

    String nomeInteiro = concatenaPalavras(primeiroNome, segundoNome);
    System.out.println(nomeInteiro);
  }
  public static String concatenaPalavras (String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
  }
}