import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as informações requeridas");

        System.out.println("Qual o seu nome? ");
        String nome = sc.next();

        System.out.println("Qual o seu sobrenome?");
        String sobrenome = sc.next();

        System.out.println("Qual a sua idade? ");
        int idade = sc.nextInt();

        System.out.println("Sexo - MASCULINO/FEMININO");
        String sexoStr = sc.next();
        Sexo sexo = Sexo.valueOf(sexoStr.toUpperCase());
        //O valueof converte um objeto em string

        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, sexo);

        pessoa.quemSouEu();

        pessoa.correr();

        System.out.printf("Eu %s nasci em %d", nome, pessoa.anoNascimento());

    }
}
