import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Supermercado {
    private static int linhas = 2;
    private static int colunas = 9;
    private static Object[][] productInfo = new Object[linhas][colunas];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index;
        do{
            index = menu(sc);
            switch (index) {
                case 1:
                    cadastrarComprar(sc);
                    break;
                case 2:
                    imprimir();
                    break;
                case 3:
                    listar(sc);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Valor digitado incorretamente");

            }
        }while(index != 0);
    }

    public static int menu(Scanner sc){
        do {
            System.out.println("----------------------------------------");
            System.out.println("1 - Cadastrar/Comprar produto: ");
            System.out.println("2 - Imprimir Estoque ");
            System.out.println("3 - Listar os produtos pelo tipo ");
            System.out.println("0 - Sair");
            System.out.println("----------------------------------------");

            int validacao = sc.nextInt();
            String aux = sc.nextLine();

            if (validacao == 1 || validacao == 2 || validacao == 3 || validacao == 0) {
                return validacao;
            } else {
                System.out.println("Digite as opções corretamente");
            }
        }while(true);
    }

    public static void verificaMatriz(){

        for (int i = 0; i < productInfo.length; i++) {

            if (productInfo[i] == null){
                break;
            }else{
                Object [][] newMatriz = new Object[productInfo.length*2][colunas];
                for (int k = 0; k < productInfo.length; k++) {
                    for (int j = 0; j < linhas; j++) {
                        newMatriz[k][j] = productInfo [k][j];
                    }
                }
                productInfo = newMatriz;
                break;
            }
        }
    }

    public static void cadastrarComprar(Scanner sc){
        System.out.println("Digite o identificador: ");
        String identifier = sc.nextLine();
        for (int i = 0; i < productInfo.length; i++) {
            if(identifier.equals(productInfo[i][0])){
                comprar(sc, i);
                break;
            }
            if (productInfo[i][0] == null){
                cadastrar(sc, identifier, i);
                break;
            }
        }
    }

    public static void comprar(Scanner sc, int i){

        verificaMatriz();

        do {
            System.out.println("Custo: ");
            try {
                productInfo[i][4] = sc.nextDouble();
            } catch (NumberFormatException ignored) {

            }
        } while (((Double) productInfo[i][4]) <= 0);

        do {
            System.out.println("Quantidade:");
            try {
                int add = sc.nextInt();
                int sum = add + (int)productInfo[i][5];
                productInfo[i][5] = sum;

            } catch (NumberFormatException ignored) {

            }
        } while (((int) productInfo[i][5]) <= 0);

        do{
            System.out.println("Nome: ");
            productInfo[i][3] = sc.nextLine();

        }while(productInfo[i][3] == null);
    }

    public static void cadastrar(Scanner sc, String identifier, int i) {

        verificaMatriz();

        productInfo[i][0]= identifier;

        do {
            System.out.println("Tipo do produto: 1 - Alimento, 2 - Higiene, 3 Bebida.");
            int tipo = sc.nextInt();
            try {
                if (tipo == 1) {
                    productInfo[i][1] = Tipo.ALIMENTO;
                }
                else if (tipo == 2) {
                    productInfo[i][1] = Tipo.HIGIENE;
                }
                else if (tipo == 3) {
                    productInfo[i][1] = Tipo.BEBIDA;
                }
            }catch (NumberFormatException ignored){

            }
        } while(( productInfo[i][1]) == null);

        do{
            System.out.println("Marca:");

            String auxb = sc.nextLine();
            productInfo[i][2] = sc.nextLine();

        }while(productInfo[i][2] == null);

        do{
            System.out.println("Nome: ");
            productInfo[i][3] = sc.nextLine();

        }while(productInfo[i][3] == null);

        do{
            System.out.println("Custo: ");
            try {
                productInfo[i][4] = sc.nextDouble();
            } catch (NumberFormatException ignored) {

            }
        }while(((Double) productInfo[i][4]) <= 0);

        do{
            System.out.println("Quantidade:");
            try{
                productInfo[i][5] = sc.nextInt();
            }catch (NumberFormatException ignored){
            }

        } while(((int) productInfo[i][5]) <= 0);

        //
        Tipo tipoProduto = (Tipo) productInfo[i][1];

        double precoCusto = (double) productInfo[i][4];

        productInfo[i][6] = Tipo.calcularVenda(tipoProduto, precoCusto);

        productInfo[i][7] = LocalDateTime.now();

        productInfo[i][8] = productInfo[i][5];

        return;

    }
    public static void imprimir(){

        for (int i = 0; i < productInfo.length; i++) {

            if (productInfo[i] == null){
                break;

            }else {

                LocalDateTime dataHoraEntrada = (LocalDateTime) productInfo[i][7];
                String dataFormatada = dataHoraEntrada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

                System.out.println("Identificador: " + productInfo[i][0]);
                System.out.println("Tipo: " + productInfo[i][1]);
                System.out.println("Marca: " + productInfo[i][2]);
                System.out.println("Nome: " + productInfo[i][3]);
                System.out.println("Custo: " + productInfo[i][4]);
                System.out.println("Quantidade: " + productInfo[i][5]);
                System.out.println("Preço de venda: " + productInfo[i][6]);
                System.out.printf("Data de compra: %s \n", dataFormatada);
                System.out.println("Estoque: " + productInfo[i][8]);
            }

        }

    }
    public static void listar(Scanner sc) {

        Tipo valida = null;
        do {
            System.out.println("Qual o tipo do produto (1 - Alimento, 2 - Higiene, 3 Bebida)? ");

            String tipo = sc.nextLine();

            if (tipo.equals("1")){

                valida = Tipo.ALIMENTO;

            } else if(tipo.equals("2")){

                valida = Tipo.HIGIENE;

            } else if(tipo.equals("3")){

                valida = Tipo.BEBIDA;
            }

        } while (valida == null);

        for (int i = 0; i < productInfo.length; i++) {
            if (productInfo[i][1] == valida){
                LocalDateTime dataHoraEntrada = (LocalDateTime) productInfo[i][7];
                String dataFormatada = dataHoraEntrada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

                System.out.println("Identificador: " + productInfo[i][0]);
                System.out.println("Tipo: " + productInfo[i][1]);
                System.out.println("Marca: " + productInfo[i][2]);
                System.out.println("Nome: " + productInfo[i][3]);
                System.out.println("Custo: " + productInfo[i][4]);
                System.out.println("Quantidade: " + productInfo[i][5]);
                System.out.println("Preço de venda: " + productInfo[i][6]);
                System.out.printf("Data de compra: %s \n", dataFormatada);
                System.out.println("Estoque: " + productInfo[i][8]);
            }

        }

    }
}


