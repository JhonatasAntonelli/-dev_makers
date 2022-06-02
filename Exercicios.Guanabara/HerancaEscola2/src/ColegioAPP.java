public class ColegioAPP {
    public static void main(String[] args) {

        Visitante v = new Visitante();
        Aluno a = new Aluno();
        AlunoBolsista aB = new AlunoBolsista();

        v.setIdade(34);
        v.setNome("Jhonatas");
        v.setSexo("Masculino");

        v.fazerAniversario();
        System.out.println(v.imprimir());


    }
}
