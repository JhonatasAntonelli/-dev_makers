package Telas;
import BancoDeDados.BancoDeDados;
import Disciplina.EscolherDisciplina;
import Notas.Impressao;
import Pessoas.EditarCadastro;
import Pessoas.Pessoa;
import Telas.Login;

import java.util.Map;
import java.util.Scanner;

public class TelaDosAluno extends BancoDeDados {

    public static void TelaAluno(String RG){

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("O que deseja fazer?");
            System.out.println("""
                                        
                    Imprimir boletin completo? (1):\s                    
                    Enviar boletim por email(2):\s
                    Enviar boletim por celular (3)\s
                    Mandar E-mail para um professor? (4):\s
                    Mandar mensagem para um professor por telefone? (5):\s
                    Editar cadastro de aluno(6):\s 
                    Retornar ao login (7)\s""");


            String action = scanner.nextLine();

            switch (action) {
                case "1" -> {
                    Impressao.imprimir(RG);
                }
                case "2" -> {
                    System.out.println("O boletim foi enviado para o email " + loginPessoas.get(RG).geteMail());

                }
                case "3" -> {
                    System.out.println("O boletim foi enviado para o celular cadastrado " + loginPessoas.get(RG).getTelefone());

                }
                case "4" -> {
                    System.out.println("Qual o RG do professor que você quer mandar um E-mail? ");
                    String RGProfessor = scanner.nextLine();

                    System.out.println(" O E-mail do professor é " + BancoDeDados.loginPessoas.get(RGProfessor).geteMail());
                        }

                case "5" -> {
                    System.out.println("Qual o RG do professor que você quer mandar um E-mail? ");
                    String RGProfessor = scanner.nextLine();

                    System.out.println(" O Telefone do professor é " + BancoDeDados.loginPessoas.get(RGProfessor).getTelefone());
                }
                case "6" -> {
                    EditarCadastro.MudarCadastrPorAluno(RG, BancoDeDados.loginPessoas.get(RG).getTipoPessoa());
                }
                case "7" -> {
                    Login.fazerLogin();
                }

                default -> System.out.println("Opção inválida, por favor, informe outra");
            }
        }while (true);

    }

    }

