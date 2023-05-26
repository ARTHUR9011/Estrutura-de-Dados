package ED.Prova_1.Questao_9;

public interface ILista {

    public void insereInicio(Object info);
    public void insereFim(Object info);
    public boolean estahVazia();
    public boolean remove(Object info);
    public int tamanho();
    public String imprimirLista();
    public void bubbleSort();

}