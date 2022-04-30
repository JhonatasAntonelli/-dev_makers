
public enum FasesDaLua {

    CHEIA ("A lua está cheia",1),
    MINGUANTE("A lua está minguante", 2),
    CRESCENTE("A lua está crescente", 3),
    NOVA("A lua está nova",4);

    FasesDaLua(String descricao, int numero){
        this.descricao = descricao;
        this.numero = numero;
    }
    private String descricao;

    private int numero;

    public String getDescricao(){

        return descricao;
    }

    public int getNumero(){
        return numero;
    }

    public FasesDaLua qualLua(){
       return FasesDaLua.CHEIA;
    }



}
