package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de X: ");
        int x = sc.nextInt();

        System.out.print("Digite o valor de Y: ");
        int y = sc.nextInt();

        int soma = x + y;

        System.out.println("SOMA = " + soma);
    }
}
