package Domain;

public class Professor extends Pessoa{
    public String Disciplina;
    public Double ValorHora;
    public int HorasMensais;

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


    @Override
    public void Situacao() {
        System.out.println("Nome: " + this.Nome);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Email: " + this.Email);
        System.out.println("Disciplina: " + this.Disciplina);
        System.out.println("Valor Hora: " + this.ValorHora);
        System.out.println("Valor Hora: " + this.HorasMensais);
        System.out.println("Salário: " + this.ValorHora * this.HorasMensais);
    }
}
