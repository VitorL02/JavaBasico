package br.com.orientacaoobjetos.fundamentos.heranca;

public class Veiculo {

    private String modelo;
    private Double quantidadeTanque;
    private Integer numeroSeguro;

    public Veiculo() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getQuantidadeTanque() {
        return quantidadeTanque;
    }

    public void setQuantidadeTanque(Double quantidadeTanque) {
        this.quantidadeTanque = quantidadeTanque;
    }

    public Integer getNumeroSeguro() {
        return numeroSeguro;
    }

    public void setNumeroSeguro(Integer numeroSeguro) {
        this.numeroSeguro = numeroSeguro;
    }
}
