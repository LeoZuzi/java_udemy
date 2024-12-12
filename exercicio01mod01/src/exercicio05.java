import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoPeca,codigoPeca2, qtdPeca, qtdPeca2;
        double valor,valor2, calculo, calculo2, total;

        System.out.println("digite o codigo da peça 1: ");
        codigoPeca = sc.nextInt();
        System.out.println("digite a quantidade de peças 1: ");
        qtdPeca = sc.nextInt();
        System.out.println("digite o valor unitario da peça 1: ");
        valor = sc.nextDouble();

        System.out.println("digite o codigo da peça 2: ");
        codigoPeca2 = sc.nextInt();
        System.out.println("digite a quantidade de peças 2: ");
        qtdPeca2 = sc.nextInt();
        System.out.println("digite o valor unitario da peça 2: ");
        valor2 = sc.nextDouble();

        calculo = (double) qtdPeca * valor;
        calculo2 = (double) qtdPeca2 * valor2;
        total = calculo + calculo2;

        System.out.println("Valor a pagar : " + total);
        sc.close();
    }
}
