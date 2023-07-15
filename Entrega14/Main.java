package Entrega14;

public class Main {

    public static void main(String[] args){

        MapaHashLSE mapa = new MapaHashLSE();

        Aluno a1 = new Aluno("Arthur", 20, 8.5);
        Aluno a2 = new Aluno("Arthur II", 21, 9.0);
        Aluno a3 = new Aluno("Arthur III", 22, 7.5);

        mapa.put(1, a1);
        mapa.put(2, a2);
        mapa.put(3, a3);

        System.out.println(mapa.get(1));
        System.out.println(mapa.get(3));
        System.out.println(mapa.remove(1));

        System.out.println(mapa);


    }
}