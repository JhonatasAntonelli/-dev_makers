public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (peso < 52.2){
            categoria = "invalido";
        }
        else if (peso <= 70.3){
            categoria = "leve";
        }
        else if (peso <= 83.9){
            categoria = "Médio";
        }
        else if (peso <= 120.2) {
            categoria = "Pesado";
        } else{
            categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("------------------------------------");
        System.out.printf("Agora com vocês o lutador %s," +
                "%s, %d anos, \n altura de %.2f, peso de %.2f, da categoria %s, \n com " +
                "%d vitórias, %d derrotas e %d empates\n",
                this.nome, this.nacionalidade, this.idade, this.altura, this.peso, this.categoria,
                this.vitorias, this.derrotas, this.empates);
        System.out.println("------------------------------------");
    }
    public void status(){
        System.out.println("------------------------------------");
        System.out.println("nome:" + this.nome +
                "\n Peso: " + this.peso + "\n Vitórioas: " + this.vitorias +
                "\n Derrotas: " + this.derrotas + "\n Empates: " + this.empates);
        System.out.println("------------------------------------");
    }

    public void ganharLuta(){
        setVitorias(getVitorias()+1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
    }

    public void empates(){
        setEmpates(getEmpates()+1);
    }
}
