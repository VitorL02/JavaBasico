package br.com.collectionsMap;

import java.util.*;

public class MapList {
    public static void main(String[] args) {

        Map<String,Double> carrosPopulares = new HashMap<>(){{
            put("Gol",14.4);
            put("Uno",11.2);
            put("Voyage",12.0);
            put("City",20.2);
        }};

        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o valor do consumo do gol por 15.5");
        carrosPopulares.put("gol",15.5);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o tucson está no dicionario: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do city " + carrosPopulares.get("City"));

       // System.out.println("Exiba o Terceiro valor adicionado"); Não existe um metodo nativo pra isso

        System.out.println("Exiba os modelos");
        Set<String> modelos = carrosPopulares.keySet(); // Retorna um set
        System.out.println(modelos);
        System.out.println("Exiba o consumo dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);


        System.out.println("Exiba o modelo mais economico : ");
        Double consumoEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloEficiente ="";

        for (Map.Entry<String, Double> entry: entries ) {
            if(entry.getValue().equals(consumoEficiente))
                modeloEficiente = entry.getKey();

        }
        System.out.println("Modelo mais eficiente: " + modeloEficiente +  " Consumo: " + consumoEficiente );

        System.out.println("Exiba o modelo menos economico e seu consumo : ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();
        String modeloMenosEficiente ="";
        for(Map.Entry<String, Double> entry : entries1){
            if(entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
            }
        }
        System.out.println("Modelo menos eficiente: " + modeloMenosEficiente +  " Consumo: " + consumoMenosEficiente );

        System.out.println("Exiba a soma dos consumos");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Exiba a media de consumo desses carros: " + (soma / carrosPopulares.size()));

        System.out.println("Remova os modelos com consumo igual a 15.5");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next().equals(15.5)) iterator1.remove();
        }
        System.out.println(carrosPopulares);
        System.out.println("Imprima os carros na ordem que foi inserido");
        Map<String,Double> carrosPopularesOrder = new LinkedHashMap<>(){{
            put("Gol",14.4);
            put("Uno",11.2);
            put("Voyage",12.0);
            put("City",20.2);
        }};
        System.out.println(carrosPopularesOrder);

        System.out.println("Exiba ordenado pelo modelo");
        Map<String,Double> carrosPopularesOrderModel = new TreeMap<>(carrosPopularesOrder);
        System.out.println(carrosPopularesOrderModel);

        System.out.println("Apague o dicionairo de carros");
        carrosPopulares.clear();
        System.out.println("Confira se os carros estão vazios: " + carrosPopulares.isEmpty() );


    }

}
