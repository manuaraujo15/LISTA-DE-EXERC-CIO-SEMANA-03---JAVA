class Livro {
    String titulo;
    int ano;
    Autor autor;

    // Construtores
    public Livro() {}
    public Livro(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }
    public Livro(String titulo, int ano, Autor autor) {
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
    }
}
