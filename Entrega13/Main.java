package Entrega13;

public class Main {

    public static void main(String[] args) {

        MapaHashVetor mapa = new MapaHashVetor();

        Aluno aluno1 = new Aluno("Arthur", 14, 4);
        Aluno aluno2 = new Aluno("Arthur Jr", 23, 8);
        Aluno aluno3 = new Aluno("Arthur III", 35, 6);

        mapa.put(143, aluno1);
        mapa.put(265, aluno2);
        mapa.put(443, aluno3);

        System.out.println(mapa.get(143));
        System.out.println(mapa.get(265));
        System.out.println(mapa.get(443));
    }

}