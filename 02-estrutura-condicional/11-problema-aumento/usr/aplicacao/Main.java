package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario da pessoa: ");
        double salario = sc.nextDouble();

        int porcentagem;

        if (salario <= 1000.0) {
            porcentagem = 20;
        } else if (salario <= 3000.0) {
            porcentagem = 15;
        } else if (salario <= 8000.0) {
            porcentagem = 10;
        } else {
            porcentagem = 5;
        }

        double aumento = salario * porcentagem / 100.0;
        double novoSalario = salario + aumento;

        System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
        System.out.printf("Aumento = R$ %.2f%n", aumento);
        System.out.println("Porcentagem = " + porcentagem + " %");

        sc.close();
    }
}
