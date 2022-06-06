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
        String op = ExibeMenu();

        while (!op.equals("4")) {
            switch (op) {
                case "1":
                    try {
                        Professor prof = new Professor();
                        System.out.println("Insira o nome completo do professor");
                        prof.setNome(scan.nextLine());
                        System.out.println("Insira o CPF do professor");
                        prof.setCPF(scan.nextLine());
                        System.out.println("Insira o Email do professor");
                        prof.setEmail(scan.nextLine());
                        System.out.println("Insira a disciplina do professor");
                        prof.setDisciplina(scan.next());
                        System.out.println("Insira o Valor Hora do professor");
                        prof.setValorHora(scan.nextDouble());
                        scan.nextLine();
                        System.out.println("Insira as horas trabalhadas do professor");
                        prof.setHorasMensais(scan.nextInt());
                        scan.nextLine();

                        prof.setNomes();
                        listaPessoas.add(prof);
                        System.out.println("Professor criado na posicao " + listaPessoas.size());

                    } catch (Exception ex) {
                        System.out.println("[ERRO] ao inserir dados do professor, erro: " + ex.getMessage());
                    } finally {
                        System.out.println("A lista agora tem: " + listaPessoas.size());
                    }
                    break;
                case "2":
                    try {
                        Aluno aluno = new Aluno();
                        System.out.println("Insira o nome completo do aluno");
                        aluno.setNome(scan.nextLine());
                        System.out.println("Insira o CPF do aluno");
                        aluno.setCPF(scan.nextLine());
                        System.out.println("Insira o Email do aluno");
                        aluno.setEmail(scan.nextLine());
                        System.out.println("Insira a turma do aluno");
                        aluno.setTurma(scan.nextLine());
                        System.out.println("Insira o ano de nascimento do aluno");
                        aluno.setAnoNascimento(scan.nextInt());
                        scan.nextLine();

                        aluno.setNomes();
                        listaPessoas.add(aluno);
                        System.out.println("aluno criado na posicao " + listaPessoas.size());
                    } catch (Exception ex) {
                        System.out.println("[ERRO] ao inserir dados do aluno, erro: " + ex);
                    } finally {
                        System.out.println("A lista agora tem: " + listaPessoas.size());
                    }
                    break;
                case "3":
                    try {
                        if (listaPessoas.size() > 0) {
                            System.out.println("Entre com o numero do docente/discente");
                            int num = scan.nextInt();
                            Pessoa pessoa = listaPessoas.get(num - 1);
                            pessoa.situacao();
                        }
                        System.out.println("Sem pessoas cadastradas no sistema");
                    } catch (Exception ex) {
                        System.out.println("[ERRO] Numero de docente/discente invalido, erro: " + ex.getMessage());
                    }
                    break;
                default:
                    System.out.println("Insira uma das opcoes validas!");
            }
            op = ExibeMenu();
        }
        System.out.println("Saindo...");
    }

    public static String ExibeMenu() {
        System.out.println("1 - Cadastrar professor");
        System.out.println("2 - Cadastrar aluno");
        System.out.println("3 - Consultar situacao de um docente/discente");
        System.out.println("4 - Sair");

        return scan.nextLine();
    }
}
