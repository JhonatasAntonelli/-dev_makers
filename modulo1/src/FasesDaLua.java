public enum FasesDaLua {

    CHEIA(descricao: "A lua está cheia", numero 1),
    MINGUANTE(descricao: "A lua está minguante", numero 2),
    CRESCENTE(descricao: "A lua está crescente", numero 3),
    NOVA(descricao: "A lua está nova", numero 4);

    FasesDaLua(String descricao, int numero){
        this.descricao = descricao;
        this.numero = numero;
    }
    private static String descricao;

    private int numero;

    private String getDescricao(){
        return descricao;
    }

    public int getNumero(){
        return numero;
    }

    public static FasesDaLua



}
