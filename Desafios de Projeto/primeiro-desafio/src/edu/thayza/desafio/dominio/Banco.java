package edu.thayza.desafio.dominio;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class Banco {
  private Map<Integer, Map> contas = new HashMap<>();

  public void iniciaPrograma() {
    System.out.println("lop");
    boolean obteveServico = false;
    while (obteveServico == false) {
      System.out.println("lop");
      Scanner leitor = new Scanner(System.in);
      System.out.println("SEJA BEM VINDO AO BANCO DIO");
      System.out.println("SERVIÇOS: 1. ABRIR CONTA / 2. ENCERRAR CONTA");
      String entrada = leitor.next();
      if (entrada.equals("1")) {
        System.out.println("Encaminhando...");
        obteveServico = true;
        abrirConta();
      } else if (entrada.equals("2")) {
        System.out.println("Encaminhando...");
        encerrarConta();
        obteveServico = true;
        leitor.close();
      } else {
        System.out.println("Serviço Inválido, você será encaminhado ao menu principal.");
      }
    }

  }

  public void abrirConta() {
    // List<String> informacoesConta = new ArrayList<>();
    System.out.println("lop");
    Map<String, String> informacoesConta = new HashMap<>();
    boolean conjunta = false;
    String titular2 = "";

    String tipoConta = JOptionPane.showInputDialog("Informe o tipo de conta:");
    if (tipoConta.equalsIgnoreCase("conjunta"))
      conjunta = true;
    System.out.println("entrou");

    String titular = JOptionPane.showInputDialog("Informe o nome do titular:");
    if (conjunta == true) {
      titular2 = JOptionPane.showInputDialog("Informe o segundo titular: ");
    }

    String nConta = "";
    Random random = new Random();
    for (int i = 1; i < 9; i++) {
      int numero = random.nextInt(9);
      nConta = nConta + Integer.toString(numero);
    }
    Integer numeroDaConta = Integer.parseInt(nConta);

    JOptionPane.showMessageDialog(null, "O número da sua conta é " + numeroDaConta);

    // inserindo informações da conta em um dict
    informacoesConta.put("titular1", titular);
    informacoesConta.put("tipoConta", tipoConta);
    if (conjunta == true)
      informacoesConta.put("titular2", titular2);

    System.out.println(numeroDaConta);
    System.out.println(informacoesConta);

    adicionaContas(numeroDaConta, informacoesConta);
  }

  public void adicionaContas(Integer numeroDaConta, Map<String, String> informacoesConta) {
    // criando um map vazio para adicionar as contas
    Map<Integer, Map> contas = new HashMap<>() {
      {
        put(numeroDaConta, informacoesConta);
      }
    };

    System.out.println(contas);
  }

  public void encerrarConta() {
    String nConta = JOptionPane.showInputDialog(null, "Informe o número da conta:");
    Integer nContaF = Integer.parseInt(nConta);

    JOptionPane.showConfirmDialog(null, "Tem certeza que deseja encerrar a conta " + nContaF);

    if (contas.containsKey(nContaF) == true) {
      contas.remove(nContaF);
      JOptionPane.showMessageDialog(null, "Conta" + nContaF + "encerrada");
    } else
      JOptionPane.showMessageDialog(null, "Conta não encontrada");
  }
}
