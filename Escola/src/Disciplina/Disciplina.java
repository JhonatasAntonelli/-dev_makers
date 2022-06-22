package Disciplina;

public enum Disciplina {
    QUIMICA(0),
    FISICA(0),
    BIOLOGIA(0),
    MATEMATICA(0),
    PORTUGUES(0),
    HISTORIA(0),
    GEOGRAFIA(0),
    EDUCACAOFISICA(0),
    ARTES(0),
    INGLES(0);

    private double notaFinal;
    Disciplina(double notaInicial){

        this.notaFinal = notaInicial;
    }

    public double getnotaFinal() {
        return notaFinal;
    }

    public static double calcularNota(Disciplina disciplina, double nota){
        return disciplina.getnotaFinal() + nota;
    }

    }