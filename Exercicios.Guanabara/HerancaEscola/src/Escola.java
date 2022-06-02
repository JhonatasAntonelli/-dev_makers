public class Escola {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Jhonatas");
        p1.setIdade(34);
        p1.setSexo("Masculino");

        p3.setNome("Jhonatas");
        p3.setEspecialidade("Química");
        p3.setSalario(5500);
        p3.setIdade(34);
        p3.setSexo("Masculino");
        

        System.out.println(p1.dadosPessoa());
        System.out.println(p3.dadosPessoa() + "\n" + p3.dadosProfessor());
    }
}
