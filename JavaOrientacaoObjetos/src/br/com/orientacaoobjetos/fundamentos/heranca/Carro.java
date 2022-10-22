package br.com.orientacaoobjetos.fundamentos.heranca;

public class Carro extends Veiculo {
    private Integer numeroDePortas;
    private Double cavalos;
    private Double taraPeso;

    public Carro() {
    }

    public Integer getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(Integer numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public Double getCavalos() {
        return cavalos;
    }

    public void setCavalos(Double cavalos) {
        this.cavalos = cavalos;
    }

    public Double getTaraPeso() {
        return taraPeso;
    }

    public void setTaraPeso(Double taraPeso) {
        this.taraPeso = taraPeso;
    }
}
