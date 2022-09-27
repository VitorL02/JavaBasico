package br.com.estruturasDeRepeticao;

public class BreakEContinue {
    public static void main(String[] args) {
        for(int numero = 1 ; numero <= 10; numero ++){
            if(numero ==3){
                //Break interrompe o laço 100%
                break;
            }
            System.out.println(numero);
        }
        System.out.println("Continue");
        for(int numeroContinue = 1 ; numeroContinue <= 10; numeroContinue ++){
            if(numeroContinue ==3){
                //Continue  interrompe somente a iteração da condição, nesse caso pulando o 3
                continue;
            }
            System.out.println(numeroContinue);
        }
        System.out.println("Somente pares de 0 a 100: ");
        for(int somentePares = 1 ; somentePares <= 100; somentePares ++){
            if(somentePares % 2 == 1 ){
                //Continue  interrompe somente a iteração da condição, nesse caso pulando o 3
                continue;
            }
            System.out.println(somentePares);
        }


    }
}
