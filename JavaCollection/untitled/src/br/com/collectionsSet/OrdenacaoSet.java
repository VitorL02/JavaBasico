package br.com.collectionsSet;

import java.util.*;

public class OrdenacaoSet {
    public static void main(String[] args) {
        Set<Series> seriesList = new HashSet<>() {{
            add(new Series("Uncharted", "Ação", 60));
            add(new Series("Stranger things", "Suspense", 45));
            add(new Series("Dark", "drama", 45));
        }};
        System.out.println("Ordem Aleatoria: ");
        for (Series serie : seriesList)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTimeEpisode());


        System.out.println("Ordem de inserção");
        Set<Series> serieListOrder = new LinkedHashSet<>() {{
            add(new Series("Uncharted", "Ação", 60));
            add(new Series("Stranger things", "Suspense", 45));
            add(new Series("Breaking Bad", "Ação", 45));
        }};
        for (Series serie : serieListOrder)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTimeEpisode());

        System.out.println("Ordem por tempo de episodio");
        Set<Series> serieListOrderForTime = new TreeSet<>(seriesList);
        for (Series serie : serieListOrderForTime)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTimeEpisode());

        System.out.println("Ordem por Nome,genero e tempo");
        Set<Series> seriesList2 = new TreeSet<>(new ComparatorToNameGeneroTime());
        seriesList2.addAll(seriesList);
        for (Series serie : seriesList2)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTimeEpisode());


        System.out.println("Ordem por genero");
        Set<Series> seriesList3 = new TreeSet<>(new ComparatorToGenero());
        seriesList3.addAll(seriesList);
        for (Series serie : seriesList3)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTimeEpisode());
    }


}

class Series implements Comparable<Series> {

    private String nome;
    private String genero;
    private Integer timeEpisode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return nome.equals(series.nome) && genero.equals(series.genero) && timeEpisode.equals(series.timeEpisode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, timeEpisode);
    }

    @Override
    public String toString() {
        return "Series{" + "nome='" + nome + '\'' + ", genero='" + genero + '\'' + ", timeEpisode=" + timeEpisode + '}';
    }

    public Series(String nome, String genero, Integer timeEpisode) {
        this.nome = nome;
        this.genero = genero;
        this.timeEpisode = timeEpisode;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTimeEpisode() {
        return timeEpisode;
    }

    @Override
    public int compareTo(Series serie) {
        int tempoEpisodio = Integer.compare(this.getTimeEpisode(), serie.getTimeEpisode());
        if (tempoEpisodio != 0) return tempoEpisodio;

        return this.getGenero().compareTo(serie.getGenero());


    }
}

class ComparatorToNameGeneroTime implements Comparator<Series> {

    @Override
    public int compare(Series serie1, Series serie2) {

        int nome = serie1.getNome().compareTo(serie2.getNome());
        if (nome != 0) return nome;

        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if (genero != 0) return genero;


        return Integer.compare(serie1.getTimeEpisode(), serie2.getTimeEpisode());
    }
}

class ComparatorToGenero implements Comparator<Series>{
    @Override
    public int compare(Series serie1, Series serie2) {
      return serie1.getGenero().compareToIgnoreCase(serie2.getGenero());
    }
}