package br.com.estruturasRepeticao;

public class SwitchCasePlanoTelefonico {

    public static void main(String[] args) {
        String plano = "Midia";

        switch (plano){
            case "Turbo" : {
                System.out.println("+ 5gb youtube");
            }
            
            case "Midia" : {
                System.out.println(" +  Whats e Insta gratis");
            }

            case "Basic" : {
                System.out.println("Você tem direito a 100 min ligação ");
            }
            default:
                System.out.println("Defina um plano por favor");
        }
    }
}
