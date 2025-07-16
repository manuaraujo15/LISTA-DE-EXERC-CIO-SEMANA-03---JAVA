class Livro {
    String titulo;
    int ano;
    Autor autor;
    int edicao;

    public Livro() {}

    public Livro(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public Livro(String titulo, int ano, Autor autor, int edicao) {
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
        this.edicao = edicao;
    }

    public void exibir() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + ano);
        System.out.println("Autor: " + autor.nome);
        System.out.println("Edição: " + edicao);
        System.out.println();
    }
}
