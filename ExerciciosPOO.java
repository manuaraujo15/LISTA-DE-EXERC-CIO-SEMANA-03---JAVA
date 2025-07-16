public class ExerciciosPOO {
    public static void main(String[] args) {
        // Exercício 1 e 2
        Autor autor1 = new Autor("Gary Chapman", "Americano");
        Livro livro1 = new Livro("As Cinco Linguagens do Amor", 2013, autor1, 3);
        Autor autor2 = new Autor("Machado de Assis", "Brasileiro");
        Livro livro2 = new Livro("Dom Casmurro", 1899, autor2, 1);

        System.out.println("Exercício 2 - Exibir Livros:");
        livro1.exibir();
        livro2.exibir();

        // Exercício 3
        Turma turma = new Turma("CI1062", "Prof. Rachel");
        turma.adicionar(new Aluno("Ana", 8.5));
        turma.adicionar(new Aluno("Carlos", 7.9));
        turma.adicionar(new Aluno("Mariana", 9.2));

        System.out.println("Exercício 3 - Exibir Alunos:");
        turma.exibirAlunos();

        // Exercício 4
        Pedido pedido = new Pedido(101);
        pedido.adicionarItem(new ItemPedido("Pizza", 35.00));
        pedido.adicionarItem(new ItemPedido("Suco", 8.00));

        System.out.println("Exercício 4 - Exibir Pedido:");
        pedido.imprimir();
    }
}
