package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Codigo do produto comprado: ");
        int codigo = sc.nextInt();

        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();

        double preco = switch (codigo) {
            case 1 -> 5.00;
            case 2 -> 3.50;
            case 3 -> 4.80;
            case 4 -> 8.90;
            case 5 -> 7.32;
            default -> 0.0;
        };

        double valorPagar = preco * quantidade;

        System.out.printf("Valor a pagar: R$ %.2f%n", valorPagar);

        sc.close();
    }
}
