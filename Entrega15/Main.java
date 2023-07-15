package Entrega15;

public class Main {

    public static void main(String[] args) {

        AAB arvore = new AAB();

        arvore.adiciona(10);

        System.out.println("Árvore:");
        System.out.println(arvore);

        arvore.adiciona(5);

        System.out.println("Árvore:");
        System.out.println(arvore);

        arvore.adiciona(2);
        arvore.adiciona(5);
        arvore.adiciona(7);
        arvore.adiciona(15);

        System.out.println("Árvore:");
        System.out.println(arvore);

        System.out.println("Busca 5: " + arvore.contains(5));
        System.out.println("Busca 7: " + arvore.contains(12));

    }
}