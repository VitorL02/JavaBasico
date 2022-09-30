package br.com.streamApi;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Function;

public class StreamApi {
    public static void main(String[] args) {

        System.out.println("Ordem Aleatoria");

        Map<Integer, Contato> listaContatos = new HashMap<>() {{
            put(1, new Contato("Vitor", 2545646));
            put(4, new Contato("Cleiton", 98789789));
            put(3, new Contato("Luna", 564489));
        }};
        System.out.println(listaContatos);
        for (Map.Entry<Integer, Contato> contato : listaContatos.entrySet()) {
            System.out.println("Id do contato " + contato.getKey() + " - " + "Contato:  " + contato.getValue());
        }

        System.out.println("Ordem Inserção");
        Map<Integer, Contato> listaContatosOrder = new LinkedHashMap<>() {{
            put(1, new Contato("Vitor", 2545646));
            put(2, new Contato("Cleiton", 98789789));
            put(3, new Contato("Luna", 564489));
        }};
        System.out.println(listaContatosOrder);

        System.out.println("Ordem Id");
        Map<Integer, Contato> listaContatosOrderById = new TreeMap<>(listaContatos);
        System.out.println(listaContatosOrderById);

        System.out.println("Ordem Numero Telefone com Classe anonimas");
        Set<Map.Entry<Integer, Contato>> listaContatosAnonima = new TreeSet<>(new Comparator<Map.Entry<Integer,
                Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> contato1, Map.Entry<Integer, Contato> contato2) {
                return Integer.compare(contato1.getValue().getNumero(), contato2.getValue().getNumero());
            }
        });
        listaContatosAnonima.addAll(listaContatos.entrySet());
        System.out.println(listaContatosAnonima);

        Set<Map.Entry<Integer, Contato>> listaContatosAnonimaCompare =
                new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {
            @Override
            public Integer apply(Map.Entry<Integer, Contato> contatoNumberTel) {
                return contatoNumberTel.getValue().getNumero();
            }
        }));
        System.out.println(listaContatosAnonimaCompare);

        System.out.println("Ordem Numero Telefone com Lambda");
        Set<Map.Entry<Integer, Contato>> listaContatosLambdaCompare =
                new TreeSet<>(Comparator.comparing(contato -> contato.getValue().getNumero()));
        listaContatosLambdaCompare.addAll(listaContatos.entrySet());

        for (Map.Entry<Integer, Contato> contatoLambda : listaContatosLambdaCompare) {
            System.out.println("Id do contato " + contatoLambda.getKey() + " - " + "Contato:  " + contatoLambda.getValue());
        }

        System.out.println("Ordem Nome com Lambda");
        Set<Map.Entry<Integer, Contato>> listaContatosLambdaCompareName =
                new TreeSet<>(Comparator.comparing(contatoNome -> contatoNome.getValue().getNome()));
        listaContatosLambdaCompareName.addAll(listaContatos.entrySet());

        for (Map.Entry<Integer, Contato> contatoLambda : listaContatosLambdaCompareName) {
            System.out.println("Id do contato " + contatoLambda.getKey() + " - " + "Contato:  " + contatoLambda.getValue());
        }

    }
}

class Contato {
    private String nome;
    private Integer numero;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return getNome().equals(contato.getNome()) && getNumero().equals(contato.getNumero());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNumero());
    }

    @Override
    public String toString() {
        return "{" + "nome='" + nome + '\'' + ", numero=" + numero + '}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }
}
