package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Configura o ponto como separador decimal para leitura e escrita
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Leitura do nome do funcionário
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        // Leitura do valor por hora
        System.out.print("Valor por hora: ");
        double valorPorHora = sc.nextDouble();

        // Leitura das horas trabalhadas
        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        // Cálculo do pagamento
        double pagamento = valorPorHora * horasTrabalhadas;

        // Exibição do resultado
        System.out.printf("O pagamento para %s deve ser %.2f%n", nome, pagamento);

        sc.close();
    }
}
