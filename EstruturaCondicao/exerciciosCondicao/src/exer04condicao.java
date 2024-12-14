import java.util.Scanner;

public class exer04condicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hInicial, hFinal, duracao;
        System.out.println("Digite a hora inicial: ");
        hInicial = sc.nextInt();
        System.out.println("Digite a hora final: ");
        hFinal = sc.nextInt();

        if (hInicial < hFinal) {
            duracao = hFinal - hInicial;
        }
        else {
            duracao = 24 - hInicial + hFinal;
        }

        System.out.println("o jogo durou " + duracao + " hora(s)");

        sc.close();


    }
}
