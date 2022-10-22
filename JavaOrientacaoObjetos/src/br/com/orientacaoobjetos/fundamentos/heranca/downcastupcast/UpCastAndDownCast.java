package br.com.orientacaoobjetos.fundamentos.heranca.downcastupcast;

public class UpCastAndDownCast {
    public static void main(String[] args) {

        //DownCast
        Gerente gerenteUpcast = (Gerente) new Funcionario();
        Faxineiro faxineiroUpcast = (Faxineiro) new Funcionario();

        //Upcast
        Funcionario funcionarioUpCastGerente = new Gerente();
        Funcionario funcionarioUpCastFaxineiro = new Faxineiro();

    }
}
