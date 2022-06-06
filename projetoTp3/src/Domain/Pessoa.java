package Domain;

import Exceptions.CpfIncorretoException;
import Exceptions.EmailIncorretoException;
import Exceptions.NomeIncompletoException;
import Exceptions.SobreNomeIncorretoException;

public abstract class Pessoa {
    private String Nome;
    private String PrimeiroNome;
    private String SobreNome;
    private String Email;
    private String CPF;

    public Pessoa(){

    }

    public Pessoa(String Nome, String Email, String CPF){
        this.Nome = Nome;
        this.Email = Email;
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public String getEmail() {
        return Email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setPrimeiroNome(String primeiroNome) throws Exception{
        if (primeiroNome.isBlank()){
            throw new NomeIncompletoException("Nome vazio");
        }

        PrimeiroNome = primeiroNome;
    }

    public void setSobreNome(String sobreNome) throws Exception{
        SobreNome = sobreNome;

        if(sobreNome.isBlank()){
            throw new SobreNomeIncorretoException("Sobrenome vazio");
        }
    }

    public void setEmail(String email) throws Exception {
        if(!email.contains("@")){
            throw new EmailIncorretoException("Email invalido");
        }

        if(email.isBlank()){
            throw new EmailIncorretoException("Campo CPF vazio");
        }
        Email = email;
    }

    public String getPrimeiroNome() {
        return PrimeiroNome;
    }

    public String getSobreNome() {
        return SobreNome;
    }

    public void setCPF(String CPF) throws Exception {
        if(CPF.length() != 11){
            throw new CpfIncorretoException("CPF não possui o tamanho esperado");
        }

        if(CPF.isBlank()){
            throw new CpfIncorretoException("Campo CPF vazio");
        }
        this.CPF = CPF;
    }

    public abstract void situacao();

    public abstract void setNomes() throws Exception;
}
