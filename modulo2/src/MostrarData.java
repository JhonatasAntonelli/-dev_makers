import java.util.Scanner;

public class MostrarData {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia");
        int dia = sc.nextInt();
        System.out.println("Digite o mês");
        int mes = sc.nextInt();
        System.out.println("Digite o ano");
        int ano = sc.nextInt();

        Data data = new Data(dia, mes, ano);
        data.mostrarData();
    }
}
