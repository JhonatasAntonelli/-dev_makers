public class Caneta {
    //Estes são os atributos da classe, a classe vai instanciar o objeto
    //que pode ou não ter estes atributos. A classe é a forma do objeto

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga = 80;
    private boolean tampado = false;

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampado() {
        return tampado;
    }

    public void setTampado(boolean tampado) {
        this.tampado = tampado;
    }

//    public String getModelo(){
//        return this.modelo;
//    }
//    public void setModelo(String m){
//        this.modelo = m;
//    }
//    public float getPonta(){
//        return this.ponta;
//    }
//    public void setPonta(float p){
//        this.ponta = p;
//    }
//
//    public Caneta(String m, String c, float p){//O construtor vai adicionar algumas atributos ao
//                        //objeto assim que ele for criado, o metodo construtos
//                        //sempre tem o mesmo nome da classe e os parametros devem ser enviados quando se cria um novo objeto
//     this.tampar();
//     this.setModelo(m);
//     this.cor = c;
//     this.setPonta(p);
//     this.carga = 80;
//
//    }
    public void status() {
        System.out.println("----------------------------------");
        System.out.println("O modelo da caneta é " + this.getModelo());
        System.out.println("Uma caneta " + this.getCor());
        System.out.println("Esta tampada? " + this.isTampado());
        System.out.println("A ponta da caneta é " + this.getPonta());
        System.out.println("A cor da caneta é " + this.getCor());
        System.out.printf("A carga da caneta esta em %d porcento\n", this.getCarga());
    }
////O this é uma autoreferencia, quem chamou o metodo status sera substituido pelo this
//    }
//public void status2(){
//    System.out.println("-------------------------------");
//    System.out.println("O modelo da caneta " + this.getModelo());
//    System.out.println("A ponta da caneta é " + this.getPonta());
//    System.out.printf("A cor da canete é %s e ela esta tampada %b \n", this.cor, this.tampado);
//    // É indiferente o uso do get ou imprimir apenas o atributo
//}
//    public void rabiscar(){
//        if (this.tampado == true){
//            System.out.println("Erro! Não posso rabiscar");
//        }else{
//            System.out.println("Estou rabiscando");
//        }
//    }
    public void tampar(){
        this.tampado = true;
    }
    public void destampar(){
        this.tampado = false;
    }
}
