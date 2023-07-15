package Entrega15;

public class AAB {

    private Noh raiz;

    public AAB() {
        this.raiz = null;
    }

    public AAB(Noh raiz) {
        this.raiz = raiz;
    }

    public Noh getRaiz() {
        return raiz;
    }

    public void setRaiz(Noh raiz) {
        this.raiz = raiz;
    }

    public boolean vazio() {
        return raiz == null;
    }

    public void adiciona(int element) {
        if (vazio()) {
            this.raiz = new Noh(element);
        } else {
            Noh aux = this.raiz;
            while (aux != null) {
                if (element < aux.getValor()) {
                    if (aux.getEsq() == null) {
                        Noh newNode = new Noh(element);
                        aux.setEsq(newNode);
                        newNode.setPai(aux);
                        return;
                    }
                    aux = aux.getEsq();
                } else {
                    if (aux.getDir() == null) {
                        Noh newNode = new Noh(element);
                        aux.setDir(newNode);
                        newNode.setPai(aux);
                        return;
                    }
                    aux = aux.getDir();
                }
            }
        }
    }

    public void recursiveadiciona(int element) {
        if (vazio()) {
            this.raiz = new Noh(element);
        } else {
            recursiveadiciona(this.raiz, element);
        }
    }

    private void recursiveadiciona(Noh node, int element) {
        if (element < node.getValor()) {
            if (node.getEsq() == null) {
                Noh newNode = new Noh(element);
                node.setEsq(newNode);
                newNode.setPai(node);
                return;
            }
            recursiveadiciona(node.getEsq(), element);
        } else {
            if (node.getDir() == null) {
                Noh newNode = new Noh(element);
                node.setDir(newNode);
                newNode.setPai(node);
                return;
            }
            recursiveadiciona(node.getDir(), element);
        }
    }

    public boolean contains(int element) {
        if (vazio()) {
            return false;
        }

        Noh aux = this.raiz;
        while (aux != null) {
            if (element == aux.getValor()) {
                return true;
            } else if (element < aux.getValor()) {
                aux = aux.getEsq();
            } else {
                aux = aux.getDir();
            }
        }

        return false;
    }

    @Override
    public String toString() {
        if (vazio()) {
            return "AAB está vazia";
        }

        StringBuilder sb = new StringBuilder();
        printTree(raiz, "", true, sb);
        return sb.toString();
    }

    private void printTree(Noh node, String prefix, boolean isTail, StringBuilder sb) {
        if (node.getDir() != null) {
            printTree(node.getDir(), prefix + (isTail ? "│   " : "    "), false, sb);
        }
        sb.append(prefix).append(isTail ? "└── " : "┌── ").append(node.getValor()).append("\n");
        if (node.getEsq() != null) {
            printTree(node.getEsq(), prefix + (isTail ? "    " : "│   "), true, sb);
        }
    }
}