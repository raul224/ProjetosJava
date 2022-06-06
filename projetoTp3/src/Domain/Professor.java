package Domain;

import Exceptions.NomeIncompletoException;

public class Professor extends Pessoa{
    private String Disciplina;
    private Double ValorHora;
    private int HorasMensais;

    public Professor(){

    }

    public Professor(String Nome, String Email, String CPF, Double ValorHora){
        super(Nome, Email, CPF);
        this.ValorHora = ValorHora;
    }

    public Professor(String Nome, String Email, String CPF, String Disciplina, Double ValorHora, int HorasMensais){
        super(Nome, Email, CPF);
        this.Disciplina = Disciplina;
        this.ValorHora = ValorHora;
        this.HorasMensais = HorasMensais;
    }

    public String getDisciplina() {
        return Disciplina;
    }

    public Double getValorHora() {
        return ValorHora;
    }

    public int getHorasMensais() {
        return HorasMensais;
    }

    public void setDisciplina(String disciplina) {
        Disciplina = disciplina;
    }

    public void setValorHora(Double valorHora) {
        ValorHora = valorHora;
    }

    public void setHorasMensais(int horasMensais) {
        HorasMensais = horasMensais;
    }

    @Override
    public void setNomes() throws Exception {
        String nome = getNome();
        if(!nome.contains(" ")){
            throw new NomeIncompletoException("Nome inserido nao esta completo");
        }
        String[] nomeList = nome.split(" ");
        setPrimeiroNome(nomeList[0]);
        StringBuilder nomeNovo = new StringBuilder();

        for(int i = 1; i <= nomeList.length - 1; i++){
            nomeNovo.append(nomeList[i]).append(" ");
        }
        setSobreNome(nomeNovo.toString());
    }

    @Override
    public void situacao() {
        System.out.println("Primeiro nome: " + getPrimeiroNome());
        System.out.println("Sobre nome: " + getSobreNome());
        System.out.println("CPF: " + getCPF());
        System.out.println("Email: " + getEmail());
        System.out.println("Disciplina: " + getDisciplina());
        System.out.println("Valor Hora: " + getValorHora());
        System.out.println("Horas mensais: " + getHorasMensais());
        System.out.println("Salario: " + (getValorHora() * getHorasMensais()));
    }
}
