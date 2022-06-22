public class Aves extends Animal{
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitorSom() {
        System.out.println("Som de Aves");
    }
    private void corPena(){

    }
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }
}
