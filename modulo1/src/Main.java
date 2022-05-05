import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();

        double area = raio * raio * 3.14159;

        System.out.printf("A = %.4f", area);


        }
    }


