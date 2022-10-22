package br.com.trycatch;

import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada {

    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Digite o nome do arquivo + extensão");
            imprimirArquivoConsole(nomeDoArquivo);


        System.out.println("Apesar da exception ou não o programa continua");
    }

    private static void imprimirArquivoConsole(String nomeDoArquivo)  {
        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        }catch (ImpossivelAbrirArquivoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch(IOException e){
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado!  " + e.getCause());
        }
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAbrirArquivoException {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAbrirArquivoException(file.getName(),file.getPath());
        }
    }

}


 class ImpossivelAbrirArquivoException extends Exception{

    private String nomeDoArquivo;
    private String diretorioArquivo;

     public ImpossivelAbrirArquivoException( String nomeDoArquivo, String diretorioArquivo) {
         super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretorio: " + diretorioArquivo);
         this.nomeDoArquivo = nomeDoArquivo;
         this.diretorioArquivo = diretorioArquivo;
     }

     @Override
     public String toString() {
         return "ImpossivelAbrirArquivoException{" + "nomeDoArquivo='" + nomeDoArquivo + '\'' + ", diretorioArquivo" +
                 "='" + diretorioArquivo + '\'' + '}';
     }

 }
