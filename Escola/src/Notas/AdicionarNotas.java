package Notas;

public class AdicionarNotas {

    private double quimica;
    private double fisica;
    private double biologia;
    private double matematica;
    private double portugues;
    private double historia;
    private double geografia;
    private double educacaoFisica;
    private double artes;
    private double ingles;

    public AdicionarNotas(double quimica, double fisica, double biologia, double matematica, double portugues,
                          double historia, double geografia, double educacaoFisica, double artes, double ingles) {
        this.quimica = quimica;
        this.fisica = fisica;
        this.biologia = biologia;
        this.matematica = matematica;
        this.portugues = portugues;
        this.historia = historia;
        this.geografia = geografia;
        this.educacaoFisica = educacaoFisica;
        this.artes = artes;
        this.ingles = ingles;
    }

    public double getQuimica() {
        return quimica;
    }

    public void setQuimica(double quimica) {
        this.quimica = quimica;
    }

    public double getFisica() {
        return fisica;
    }

    public void setFisica(double fisica) {
        this.fisica = fisica;
    }

    public double getBiologia() {
        return biologia;
    }

    public void setBiologia(double biologia) {
        this.biologia = biologia;
    }

    public double getMatematica() {
        return matematica;
    }

    public void setMatematica(double matematica) {
        this.matematica = matematica;
    }

    public double getPortugues() {
        return portugues;
    }

    public void setPortugues(double portugues) {
        this.portugues = portugues;
    }

    public double getHistoria() {
        return historia;
    }

    public void setHistoria(double historia) {
        this.historia = historia;
    }

    public double getGeografia() {
        return geografia;
    }

    public void setGeografia(double geografia) {
        this.geografia = geografia;
    }

    public double getEducacaoFisica() {
        return educacaoFisica;
    }

    public void setEducacaoFisica(double educacaoFisica) {
        this.educacaoFisica = educacaoFisica;
    }

    public double getArtes() {
        return artes;
    }

    public void setArtes(double artes) {
        this.artes = artes;
    }

    public double getIngles() {
        return ingles;
    }

    public void setIngles(double ingles) {
        this.ingles = ingles;
    }
}
