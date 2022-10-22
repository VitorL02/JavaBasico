package br.com.trycatch;

import javax.swing.*;
import java.io.*;

public class CheckedException {

    public static void main(String[] args) {
        String nomeDoArquivo = "cleancodes.txt";
//        String nomeDoArquivo = "cleancode.txt"; Nome Correto
        try {
            imprimirArquivoConsole(nomeDoArquivo);
        }catch (FileNotFoundException error){
            JOptionPane.showMessageDialog(null,
                    "Revise o nome do arquivo! O mesmo não foi encontrado! " + error.getCause());
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado!  " + e.getCause());
        }

        System.out.println("Apesar da exception ou não o programa continua");
    }

    private static void imprimirArquivoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);
        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null);
        bw.flush();
        br.close();
    }
}
