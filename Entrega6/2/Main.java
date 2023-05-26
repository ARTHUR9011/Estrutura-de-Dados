package ED.Entrega6;

public class Main {
    public static void main(String[] args) {
        LDE_Object ldeAlunos = new LDE_Object();
        Aluno aluno1 = new Aluno("Arthur", 14, 4);
        Aluno aluno2 = new Aluno("Arthur Jr", 23, 8);
        Aluno aluno3 = new Aluno("Arthur III", 35, 6);

        ldeAlunos.insereFim(aluno1);
        System.out.println(ldeAlunos.imprimeInicio()); 
        ldeAlunos.insereInicio(aluno2);
        System.out.println(ldeAlunos.imprimeInicio());
        ldeAlunos.insereFim(aluno3);
        System.out.println(ldeAlunos.imprimeInicio());
        System.out.println(ldeAlunos.imprimeFim());
        ldeAlunos.remove(aluno1);
        System.out.println(ldeAlunos.imprimeInicio());
        System.out.println(ldeAlunos.imprimeFim());
        System.out.println(ldeAlunos.tamanho());
        System.out.println(ldeAlunos.estaVazia());
    }
}