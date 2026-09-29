package aplicacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int x = sc.nextInt();

        // O laço continua até que o valor de X seja igual a 0
        while (x != 0) {
            // Se X for ímpar, ajusta para o próximo número par
            if (x % 2 != 0) {
                x++;
            }

            // Soma os 5 números pares consecutivos a partir de X
            int soma = 5 * x + 20;

            System.out.println("SOMA = " + soma);

            System.out.print("Digite um numero inteiro: ");
            x = sc.nextInt();
        }

        sc.close();
    }
}