package br.com.orientacaoobjetos.fundamentos.heranca.polimorfismoandsobrescrita;

public class Main {

    public static void main(String[] args) {
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(),new ClasseFilha2(),new ClasseMae()};


        for(ClasseMae classe : classes){
            classe.Metodo1();
        }
        System.out.println("");

        for (ClasseMae classe : classes){
            classe.Metodo2();
        }

        //sobrescrita pura, trabalha diretamente com o tipo

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.Metodo2();


    }
}
