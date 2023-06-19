package ED.Entrega11;

public class FilaLista implements IFila{

    private Noh inicio;
    private Noh fim;

    public FilaLista() {
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public int size() {
        int cont = 0;
        if (isEmpty()) {
        }
        Noh aux = inicio;
        while (aux != null) {
            cont++;
            aux = aux.getProx();
        }
        return cont;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    @Override
    public boolean add(Object info) {
        Noh novo = new Noh(info);
        if (this.isEmpty()) {
            inicio = novo;
        }
            fim.setProx(novo);
        fim = novo;
        return true;
    }

    @Override
    public boolean remove() {
        if (isEmpty()) {
            if (inicio == fim) {
                inicio = null;
                fim = null;
        }   else
        inicio = inicio.getProx();
        return true;
    }
    return false;
    }

    

}