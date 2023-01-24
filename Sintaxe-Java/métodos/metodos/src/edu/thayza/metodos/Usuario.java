package edu.thayza.metodos;

public class Usuario {
  public static void main (String[] args) throws Exception {
    SmartTv smartTv = new SmartTv();

    System.out.println("A TV está ligada? " + smartTv.ligada);
    System.out.println("Qual é o canal atual? " + smartTv.canal);
    System.out.println("Qual é o volume atual? " + smartTv.volume);

    smartTv.ligar();
    System.out.println("estado atual: " + smartTv.ligada);

    smartTv.desligar();
    System.out.println("estado atual: " + smartTv.ligada);

    smartTv.aumentarVolume();
    System.out.println("estado atual: " + smartTv.volume);

    smartTv.diminuirVolume();
    System.out.println("estado atual: " + smartTv.volume);

    smartTv.mudarCanal(65);
    System.out.println("canal atual: "+ smartTv.canal);




  }
}