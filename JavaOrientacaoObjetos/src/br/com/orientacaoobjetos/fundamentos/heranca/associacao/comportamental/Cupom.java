package br.com.orientacaoobjetos.fundamentos.heranca.associacao.comportamental;

public class Cupom {
    private String nomeCupom;
    private Double quantidadeDesconto;

    public String getNomeCupom() {
        return nomeCupom;
    }

    public void setNomeCupom(String nomeCupom) {
        this.nomeCupom = nomeCupom;
    }

    public Double getQuantidadeDesconto() {
        return quantidadeDesconto;
    }

    public void setQuantidadeDesconto(Double quantidadeDesconto) {
        this.quantidadeDesconto = quantidadeDesconto;
    }

    public Cupom() {
    }
}
