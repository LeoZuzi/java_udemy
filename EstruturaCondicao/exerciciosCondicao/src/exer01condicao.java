import java.util.Scanner;

public class exer01condicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println("digite um numero inteiro: ");
        numero = sc.nextInt();

        if (numero > 0){
            System.out.println("Numero positivo!");
        }
        else{
            System.out.println("Numero negativo!");
        }

        sc.close();
    }
}