package aplicacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }

        sc.close();
    }
}
