package br.com.collectionsLists;

import java.util.*;

public class OrdenacaoLists {
    public static void main(String[] args) {

        System.out.println("Criar e ordenar uma lista");

        List<Cachorro> cachorros = new ArrayList(){{
            add(new Cachorro("Luna",6,"Branca"));
            add(new Cachorro("Luna",7,"Branca"));
            add(new Cachorro("Thor",7,"Bege"));
            add(new Cachorro("Scooby",10,"Preto"));
        }};


        System.out.println("Ordem de inserção");
        System.out.println(cachorros);
        System.out.println("Ordem aleatoria");
        Collections.shuffle(cachorros);
        System.out.println(cachorros);

        System.out.println("Ordem natural (Nome)");
        Collections.sort(cachorros);
        System.out.println(cachorros);

        System.out.println("Ordenar por idade ");
        Collections.sort(cachorros,new ComparatorIdade());
        System.out.println(cachorros);

        System.out.println("Ordenar por cor");
        Collections.sort(cachorros,new ComparatorCor());
        System.out.println(cachorros);

        System.out.println("Ordenar por cor idade e nome");
        cachorros.sort(new ComparatorNomeCorIdade());
        System.out.println(cachorros);



    }
}


 class Cachorro implements Comparable<Cachorro> {


     private String nome;
    private Integer idade;
    private String cor;

     public Cachorro(String nome, Integer idade, String cor) {
         this.nome = nome;
         this.idade = idade;
         this.cor = cor;
     }

     public String getNome() {
         return nome;
     }
     public String getCor() {
         return cor;
     }

     public Integer getIdade() {
         return idade;
     }
    //Necessario utilizar pois sem ele e exibido o endereço de memoria
     @Override
     public String toString() {
         return "Cachorro{" +
                 "nome='" + nome + '\'' +
                 ", idade=" + idade +
                 ", cor='" + cor + '\'' +
                 '}';
     }

     @Override
     public int compareTo(Cachorro cachorro) {
         return this.getNome().compareToIgnoreCase(cachorro.getNome());
     }
 }

 class ComparatorIdade implements Comparator<Cachorro> {
     @Override
     public int compare(Cachorro cachorro,Cachorro cachorro2) {
         return Integer.compare(cachorro.getIdade(),cachorro2.getIdade());
     }
 }

class ComparatorCor implements Comparator<Cachorro> {

    @Override
    public int compare(Cachorro cachorro1, Cachorro cachorro2) {
        return cachorro1.getCor().compareToIgnoreCase(cachorro2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Cachorro>{

    @Override
    public int compare(Cachorro cachorro1, Cachorro cachorro2) {
        int nome = cachorro1.getNome().compareToIgnoreCase(cachorro2.getNome());
        if(nome !=0) return nome;

        int cor = cachorro1.getCor().compareToIgnoreCase(cachorro2.getCor());
        if(cor != 0) return cor;


        return Integer.compare(cachorro1.getIdade(),cachorro2.getIdade());
    }
}

