public class TesteLivroAutor {
    public static void main(String[] args) {
        Autor autor = new Autor("Gary Chapman", "Americano");
        Livro livro = new Livro("As Cinco Linguagens do Amor", 2013, autor);

        System.out.println("Título: " + livro.titulo);
        System.out.println("Ano: " + livro.ano);
        System.out.println("Autor: " + livro.autor.nome);
    }
}
