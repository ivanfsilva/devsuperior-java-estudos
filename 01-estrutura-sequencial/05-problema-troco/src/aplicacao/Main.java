package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define o ponto (.) como separador decimal para o Scanner (padrão US)
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Preço unitário do produto: ");
        double precoUnitario = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        double dinheiroRecebido = sc.nextDouble();

        // Cálculo
        double total = precoUnitario * quantidade;
        double troco = dinheiroRecebido - total;

        // Exibição do resultado com 2 casas decimais
        System.out.printf("TROCO = %.2f%n", troco);
    }
}
