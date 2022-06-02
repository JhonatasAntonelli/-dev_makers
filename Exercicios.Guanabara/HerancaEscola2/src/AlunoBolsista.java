public class AlunoBolsista extends Aluno {
    private int bolsa;

    private void renovarBolsa(){
        System.out.println("Bolsa Renovada");
    }
    @Override
    public void pagarMensalidade(){
        System.out.println("Matricula Paga");
    }

    @Override
    public String imprimir() {
        return "AlunoBolsista{" +
                "bolsa=" + bolsa +
                '}';
    }
}
