import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrada: ");
    float A,B, C;
    double pi, circulo, quadrado, retangulo, triangulo, trapezio;
    pi = 3.14159;
    A = sc.nextFloat();
    B = sc.nextFloat();
    C = sc.nextFloat();
    triangulo = A * C/2;
    circulo = pi * Math.pow(C,2.0);
    trapezio = ((A + B) * C)/2;
    quadrado = Math.pow(B,2.0);
    retangulo = A * B;
    System.out.println("Saida: ");
        System.out.printf("Triangulo: %.3f%n", triangulo);
        System.out.printf("Circulo: %.3f%n", circulo);
        System.out.printf("Trapezio: %.3f%n", trapezio);
        System.out.printf("Quadrado: %.3f%n", quadrado);
        System.out.printf("Retangulo: %.3f%n", retangulo);
    sc.close();
    }
}
