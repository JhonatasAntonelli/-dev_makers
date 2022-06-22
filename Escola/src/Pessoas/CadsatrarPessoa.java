package Pessoas;
import BancoDeDados.BancoDeDados;
import Disciplina.Disciplina;
import Disciplina.EscolherDisciplina;
import Notas.AdicionarNotas;


import java.util.Scanner;

public class CadsatrarPessoa extends BancoDeDados {

    public static void CadastrarPessoa(){

        Scanner scanner = new Scanner(System.in);

        do {
        System.out.println("O cadastro é para aluno (digite 1), professor (digite 2), direção (digite 3)?");

            String action = scanner.nextLine();

            if (action.matches("[1]")){

                System.out.println("Qual o nome do aluno?");
                String nome = scanner.nextLine();
                System.out.println("Qual o RG do aluno?");
                String RG = scanner.nextLine();
                System.out.println("Qual o nome responsável pelo aluno?");
                String responsavel = scanner.nextLine();
                System.out.println("Qual o telefone do responsável pelo aluno?");
                String telefone = scanner.nextLine();
                System.out.println("Qual o E-mail do responsável pelo aluno?");
                String email = scanner.nextLine();
                System.out.println("Qual a senha para login?");
                String senha = scanner.nextLine();

                Disciplina disciplina = null;
                AdicionarNotas notas = new AdicionarNotas(0,0,0,0,0,0,0,0,0,0);

                Pessoa aluno = new Pessoa(nome, RG, responsavel, telefone, email, senha, notas);

                BancoDeDados.loginPessoas.put(RG, aluno);
                System.out.println("Cadastro realizado com sucesso!");
                break;
            }
            if (action.matches("[2]")) {

                System.out.println("Qual o nome do Professor?");
                String nome = scanner.nextLine();
                System.out.println("Qual o RG do Professor?");
                String RG = scanner.nextLine();
                System.out.println("Qual o telefone do Professor?");
                String telefone = scanner.nextLine();
                System.out.println("Qual o E-mail do Professor?");
                String email = scanner.nextLine();
                System.out.println("Qual a senha para login?");
                String senha = scanner.nextLine();
                System.out.println("Qual o salário do Professor?");
                double salario = scanner.nextDouble();

                System.out.println("Qual a disciplina do Professor?");
                String disciplina = EscolherDisciplina.listaDeDisciplina();

                Pessoa professor = new Pessoa(nome, RG, telefone, email, senha, disciplina, salario);
                BancoDeDados.loginPessoas.put(RG, professor);
                System.out.println("Cadastro realizado com sucesso!");

                break;
            }

            if (action.matches("[3]")) {

                System.out.println("Qual o nome do funcionário?");
                String nome = scanner.nextLine();
                System.out.println("Qual o RG do funcionário?");
                String RG = scanner.nextLine();
                System.out.println("Qual o telefone do funcionário?");
                String telefone = scanner.nextLine();
                System.out.println("Qual o E-mail do funcionário?");
                String email = scanner.nextLine();
                System.out.println("Qual a senha para login?");
                String senha = scanner.nextLine();
                System.out.println("Qual o salário do funcionário?");
                double salario = scanner.nextDouble();
                System.out.println("Qual o cargo do funcionário?");
                String cargo = scanner.nextLine();

                Pessoa direcao = new Pessoa(nome, RG, telefone, email, senha, salario, cargo);
                BancoDeDados.loginPessoas.put(RG, direcao);
                System.out.println("Cadastro realizado com sucesso!");

                break;
            }
            else {
                System.out.println("Opção invalida, tente novamente");
            }
        }while(true);
    }
}
