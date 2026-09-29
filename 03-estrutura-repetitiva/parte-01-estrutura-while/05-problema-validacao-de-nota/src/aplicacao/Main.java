package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Configura o ponto como separador decimal
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Leitura e validação da primeira nota
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        while (nota1 < 0.0 || nota1 > 10.0) {
            System.out.print("Valor invalido! Tente novamente: ");
            nota1 = sc.nextDouble();
        }

        // Leitura e validação da segunda nota
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        while (nota2 < 0.0 || nota2 > 10.0) {
            System.out.print("Valor invalido! Tente novamente: ");
            nota2 = sc.nextDouble();
        }

        // Cálculo da média semestral
        double media = (nota1 + nota2) / 2.0;

        // Impressão da média formatada com 2 casas decimais
        System.out.printf("MEDIA = %.2f%n", media);

        sc.close();
    }
}