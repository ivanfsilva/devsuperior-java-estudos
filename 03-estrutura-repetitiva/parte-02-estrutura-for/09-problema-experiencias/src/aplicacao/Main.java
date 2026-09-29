package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Configura o ponto como separador decimal para a saída dos percentuais
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;

        System.out.print("Quantos casos de teste serão digitados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Quantidade de cobaias: ");
            int qtd = sc.nextInt();

            System.out.print("Tipo de cobaia: ");
            char tipo = sc.next().toUpperCase().charAt(0);

            // Soma a quantidade conforme o tipo informado
            switch (tipo) {
                case 'C' -> totalCoelhos += qtd;
                case 'R' -> totalRatos += qtd;
                case 'S' -> totalSapos += qtd;
                default -> { }
            }
        }

        int totalCobaias = totalCoelhos + totalRatos + totalSapos;

        // Cálculos dos percentuais (fazendo o casting para double)
        double pCoelhos = (double) totalCoelhos / totalCobaias * 100.0;
        double pRatos = (double) totalRatos / totalCobaias * 100.0;
        double pSapos = (double) totalSapos / totalCobaias * 100.0;

        // Relatório final
        System.out.println(" ");
        System.out.println("RELATÓRIO FINAL:");
        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelhos);
        System.out.println("Total de ratos: " + totalRatos);
        System.out.println("Total de sapos: " + totalSapos);
        System.out.printf("Percentual de coelhos: %.2f%n", pCoelhos);
        System.out.printf("Percentual de ratos: %.2f%n", pRatos);
        System.out.printf("Percentual de sapos: %.2f%n", pSapos);

        sc.close();
    }
}
