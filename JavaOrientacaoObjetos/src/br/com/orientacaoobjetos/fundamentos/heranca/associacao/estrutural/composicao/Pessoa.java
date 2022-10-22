package br.com.orientacaoobjetos.fundamentos.heranca.associacao.estrutural.composicao;

//Com parte detodo, um compoe o outro, endereço depende de pessoa para existir

public class Pessoa {
    Endereco endereco;
    private String nome;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa() {
    }
}
