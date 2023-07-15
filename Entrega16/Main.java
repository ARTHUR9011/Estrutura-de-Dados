package Entrega16;

public class Main {

    public static void main(String[] args) {
        AAB arvore = new AAB();

        // Adiciona elementos na árvore
        arvore.adiciona(8);
        arvore.adiciona(4);
        arvore.adiciona(12);
        arvore.adiciona(2);
        arvore.adiciona(6);
        arvore.adiciona(10);
        arvore.adiciona(14);

        System.out.println("Árvore Binária de Busca:");
        System.out.println(arvore);

        int elemento = 6;
        boolean contemElemento = arvore.contains(elemento);
        System.out.println("A árvore contém o elemento " + elemento + "? " + contemElemento);

        int elementoRemovido = 12;
        Noh nohRemovido = arvore.remove(elementoRemovido);
        if (nohRemovido != null) {
            System.out.println("Elemento " + elementoRemovido + " removido com sucesso!");
        } else {
            System.out.println("Elemento " + elementoRemovido + " não encontrado na árvore.");
        }

        System.out.println("Árvore após a remoção:");
        System.out.println(arvore);
        System.out.println("Árvore em ordem:");
        System.out.println(arvore.emOrdem());
        System.out.println("Árvore em pré-ordem:");
        System.out.println(arvore.preOrdem());
        System.out.println("Árvore em pós-ordem:");
        System.out.println(arvore.posOrdem());
    }
}
