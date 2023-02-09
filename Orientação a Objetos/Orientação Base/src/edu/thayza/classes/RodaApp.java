package edu.thayza.classes;

import java.rmi.dgc.VMID;

public class RodaApp {
  public static void main(String[] args) {
    System.out.println();
    Carro carro1 = new Carro();

    carro1.setCor("coral");
    carro1.setModelo("sim");
    carro1.setCapacidadeTanque(40);

    System.out.println(carro1.getCapacidadeTanque());
    System.out.println(carro1.getCor());
    System.out.println(carro1.getModelo());
    System.out.println(carro1.calculaTotalTanque(5.0));


    Carro carro2 = new Carro("branco", "não", 100);


    System.out.println(carro2.getCapacidadeTanque());
    System.out.println(carro2.getCor());
    System.out.println(carro2.getModelo());
    System.out.println(carro2.calculaTotalTanque(7.0));
  }
}
