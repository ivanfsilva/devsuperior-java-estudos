package aplicacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int n = sc.nextInt();

        int dentro = 0;
        int fora = 0;

        // Repete N vezes para ler cada número X
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            int x = sc.nextInt();

            // Verifica se o valor está dentro do intervalo [10, 20]
            if (x >= 10 && x <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }

        // Exibe os totais dentro e fora do intervalo
        System.out.println(dentro + " DENTRO");
        System.out.println(fora + " FORA");

        sc.close();
    }
}
