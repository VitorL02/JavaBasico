package br.com.orientacaoobjetos.fundamentos.classeExercicios;

import br.com.orientacaoobjetos.fundamentos.classeExercicios.Livro;

public class Fundamentos {

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setAutor("Autor Teste");
        livro.setNome("Livro teste");
        livro.setNumeroPaginas(150);

        Carro carro = new Carro();
        carro.setCapacidadeTanque(41.0);
        System.out.println( carro.valorEncherTanque(5.47));


    }

}


