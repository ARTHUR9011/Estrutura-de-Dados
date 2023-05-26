public class Main {
    public static void main(String[] args) {
        // Criando um objeto Vetor com capacidade de 1.000 elementos
        Vetor vetor = new Vetor(1000);

        // Gerando um vetor aleatório com 1.000 elementos
        int[] elementos = generateRandomArray(1000);

        // Adicionando os elementos ao vetor
        for (int numero : elementos) {
            vetor.add(numero);
        }

        // Obtendo o último elemento do vetor
        int lastElement = vetor.getLastElement();

        // Realizando a pesquisa binária com loop de repetição
        long startTime = System.nanoTime();
        int index = binarySearchIterative(vetor.getElements(), lastElement);
        long endTime = System.nanoTime();
        long binarySearchTime = endTime - startTime;

        System.out.println("Pesquisa Binária Iterativa:");
        if (index != -1) {
            System.out.println("Elemento " + lastElement + " encontrado no índice " + index);
        } else {
            System.out.println("Elemento " + lastElement + " não encontrado no vetor");
        }
        System.out.println("Tempo de execução: " + binarySearchTime + " nanosegundos");

        // Realizando a pesquisa binária com recursão
        startTime = System.nanoTime();
        index = binarySearchRecursive(vetor.getElements(), lastElement, 0, vetor.size() - 1);
        endTime = System.nanoTime();
        long binarySearchRecursiveTime = endTime - startTime;

        System.out.println("\nPesquisa Binária Recursiva:");
        if (index != -1) {
            System.out.println("Elemento " + lastElement + " encontrado no índice " + index);
        } else {
            System.out.println("Elemento " + lastElement + " não encontrado no vetor");
        }
        System.out.println("Tempo de execução: " + binarySearchRecursiveTime + " nanosegundos");
    }
}