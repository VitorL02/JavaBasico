package br.com.estruturasDeRepeticao;

import java.util.Random;

public class doWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do{
            System.out.println("Telefone Tocando!");

        }while(tocando());

            System.out.println("Alô");
    }
    public static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu " + atendeu);
        //negando o ato de tocar o telefone quando for true
        return !atendeu;
    }
}
