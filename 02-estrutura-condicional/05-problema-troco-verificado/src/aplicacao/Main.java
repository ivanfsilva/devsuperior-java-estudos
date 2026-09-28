package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double precoUnitario = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        double dinheiroRecebido = sc.nextDouble();

        double totalCompra = precoUnitario * quantidade;

        if (dinheiroRecebido >= totalCompra) {
            double troco = dinheiroRecebido - totalCompra;
            System.out.printf("TROCO = %.2f%n", troco);
        } else {
            double falta = totalCompra - dinheiroRecebido;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS%n", falta);
        }

        sc.close();
    }
}
