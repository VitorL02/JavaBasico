package br.com.collectionsSet;

import java.util.*;

public class LinguagemFavorita {

    /*
       Ordem de inserção
       Ordem natural nome
       IDE
       Ano de criação e nome
       nome,ano de criação e IDE,
       Exibir todas uma em baixo da outra
     */

    public static void main(String[] args) {
        Set<Linguagens> linguagemFavoritas = new LinkedHashSet() {{
            add(new Linguagens("Java", 2005, "IntteliJ"));
            add(new Linguagens("JavaScript", 2008, "VsCode"));
            add(new Linguagens("C#", 2007, "VisualStudio"));
        }};
        System.out.println("Ordem de inserção");
        System.out.println(linguagemFavoritas);

        System.out.println("Ordem natural nome");
        Set linguagemNameOrder = new TreeSet(new LinguagensOrderByName());
        linguagemNameOrder.addAll(linguagemFavoritas);
        System.out.println(linguagemNameOrder);

        System.out.println("Ordem natural IDE");
        Set linguagemIDEOrder = new TreeSet(new LinguagensOrderByIDE());
        linguagemIDEOrder.addAll(linguagemFavoritas);
        System.out.println(linguagemIDEOrder);

        System.out.println("nome,ano de criação e IDE,");
        Set linguagemNemeIdeYearOrder = new TreeSet(new LinguagensOrderByNameIdeYear());
        linguagemNemeIdeYearOrder.addAll(linguagemFavoritas);
        System.out.println(linguagemNemeIdeYearOrder);

        System.out.println("Exibir todas uma em baixo da outra");

        for (Linguagens linguaguem : linguagemFavoritas)
            System.out.println(linguaguem.getNome() + " - " + linguaguem.getIde()  +
                    " - " + linguaguem.getAnoCriacao());


    }

}

class Linguagens {
    private String nome;
    private Integer anoCriacao;
    private String ide;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linguagens that = (Linguagens) o;
        return nome.equals(that.nome) && anoCriacao.equals(that.anoCriacao) && ide.equals(that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoCriacao, ide);
    }

    @Override
    public String toString() {
        return "{" + "nome='" + nome + '\'' + ", anoCriacao=" + anoCriacao + ", ide='" + ide + '\'' + '}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoCriacao() {
        return anoCriacao;
    }

    public String getIde() {
        return ide;
    }

    public Linguagens(String nome, Integer anoCriacao, String ide) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.ide = ide;
    }


}

class LinguagensOrderByName implements Comparator<Linguagens> {

    @Override
    public int compare(Linguagens linguagem1, Linguagens linguagem2) {
        return linguagem1.getNome().compareToIgnoreCase(linguagem2.getNome());
    }

}

class LinguagensOrderByIDE implements Comparator<Linguagens> {
    @Override
    public int compare(Linguagens linguagem1, Linguagens linguagem2) {
        return linguagem1.getIde().compareToIgnoreCase(linguagem2.getIde());
    }
}

class LinguagensOrderByNameIdeYear implements Comparator<Linguagens> {
    @Override
    public int compare(Linguagens linguagem1, Linguagens linguagem2) {
        int nome = linguagem1.getNome().compareToIgnoreCase(linguagem2.getNome());
        if (nome != 0) return nome;

        int ide = linguagem1.getIde().compareToIgnoreCase(linguagem2.getIde());
        if (ide != 0) return ide;

        return Integer.compare(linguagem1.getAnoCriacao(), linguagem2.getAnoCriacao());
    }
}