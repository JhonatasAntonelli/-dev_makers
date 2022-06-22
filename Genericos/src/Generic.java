import java.util.ArrayList;

public class Generic<T> {
//Generic é um objeto que aceita ser qualquer coisa(Strig, Integer, Boolean)
    // quem vai definir é quem instancia o objeto

 //Os tipos genéricos foram introduzidos a partir da versão 5 do Java,
// permitindo que um método seja capaz de operar sobre vários objetos de diferentes tipos.
// Em outras palavras, usando uma coleção genérica em Java, escreveremos uma classe,
// um método ou uma interface somente uma vez — e poderemos usá-los em qualquer tipo de dado.

    //Para isso é necessário declarar na classe a variavel generica  (Ex T) e utilizar
    //essa variavel em todos os locais

private T value;

public void add(T value){
    this.value = value;
}

    public T getValue() {
        return value;
    }
}
