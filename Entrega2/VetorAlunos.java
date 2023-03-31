public class VetorAlunos {
    private Aluno[] alunos;
    private int totalAlunos;

    public VetorAlunos() {
        this.alunos = new Aluno[10];
        this.totalAlunos = 0;
    }

    public void adiciona(Aluno aluno) {
        if (this.totalAlunos == this.alunos.length) {
            Aluno[] novoArray = new Aluno[this.alunos.length * 2];
            for (int i = 0; i < this.alunos.length; i++) {
                novoArray[i] = this.alunos[i];
            }
            this.alunos = novoArray;
        }
        this.alunos[this.totalAlunos] = aluno;
        this.totalAlunos++;
    }

    public int tamanho() {
        return this.totalAlunos;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.totalAlunos; i++) {
            if (aluno.equals(this.alunos[i])) {
                return true;
            }
        }
        return false;
    }
}