public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        verificarDia();
        verificarMes();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
        verificarDia();
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
        verificarMes();
    }

    public int getAno() {
        return ano;
    }
    private void verificarDia() {
        if (getDia() > 31 || getDia() < 0) {
            setDia(1);
        }
    }
    private void verificarMes() {
        if (getMes() > 12 || getMes() < 0) {
            setMes(1);
        }
    }
    public void mostrarData(){
        System.out.printf("%d/%d/%d", getDia(), getMes(), getAno());
    }
}

