public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho(String novoSetor){
        this.setSetor(novoSetor);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String dadosFuncionarios() {
        return "Funcionario{" +
                "setor='" + setor + '\'' +
                ", trabalhando=" + trabalhando +
                '}';
    }
}
