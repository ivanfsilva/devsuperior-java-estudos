package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Configura o ponto como separador decimal para a entrada e saída de dados
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos casos voce vai digitar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite tres numeros:");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            // Cálculo da média ponderada: (a*2 + b*3 + c*5) / (2 + 3 + 5)
            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("MEDIA = %.1f%n", media);
        }

        sc.close();
    }
}
