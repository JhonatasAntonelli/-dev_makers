public class MapExeplos {

    //Os conjuntos de dados do tipo map são também conhecidos por “arrays associativos”.
    // São muito úteis durante o desenvolvimento de aplicações em Java quando precisamos pesquisar e atualizar
    // elementos correspondentes com base em uma chave específica para determinado valor.
    // Assim, o Java map “mapeia” os valores contidos no conjunto de dados tomando as chaves por referência, resumidamente.
    //o tipo map não possibilita o armazenamento de duas chaves idênticas.
    //HashMap(): implementação de Map — é importante levar em consideração que o uso dessa classe não realiza a ordenação dos elementos;
    //LinkedHashMap(): a mesma coisa que a classe anterior, mas com ordenamento dos elementos contidos no map em ordem de inserção.
    // Suporta o uso de valor e chaves nulos (“null”).
    //TreeMap(): o treeMap é implementação das interfaces Map e sortedMap — sempre usa a ordenação ascendente (do menor para o maior).
    // É bastante usado na manipulação de dados hierárquicos e não tem suporte para uso de valores nulos (“null”).

    String nome;
    int idade;
    Boolean disponivel;

    public MapExeplos(String nome, int idade, Boolean disponivel) {
        this.nome = nome;
        this.idade = idade;
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}
