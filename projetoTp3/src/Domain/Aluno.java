package Domain;

import Exceptions.NomeIncompletoException;

public class Aluno extends Pessoa{
    private String Turma;
    private int AnoNascimento;
    public Aluno() {

    }

    public Aluno(String Nome, String Email, String CPF, String Turma, int AnoNascimento){
        super(Nome, Email, CPF);
        this.Turma = Turma;
        this.AnoNascimento = AnoNascimento;
    }

    public String getTurma() {
        return Turma;
    }

    public void setTurma(String turma) {
        Turma = turma;
    }

    public int getAnoNascimento() {
        return AnoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        AnoNascimento = anoNascimento;
    }

    @Override
    public void setNomes() throws Exception {
        String nome = getNome();
        int primeiroEspaco = nome.indexOf(" ");

        if(primeiroEspaco == -1){
            throw new NomeIncompletoException("O campo nome nao esta completo");
        }
        String primeiro = nome.substring(0, primeiroEspaco);
        String sobre = nome.substring(primeiroEspaco + 1);

        setPrimeiroNome(primeiro);
        setSobreNome(sobre);
    }

    @Override
    public void situacao(){
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCPF());
        System.out.println("Email: " + getEmail());
        System.out.println("Ano nascimento: " + getAnoNascimento());
        System.out.println("Turma: " + getTurma());
    }
}
