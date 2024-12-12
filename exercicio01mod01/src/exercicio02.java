import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor do raio: ");
        double pi, area, raio;
        pi = 3.14159;
        raio = sc.nextDouble();
        area = pi * Math.pow(raio, 2.0);
        System.out.println("Saida: ");
        System.out.printf("A= %.4f%n",area);



        sc.close();
    }
}
