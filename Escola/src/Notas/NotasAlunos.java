package Notas;
import BancoDeDados.BancoDeDados;
import java.util.Scanner;

public class NotasAlunos extends BancoDeDados {

    public static void AddNotas(String disciplinaProfessor){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o RG do aluno que você deseja adicionar a nota na disciplina de " + disciplinaProfessor);
        String RG = scanner.nextLine();

        System.out.println("Digite a nota do aluno na disciplina de " + disciplinaProfessor);
        double nota = scanner.nextDouble();

        switch (disciplinaProfessor) {
            case "QUIMICA" -> {
                BancoDeDados.loginPessoas.get(RG).getAdicionarNotas().setQuimica(nota);
            }
            case "FISICA" -> {
                BancoDeDados.loginPessoas.get(RG).getAdicionarNotas().setFisica(nota);
            }
            case "BIOLOGIA" -> {
                BancoDeDados.loginPessoas.get(RG).getAdicionarNotas().setBiologia(nota);
            }
            case "MATEMATICA" -> {
                BancoDeDados.loginPessoas.get(RG).getAdicionarNotas().setMatematica(nota);
            }
            case "PORTUGUES" -> {
                BancoDeDados.loginPessoas.get(RG).getAdicionarNotas().setPortugues(nota);
            }
            case "HISTORIA" -> {
                BancoDeDados.loginPessoas.get(RG).getAdicionarNotas().setHistoria(nota);
            }
            case "GEOGRAFIA" -> {
                BancoDeDados.loginPessoas.get(RG).getAdicionarNotas().setGeografia(nota);
            }
            case "EDUCACAOFISICA" -> {
                BancoDeDados.loginPessoas.get(RG).getAdicionarNotas().setEducacaoFisica(nota);
            }
            case "ARTES" -> {
                BancoDeDados.loginPessoas.get(RG).getAdicionarNotas().setArtes(nota);
            }
            case "INGLES" -> {
                BancoDeDados.loginPessoas.get(RG).getAdicionarNotas().setIngles(nota);
            }

        }

    }
}


