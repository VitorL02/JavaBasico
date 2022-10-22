package br.com.orientacaoobjetos.fundamentos.heranca.downcastupcast;

public class Faxineiro extends  Funcionario{
    private String nomeSetorLimpeza;
    private Integer codigoArmario;
    private boolean isInsalubre;

    public Faxineiro() {
    }

    public String getNomeSetorLimpeza() {
        return nomeSetorLimpeza;
    }

    public void setNomeSetorLimpeza(String nomeSetorLimpeza) {
        this.nomeSetorLimpeza = nomeSetorLimpeza;
    }

    public Integer getCodigoArmario() {
        return codigoArmario;
    }

    public void setCodigoArmario(Integer codigoArmario) {
        this.codigoArmario = codigoArmario;
    }

    public boolean isInsalubre() {
        return isInsalubre;
    }

    public void setInsalubre(boolean insalubre) {
        isInsalubre = insalubre;
    }
}
