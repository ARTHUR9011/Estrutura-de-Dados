package Entrega10;

public class FilaVet implements IFila {

    private int nElementos;
    private int[] VetorFila;
    private int inicio;

    public FilaVet(int tamanho) {
        this.nElementos = 0;
        this.VetorFila = new int[tamanho];
        this.inicio = 0;
    }

    @Override
    public boolean add(int info) {
        if (this.nElementos == VetorFila.length) {
            return false;
        }
        int fim = (inicio + nElementos) % VetorFila.length;
        VetorFila[fim] = info;
        nElementos++;
        return true;
        }

    @Override
    public boolean remove() {
        if (this.isEmpty()) {
            System.out.println("Fila vazia");
            return false;
        }
        inicio = (inicio + 1) % VetorFila.length;
        nElementos--;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return (nElementos == 0);
    }

    @Override
    public int size() {
        return this.nElementos;
    }

    @Override
    public void imprimirFila() {
        if (this.isEmpty()) {
            System.out.println("Fila vazia");
            return;
        }
            int indice = this.inicio;
            for (int i = 0; i < this.nElementos; i++) {
                System.out.println(VetorFila[indice]);
                indice = (indice + 1) % VetorFila.length;
            }
        }
    }

    