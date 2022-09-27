package br.com.estruturasRepeticao;

public class CondicionalSimples {

    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSaque = 17.0;

        if(valorSaque < saldo){
            saldo = saldo - valorSaque;
            System.out.println(saldo);
        }
    }


}
