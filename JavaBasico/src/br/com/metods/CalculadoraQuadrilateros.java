package br.com.metods;

public class CalculadoraQuadrilateros {


    public static double calculaQuadrilateroArea(double ladoQuadrado){

        double resultado = Math.pow(ladoQuadrado,2);
        return resultado;
    }

    public  static  double calculaQuadrilateroArea(double ladoRetangulo,double alturaRetangulo){

        double resultado = ladoRetangulo * alturaRetangulo;

        return resultado;
    }

    public  static  double calculaQuadrilateroArea(double baseMaiorTrapezio,double alturaTrapezio,double baseMenorTrapezio){

        double resultado = ((baseMaiorTrapezio +baseMenorTrapezio ) * alturaTrapezio) / 2 ;

        return resultado;
    }

}
