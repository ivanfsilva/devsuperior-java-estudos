package aplicacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        // Determina o menor e o maior valor para garantir a ordem correta do intervalo
        int menor = Math.min(x, y);
        int maior = Math.max(x, y);

        int soma = 0;

        // Percorre os números estritamente ENTRE o menor e o maior (sem incluí-los)
        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println("SOMA DOS IMPARES = " + soma);

        sc.close();
    }
}
