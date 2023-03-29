import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira as coordenadas do primeiro ponto:");
        System.out.print("X: ");
        double x1 = sc.nextDouble();
        System.out.print("Y: ");
        double y1 = sc.nextDouble();
        PontoCartesiano ponto1 = new PontoCartesiano(x1, y1);
        
        System.out.println("Insira as coordenadas do segundo ponto:");
        System.out.print("X: ");
        double x2 = sc.nextDouble();
        System.out.print("Y: ");
        double y2 = sc.nextDouble();
        PontoCartesiano ponto2 = new PontoCartesiano(x2, y2);
        
        System.out.println("Coordenadas do ponto 1: (" + ponto1.getX() + ", " + ponto1.getY() + ")");
        System.out.println("Coordenadas do ponto 2: (" + ponto2.getX() + ", " + ponto2.getY() + ")");
        
        double distancia = ponto1.distanciaEuclidiana(ponto2);
        System.out.println("Distância euclidiana entre os pontos: " + distancia);
        

    }
    
}