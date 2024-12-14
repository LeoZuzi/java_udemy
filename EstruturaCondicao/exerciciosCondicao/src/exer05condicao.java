import java.util.Scanner;

public class exer05condicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade;
        double valorTotal;
        int codigo = sc.nextInt();
        if (codigo == 1){
            System.out.println("Digite a quantidade de cachorros quentes: ");
            quantidade = sc.nextInt();
            valorTotal = quantidade * 4.00;
            System.out.println("Valor total: " + valorTotal);
        }
        else if (codigo == 2){
            System.out.println("Digite a quantidade de x saladas: ");
            quantidade = sc.nextInt();
            valorTotal = quantidade * 4.50;
            System.out.println("Valor total: " + valorTotal);
        }
        else if (codigo == 3){
            System.out.println("Digite a quantidade de x bacons: ");
            quantidade = sc.nextInt();
            valorTotal = quantidade * 5.00;
            System.out.println("Valor total: " + valorTotal);
        }
        else if (codigo == 4){
            System.out.println("Digite a quantidade de torradas simples: ");
            quantidade = sc.nextInt();
            valorTotal = quantidade * 2.00;
            System.out.println("Valor total: " + valorTotal);
        }
        else if (codigo == 5){
            System.out.println("Digite a quantidade de refrigerantes: ");
            quantidade = sc.nextInt();
            valorTotal = quantidade * 1.50;
            System.out.println("Valor total: " + valorTotal);
        }
    }
}
