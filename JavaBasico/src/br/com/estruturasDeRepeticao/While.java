package br.com.estruturasDeRepeticao;

import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        double mesadaTotal = 50.0;

        while ( mesadaTotal > 0){
            double valorDoce = valorAleatorio();
            if(valorDoce > mesadaTotal)
                valorDoce = mesadaTotal;
            System.out.println("Valor do doce " + valorDoce );
            mesadaTotal = mesadaTotal - valorDoce;
        }
        System.out.println("A mesada acabou");
    }

    public static  double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(1,50);
    }
}
