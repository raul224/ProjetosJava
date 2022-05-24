package Domain;

public abstract class Pessoa {
    public String Nome;
    public String Email;
    public String CPF;

    public Pessoa(String Nome, String Email, String CPF){
        this.Nome = Nome;
        this.Email = Email;
        this.CPF = CPF;
    }

    public abstract void Situacao();
}
