import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int minutos = sc.nextInt();
        double conta = 50;
        if (minutos > 100){
            conta = conta + (minutos - 100) * 2.00;
        }
        System.out.println("Valor a pagar: " + conta);
        sc.close();
    }
}
