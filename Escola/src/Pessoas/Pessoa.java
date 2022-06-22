package Pessoas;
import Notas.AdicionarNotas;
import Disciplina.Disciplina;

public class Pessoa {

    private  String cargo;
    private AdicionarNotas adicionarNotas;
    private  String tipoPessoa;
    private String nome;
    private String RG;
    private String responsavel;
    private String telefone;
    private String eMail;
    private String senha;
    private Enum disciplina;
    private double salario;

    public Pessoa(String nome, String RG, String responsavel, String telefone, String eMial, String senha, AdicionarNotas adicionarNotas) {

        this.tipoPessoa = "Aluno";
        this.nome = nome;
        this.RG = RG;
        this.responsavel = responsavel;
        this.telefone = telefone;
        this.eMail = eMial;
        this.senha = senha;
        this.adicionarNotas = adicionarNotas;
    }

    public Pessoa (String nome, String RG, String telefone, String eMail, String senha, String disciplina, double salario) {

        this.tipoPessoa = "Professor";
        this.nome = nome;
        this.RG = RG;
        this.telefone = telefone;
        this.eMail = eMail;
        this.senha = senha;
        this.disciplina = Disciplina.valueOf(disciplina);
        this.salario = salario;
    }

    public Pessoa (String nome, String RG, String telefone, String eMail, String senha, double salario, String cargo) {

        this.tipoPessoa = "Direção";
        this.nome = nome;
        this.RG = RG;
        this.telefone = telefone;
        this.eMail = eMail;
        this.senha = senha;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public AdicionarNotas getAdicionarNotas() {
        return adicionarNotas;
    }

    public void setAdicionarNotas() {
        this.adicionarNotas = adicionarNotas;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public Enum getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Enum disciplina) {
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
