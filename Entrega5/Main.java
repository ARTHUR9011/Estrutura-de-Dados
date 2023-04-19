public class Main {

public static void main(String[] args) {

    Lista lista = new LSE();

    System.out.println(lista.estahVazia());

    lista.insereInicio(0);

    System.out.println(lista.estahVazia());

    lista.remove(0);

    System.out.println(lista.estahVazia());

    }
}