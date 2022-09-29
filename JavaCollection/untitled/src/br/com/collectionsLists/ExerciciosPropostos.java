package br.com.collectionsLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExerciciosPropostos {
    public static void main(String[] args) {
        System.out.println("Faça uma lista que receba a temperatura media dos 6 primeiros meses do ano," +
                "depois calcule a media semestral e mostre todas as temperaturas acima dessa media, e em que mes elas ocorreram ");

        List<String> mesesDoAno = new ArrayList(){{
            add("Janeiro");
            add("Fevereiro");
            add("Março");
            add("Abril");
            add("Maio");
            add("Junho");
        }};

        List<Double>temperaturas = new ArrayList(){{
            add(26.0);
            add(30.0);
            add(10.0);
            add(0.0);
            add(12.0);
            add(-1.0);
        }};

        System.out.println("Media semestral");
        Iterator<Double>iterator = temperaturas.iterator();
        double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma = soma + next;
        }
        double media = soma/temperaturas.size();
        System.out.println(media);

        System.out.println("Temperaturas maiores que a media semestral : ");
        for(int index = 0; index < temperaturas.size(); index++){
            if( media < temperaturas.get(index)){
                System.out.println(temperaturas.get(index));
                System.out.println("Mes: " + mesesDoAno.get(index) );
            }

        }
        List<String> responses = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Responda as perguntas com S ou N ");
        System.out.println("1-Telefonou pra vitima? ");
        String telForVitim = scanner.next();
        System.out.println("2-Esteve no local do crime? ");
        String stayCrimeLocal = scanner.next();
        System.out.println("3-Mora perto da vitima ");
        String liveFromVitim = scanner.next();
        System.out.println("4-Devia pra vitima?  ");
        String payForVitim = scanner.next();
        System.out.println("5-Já trabalhou com vitima  ");
        String workWithVitim = scanner.next();

        responses.add(telForVitim);
        responses.add(stayCrimeLocal);
        responses.add(liveFromVitim);
        responses.add(payForVitim);
        responses.add(workWithVitim);
        int counterPositive = 0;

        for(String response : responses){
            if(response.equals("S") || response.equals("s")){
                counterPositive ++ ;
            }
        }
        if(counterPositive == 1)
            System.out.println("Inocente");
            else if(counterPositive == 2)
                System.out.println("Suspeita");
             else if (counterPositive >= 3 && counterPositive <=4 )
                System.out.println("Cumplice");
             else
                System.out.println("Assasina");



    }
}
