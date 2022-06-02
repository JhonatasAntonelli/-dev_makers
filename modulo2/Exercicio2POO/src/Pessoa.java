public class Pessoa {
    protected String identidade;
    protected String nome;

    public Pessoa(String identidade, String nome) {
        this.identidade = identidade;
        this.nome = nome;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
