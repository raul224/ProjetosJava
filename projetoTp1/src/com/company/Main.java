package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<String> listaNomes = new ArrayList<>();
    static List<Double> listaNotasV1 = new ArrayList<>();
    static List<Double> listaNotasV2 = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("1 - Registrar as notas de um novo aluno");
        System.out.println("2 - Consultar boletim de um aluno");
        System.out.println("3 - Consultar notas da turma");
        System.out.println("4 - Sair");

        Scanner scan = new Scanner(System.in);
        String op = scan.nextLine();

        while(!op.equals("4")){
            switch (op){
                case "1":
                    if (listaNomes.size() < 100){
                        System.out.println("Insira o nome do aluno");
                        String nome = scan.nextLine();
                        System.out.println("Insira a primeira nota do aluno");
                        String notaV1 = scan.nextLine();
                        System.out.println("Insira a segunda nota do aluno");
                        String notaV2 = scan.nextLine();

                        listaNomes.add(nome);
                        listaNotasV1.add(Double.parseDouble(notaV1));
                        listaNotasV2.add(Double.parseDouble(notaV2));

                        System.out.println("Aluno criado na posicao " + listaNomes.size());
                    } else {
                        System.out.println("A turma está cheia!");
                    }
                    break;
                case "2":
                    System.out.println("Insira o numero do aluno");
                    String num = scan.nextLine();

                    int numInt = Integer.parseInt(num);

                    if(numInt <= listaNomes.size()){
                        numInt = numInt - 1;
                        String Nome = listaNomes.get(numInt);
                        double NotaV1 = listaNotasV1.get(numInt);
                        double NotaV2 = listaNotasV2.get(numInt);
                        double Media = (NotaV1 + NotaV2)/2;

                        String Situacao = Media >= 7 ? "Aprovado" : "Reprovado";

                        System.out.println("Aluno: " + Nome);
                        System.out.println("Nota V1: " + NotaV1);
                        System.out.println("Nota V2: " + NotaV2);
                        System.out.println("Media: " + Media);
                        System.out.println("Situacao: " + Situacao);
                    } else {
                        System.out.println("Insira um numero valido");
                    }
                    break;
                case "3":
                    for (int i = 0; i <= listaNomes.size() - 1; i++){
                        double media = (listaNotasV1.get(i) + listaNotasV2.get(i))/2;
                        String Situacao = media>= 7 ? "Aprovado" : "Reprovado";

                        System.out.println("Aluno: " + listaNomes.get(i) + ", Nota V1: " + listaNotasV1.get(i) + ", Nota V2: " + listaNotasV2.get(i) + ", Media: " + media + ", Situacao: " + Situacao);
                    }
                    break;
                default:
                    System.out.println("Insira uma das opções validas!");
            }

            System.out.println("1 - Registrar as notas de um novo aluno");
            System.out.println("2 - Consultar boletim de um aluno");
            System.out.println("3 - Consultar notas da turma");
            System.out.println("4 - Sair");

            op = scan.nextLine();
        }
        System.out.println("Saindo...");
        scan.close();
    }
}
