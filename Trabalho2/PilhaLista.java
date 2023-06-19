package Trabalho2;

public class PilhaLista implements IPilha {

    private Noh topo;

    public PilhaLista() {
        this.topo = null;
    }

    @Override
    public boolean push(Aluno info) {
        Noh novo = new Noh(info);

        if(isEmpty()) {
            topo = novo;
        } else {
            novo.setProximo(topo);
            topo = novo;
        }

        return true;
    }

    @Override
    public Aluno pop() {
        Aluno info = null;

        if(!isEmpty()) {
            info = topo.getInfo();
            topo = topo.getProximo();
        }

        return info;
    }

    @Override
    public Aluno top() {
        Aluno info = null;

        if(!isEmpty()) {
            info = topo.getInfo();
        }

        return info;

    }

    @Override
    public boolean isEmpty() {
        return topo == null;
    }

    @Override
    public int size() {
        int cont = 0;
        Noh aux = topo;

        while(aux != null) {
            cont++;
            aux = aux.getProximo();
        }

        return cont;
    }

    public boolean isPalindromo() {

        PilhaLista pilha = new PilhaLista();
        Noh aux = topo;

        while(aux != null) {
            pilha.push(aux.getInfo());
            aux = aux.getProximo();
        }

        aux = topo;

        while(aux != null) {
            if(!aux.getInfo().equals(pilha.pop())) {
                return false;
            }
            aux = aux.getProximo();
        }
        return true;
    }

    @Override
    public String toString() {
        String str = "";
        Noh aux = topo;

        while(aux != null) {
            str += aux.getInfo() + " ";
            aux = aux.getProximo();
        }

        return str;
    } 
}

