package br.com.orientacaoobjetos.fundamentos.heranca.associacao.comportamental;

public class Compra {

    private String nomeComprador;
    private Double valorCompra;

    public Compra() {
       
    }

    public String getNomeComprador() {
        return nomeComprador;
    }

    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    public double finalizar(Cupom cupom){
        return 0.0;
    }
    public double finalizar(){
        return 0.0;
    }
}
