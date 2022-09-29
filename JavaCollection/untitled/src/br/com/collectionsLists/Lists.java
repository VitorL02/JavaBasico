package br.com.collectionsLists;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();

        System.out.println("Crie uma lista e adicione as 7 notas");
        notas.add(8.5);
        notas.add(1.5);
        notas.add(9.0);
        notas.add(4.12);
        notas.add(12.25);
        notas.add(7.5);
        notas.add(6.2);
        System.out.println(notas);
        System.out.println("Exiba a posição da nota 4.12");
        System.out.println(notas.indexOf(4.12));

        System.out.println("Adicione a nota 8 na posição 4");
        notas.add(4,8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 1.5 por 2.0");
        notas.set(1,2.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 12.25 está na lista: " + notas.contains(12.25) );

        System.out.println("Imprima as notas de forma que elas foram inseridas");
        for(Double nota : notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2) );

        System.out.println("Exiba a menor nota : " + Collections.min(notas));
        System.out.println("Exiba a maior nota : " + Collections.max(notas));


        System.out.println("Exiba a soma das nota : " );
        Iterator<Double> iterator =  notas.iterator();
        double sum = 0d;
        while (iterator.hasNext()){
            Double number = iterator.next();
            sum = number + sum;
        }
        System.out.println("Soma das notas: " + sum);

        System.out.println("Exiba a media das notas: "  + (sum/notas.size()));

        System.out.println("Remova a nota 2.0");
        notas.remove(2.0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7");

        Iterator<Double> removeNotesLessThanSeven = notas.iterator();

        while (removeNotesLessThanSeven.hasNext()){
            Double next = removeNotesLessThanSeven.next();
            if(next< 7 ) removeNotesLessThanSeven.remove();
        }
        System.out.println(notas);

       // System.out.println("Apague toda a lista: ");
        // notas.clear();
       //System.out.println(notas);
        System.out.println("Verifique se  toda a lista está vazia: " +notas.isEmpty());

        System.out.println("Exercicios");
        System.out.println("Crie uma lista chamada notas2 e coloque os elementos da 1 lista nessa nova lista");

        LinkedList<Double> notas2 = new LinkedList();

        notas2.addAll(notas);
        System.out.println(notas2);

        System.out.println("Mostre o primeiro elemento nota da nova lista sem remover");
        System.out.println(notas2.getFirst());

        System.out.println("Mostre o primeiro elemento nota da nova lista  removendo");
        System.out.println(notas2.pollFirst());
        System.out.println(notas2);


    }

}
