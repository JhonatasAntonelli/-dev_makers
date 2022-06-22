package Telas;
import BancoDeDados.BancoDeDados;
import Notas.Impressao;
import Notas.NotasAlunos;
import Pessoas.CadsatrarPessoa;
import Pessoas.EditarCadastro;
import Telas.Login;

import java.util.Scanner;

public class TelaDirecao extends BancoDeDados{

    public static void TelaDaDirecao(String tipo) {

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("O que deseja fazer?");
            System.out.println("""
            Mudar a nota de aluno (1):\s
            Editar cadastro de aluno (2): \s
            Editar cadastro de Professor (3)\s
            Editar o cadastro da direção (4)\s
            Imprimir Boletim do aluno (5) \s
            Enviar boletim  por e-mail (6)\s
            Enviar boletim para o celular (7)\s
            Cadastrar nova pessoa (8)\s
            Retornar para pagina de login (9)\s
            """);

            String action = scanner.nextLine();

            switch (action) {
                case "1" -> {
                    System.out.println("De qual disciplina você quer alterar a nota?");
                    String disciplinaProfessor = scanner.nextLine();
                    NotasAlunos.AddNotas(disciplinaProfessor);
                }
                case "2", "3", "4" -> {
                    System.out.println("Qual o RG do Aluno que você quer alterar o cadastro?");
                    String RG = scanner.nextLine();
                    EditarCadastro.MudarCadastrPorAluno(RG, tipo);
                }
                case "5" -> {
                    System.out.println("Qual o RG do Aluno que você quer imprimir o boletim?");
                    String RG = scanner.nextLine();
                    Impressao.imprimir(RG);
                }
                case "6" -> {
                    System.out.println("Qual o RG do Aluno que você quer enviar o boletim por E-mail?");
                    String RG = scanner.nextLine();
                    System.out.println("O boletim foi enviado para o email " + loginPessoas.get(RG).geteMail());
                }
                case "7" -> {
                    System.out.println("Qual o RG do Aluno que você quer enviar o boletim por telefone?");
                    String RG = scanner.nextLine();
                    System.out.println("O boletim foi enviado para o celular cadastrado " + loginPessoas.get(RG).getTelefone());

                }
                case "8" -> {
                    CadsatrarPessoa.CadastrarPessoa();
                }
                case "9" -> {
                    Login.fazerLogin();
                }
                default -> System.out.println("Opção inválida, por favor, informe outra");
            }
        } while (true);
    }
}
