package br.com.collectionsSet;

import java.util.*;

public class SetLists {
    public static void main(String[] args) {

        Set<Double> notas  = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,2d,3.6,0d));
        //Ordem completamente aleatoria, isso vem da HashSet
        System.out.println(notas);
        //A hashSet não permite essas buscas pois não usa indice
        //System.out.println("Exiba a posição da nota 5");
        //System.out.println("Adicione a nota 8 na posição 4");
        //System.out.println("Substitua a nota 1.5 por 2.0");

        System.out.println("Confira se a nota 8.5 está na lista: " + notas.contains(8.5));
        System.out.println("Exiba a menor nota : " + Collections.min(notas));
        System.out.println("Exiba a maior nota : " + Collections.max(notas));

        System.out.println("Exiba a soma das notas ");
        Iterator<Double>iterator = notas.iterator();
        double soma = 0.0;

        while (iterator.hasNext()){
            Double next = iterator.next();
            soma = next + soma;
        }
        System.out.println("A soma dos valores: " + soma);
        System.out.println("Media das notas: " + (soma/ notas.size()) );

        System.out.println("Remova a nota 0");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7");
        Iterator<Double> removeNotesLessThanSeven = notas.iterator();
        while (removeNotesLessThanSeven.hasNext()){
            Double next = removeNotesLessThanSeven.next();
            if(next < 7 ) removeNotesLessThanSeven.remove();
        }
        System.out.println(notas);
        System.out.println("Exiba as notas na ordem que foi informada");

        //Implementação set não permite entradas duplicadas
        Set<Double> notasOrdenadas = new LinkedHashSet<>(Arrays.asList(7d,7d,8.5,9.3,5d,2d,3.6,0d));
        System.out.println(notasOrdenadas); // retorno [7.0, 8.5, 9.3, 5.0, 2.0, 3.6, 0.0] = Removeu o 7 duplicado

        System.out.println("Exiba as notas na ordem Crescente");
        Set<Double> notasCrescente = new TreeSet<>(notasOrdenadas);
        System.out.println(notasCrescente);

        System.out.println("Apague todo conjunto");
        notas.clear();

        System.out.println("Verifique se  a lista está vazia: " + notas.isEmpty());

    }
}
