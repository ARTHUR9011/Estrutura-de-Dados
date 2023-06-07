package Palindromo;

public class Main {
    
    public static void main(String[] args) {

        PilhaLista pilha = new PilhaLista();

            pilha.push("mussum");

        if (pilha.isPalindromo()) {
            System.out.println("A pilha é um palíndromo.");
        } else {
            System.out.println("A pilha não é um palíndromo.");
        }
    }
}