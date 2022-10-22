package br.com.orientacaoobjetos.fundamentos.classeExercicios;

public class Carro {

    private String modelo;
    private String placa;
    private Integer numeroDeSerie;
    private String fabricante;

    private Double capacidadeTanque;


    public Double valorEncherTanque(Double valorGasolina){

        valorGasolina = getCapacidadeTanque() * valorGasolina;
        return valorGasolina;

    }

    public Double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(Double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    private Integer portas;

    public Integer getPortas() {
        return portas;
    }

    public void setPortas(Integer portas) {
        this.portas = portas;
    }

    public Carro() {

    }
    public Carro(Integer numeroDeSerie ) {
        this.numeroDeSerie = numeroDeSerie;

    }
    public Carro(String modelo ) {
        this.modelo = modelo;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(Integer numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }


}
