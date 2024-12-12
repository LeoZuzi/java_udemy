import java.util.Locale;

//Aula01, tipos de dados de entrada e saida no java
public class Main {
    public static void main(String[] args) {
        int y = 32;
        double x = 10.45679;
        System.out.println("Bom dia!");
        System.out.println(y);
        System.out.printf("%.2f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
        System.out.println("resultado = " + x + " metros");
        System.out.printf("resultado = %.2f metros%n", x);

        String nome = "Maria";
        int idade = 34;
        double renda = 4000.00;
        System.out.printf("%s tem %d anos e recebe %.2f reais", nome ,idade, renda);


    }
    }
