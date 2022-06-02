public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public void pagarMensalidade(){
        System.out.println("Matricula Paga");
    }

    public String imprimir() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}';
    }
}
