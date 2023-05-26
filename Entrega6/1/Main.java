package ED.Entrega6;

public class Main {
    public static void main(String[] args) {
        LDE_Inteiros ldeInteiros = new LDE_Inteiros();
        Aluno aluno1 = new Aluno("Arthur", 14, 4);
        Aluno aluno2 = new Aluno("Arthur Jr", 23, 8);
        Aluno aluno3 = new Aluno("Arthur III", 35, 6);

        // Testes LDE_Inteiros
        ldeInteiros.insereInicio(200);
        System.out.println(ldeInteiros.imprimeInicio());
        ldeInteiros.insereInicio(150);
        System.out.println(ldeInteiros.imprimeInicio());
        ldeInteiros.insereFim(86);
        System.out.println(ldeInteiros.imprimeInicio());
        ldeInteiros.insereFim(59);
        System.out.println(ldeInteiros.imprimeInicio());
        System.out.println(ldeInteiros.imprimeFim());
        ldeInteiros.remove(200);
        System.out.println(ldeInteiros.imprimeInicio());
        System.out.println(ldeInteiros.imprimeFim());
        System.out.println(ldeInteiros.tamanho());
        System.out.println(ldeInteiros.estaVazia());
    }
}