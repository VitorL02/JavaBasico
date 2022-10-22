package br.com.orientacaoobjetos.fundamentos.heranca.associacao.agregacao;

//O aluno pode existir sem uma disciplina e vice-versa, ou seja ele e o contrario de composicao

public class Disciplina {
    Aluno aluno;
    private String nomeDisciplina;

    public Disciplina() {
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
}
