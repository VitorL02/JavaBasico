package br.com.orientacaoobjetos.fundamentos.heranca.associacao.estrutural.composicao;

public class Endereco {
    private String endereco;
    private String CEP;
    private Integer numeroCasa;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public Integer getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(Integer numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public Endereco() {
    }
}
