package Entrega16;

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

    public Noh remove(int element) {
        if (vazio()) {
            return null;
        }

        Noh aux = this.raiz;

        while (aux != null) {
            if (element == aux.getValor()) {
                break;
            } else if (element < aux.getValor()) {
                aux = aux.getEsq();
            } else {
                aux = aux.getDir();
            }
        }

        if (aux == null) {
            return null;
        }

        if (aux.getEsq() == null && aux.getDir() == null) {
            if (aux == this.raiz) {
                this.raiz = null;
            } else {
                if (aux.getPai().getEsq() == aux) {
                    aux.getPai().setEsq(null);
                } else {
                    aux.getPai().setDir(null);
                }
            }
        } else if (aux.getEsq() != null && aux.getDir() == null) {
            if (aux == this.raiz) {
                this.raiz = aux.getEsq();
            } else {
                if (aux.getPai().getEsq() == aux) {
                    aux.getPai().setEsq(aux.getEsq());
                } else {
                    aux.getPai().setDir(aux.getEsq());
                }
            }
        } else if (aux.getEsq() == null && aux.getDir() != null) {
            if (aux == this.raiz) {
                this.raiz = aux.getDir();
            } else {
                if (aux.getPai().getEsq() == aux) {
                    aux.getPai().setEsq(aux.getDir());
                } else {
                    aux.getPai().setDir(aux.getDir());
                }
            }
        } else {
            Noh sucessor = aux.getDir();
            while (sucessor.getEsq() != null) {
                sucessor = sucessor.getEsq();
            }

            aux.setValor(sucessor.getValor());

            if (sucessor.getPai().getEsq() == sucessor) {
                sucessor.getPai().setEsq(null);
            } else {
                sucessor.getPai().setDir(null);
            }
        }

        return aux;
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

    public String preOrdem() {
        if (vazio()) {
            return "AAB está vazia";
        }

        StringBuilder conteudo = new StringBuilder();
        preOrdem(raiz, conteudo);
        return conteudo.toString();
    }

    private void preOrdem(Noh node, StringBuilder str) {
        if (node != null) {
            str.append(node.getValor()).append(" ");
            preOrdem(node.getEsq(), str);
            preOrdem(node.getDir(), str);
        }
    }

    public String emOrdem() {
        if (vazio()) {
            return "AAB está vazia";
        }

        StringBuilder conteudo = new StringBuilder();
        emOrdem(raiz, conteudo);
        return conteudo.toString();
    }

    private void emOrdem(Noh node, StringBuilder str) {
        if (node != null) {
            emOrdem(node.getEsq(), str);
            str.append(node.getValor()).append(" ");
            emOrdem(node.getDir(), str);
        }
    }

    public String posOrdem() {
        if (vazio()) {
            return "AAB está vazia";
        }

        StringBuilder conteudo = new StringBuilder();
        posOrdem(raiz, conteudo);
        return conteudo.toString();
    }

    private void posOrdem(Noh node, StringBuilder str) {
        if (node != null) {
            posOrdem(node.getEsq(), str);
            posOrdem(node.getDir(), str);
            str.append(node.getValor()).append(" ");
        }
    }
}
