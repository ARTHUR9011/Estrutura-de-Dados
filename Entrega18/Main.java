package Entrega18;

public class Main {
    public static void main(String[] args) {
        Ordenador ordenador = new Ordenador();

        int[] array2 = { 5, 3, 17, 10, 8, 9 };
        ordenador.quickSort(array2);
        for (int i = 0; i < array2.length; i++)
            System.out.print(array2[i] + " ");
    }



}