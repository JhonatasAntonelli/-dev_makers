public class ControleRemoto {
    public static void main(String[] args) {
        Controle controle = new Controle(50, false, false);
        controle.ligar();
        controle.abrirMenu();
        controle.maisVolume();
        controle.abrirMenu();
        controle.play();
        controle.maisVolume();
        controle.abrirMenu();
        controle.ligarMudo();
        controle.abrirMenu();
    }
}
