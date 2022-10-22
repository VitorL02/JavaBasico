package br.com.trycatch;

import javax.swing.*;

public class UncheckedException {


    public static void main(String[] args) {
        boolean continueLoop = true;
        do{

            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
            try {
                int result = dividir(Integer.parseInt(a),Integer.parseInt(b));
                System.out.println(result);
                continueLoop = false;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Entrada Invalida, informe um numero inteiro!");
                //e.printStackTrace();
            }catch ( ArithmeticException e){
                JOptionPane.showMessageDialog(null,"Impossivel dividir por 0! ");
            }
            finally { //Finaly sera executado mesmo com a exception estourando
                System.out.println("Chegeou ate aqui...");
            }
        }while(continueLoop);

        System.out.println("Codigo realiza");
    }

    private static int dividir(int a, int b) {
        return a / b;
    }
}
