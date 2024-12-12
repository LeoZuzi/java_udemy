import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero, horasTrabalhadas, salarioHora, calculo;
        System.out.println("digite o numero do funcionario: ");
        numero = sc.nextDouble();
        System.out.println("horas trabalhadas: ");
        horasTrabalhadas = sc.nextDouble();
        System.out.println("Salario por hora: ");
        salarioHora = sc.nextDouble();
        calculo = salarioHora * horasTrabalhadas;
        System.out.println("Numero: " + numero);
        System.out.println("Salario: " + calculo);

        sc.close();
    }
}
