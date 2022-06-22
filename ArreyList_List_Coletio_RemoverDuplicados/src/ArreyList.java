import java.lang.reflect.Type;
import java.util.*;

import static java.util.Collections.swap;

public class ArreyList {

    public static void main(String[] args) {

//Foi criado um arreyList de Objetos, nesse caso o objeto é BrincandoComArreyList criado em outra classe
        Collection<BrincandoComArreyList> nomes = new ArrayList();

        BrincandoComArreyList nome1 = new BrincandoComArreyList("Jhonatas", 37443, "05486028911", 120774);

        nomes.add(nome1);
//Aqui foi criado um arreyList de numeros inteiros
        Collection<Integer> numeros = new ArrayList();
        numeros.add(10);
        numeros.add(15);
        numeros.add(18);
        numeros.add(12);
        numeros.add(10);
        numeros.add(15);
        numeros.add(11);
        numeros.add(15);
        numeros.add(19);
        numeros.add(0);

//Aqui foi criado uma lista em um arreyList. A interface List é implementada pela classe ArrayList,
// fornecendo métodos para que seja possível manipular os objetos baseados na posição em que estão.

        List<Integer> lista = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            lista.add(i);
        }

//Map é um objeto que opera armazenando chaves e valores. As chaves nunca poderão ser repetidas e sempre devem ter algum valor.
// Seu funcionamento pode ser comparado à abstração das funções em matemática. Essa interface utiliza métodos comuns para operar,
// como set(), add(), remove() etc.

        //Nesse exeplo o primeiro String é a chave e o segundo é o valor
        Map<String,String> map = new HashMap<>();
        map.put("Teclado", "teclado");
        map.put("Mouse", "Mouze");
        map.put("Monitor", "monitor");
        map.put("Monitor", "gabinete");

        //Esse sout vai imprimir a chave de todos os elementos do HashMap,
        //Exceto os repetidos
        for (String Key: map.keySet()){
            System.out.println("A chave é " + Key);
        }
        //Para imprimir tanto a chave quanto o valor

        for (Map.Entry<String, String> entry :  map.entrySet()){
            System.out.println(entry.getKey()+" A chave e o Valor "+ entry.getValue());
        }

//Aqui voi tirado os numeros duplicados
        Collection<Integer> semDuplicados = new HashSet<Integer>(numeros);

        System.out.println(semDuplicados);

        System.out.println(lista);

        System.out.println(lista.get(10));

    }
//principais métodos usados com a classe Arraylist
//new ArrayList(): cria um novo ArrayList. Por padrão, essa classe tem a capacidade inicial de 10 elementos;
//add(item): é o método utilizado para adicionar novos elementos ao ArrayList. Os elementos são colocados no fim da lista, por padrão;
//remove(posição): remove um item de determinada posição na lista criada;
//set(item, lista): usamos para definir um elemento em determinado index;
//get(item): retorna o objeto ligado a determinado índice;
//iterator(): responsável por iterar um elemento na sequência adequada do vetor;
//clear(): limpa todos os elementos contidos na lista.
// ToString transforma tudo em String e imprime
// instanceof verifica o tipo da vatiavel. Ex: instanceof Stringe, se for String ele aceita
}