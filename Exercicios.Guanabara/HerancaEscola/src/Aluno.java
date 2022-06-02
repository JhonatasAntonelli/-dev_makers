public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public void cancelarMatricula(){
        this.setMatricula(0);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int mqtricula) {
        this.matricula = mqtricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String dadosAluno() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}';
    }
}
