package Entrega12;

public class Main {

    public static void main(String[] args){

        FilaLista fila = new FilaLista();
        
        Aluno aluno1 = new Aluno("Arthur", 14, 4);
        Aluno aluno2 = new Aluno("Arthur Jr", 23, 8);
        Aluno aluno3 = new Aluno("Arthur III", 35, 6);
        
        fila.add(aluno1);
        fila.add(aluno2);
        fila.add(aluno3);

        System.out.println(fila.toString());
        System.out.println(fila.size());

        fila.remove();
        System.out.println(fila.toString());
    }
    
}
