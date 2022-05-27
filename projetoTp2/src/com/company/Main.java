package com.company;

import Domain.Aluno;
import Domain.Pessoa;
import Domain.Professor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Pessoa> listaPessoas = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        var op = ExibeMenu();

        while(!op.equals("4")){

            switch (op){
                case "1":
                    if (listaPessoas.size() < 100){
                        System.out.println("Insira o nome do professor");
                        String nome = scan.nextLine();
                        System.out.println("Insira o CPF do professor");
                        String cpf = scan.nextLine();
                        System.out.println("Insira o Email do professor");
                        String email= scan.nextLine();
                        System.out.println("Insira a disciplina do professor");
                        String disciplina = scan.nextLine();
                        System.out.println("Insira o Valor Hora do professor");
                        String valorHoraString = scan.nextLine();
                        Double valorHora = Double.parseDouble(valorHoraString);
                        System.out.println("Insira as horas trabalhadas do professor");
                        String horasTrabalho = scan.nextLine();
                        int horasTrabalhoInt = Integer.parseInt(horasTrabalho);

                        Professor prof = new Professor(nome, email, cpf, disciplina, valorHora, horasTrabalhoInt);

                        listaPessoas.add(prof);

                        System.out.println("Professor criado na posicao " + listaPessoas.size());
                    } else {
                        System.out.println("O sistema está cheio!");
                    }
                    break;
                case "2":
                    if (listaPessoas.size() < 100){
                        System.out.println("Insira o nome do aluno");
                        String nome = scan.nextLine();
                        System.out.println("Insira o CPF do aluno");
                        String cpf = scan.nextLine();
                        System.out.println("Insira o Email do aluno");
                        String email= scan.nextLine();
                        System.out.println("Insira a turma do aluno");
                        String disciplina = scan.nextLine();
                        System.out.println("Insira o ano de nascimento do aluno");
                        String anoNascString = scan.nextLine();
                        int anoNascimento = Integer.parseInt(anoNascString);

                        Aluno aluno = new Aluno(nome, email, cpf, disciplina,anoNascimento);

                        listaPessoas.add(aluno);

                        System.out.println("aluno criado na posicao " + listaPessoas.size());
                    } else {
                        System.out.println("O sistema está cheia!");
                    }
                    break;
                case "3":
                    System.out.println("Entre com o numero do docente/discente");
                    String numString = scan.next();
                    scan.close();
                    int num = Integer.parseInt(numString);

                    Pessoa pessoa = listaPessoas.get(num);
                    pessoa.Situacao();
                    break;
                default:
                    System.out.println("Insira uma das opções validas!");
            }
            scan.close();

            op = ExibeMenu();
        }
        System.out.println("Saindo...");

    }

    public static String ExibeMenu(){
        System.out.println("1 - Cadastrar professor");
        System.out.println("2 - Cadastrar aluno");
        System.out.println("3 - Consultar situação de um docente/discente");
        System.out.println("4 - Sair");

        String op = scan.nextLine();
        return op;
    }
}
