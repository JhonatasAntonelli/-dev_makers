import java.util.Scanner;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totalPagina;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    Scanner sc = new Scanner(System.in);
    public Livro(String titulo, String autor, int totalPagina, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPagina = totalPagina;
        this.paginaAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPagina() {
        return totalPagina;
    }

    public void setTotalPagina(int totalPagina) {
        this.totalPagina = totalPagina;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{" +
                "\n# Titulo='" + titulo +
                ", \n# Autor='" + autor +
                ", \n# Total de Pagina=" + totalPagina +
                ", \n# Pagina Atual=" + paginaAtual +
                ", \n# Leitor=" + leitor.getNome() +
                ", \n# Idade do leitor=" + leitor.getIdade() +
                ", \n# Sexo do leitor=" + leitor.getSexo() +
                '}';
    }


    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void avancarPagina() {
        this.paginaAtual++;
    }

    @Override
    public void voltarPagina() {
        this.paginaAtual--;
    }

    @Override
    public void folhear(int p) {
        this.paginaAtual = p;

    }
}
