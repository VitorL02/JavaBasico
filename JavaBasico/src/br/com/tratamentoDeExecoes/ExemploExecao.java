package br.com.tratamentoDeExecoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.17");
        System.out.println(valor);

        try {
            valor = NumberFormat.getInstance().parse("a1.17");
            System.out.println(valor);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
