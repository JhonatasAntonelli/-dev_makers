package Telas;
import BancoDeDados.BancoDeDados;
import java.util.Map;
import java.util.Scanner;

public class Login extends BancoDeDados {

    public static String fazerLogin() {

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Digite o RG do usuário");
            String RG = scanner.nextLine();

            System.out.println("Digite senha do usuário");
            String senha = scanner.nextLine();

            for (Map.Entry i : BancoDeDados.loginPessoas.entrySet()) {
                if (i.getKey().equals(RG) && BancoDeDados.loginPessoas.get(RG).getSenha().equals(senha)) {

                    if (BancoDeDados.loginPessoas.get(RG).getTipoPessoa().equals("Aluno")) {
                        TelaDosAluno.TelaAluno(RG);
                    }
                    if (BancoDeDados.loginPessoas.get(RG).getTipoPessoa().equals("Professor")) {
                        String disciplina = String.valueOf(BancoDeDados.loginPessoas.get(RG).getDisciplina());
                        TelaDoProfessor.TelaProfessores(disciplina, RG);
                    }
                    if (BancoDeDados.loginPessoas.get(RG).getTipoPessoa().equals("Direção")) {
                        TelaDirecao.TelaDaDirecao("Direção");
                    }
                }
            }
            System.out.println("Logim ou senha não encontrado, por favor tente novamente.");
        } while (true);
    }
}