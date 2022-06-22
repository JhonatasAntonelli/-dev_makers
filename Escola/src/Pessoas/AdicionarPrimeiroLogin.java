package Pessoas;
import BancoDeDados.BancoDeDados;
import Disciplina.Disciplina;
import Notas.AdicionarNotas;
import Pessoas.Pessoa;

public class AdicionarPrimeiroLogin extends BancoDeDados {
    public static void AdicionarPimeiraDirecao(){
        Pessoa direcao = new Pessoa("Admin", "123456", "123456", "admin@gmail.com", "Admin", 0, "Diretor");
        String RGDireção = "123456";
        BancoDeDados.loginPessoas.put(RGDireção, direcao);


        String disciplina = String.valueOf(Disciplina.QUIMICA);
        Pessoa professor = new Pessoa("Admin", "02468", "123456", "admin@gmail.com", "professor", disciplina, 0);
        String RGProfessor = "2468";
        BancoDeDados.loginPessoas.put(RGProfessor, professor);


        AdicionarNotas notas = new AdicionarNotas(0,0,0,0,0,0,0,0,0,0);

        Pessoa aluno = new Pessoa("Admin", "13579", "Pai", "123456", "admin@gmail.com", "aluno", notas);
        String RGAluno = "13579";
        BancoDeDados.loginPessoas.put(RGAluno, aluno);
    }
}
