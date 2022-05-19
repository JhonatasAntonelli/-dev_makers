import java.util.Scanner;

public class ContaBanco {

    Scanner sc = new Scanner(System.in);
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private double saldoConta;
    private boolean statusConta;
    private String cpf;

    public ContaBanco() {
        this.numConta = 0;
        this.tipoConta = "null";
        this.donoConta = "null";
        this.saldoConta = 0.0;
        this.statusConta = false;
        this.cpf = "0";
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {

    }

    public String getDonoConta() {
        return donoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public boolean isStatusConta() {
        if (statusConta == true){
            System.out.println("Esta conta esta ativa!!");
        }else{
            System.out.println("Esta conta está inativa!!");
        }

        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }

    public void abrirConta() {


        System.out.println("Digite o tipo da conta que deseja abrir (CC para conta correte e CP para conta poupança");
        String tipo = sc.next();
        this.tipoConta = tipo;

        this.setStatusConta(true);
        if (tipo.equalsIgnoreCase("CC")) {
            this.setSaldoConta(50);
        } else {
            this.setSaldoConta(150);
        }

        System.out.println("Qual o nome do titular da conta? ");
        setDonoConta(sc.next());

        System.out.println("Qual o número da conta? ");
        setNumConta(sc.nextInt());

        System.out.println("Qual o CPF do titular?");
        setCpf(sc.next());

        System.out.println("Sua conta foi criada com sucesso, seu novo saldo é de R$ " + getSaldoConta());
    }

    public void fecharConta() {
        System.out.println("Deseja fhechar a conta? Digite Sim ou Não");
        String fechar = sc.next();

        if (fechar.equalsIgnoreCase("sim")) {
            if (this.getSaldoConta() > 0) {
                System.out.println("Você não pode fechar a conta pois possui saldo positivo, " +
                        "para fechar a conta seque todo o saldo, deseja sacar o saldo? Sim/Não");
                String retirar = sc.next();
                if (retirar.equalsIgnoreCase("Sim")) {
                    this.sacar();
                } else {
                    return;
                }
            }
            if (this.getSaldoConta() < 0) {
                System.out.println("Você não pode fechar a conta pois possui saldo negativo, " +
                        "para fechar a conta deposite o valor devido, quer depositar o valor devido? Sim/Não");
                String retirar = sc.next();
                if (retirar.equalsIgnoreCase("Sim")) {
                    this.depositar ();
                } else {
                    return;
                }
            }else {
                System.out.println("Conta fechada, obrigado por usar nosso banco, volte sempre!!");
                setStatusConta(false);
            }
        }else {
            return;
        }
    }
    public void depositar () {

        if (isStatusConta() == true){
            System.out.println("Qual o valor você deseja depositar?");
            double valor = sc.nextDouble();
            setSaldoConta(getSaldoConta() + valor);
            System.out.println("Depoósito realizado com sucesso, seu novo saldo é" + getSaldoConta());
        }else{
            System.out.println("Essa conta não está em operação, por favor ative a conta para depositar" +
                    "Deseja ativar essa conta? Sim ou Não");
            String ativar = sc.next();
            if (ativar.equalsIgnoreCase("sim")){
                this.abrirConta();
            }else{
                return;
            }
        }

    }
    public void sacar () {

        if (isStatusConta() == true) {

            System.out.println("Qual o valor você deseja sacar?");
            double valor = sc.nextDouble();

            if (getSaldoConta() >= valor) {
                setSaldoConta(getSaldoConta() - valor);
                System.out.println("Saque realizado com sucesso!!");
                System.out.println("Seu novo saldo é " + getSaldoConta());
            } else {
                System.out.printf("Seu saldo atual é %.2f .\n" +
                        "O saldo é insuficuente para o saque, deseja sacar outro valor?" +
                        " Sim/Não\n", getSaldoConta());
                String resposta = sc.next();
                if (resposta.equalsIgnoreCase("sim")) {
                    sacar();
                } else {
                    return;
                }
            }
        }
        else{
            System.out.println("Essa conta não está em operação, por favor ative a conta para depositar" +
                    "Deseja ativar essa conta? Sim ou Não");
            String ativar = sc.next();
            if (ativar.equalsIgnoreCase("sim")){
                this.abrirConta();
            }else{
                return;
            }
        }

    }
    public void pagarMensalidade () {
        if (isStatusConta() == true) {
            if(getTipoConta().equalsIgnoreCase("cc") && getSaldoConta() >= 12){
                setSaldoConta(getSaldoConta() - 12);
                System.out.println(" Mensalidade paga com sucesso\n. Seu novo saldo é de R$ " + getSaldoConta());
            } if(getTipoConta().equalsIgnoreCase("cp") && getSaldoConta() >= 20){
                setSaldoConta(getSaldoConta() - 20);
                System.out.println(" Mensalidade paga com sucesso\n. Seu novo saldo é de R$ " + getSaldoConta());
            }
        }else{
            statusConta = false;
        }
    }

    public void abrirMenu() {
        System.out.println("Bem vindo ao banco dev_makers");
        int index;
        do {
            index = menu();
            switch (index) {
                case 1:
                    this.abrirConta();
                    break;
                case 2:
                   this.fecharConta();
                    break;
                case 3:
                    this.depositar();
                    break;
                case 4:
                    this.sacar();
                    break;
                case 5:
                    this.pagarMensalidade();
                    break;
                case 6:
                    this.getSaldoConta();
                    break;
                case 7:
                    this.isStatusConta();
                    break;
                case 8:
                    this.relatorio();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Valor digitado incorretamente");
            }
        } while (index != 0);
    }

    public int menu() {
        do {
            System.out.println("----------------------------------------");
            System.out.println("Digite a oção desejada");
            System.out.println("1 - Abrir nova conta: ");
            System.out.println("2 - Fechar conta");
            System.out.println("3 - Depositar ");
            System.out.println("4 - Sacar ");
            System.out.println("5 - Pagar mensalidade ");
            System.out.println("6 - Saldo ");
            System.out.println("7 - Sabr o status da conta");
            System.out.println("8 - Imprimir relatório da conta");
            System.out.println("0 - Sair");
            System.out.println("----------------------------------------");

            int validacao = sc.nextInt();
            String aux = sc.nextLine();

            if (validacao >= 0 && validacao <= 8) {
                return validacao;
            } else {
                System.out.println("Digite as opções corretamente");
            }
        } while (true);
    }

    public void relatorio(){
        System.out.println("----------------------------------------------");
        System.out.println("As informações dessa conta são:");
        System.out.println("Titular da conta: " + getDonoConta());
        System.out.println("CPF do titular: " + getCpf());
        System.out.println("Tipo de conta: " + getTipoConta());
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Saldo da conta " + getSaldoConta());
        System.out.println("----------------------------------------------");
    }
}
