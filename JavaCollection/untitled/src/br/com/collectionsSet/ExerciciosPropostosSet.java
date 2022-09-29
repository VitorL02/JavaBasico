package br.com.collectionsSet;

import java.util.*;

public class ExerciciosPropostosSet {
    /*
    Crie um conjunto tendo as cores do arco Ires
    exibir todas as cores uma abaixo da outra
    A quantidade de cores que o arcoIres tem
    As cores em ordem alfabetica
    Cores na ordem inversa que foi informada
    exiba todas as cores que começão com a letra v
    Remova todas as cores que não começão com a letra v
    limpe o conjunto
    confira se o conjunto esta vazio
    */
    public static void main(String[] args) {
        Set<String> arcoIres = new HashSet<String>(){{
            add("Vermelho");
            add("Azul");
            add("Roxo");
            add("Rosa");
        }};
        System.out.println("exibir todas as cores uma abaixo da outra: ");
        int count = 0;
        for(String cores : arcoIres){
            count ++;
            System.out.println(cores);
        }
        System.out.println("A quantidade de cores que o arcoIres tem: ");
        System.out.println(count);

        System.out.println("As cores em ordem alfabetica");
        Set orderArcoIresList = new LinkedHashSet(){{
            add("Vermelho");
            add("Azul");
            add("Roxo");
            add("Rosa");
        }};
        System.out.println(orderArcoIresList);

        System.out.println("Cores na ordem inversa que foi informada");
        List<String> coresArcoIris = new ArrayList<>(orderArcoIresList);
        Collections.reverse(coresArcoIris);
        System.out.println(coresArcoIris);

        System.out.println("exiba todas as cores que começão com a letra v");

        for(String cor : coresArcoIris ){
            if(cor.startsWith("V") || cor.startsWith("v")) System.out.println(cor);
        }
        System.out.println("Remova todas as cores que não começão com a letra v");

        Iterator<String> iterator = coresArcoIris.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if(next.startsWith("V")|| next.startsWith("v")) iterator.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("limpe o conjunto");
        arcoIres.clear();
        System.out.println(arcoIres);

        System.out.println("confira se o conjunto esta vazio: " + arcoIres.isEmpty());

    }
}


