import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrada: ");
        int valor1,valor2, resultado;
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        resultado = valor1 + valor2;
        System.out.println("Saida: ");
        System.out.println("SOMA: " + resultado);


        sc.close();
    }
}