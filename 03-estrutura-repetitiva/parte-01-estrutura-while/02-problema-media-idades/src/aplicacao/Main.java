package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Configura o ponto como separador decimal para o formato dos números
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as idades:");
        int idade = sc.nextInt();

        // Caso a primeira idade seja negativa, não é possível calcular a média
        if (idade < 0) {
            System.out.println("IMPOSSIVEL CALCULAR");
        } else {
            int soma = 0;
            int contagem = 0;

            // Continua lendo idades enquanto o valor for maior ou igual a zero
            while (idade >= 0) {
                soma += idade;
                contagem++;
                idade = sc.nextInt();
            }

            // Converte a soma para double para garantir a divisão com casas decimais
            double media = (double) soma / contagem;

            // Imprime o resultado formatado com 2 casas decimais
            System.out.printf("MEDIA = %.2f%n", media);
        }

        sc.close();
    }
}
