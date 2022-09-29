package br.com.collectionsMap;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

import java.util.*;

public class ExerciciosPropostos {
    public static void main(String[] args) {
        Map<String,Double> estadosBrasileiros = new HashMap<>(){{
            put("PE", 9616621.0);
            put("AL", 3351543.0);
            put("CE", 9187103.0);
            put("RN", 3534265.0);
        }};
        System.out.println("Substitua a população do estado RN por : 3.534.165");
        estadosBrasileiros.put("RN",3534165.0);
        System.out.println(estadosBrasileiros);

        System.out.println("Confira se o estado da Paraíba (PB) tucson está no dicionário, caso não, adicione " + "PB - 4.039.277: ");
        if(!estadosBrasileiros.containsKey("PB")){
            estadosBrasileiros.put("PB", 4039277.0);
        }
        System.out.println(estadosBrasileiros);
        System.out.println("Exiba a população do estado PE: " + estadosBrasileiros.get("PE"));

        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String,Double> estadosBrasileirosOrderInsertion = new LinkedHashMap<>(){{
            put("PE", 9616621.0);
            put("AL", 3351543.0);
            put("CE", 9187103.0);
            put("RN", 3534265.0);
        }};
        System.out.println(estadosBrasileirosOrderInsertion);

        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String,Double> estadosBrasileirosOrderName = new TreeMap<>(estadosBrasileiros);
        System.out.println(estadosBrasileirosOrderName);
        System.out.println("Exiba o estado com o menor população  e seu respectivo valor : ");
        Double menorValor = Collections.min(estadosBrasileiros.values());
        Set<Map.Entry<String, Double>> entries = estadosBrasileiros.entrySet();
        String estadoMenorPop = "";
        for(Map.Entry<String, Double>  entry : entries ){
            if(entry.getValue().equals(menorValor)){
                estadoMenorPop = entry.getKey();
            }
        }
        System.out.println("Estado com menor população: " + estadoMenorPop + "-" + menorValor  );

        Double soma = 0d;
        Iterator<Double> iterator = estadosBrasileiros.values().iterator();
        while (iterator.hasNext()){
            soma += iterator.next();
        }

        System.out.println("Exiba a soma da população desses estados: " + soma);
        System.out.println("Exiba a média da população deste dicionário de estados: " + (soma / estadosBrasileiros.size()) );

        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator<Double> iterator1 = estadosBrasileiros.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next() <  4000000.0) iterator1.remove();
        }
        System.out.println(estadosBrasileiros);
        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
        estadosBrasileiros.clear();
        System.out.println("Confira se a lista está vazia: " + estadosBrasileiros.isEmpty());

    }
}
