public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa [] p = new Pessoa[2];
        Livro [] l = new Livro[3];

        p[0] = new Pessoa("Jhonatas", 34, "Masculino");
        p[1] = new Pessoa("Gabriela", 27,"Femonino");
        l[0] = new Livro("Revolução dos Bichos", "George", 200, p[0]);
        l[1] = new Livro("D. Pdreo II", "Dom Pedro", 300, p[1]);
        l[2] = new Livro("1984", "George", 350, p[0]);

        l[0].abrir();
        l[0].folhear(200);
        l[0].voltarPagina();
        System.out.println(l[0].detalhes());
    }
}
