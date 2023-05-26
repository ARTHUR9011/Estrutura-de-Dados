package ED.Entrega9;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int tamanho = 1000;
        Vetor vetor = new Vetor(tamanho);

        // Generate random vector
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            int numero = random.nextInt(1000); // Generate a random number between 0 and 999
            vetor.adiciona(numero);
        }

        // Bubble Sort
        long startTime = System.nanoTime();
        vetor.bubbleSort();
        long endTime = System.nanoTime();
        long bubbleSortTime = endTime - startTime;

        // Selection Sort
        startTime = System.nanoTime();
        vetor.selectionSort();
        endTime = System.nanoTime();
        long selectionSortTime = endTime - startTime;

        // Insertion Sort
        startTime = System.nanoTime();
        vetor.insertionSort();
        endTime = System.nanoTime();
        long insertionSortTime = endTime - startTime;

        // Print sorted vector and execution times
        System.out.println("Sorted Vector (Bubble Sort):");
        printVector(vetor);
        System.out.println("Bubble Sort Execution Time: " + bubbleSortTime + " nanoseconds");

        System.out.println("\nSorted Vector (Selection Sort):");
        printVector(vetor);
        System.out.println("Selection Sort Execution Time: " + selectionSortTime + " nanoseconds");

        System.out.println("\nSorted Vector (Insertion Sort):");
        printVector(vetor);
        System.out.println("Insertion Sort Execution Time: " + insertionSortTime + " nanoseconds");
    }

    private static void printVector(Vetor vetor) {
        for (int i = 0; i < vetor.getTamanho(); i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}