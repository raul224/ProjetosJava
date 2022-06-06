package Testes;

import Domain.Professor;

public class ProfessorTeste {

    public static void main(String[] args) {
        Professor teste1 = new Professor("Raul Araujo Pires", "raulpires224@gmail.com", "18593655742", 90.0);
        try {
            teste1.setNomes();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        teste1.situacao();

        Professor teste2 = new Professor("Raul Portes", "rafaelportes@gmail.com", "18222720767", "Matematica",70.0, 40);
        try{
            teste2.setNomes();
        } catch (Exception e){
            throw new RuntimeException(e);
        }

        teste2.situacao();

        Professor teste3 = new Professor();
        teste3.setNome("Maria Joana");
        try{
            teste3.setEmail("mariajoana@gmail.com");
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        teste3.setCPF("18294782950");
        teste3.setDisciplina("Historia");
        teste3.setValorHora(70.0);
        teste3.setHorasMensais(30);
        try {
            teste3.setNomes();
        } catch (Exception e){
            throw new RuntimeException(e);
        }
        teste3.situacao();
    }
}
