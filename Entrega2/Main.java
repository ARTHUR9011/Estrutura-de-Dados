public static void main(String[] args) {
    VetorAlunos vetNotas = new VetorAlunos();
    Aluno aluno1 = new Aluno("João", 20, 9.0);
    Aluno aluno2 = new Aluno("Maria", 22, 5.2);

    vetNotas.adiciona(aluno1);
    vetNotas.adiciona(aluno2);

    for (int i = 0; i < vetNotas.tamanho(); i++) {
        Aluno aluno = vetNotas.get(i);
        System.out.println("Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade() + ", Nota: " + aluno.getNota());
    }
}