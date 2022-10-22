package br.com.orientacaoobjetos.fundamentos.interfaces;

public class Calculadora  implements  OperacaoMatematica{
    @Override
    public void soma(double operadorOne, double operadorTwo) {
        double v = operadorOne + operadorTwo;
    }

    @Override
    public void subtracao(double operadorOne, double operadorTwo) {
        double response = operadorOne - operadorTwo;
    }

    @Override
    public void multipicacao(double operadorOne, double operadorTwo) {
        double response = operadorOne * operadorTwo;
    }

    @Override
    public void divisao(double operadorOne, double operadorTwo) {
        double response = operadorOne / operadorTwo;

    }
}
