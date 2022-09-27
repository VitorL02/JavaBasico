package br.com.retornos;

public class Retornos {

    public static double area(double lado ){
        return lado * lado;
    }

    public static double area(double lado1,double lado2){
        return lado1 * lado2;
    }

    public static double area(double lado1,double lado2,double altura){
        return ((lado1 + lado2) * altura)/2;
    }
}
