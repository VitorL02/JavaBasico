package br.com.orientacaoobjetos.fundamentos.heranca;

public class Caminhao extends Veiculo {

    private Integer numeroEixos;
    private Double pesoCarregavel;

    public Integer getNumeroEixos() {
        return numeroEixos;
    }

    public void setNumeroEixos(Integer numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    public Double getPesoCarregavel() {
        return pesoCarregavel;
    }

    public void setPesoCarregavel(Double pesoCarregavel) {
        this.pesoCarregavel = pesoCarregavel;
    }

    public Caminhao() {
    }
}
