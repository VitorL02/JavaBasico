package br.com.estruturasRepeticao;

public class CondicaoTernaria {
    public static void main(String[] args) {
        int nota = 6;

        String resultado = nota >= 7 && nota <= 10 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        String resultadoComplementar = nota >= 7 && nota <= 10 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" :"Reprovado";
        System.out.println(resultadoComplementar);
    }
}
