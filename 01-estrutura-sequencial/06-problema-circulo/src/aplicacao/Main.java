package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Configura o ponto como separador decimal para aceitar entradas como 2.0 ou 13.2
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio do círculo: ");
        double raio = sc.nextDouble();

        // Cálculo da área usando Math.PI e Math.pow
        double area = Math.PI * Math.pow(raio, 2.0);

        // Formatação do resultado com 3 casas decimais
        System.out.printf("ÁREA = %.3f%n", area);

        sc.close();
    }
}
