package br.com.tratamentoDeExecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            try {
                System.out.println("Digite seu nome: ");
                String nome = scanner.next();
                System.out.println("Digite sua altura: ");
                double altura = scanner.nextDouble();
                System.out.println("Digite sua idade: ");
                int idade = scanner.nextInt();

                System.out.println("Seu nome é: " + nome);
                System.out.println("Sua idade é: " + idade);
                System.out.println("Seu altura é: " + altura);
                scanner.close();

            }catch (InputMismatchException e){
                System.out.println("Os campos idade e altura precisam ser numericos!");
            }
        }





}
