import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;

        System.out.print("Digite a dimensão do vetor: ");
        n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Valores do primeiro vetor: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Valores do segundo vetor: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr1[i] == arr2[j]) {
                    arr3[k] = arr1[i];
                    k++;
                }
            }
        }

        System.out.println("A interseção entre os dois vetores é: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr3[i] + " ");
        }
        sc.close();
    }
}