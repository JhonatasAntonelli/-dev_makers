public enum Aula5EnumExercicioEscola {

    PU ("Publica", 65),
    PR ("Privada", 70),
    MT("Militar", 80);

    Aula5EnumExercicioEscola(String descricao, int media){
        this.descricao = descricao;
        this.media = media;
    }
    //É colocado primeiro metodo private para ninguem ter acesso, e depois eu retorno
    //em outro metodo publico esses valor.
    private String descricao;

    private int media;

    public int getMedia() {
        return media;
    }

    public String getDescricao() {
        return descricao;
    }
}
