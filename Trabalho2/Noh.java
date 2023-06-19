package Trabalho2;

public class Noh {

    private Aluno info;
    private Noh proximo;

    public Noh(Aluno info) {
        this.info = info;
        this.proximo = null;
    }

    public Aluno getInfo() { 
        return this.info;
    }

    public Noh getProximo() { 
        return this.proximo;
    }

    public void setProximo(Noh n) {
        this.proximo = n;
    }
}
