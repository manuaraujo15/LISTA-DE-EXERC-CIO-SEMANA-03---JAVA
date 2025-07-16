class Turma {
    String codigo;
    String nomeProfessor;
    ArrayList<Aluno> alunos;

    public Turma() {
        alunos = new ArrayList<>();
    }

    public Turma(String codigo, String nomeProfessor) {
        this.codigo = codigo;
        this.nomeProfessor = nomeProfessor;
        this.alunos = new ArrayList<>();
    }

    public void adicionar(Aluno aluno) {
        alunos.add(aluno);
    }

    public void exibirAlunos() {
        System.out.println("Alunos da turma " + codigo + ":");
        for (Aluno a : alunos) {
            System.out.println("- " + a.nome + " (CR: " + a.CR + ")");
        }
        System.out.println();
    }
}
