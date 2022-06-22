public class Cachoro extends Mamifero{

    public void enterrarOsso(){
        System.out.println("Enterrando Ossos");
    }
    public void abanarRabo(int idade){
        if (idade <= 5){
            System.out.println("Abanando o Rabo");
        }
    }
    public void abanarRabo(boolean dono){
        if (dono){
            System.out.println("Abanando o Rabo");
        }
    }
    public void abanarRabo(String chamado){
        if (chamado.equalsIgnoreCase("olá")){
            System.out.println("Abanando o Rabo");
        }
    }
@Override
    public void emitorSom() {
        System.out.println("Au! Au! Au!");
    }
}
