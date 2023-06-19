package ED.Entrega11;

public class Noh {

    private Object info;
    private Noh prox;

    public Noh(Object info) {
        this.info = info;
        this.prox = null;
    }

    public Object getInfo() {
        return info;
    }

    public Noh getProx() {
        return prox;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public void setProx(Noh prox) {
        this.prox = prox;
    }
    
}
