package ED.Entrega11;

public class Main {

    public static void main(String[] args) {

        FilaLista fila = new FilaLista();

        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);

        System.out.println(fila.toString());
        System.out.println("Tamanho da fila: " + fila.size());

        fila.remove();
        fila.remove();

        System.out.println(fila.toString());

    }
}
