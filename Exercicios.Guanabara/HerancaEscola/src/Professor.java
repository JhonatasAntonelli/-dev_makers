public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public double receberAumento(double aumento){
        this.setSalario(this.getSalario() + aumento);
        return this.salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String dadosProfessor() {
        return "Professor{" +
                "especialidade='" + especialidade + '\'' +
                ", salario=" + salario +
                '}';
    }
}
