package Palindromo;

public class PilhaLista implements IPilha {
    private Noh topo;
    private int tamanho;

    public PilhaLista() {
        this.topo = null;
        this.tamanho = 0;
    }

    @Override
    public boolean push(Object info) {
        Noh novoNoh = new Noh(info);
        if (isEmpty()) {
            topo = novoNoh;
        } else {
            novoNoh.setProximo(topo);
            topo = novoNoh;
        }
        tamanho++;
        return true;
    }

    @Override
    public Object top() {
        if (!isEmpty()) {
            return topo.getInfo();
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return topo == null;
    }

    @Override
    public int size() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Noh atual = topo;
        while (atual != null) {
            sb.append(atual.getInfo()).append(" ");
            atual = atual.getProximo();
        }
        return sb.toString().trim();
    }

    public boolean isPalindromo() {
        if (isEmpty()) {
            return false;
        }
        Noh atual = topo;
        StringBuilder sb = new StringBuilder();
        while (atual != null) {
            sb.append(atual.getInfo());
            atual = atual.getProximo();
        }
        String original = sb.toString();
        String reverso = sb.reverse().toString();
        return original.equals(reverso);
    }
}