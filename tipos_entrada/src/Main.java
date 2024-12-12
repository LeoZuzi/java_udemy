import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);//importando scanner, forma que o java utiliza para recber dados em uma variavel

        String x;
        x = sc.next();//permite que a palavra que for digitada pelo usuario seja armazenada dentro dessa variavel
        System.out.println("Voce digitou: " + x);

        int y;
        y = sc.nextInt();
        System.out.println("Voce digitou: " + y);

        double z;
        z= sc.nextDouble();
        System.out.println("Voce digitou: " + z);
        sc.close();
    }
}