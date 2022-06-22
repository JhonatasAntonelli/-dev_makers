public class Peixe extends Animal{
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias");
    }

    @Override
    public void emitorSom() {
        System.out.println("Peixe não emite som");
    }
    private void corEscama(){

    }
    public void soltarBolha(){
        System.out.println("Soltando bolhas");
    }

}
