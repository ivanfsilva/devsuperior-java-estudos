package aplicacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            int x = sc.nextInt();

            if (x == 0) {
                System.out.println("NULO");
            } else {
                // Paridade: par se o resto da divisão por 2 for 0
                String paridade = (x % 2 == 0) ? "PAR" : "IMPAR";
                // Sinal: positivo se maior que 0, caso contrário negativo
                String sinal = (x > 0) ? "POSITIVO" : "NEGATIVO";

                System.out.println(paridade + " " + sinal);
            }
        }

        sc.close();
    }
}
