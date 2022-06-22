package Notas;
import BancoDeDados.BancoDeDados;
public class GetNotas extends BancoDeDados {

    public static double getDaNota(String disciplina, String RGAluno){

        double notaDisciplina = 0;

        switch (disciplina) {
            case "QUIMICA" -> {
                notaDisciplina = BancoDeDados.loginPessoas.get(RGAluno).getAdicionarNotas().getQuimica();
            }
            case "FISICA" -> {
                notaDisciplina = BancoDeDados.loginPessoas.get(RGAluno).getAdicionarNotas().getFisica();
            }
            case "BIOLOGIA" -> {
                notaDisciplina = BancoDeDados.loginPessoas.get(RGAluno).getAdicionarNotas().getBiologia();
            }
            case "MATEMATICA" -> {
                notaDisciplina = BancoDeDados.loginPessoas.get(RGAluno).getAdicionarNotas().getMatematica();
            }
            case "PORTUGUES" -> {
                notaDisciplina = BancoDeDados.loginPessoas.get(RGAluno).getAdicionarNotas().getPortugues();
            }
            case "HISTORIA" -> {
                notaDisciplina = BancoDeDados.loginPessoas.get(RGAluno).getAdicionarNotas().getHistoria();
            }
            case "GEOGRAFIA" -> {
                notaDisciplina = BancoDeDados.loginPessoas.get(RGAluno).getAdicionarNotas().getGeografia();
            }
            case "EDUCACAOFISICA" -> {
                notaDisciplina = BancoDeDados.loginPessoas.get(RGAluno).getAdicionarNotas().getEducacaoFisica();
            }
            case "ARTES" -> {
                notaDisciplina = BancoDeDados.loginPessoas.get(RGAluno).getAdicionarNotas().getArtes();
            }
            case "INGLES" -> {
                notaDisciplina = BancoDeDados.loginPessoas.get(RGAluno).getAdicionarNotas().getIngles();
            }
            default -> System.out.println("Opção inválida, por favor, informe outra");
        }

        return notaDisciplina;
    }
}
