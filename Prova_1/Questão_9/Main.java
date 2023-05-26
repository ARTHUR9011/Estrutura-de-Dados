public class Main {

public static void main(String[] args) {

    LSE lse = new LSE();

    lse.insereInicio(3);
    lse.insereFim(1);
    lse.insereFim(8);
    lse.insereFim(5);
    lse.insereInicio(2);
    
    lse.bubbleSort();

    System.out.println(lse.imprimirLista());
        
    }
    
}
