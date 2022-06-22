package Pessoas;

import Disciplina.Disciplina;
import BancoDeDados.BancoDeDados;
import java.util.Scanner;

public class EditarCadastro extends BancoDeDados {
    public static void MudarCadastrPorAluno(String RG, String tipo) {
        Scanner scanner = new Scanner(System.in);
        do {
            if (tipo.equals("Aluno") || tipo.equals("Direção")) {

                System.out.println("O que deseja alterar?");
                System.out.println("""                     
                        Editar nome de aluno(1)
                        Editar número de telefone de aluno (2):\s
                        Editar E-mail de aluno (3):\s
                        Editar senha de aluno (4):""");
            }

            if (tipo.equals("Professor") || tipo.equals("Direção")) {

                System.out.println("""              
                        Edita nome do professor (5):\s
                        Editar número de RG de professor (6):\s
                        Editar número de telefone de professor (7):\s
                        Editar E-mail de professor (8):\s
                        Editar senha de professor (9):""");
            }

            if (tipo.equals("Direção")) {

                System.out.println("""
                        Editar RG do aluno (10):\s           
                        Editar Resposnsável pelo aluno (11):\s
                        Adicionar nome da Direção (12):\s
                        Edita E-mail Direção (13):\s
                        Editar número de RG da Direção (14):\s
                        Editar número de telefone da direção (15):\s                
                        Editar senha da direção (16):\s
                        Editar Salários (17):\s
                        Editar Disciplina Professor (18):\s
                        Editar Tipo de Pessoa (19):\s
                        Editar cargo da direção (20):\s
                        """);

            }

            String action = scanner.nextLine();

            switch (action) {

                case "1", "5", "12" -> {
                    System.out.println("Qual o novo nome que deseja adicionar adicionar? ");
                    String nome = scanner.nextLine();
                    BancoDeDados.loginPessoas.get(RG).setNome(nome);
                }
                case "3", "9", "13" -> {
                    System.out.println("Qual o novo número E-mail que deseja adicionar? ");
                    String email = scanner.nextLine();
                    BancoDeDados.loginPessoas.get(RG).seteMail(email);
                }
                case "2", "7", "15" -> {
                    System.out.println("Qual o novo número de telefone que deseja adicionar? ");
                    String telefone = scanner.nextLine();
                    BancoDeDados.loginPessoas.get(RG).setTelefone(telefone);
                }
                case "4", "8", "16" -> {
                    System.out.println("Qual a nova senha que deseja adicionar? ");
                    String senha = scanner.nextLine();
                    BancoDeDados.loginPessoas.get(RG).setNome(senha);
                }
                case "6", "10", "14" -> {
                    System.out.println("Qual o novo RG que deseja adicionar? ");
                    String novoRG = scanner.nextLine();
                    BancoDeDados.loginPessoas.get(RG).setRG(novoRG);
                }
                case "18" -> {
                    System.out.println("Qual a nova disciplina do Professor? ");
                    String disciplina = scanner.nextLine().toUpperCase();
                    BancoDeDados.loginPessoas.get(RG).setDisciplina(Disciplina.valueOf(disciplina));
                }
                case "17" -> {
                    System.out.println("Qual o novo salário? ");
                    double salario = scanner.nextDouble();
                    BancoDeDados.loginPessoas.get(RG).setSalario(salario);
                }
                case "19" -> {
                    System.out.println("Qual o tipo de pessoa? ");
                    String novoTipo = scanner.nextLine();
                    BancoDeDados.loginPessoas.get(RG).setTipoPessoa(novoTipo);
                }
                case "20" -> {
                    System.out.println("Qual o novo cargo? ");
                    String cargo = scanner.nextLine();
                    BancoDeDados.loginPessoas.get(RG).setCargo(cargo);
                }

                default -> System.out.println("Opção inválida, por favor, informe outra");
            }
        } while (true);


    }
}
