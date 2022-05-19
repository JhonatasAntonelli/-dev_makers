import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sobreNome;
    private int idade;
    private int anoNascimento = LocalDate.now().getYear() - idade;

    private Sexo sexoEnum;


    public Pessoa(String nome, String sobreNome, int idade, Sexo sexoEnum) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.anoNascimento = anoNascimento;
        this.sexoEnum = sexoEnum;
    }

    public void andar(){
        System.out.printf("Eu %s %s estou correndo \n ", this.nome, this.sobreNome);
    }
    public void nadar(){
        System.out.printf("Eu %s estou nadando \n", this.nome);
    }
    public void correr(){
        System.out.printf("Eu %s estou correndo \n", this.nome);
    }
    public void quemSouEu(){
        System.out.printf("%s está correndo %n", this.nome);

    }
    public int anoNascimento(){
        return LocalDate.now().getYear() - idade;
    }
}
