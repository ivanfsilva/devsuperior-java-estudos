package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as tres distâncias:");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();

        double maior = Math.max(d1, Math.max(d2, d3));

        System.out.printf("MAIOR DISTÂNCIA = %.2f%n", maior);

        sc.close();
    }
}
