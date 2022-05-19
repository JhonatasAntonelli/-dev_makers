public class Controle implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;


    public Controle(int volume, boolean ligado, boolean tocando) {
        this.volume = volume;
        this.ligado = ligado;
        this.tocando = tocando;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        if (!(this.isLigado())) {
            this.setLigado(true);
        }
    }

    @Override
    public void desligar() {
        if(this.isLigado()) {
            this.setLigado(false);
        }
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado? " + this.isLigado());
        System.out.println("Esta tocando? " + this.isTocando());
        System.out.print("O volume é " + this.getVolume() + "  ");
        for (int i = 0; i < getVolume(); i += 5) {
            System.out.print("*");
        }
        System.out.println();

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu....");
    }

    @Override
    public void maisVolume() {
    if (isLigado() && isTocando()){
        this.setVolume(this.getVolume()+5);
    }
    }

    @Override
    public void menosVolume() {

        if (isLigado()&& isTocando()){
            this.setVolume(this.getVolume()-5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0){
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())){
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()){
            setTocando(false);
        }

    }
}
