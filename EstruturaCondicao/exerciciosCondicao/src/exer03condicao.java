import java.util.Scanner;

public class exer03condicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Digite um numero: ");
        numero1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        numero2 = sc.nextInt();

        if(numero1 % numero2 == 0 || numero2 % numero1 ==0){
            System.out.println("São multiplos");
        }
        else{
            System.out.println("não são multiplos");
        }
        sc.close();
    }
}
