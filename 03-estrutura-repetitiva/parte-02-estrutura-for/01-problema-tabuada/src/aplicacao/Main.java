package aplicacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja a tabuada para qual valor? ");
        int n = sc.nextInt();

        // Laço for de 1 até 10 para calcular e exibir a tabuada
        for (int i = 1; i <= 10; i++) {
            int produto = n * i;
            System.out.println(n + " x " + i + " = " + produto);
        }

        sc.close();
    }
}
