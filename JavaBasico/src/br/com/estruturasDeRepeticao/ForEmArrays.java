package br.com.estruturasDeRepeticao;

public class ForEmArrays {
    public static void main(String[] args) {
        String alunos []={"Vitor","Clara","Jaqueline","Varley","Mateus"};

        for(int i = 0 ; i < alunos.length; i++){
            System.out.println("Aluno: " + alunos[i]);
        }

        System.out.println("Forma abreviada da iteração em java");
        for(String aluno : alunos){
            System.out.println(aluno);
        }


    }

}
