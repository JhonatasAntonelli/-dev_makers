package Telas;
import BancoDeDados.BancoDeDados;
import Notas.GetNotas;
import Notas.SetNotas;
import Pessoas.EditarCadastro;
import Telas.Login;

import java.util.Scanner;

public class TelaDoProfessor extends BancoDeDados {

    public static void TelaProfessores(String disciplinaProfessor, String RG){

        Scanner scanner = new Scanner(System.in);
        System.out.println("O que deseja fazer?");
        System.out.println("""
            Adicionar nota de aluno (1):\s
            Edita seu nome no cadastro (2):\s
            Verificar nota do aluno (3):\s
            Retornar ao login (4):\s
            """);

        String action = scanner.nextLine();

        switch (action) {
            case "1" -> {

                System.out.println("Qual o RG do aluno que você deseja alterar a nota?");
                String RGAluno = scanner.nextLine();
                System.out.println("Qual a nota do aluno que você deseja alterar ?");
                double nota = scanner.nextDouble();

                SetNotas.SetDaDisciplina(disciplinaProfessor, RGAluno, nota, RG);
            }
            case "2" -> {
               EditarCadastro.MudarCadastrPorAluno(RG, BancoDeDados.loginPessoas.get(RG).getTipoPessoa());
            }
            case "3"-> {
                System.out.println("Qual o RG do aluno que você deseja saber a nota?");
                String RGAluno = scanner.nextLine();
                double nota = GetNotas.getDaNota(disciplinaProfessor, RGAluno);
                System.out.printf("A nota do aluno %s, na disciplina de %s é %d ", BancoDeDados.loginPessoas.get(RGAluno).getNome(),
                        disciplinaProfessor, nota);
            }
            case "4" -> {
                Login.fazerLogin();
            }

                default -> throw new IllegalStateException("Unexpected value: " + action);
        }

    }

}
