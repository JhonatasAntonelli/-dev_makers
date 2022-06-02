import java.util.Random;

public class NovoLutador {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", "Françes", 31, 1.75, 68.9, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasileiro", 29, 1.68, 57.8, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "Americano,", 35, 1.65, 89.9, 12, 2, 1);
        l[3] = new Lutador("DeadCode", "Australiano", 28, 1.93, 81.6, 13, 0, 2);
        l[4] = new Lutador("UfoCode", "Brasileiro", 37, 1.70, 119.3, 5, 4, 3);
        l[5] = new Lutador("Nerdard", "Americano", 30, 1.81, 105.7, 12, 2, 4);

        Luta UEC01 = new Luta();
        Random lutador1 = new Random();
        int l1 = lutador1.nextInt(5);
        Random lutador2 = new Random();
        int l2 = lutador2.nextInt(5);

        UEC01.marcarLuta(l[l1], l[l2]);
        UEC01.lutar();

        l[l1].apresentar();
        l[l2].apresentar();
    }
}
