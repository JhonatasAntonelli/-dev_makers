import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {

        Map<String, Integer> agenda = new HashMap<String, Integer>();
        agenda.put("Luma", 11222);
        agenda.put("Alex", 22333);
        agenda.put("Andrea", 3344);
        agenda.put("Lumas", 11222);

        MapExeplos mapExeplos = new MapExeplos("JhonatasBonitão", 34, true);
        String senha = "123";

        Map<String, MapExeplos> logins = new HashMap<>();
        logins.put(senha, mapExeplos);

        System.out.println(logins.get(senha).getNome());


        System.out.println(agenda);

//Pelo motivo de a interface map não ser instanciável, usamos a classe HashMap() para manipular o conjunto.
// HashMap é a classe responsável por implementar uma estrutura map para a interface Map,
// armazenar chaves únicas (hashes) e as atribuir a valores.

        Map<String, String> meu_Map = new HashMap<>();

        meu_Map.put("T", "melhor");
        meu_Map.put("r", "escola");
        meu_Map.put("y", "de");
        meu_Map.put("b", "programação");
        meu_Map.put("e", "e tecnologia");

        for (Map.Entry<String, String> be : meu_Map.entrySet()) {

            System.out.print(be.getKey() + ":");
            System.out.println(be.getValue());
        }

//hashtables São também comumente conhecidas como “tabelas de dispersão”. É uma estrutura em forma de tabela,
// a qual é responsável por implementar um array abstrato e associá-lo a determinado tipo de estrutura de dado —
// realizando a correspondência das chaves com os valores contidos em um map, resumidamente.
//A utilização mais comum das hashtables é a realização de buscas em estruturas map de maneira agilizada.

        Hashtable<Integer,String> ht=new Hashtable<>();

        ht.put(100,"AAA");
        ht.put(102,"BBB");
        ht.put(101,"CCC");
        ht.put(103,"DDD");

        for(Map.Entry i:ht.entrySet()){
            System.out.println(i.getKey()+" "+i.getValue());
        }

//o método size() não recebe parâmetros — o método retorna o tamanho do map, ou seja, o número dos pares de chaves e valores contidos nele.

        System.out.println("O tamanho do meu HashMap é : " + ht.size());

//O método boolean isEmpty() realiza uma verificação nas chaves e valores contidos no map para saber se está ou não vazio.
// Não usa argumentos, e retorna verdadeiro em caso de algum par chave-valor esteja vazio:

        System.out.println("Tem algum lugar null ? " + ht.isEmpty());

//Os métodos containsKey() e containsValue() funcionam da mesma forma, mas um apenas para chaves e o outro somente para valores, respectivamente. A sintaxe é:
//Retorna um dado booleano: verdadeiro, para os casos em que o elemento verificado esteja presente, e falso, para caso negativo.

        System.out.println("Verificar se a chave 0 existe " + ht.containsKey(0));

        System.out.println("Verificar se a chave 10 existe " + ht.containsKey(100));

        System.out.println("Verificar se a chave 2 existe: " + ht.containsValue("Be"));

//O método get() é usado para recuperar o elemento especificado no parâmetro que damos para ele. A sintaxe do get() é:

        System.out.println("Verificar a chave 0: " + ht.get(100));

        System.out.println("Verificar a chave 5: " + ht.get(2));

//Put() e remove() são métodos responsáveis por colocar ou retirar elementos em uma estrutura map. Sua síntaxe é:

        ht.remove(100, "AAA");
        System.out.println(ht);

//o forEach(), usado para iterar os valores e chaves da interface;
//o replace(), utilizado para substituir elementos;
//o merge(), operação funcional usada para mesclar diferentes maps, entre outros métodos.

//map.compute: Mapeia a chave e seu valor atual — um exemplo de compute() incrementando um valor inteiro no map:

       ht.compute(10, (k, v) -> (v == null) ? "AAA" : v+1);

//map.computePresent: Mapeia chaves e valores, atualizando o valor especificado para a chave designada.

        ht.computeIfPresent(100, (key, val) -> "AAA".toString().toUpperCase());

        ht.computeIfAbsent(100, (key) -> "AAA");
    }

}
