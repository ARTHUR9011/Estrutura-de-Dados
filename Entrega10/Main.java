package Entrega10;

public class Main {

public static void main(String[] args) {

    FilaVet fila = new FilaVet(2);

    fila.add(7);
    fila.add(2);
    fila.imprimirFila();

    fila.remove();
    fila.imprimirFila();

    fila.add(3);
    fila.imprimirFila();

    }
}
