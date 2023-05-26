package ED.Entrega7;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int tamanhoVetor = 1000;
        Vetor vetor = new Vetor(tamanhoVetor);

        // Generate random integers and add them to the vector
        Random random = new Random();
        for (int i = 0; i < tamanhoVetor; i++) {
            vetor.adiciona(random.nextInt(1000));
        }

        // Recursive method - Finding maximum element
        long startTimeRecursiva = System.nanoTime();
        int maximoRecursiva = vetor.maximoRecursiva();
        long endTimeRecursiva = System.nanoTime();
        long executionTimeRecursiva = endTimeRecursiva - startTimeRecursiva;

        System.out.println("Máximo (Recursiva): " + maximoRecursiva);
        System.out.println("Tempo de execução (Recursiva): " + executionTimeRecursiva + " nanoseconds");

        // Iterative method - Finding maximum element
        long startTimeIterativa = System.nanoTime();
        int maximoIterativa = vetor.maximoIterativa();
        long endTimeIterativa = System.nanoTime();
        long executionTimeIterativa = endTimeIterativa - startTimeIterativa;

        System.out.println("Máximo (Iterativa): " + maximoIterativa);
        System.out.println("Tempo de execução (Iterativa): " + executionTimeIterativa + " nanoseconds");
    }
}