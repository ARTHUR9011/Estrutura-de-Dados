public class Main {
    public static void main(String[] args) {
        LDE lista = new LDE();

        lista.insereInicio(10);
        lista.insereInicio(20);
        lista.insereFim(30);
        lista.insereFim(40);

        System.out.println("Lista no início: " + lista.getListaInicio());
        System.out.println("Lista no fim: " + lista.getListaFim());
        System.out.println("Tamanho da lista: " + lista.tamanho());

        lista.remove(20);
        lista.remove(40);

        System.out.println("Lista após remoção: " + lista.getListaInicio());

        LDE lista2 = new LDE();
        lista2.insereInicio(50);
        lista2.insereFim(60);

        lista.concat(lista2);

        System.out.println("Lista após concatenação: " + lista.getListaInicio());
    }
}