package edu.thayza.exercicios_map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//        FORMAS DE INICIAR UM MAP
//        Map carrosPopulares2020 = new HashMap(); //antes do java 5
//        Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//        HashMap<String, Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

public class ExemploMap {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione o modelo e seus respectivos consumos: ");
        Map<String,Double> carros = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carros.toString());

        System.out.println("Substitua o consumo do gol por 15,2km/L");
        carros.put("gol", 15.2);
        System.out.println(carros);

        System.out.println("Confira se o modelo tucson está no dicionário: "  + carros.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carros.get("uno"));

        // System.out.println("Exiba o terceiro modelo adicionado: ");

        System.out.println("Exiba os modelos: " + carros.keySet());

        System.out.println("Exiba os consumos dos carros: " + carros.values());

        Double consumoMaisEficiente = Collections.max(carros.values());
        Set<Map.Entry<String,Double>> entries = carros.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String,Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) modeloMaisEficiente = entry.getKey();
        }

        System.out.println("Exiba o modelo mais econômico e seu consumo: " + modeloMaisEficiente + " - " + consumoMaisEficiente);



        Double consumoMenosEficiente = Collections.min(carros.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String,Double> entry : carros.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) modeloMenosEficiente = entry.getKey();
        }
        System.out.println("Exiba o modelo menos econômico e seu consumo: " + modeloMenosEficiente + " - " + consumoMenosEficiente);


        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma+= iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.println("Exiba a média dos consumos desses dicionários: " + (soma/carros.size()));

        Iterator<Double> iterator1 = carros.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println("Remova os modelos com consumo igual a 15.6: " + carros);


        Map<String,Double> carros1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println("Exiba todos os carros na ordem em que foram informados: " + carros1);

        Map<String,Double> carros2 = new TreeMap<>(carros1);
        System.out.println("Exiba o dicionário ordenado pelo modelo: " + carros2);

        carros.clear();
        System.out.println("Apague o dicionário de carros: " + carros);

        System.out.println("Confira se o dicionário está vazio: " +  carros.isEmpty());

    }

}