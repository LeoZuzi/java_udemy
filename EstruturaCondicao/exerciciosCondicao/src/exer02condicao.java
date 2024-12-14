import java.util.Scanner;

public class exer02condicao {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int numero;
    System.out.println("digite um numero inteiro: ");
    numero = sc.nextInt();

    if (numero % 2 == 0){
        System.out.println("PAR");
    }
    else{
        System.out.println("IMPAR");
    }

    sc.close();
    }
}
