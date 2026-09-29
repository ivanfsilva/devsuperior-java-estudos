package aplicacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = sc.nextInt();

        // Percorre todos os números de 1 até X
        for (int i = 1; i <= x; i++) {
            // Verifica se o número atual é ímpar
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
