import javax.swing.*;
import java.time.LocalDateTime;

public class ClassA {
    //variavel de escopo(ou de classe). Sempre que é iniciada variavel na raiz, fora do escopo,
    // ela é iniciada com valor padrão para Srtring é null e tipo númerico é 0,
    // double 0,0 e bouleane é False.
    //Se essa variavel é criada dentro de um método, inclusive o main,
    //para usar ela deve ser inicializada, caso seja criada na raiz, como nesse caso, ela não precisa ser inicializada
    // Se tiver 2 variaveis com o mesmo nome, para usar a variavel da classe, deve ser utilizado o 'this'
    //This sempre referencia a variavel da classe

    private String nome;
    public int idade;
    String genero;
    private LocalDateTime dataAtual;
    double vivo;

    public void metodo1() {

        int numero = 0;
        System.out.println(numero);

    }
    public void metodo2(){

    }

    public void gravarNome (String nome){
        this.nome = nome;
        System.out.println(nome);
    }

    public String retorneNome (){
        return this.nome;
    }
}
