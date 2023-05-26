package ED.Prova_1.Questao_5;

public interface ILista {

    public void insereInicio(int info);
    public void insereFim(int info);
    public boolean estahVazia();
    public boolean remove(int info);
    public int tamanho();
    public String getListaInicio();
    public String getListaFim();
    public int nroPares();

}