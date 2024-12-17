import java.util.Scanner;

public class exer07condicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double renda, imposto;
        System.out.println("Digite sua renda: ");
        renda = sc.nextDouble();
        if (renda <= 2000.00){
            System.out.println("Isento");
        }
        else if (renda > 2000 && renda <= 3000){
            imposto = (renda - 2000.0) * 0.08;
            System.out.printf("imposto: %.2f%n ",imposto);
        }
        else if (renda > 3000 && renda <= 4500){
            imposto = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf("imposto: %.2f%n ",imposto);
        }
        else{
            imposto = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("imposto: %.2f%n ",imposto);
        }
        sc.close();
    }
}
