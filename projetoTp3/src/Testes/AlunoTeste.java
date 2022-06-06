package Testes;

import Domain.Aluno;

public class AlunoTeste {
    public static void main(String[] args) {
        try {
            Aluno teste1 = new Aluno("Raul Araujo Pires", "raulpires224@gmail.com", "18593655742", "Segundo ano", 1999);
            teste1.setNomes();
            teste1.situacao();

            Aluno teste2 = new Aluno();
            teste2.setNome("Carlos Ferreira");
            teste2.setEmail("carlosferreira@gmail.com");
            teste2.setCPF("18596755423");
            teste2.setTurma("Terceiro ano");
            teste2.setAnoNascimento(2000);
            teste2.setNomes();
            teste2.situacao();
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
