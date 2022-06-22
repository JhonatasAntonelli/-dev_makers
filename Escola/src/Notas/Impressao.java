package Notas;
import BancoDeDados.BancoDeDados;
public class Impressao extends BancoDeDados {
    public static void imprimir(String RG){
        System.out.println("------------------------------------------------------");
        System.out.println("----------------Colegio Let's Code--------------------");
        System.out.println("Suas notas são:");
        System.out.println("Química: " + BancoDeDados.loginPessoas.get(RG).getAdicionarNotas().getQuimica());
        System.out.println("Física: " + BancoDeDados.loginPessoas.get(RG).getAdicionarNotas().getFisica());
        System.out.println("Biologia: " + BancoDeDados.loginPessoas.get(RG).getAdicionarNotas().getBiologia());
        System.out.println("Matemática: " + BancoDeDados.loginPessoas.get(RG).getAdicionarNotas().getMatematica());
        System.out.println("Português: " + BancoDeDados.loginPessoas.get(RG).getAdicionarNotas().getPortugues());
        System.out.println("História: " + BancoDeDados.loginPessoas.get(RG).getAdicionarNotas().getHistoria());
        System.out.println("Geografia: " + BancoDeDados.loginPessoas.get(RG).getAdicionarNotas().getGeografia());
        System.out.println("Inglês: " + BancoDeDados.loginPessoas.get(RG).getAdicionarNotas().getIngles());
        System.out.println("Artes: " + BancoDeDados.loginPessoas.get(RG).getAdicionarNotas().getArtes());
        System.out.println("Educação Física: " + BancoDeDados.loginPessoas.get(RG).getAdicionarNotas().getEducacaoFisica());
        System.out.println("-----------O Colegio Let's Code Agradece--------------");
        System.out.println("------------------------------------------------------");
    }
}
