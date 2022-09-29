package br.com.collectionsMap;

import java.util.*;

public class OrdenacaoListMap {
    public static void main(String[] args) {
        Map<String,Livro> livrosFavoritos = new HashMap<>(){{
            put("Harari",new Livro("Yaval Noah",456));
            put("Hawking",new Livro("Uma breve historia do tempo",330));
            put("Duhigg",new Livro("O poder do habito",220));
        }};

        System.out.println("Imprima na ordem aleatoria");
        Set<Map.Entry<String, Livro>> entries = livrosFavoritos.entrySet();
        for(Map.Entry<String, Livro>  livro : entries  ){
            String nome = livro.getValue().getNome();
            System.out.println("Nome dos livros : " + nome + ","+  "Autor: " + livro.getKey());
        }

        System.out.println("Imprima na ordem inserção");
        Map<String,Livro> livrosFavoritosOrderInsert = new LinkedHashMap<>(){{
            put("Harari",new Livro("Yaval Noah",456));
            put("Hawking",new Livro("Uma breve historia do tempo",330));
            put("Duhigg",new Livro("O poder do habito",220));
        }};
        System.out.println(livrosFavoritosOrderInsert);

        System.out.println("Ordem alfabetica dos autores");
        Map<String,Livro> livrosFavoritosOrderAuthorName = new TreeMap<>(livrosFavoritos);
        System.out.println(livrosFavoritosOrderAuthorName);

        System.out.println("Ordem alfabetica dos livros");
        Set<Map.Entry<String,Livro>>livrosFavoritosOrderLivroName = new TreeSet<>(new ComparatorName());
        livrosFavoritosOrderLivroName.addAll(livrosFavoritos.entrySet());
        System.out.println(livrosFavoritosOrderLivroName);

        System.out.println("Ordem numero de paginas");
        Set<Map.Entry<String,Livro>>livrosFavoritosOrderLivroPages = new TreeSet<>(new ComparatorPages());
        livrosFavoritosOrderLivroPages.addAll(livrosFavoritos.entrySet());
        System.out.println(livrosFavoritosOrderLivroPages);
    }
}

class Livro{
    private String nome;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return getNome().equals(livro.getNome()) && getPaginas().equals(livro.getPaginas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getPaginas());
    }

    private Integer paginas;

    @Override
    public String toString() {
        return "{" + "nome='" + nome + '\'' + ", paginas=" + paginas + '}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }
}

class ComparatorName implements Comparator<Map.Entry<String,Livro>>{


    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
    }
}

class ComparatorPages implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return Integer.compare(livro1.getValue().getPaginas(),livro2.getValue().getPaginas());
    }
}
