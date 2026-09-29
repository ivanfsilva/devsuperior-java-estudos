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
            System.out.print("Entre com o numerador: ");
            int numerador = sc.nextInt();

            System.out.print("Entre com o denominador: ");
            int denominador = sc.nextInt();

            // Validação de divisão por zero
            if (denominador == 0) {
                System.out.println("DIVISAO IMPOSSIVEL");
            } else {
                // Realiza o casting para double para obter divisão com casas decimais
                double divisao = (double) numerador / denominador;
                System.out.printf("DIVISAO = %.2f%n", divisao);
            }
        }

        sc.close();
    }
}
