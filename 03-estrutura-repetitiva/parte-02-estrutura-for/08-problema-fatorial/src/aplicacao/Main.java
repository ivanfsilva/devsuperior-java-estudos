package aplicacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = sc.nextInt();

        // Variável tipo long para evitar estouro numérico em fatoriais maiores
        long fatorial = 1;

        // Laço de repetição para multiplicar de 1 até N
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println("FATORIAL = " + fatorial);

        sc.close();
    }
}
