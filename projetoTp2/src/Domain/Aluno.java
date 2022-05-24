package Domain;

import java.sql.Date;

public class Aluno extends Pessoa{
    public String Turma;
    public int AnoNascimento;

    public Aluno(String Nome, String Email, String CPF, String Turma, int AnoNascimento){
        super(Nome, Email, CPF);
        this.Turma = Turma;
        this.AnoNascimento = AnoNascimento;
    }

    public void Situacao(){
        System.out.println("Nome: " + this.Nome);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Email: " + this.Email);
        System.out.println("Ano nascimento: " + this.AnoNascimento);
        System.out.println("Turma: " + this.Turma);
    }
}
