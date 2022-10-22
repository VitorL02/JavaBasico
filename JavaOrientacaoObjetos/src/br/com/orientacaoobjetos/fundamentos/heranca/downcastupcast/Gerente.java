package br.com.orientacaoobjetos.fundamentos.heranca.downcastupcast;

public class Gerente extends  Funcionario{
    private Integer codAcesso;
    private String nomeSetorGerenciado;

    public Gerente() {
    }

    private Integer numeroDeFuncionariosCustodia;

    public Integer getCodAcesso() {
        return codAcesso;
    }

    public void setCodAcesso(Integer codAcesso) {
        this.codAcesso = codAcesso;
    }

    public Integer getNumeroDeFuncionariosCustodia() {
        return numeroDeFuncionariosCustodia;
    }

    public void setNumeroDeFuncionariosCustodia(Integer numeroDeFuncionariosCustodia) {
        this.numeroDeFuncionariosCustodia = numeroDeFuncionariosCustodia;
    }

    public String getNomeSetorGerenciado() {
        return nomeSetorGerenciado;
    }

    public void setNomeSetorGerenciado(String nomeSetorGerenciado) {
        this.nomeSetorGerenciado = nomeSetorGerenciado;
    }


}
