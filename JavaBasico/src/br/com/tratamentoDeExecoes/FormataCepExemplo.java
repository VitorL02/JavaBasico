package br.com.tratamentoDeExecoes;

public class FormataCepExemplo {
    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("2525000");
            System.out.println(cepFormatado);
        } catch (CepInvalido e) {
            System.out.println("Cep não está com 8 digitos");
        }
    }

    public static String formatarCep(String cep) throws CepInvalido{

        if(cep.length() != 8){
            throw new CepInvalido();
        }
        return "23.525-000";
    }
}
