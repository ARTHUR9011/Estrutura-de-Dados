package ED.Prova_1.Questao8;

public interface IVetor {

    public void insereInicio(int info);
    public void insereFim(int info);
    public boolean isVazia();
    public boolean remove(int info);
    public int tamanho();
    public String getListaInicio();
    public String getListaFim();
    public void concat(LDE l);
    
}