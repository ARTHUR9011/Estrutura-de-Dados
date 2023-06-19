package Trabalho2;

public class Main {

    public static void main(String[] args) {

        LSE lista = new LSE();

        Aluno aluno1 = new Aluno("Arthur", 14, 4);
        Aluno aluno2 = new Aluno("Arthur Jr", 23, 8);
        Aluno aluno3 = new Aluno("Arthur III", 35, 6);

        lista.insereInicio(aluno1);
        lista.insereFim(aluno2);
        lista.insereFim(aluno3);

        System.out.println("Lista normal: " + lista.imprimirLista());

        lista.inverterLista();

        System.out.println("Lista invertida: " + lista.imprimirLista());
    }
    
}
