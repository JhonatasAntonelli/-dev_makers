public abstract class Pessoa {
    private String nome;
    private int idade;
    private String Sexo;

    public final void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
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

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public String imprimir() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", Sexo='" + Sexo + '\'' +
                '}';
    }

}
